package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nud0 f24142a;
    public static final nud0 b;
    public static final /* synthetic */ nud0[] c;

    static {
        nud0 nud0Var = new nud0("MAP", 0);
        f24142a = nud0Var;
        nud0 nud0Var2 = new nud0("OPERATOR", 1);
        b = nud0Var2;
        c = new nud0[]{nud0Var, nud0Var2};
    }

    public static nud0 valueOf(String str) {
        return (nud0) Enum.valueOf(nud0.class, str);
    }

    public static nud0[] values() {
        return (nud0[]) c.clone();
    }
}
