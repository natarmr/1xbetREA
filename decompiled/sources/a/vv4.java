package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vv4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vv4 f38080a;
    public static final vv4 b;
    public static final vv4 c;
    public static final /* synthetic */ vv4[] d;

    static {
        vv4 vv4Var = new vv4("NOT_CANCELLING", 0);
        f38080a = vv4Var;
        vv4 vv4Var2 = new vv4("CANCELLING", 1);
        b = vv4Var2;
        vv4 vv4Var3 = new vv4("CANCELLED", 2);
        c = vv4Var3;
        d = new vv4[]{vv4Var, vv4Var2, vv4Var3};
    }

    public static vv4 valueOf(String str) {
        return (vv4) Enum.valueOf(vv4.class, str);
    }

    public static vv4[] values() {
        return (vv4[]) d.clone();
    }
}
