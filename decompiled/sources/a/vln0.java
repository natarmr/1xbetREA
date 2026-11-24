package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vln0 f37634a;
    public static final vln0 b;
    public static final vln0 c;
    public static final vln0 d;
    public static final vln0 e;
    public static final /* synthetic */ vln0[] f;

    static {
        vln0 vln0Var = new vln0("PRIV", 0);
        f37634a = vln0Var;
        vln0 vln0Var2 = new vln0("YUV", 1);
        b = vln0Var2;
        vln0 vln0Var3 = new vln0("JPEG", 2);
        c = vln0Var3;
        vln0 vln0Var4 = new vln0("JPEG_R", 3);
        d = vln0Var4;
        vln0 vln0Var5 = new vln0("RAW", 4);
        e = vln0Var5;
        f = new vln0[]{vln0Var, vln0Var2, vln0Var3, vln0Var4, vln0Var5};
    }

    public static vln0 valueOf(String str) {
        return (vln0) Enum.valueOf(vln0.class, str);
    }

    public static vln0[] values() {
        return (vln0[]) f.clone();
    }
}
