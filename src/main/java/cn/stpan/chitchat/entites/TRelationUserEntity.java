package cn.stpan.chitchat.entites;

import javax.persistence.*;

/**
 * Created by stpan on 2016/4/18 21:45.
 */
@Entity
@Table(name = "t_relation_user")
public class TRelationUserEntity {
    private String id;
    private String primaryId;
    private String secondaryId;
    private String relationType;
    private String isActive;
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
    @Column(name = "primary_id")
    public String getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    @Basic
    @Column(name = "secondary_id")
    public String getSecondaryId() {
        return secondaryId;
    }

    public void setSecondaryId(String secondaryId) {
        this.secondaryId = secondaryId;
    }

    @Basic
    @Column(name = "relation_type")
    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    @Basic
    @Column(name = "is_active")
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
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

        TRelationUserEntity that = (TRelationUserEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (primaryId != null ? !primaryId.equals(that.primaryId) : that.primaryId != null) return false;
        if (secondaryId != null ? !secondaryId.equals(that.secondaryId) : that.secondaryId != null) return false;
        if (relationType != null ? !relationType.equals(that.relationType) : that.relationType != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (primaryId != null ? primaryId.hashCode() : 0);
        result = 31 * result + (secondaryId != null ? secondaryId.hashCode() : 0);
        result = 31 * result + (relationType != null ? relationType.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
