package io.github.biezhi.wechat.exception;

/**
 * 微信运行时异常
 *
 * @author biezhi
 * @date 2018/1/19
 */
public class WeChatException extends RuntimeException {

    /**  */
    private static final long serialVersionUID = 5912553654133352867L;

    public WeChatException() {
    }

    public WeChatException(String message) {
        super(message);
    }

    public WeChatException(String message, Throwable cause) {
        super(message, cause);
    }

    public WeChatException(Throwable cause) {
        super(cause);
    }
}
