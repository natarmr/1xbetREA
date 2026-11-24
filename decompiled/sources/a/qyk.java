package a;

/* JADX INFO: loaded from: classes4.dex */
public enum qyk {
    DEFAULT,
    LOW_THEN_1K,
    MORE_THEN_1K,
    PARTNER_LOW_THEN_10K,
    PARTNER_MORE_THEN_10K,
    URAL_PLUS,
    URAL_MINUS,
    VIP;

    private static final /* synthetic */ a0o b = dtb.B(a());

    public static a0o getEntries() {
        return b;
    }

    public final int code() {
        switch (pyk.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 16;
            case 4:
                return 256;
            case 5:
                return 4096;
            case 6:
                return 65536;
            case 7:
                return 1048576;
            case 8:
                return 16777216;
            default:
                t9f.b();
                return 0;
        }
    }
}
