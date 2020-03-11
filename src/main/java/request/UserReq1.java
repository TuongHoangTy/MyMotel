package request;

import lombok.Data;

@Data
public class UserReq1 {
	private String fullName;
	private String passWord;
	private String email;
	private Long id;
}
