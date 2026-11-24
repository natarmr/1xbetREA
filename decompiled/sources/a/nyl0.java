package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class nyl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nyl0 f24334a;
    public static final nyl0 b;
    public static final nyl0 c;
    public static final nyl0 d;
    public static final /* synthetic */ nyl0[] e;

    static {
        nyl0 nyl0Var = new nyl0("EMPTY", 0);
        f24334a = nyl0Var;
        nyl0 nyl0Var2 = new nyl0("TRANSPARENT_STYLE_CODE", 1);
        b = nyl0Var2;
        nyl0 nyl0Var3 = new nyl0("CUSTOM_STYLE_CODE", 2);
        c = nyl0Var3;
        nyl0 nyl0Var4 = new nyl0("DEFAULT_STYLE_CODE", 3);
        d = nyl0Var4;
        e = new nyl0[]{nyl0Var, nyl0Var2, nyl0Var3, nyl0Var4};
    }

    public static nyl0 valueOf(String str) {
        return (nyl0) Enum.valueOf(nyl0.class, str);
    }

    public static nyl0[] values() {
        return (nyl0[]) e.clone();
    }
}
