package cn.stpan.chitchat.entites;

import javax.persistence.*;

/**
 * Created by stpan on 2016/4/18 21:46.
 */
@Entity
@Table(name = "t_user_group")
public class TUserGroupEntity {
    private String id;
    private String createUserid;
    private String groupMasterUserid;
    private String groupName;
    private String headImage;
    private String createTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "create_userid")
    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }

    @Basic
    @Column(name = "group_master_userid")
    public String getGroupMasterUserid() {
        return groupMasterUserid;
    }

    public void setGroupMasterUserid(String groupMasterUserid) {
        this.groupMasterUserid = groupMasterUserid;
    }

    @Basic
    @Column(name = "group_name")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "head_image")
    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserGroupEntity that = (TUserGroupEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createUserid != null ? !createUserid.equals(that.createUserid) : that.createUserid != null) return false;
        if (groupMasterUserid != null ? !groupMasterUserid.equals(that.groupMasterUserid) : that.groupMasterUserid != null)
            return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
        if (headImage != null ? !headImage.equals(that.headImage) : that.headImage != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createUserid != null ? createUserid.hashCode() : 0);
        result = 31 * result + (groupMasterUserid != null ? groupMasterUserid.hashCode() : 0);
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (headImage != null ? headImage.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
