package com.indevopslab.springit.domain;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.URL;
import org.ocpsoft.prettytime.PrettyTime;

import com.indevopslab.springit.service.BeanUtil;
import java.net.URI;
import java.net.URISyntaxException;
import lombok.*;


@Entity
@RequiredArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Link  extends Auditable{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	@NotEmpty(message = "Please enter a title")
	private String title;
	
	@NonNull
	@NotEmpty(message = "Pleaase enter url.")
	@URL(message = "Please enter a valid url.")
	private String url;
	
	//Comments
	@OneToMany(mappedBy="link")
	private List<Comment> comments = new ArrayList<>();
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public String getDomainName() throws URISyntaxException {
		URI uri = new URI(this.url);
		String domain = uri.getHost();
		return domain.startsWith("www.") ? domain.substring(4) : domain;
	}
	
	public String getPrettyTime() {
		PrettyTime pt = BeanUtil.getBean(PrettyTime.class);
		return pt.format(convertToDateViaInstant(getCreationDate()));
	}

	private Date convertToDateViaInstant(LocalDateTime dateToConvert) {
		return java.util.Date.from(dateToConvert.atZone(ZoneId.systemDefault()).toInstant());
	}

}
