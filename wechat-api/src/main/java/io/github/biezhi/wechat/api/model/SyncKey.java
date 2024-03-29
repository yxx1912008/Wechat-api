package io.github.biezhi.wechat.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * SyncKey
 *
 * @author biezhi
 * @date 2018/1/19
 */
@Data
public class SyncKey implements Serializable {

    /**  */
    private static final long serialVersionUID = -5689434905462614119L;

    @SerializedName("Count")
    private Integer           count;

    @SerializedName("List")
    private List<KeyItem>     list;

}
