package www.spring.com.board.model.criteria;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.Setter;
import www.spring.com.framework.PageDTO;

@Getter
@Setter
public class BoardCriteria extends PageDTO {
	private String searchType;
	private String keyword;

	public BoardCriteria() {
		super();
	}

	public BoardCriteria(int pageNum, int amount) {
		super(pageNum, amount);
	}
	
	public BoardCriteria(BoardCriteria cri, int totalCnt) {
		super(cri, totalCnt);
		this.searchType = cri.searchType;
		this.keyword = cri.keyword;
	}

	public String[] getSearchTypeArr() {
		return searchType == null ? new String[] {} : searchType.split("");
	}
	
	public String getListLink() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromPath("");
		builder.queryParam("pageNum", getPageNum())
		.queryParam("amount", getAmount())
		.queryParam("searchType", getSearchType())
		.queryParam("keyword", getKeyword());

		return builder.toUriString();
	}
}

















