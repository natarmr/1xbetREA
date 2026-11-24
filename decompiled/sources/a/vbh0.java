package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class vbh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vbh0 f37141a;
    public static final vbh0 b;
    public static final /* synthetic */ vbh0[] c;

    static {
        vbh0 vbh0Var = new vbh0("ITEMS", 0);
        f37141a = vbh0Var;
        vbh0 vbh0Var2 = new vbh0("INDICATOR", 1);
        b = vbh0Var2;
        c = new vbh0[]{vbh0Var, vbh0Var2};
    }

    public static vbh0 valueOf(String str) {
        return (vbh0) Enum.valueOf(vbh0.class, str);
    }

    public static vbh0[] values() {
        return (vbh0[]) c.clone();
    }
}
