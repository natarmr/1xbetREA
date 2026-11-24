package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uw4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uw4 f36376a;
    public static final uw4 b;
    public static final uw4 c;
    public static final /* synthetic */ uw4[] d;

    static {
        uw4 uw4Var = new uw4("NOT_CANCELLING", 0);
        f36376a = uw4Var;
        uw4 uw4Var2 = new uw4("CANCELLING", 1);
        b = uw4Var2;
        uw4 uw4Var3 = new uw4("CANCELLED", 2);
        c = uw4Var3;
        d = new uw4[]{uw4Var, uw4Var2, uw4Var3};
    }

    public static uw4 valueOf(String str) {
        return (uw4) Enum.valueOf(uw4.class, str);
    }

    public static uw4[] values() {
        return (uw4[]) d.clone();
    }
}
