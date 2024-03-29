package io.github.biezhi.wechat.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * KeyItem
 *
 * @author biezhi
 * @date 2018/1/19
 */
@Data
public class KeyItem implements Serializable {

    /**  */
    private static final long serialVersionUID = 7897007725258743826L;

    @SerializedName("Key")
    private Integer           key;

    @SerializedName("Val")
    private Integer           val;
}
