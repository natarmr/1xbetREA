package a;

/* JADX INFO: loaded from: classes5.dex */
public final class p6a extends v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6a(String str, byte b) {
        super("Auth", "", str);
        str.getClass();
        switch (b) {
            case 6:
                super("ChangeUser", "", str);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6a(String str, String str2) {
        super("ActivatePhone", str, str2);
        str.getClass();
        str2.getClass();
    }
}
