package cn.stpan.chitchat.entites;

import javax.persistence.*;

/**
 * Created by stpan on 2016/4/27 22:06.
 */
@Entity
@Table(name = "t_message_parent")
public class TMessageParentEntity {
    private String id;
    private String messageInitiate;
    private String messageRecieve;
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
    @Column(name = "message_initiate")
    public String getMessageInitiate() {
        return messageInitiate;
    }

    public void setMessageInitiate(String messageInitiate) {
        this.messageInitiate = messageInitiate;
    }

    @Basic
    @Column(name = "message_recieve")
    public String getMessageRecieve() {
        return messageRecieve;
    }

    public void setMessageRecieve(String messageRecieve) {
        this.messageRecieve = messageRecieve;
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

        TMessageParentEntity that = (TMessageParentEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (messageInitiate != null ? !messageInitiate.equals(that.messageInitiate) : that.messageInitiate != null)
            return false;
        if (messageRecieve != null ? !messageRecieve.equals(that.messageRecieve) : that.messageRecieve != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (messageInitiate != null ? messageInitiate.hashCode() : 0);
        result = 31 * result + (messageRecieve != null ? messageRecieve.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
