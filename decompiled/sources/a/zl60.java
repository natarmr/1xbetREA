package a;

/* JADX INFO: loaded from: classes5.dex */
public final class zl60 extends v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl60(String str, byte b) {
        super("AuthSendConfirmationSms", "", str);
        str.getClass();
        switch (b) {
            case 3:
                super("SetQrAuth", "", str);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl60(String str, String str2) {
        super("Authenticator", str2, str);
        str.getClass();
        str2.getClass();
    }
}
