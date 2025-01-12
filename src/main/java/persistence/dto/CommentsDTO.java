package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString

public class CommentsDTO {
    private int commentsIndex;
    private String commentsContent;
    private Date uploadDate;
    private int commentsLayer;
    private int memberIndex;
    private int bulletinIndex;
}
