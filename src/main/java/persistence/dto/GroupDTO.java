package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

/*
    그룹리더는 회원에서 외래키로 받아와야 하지 않나
    그룹에서 지역 소,중,대분류를 구분지어놨는데 지역정보의 기본키를 외래키로 받아오면 되지 않나
 */
public class GroupDTO {
    private int groupIndex;
    private String groupName;
    private String groupLeader;
    private String sports;
    private String largeCategoryLocal;
    private String middleCategoryLocal;
    private String smallCategoryLocal;
    private int chatRoomNumber;

}
