package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class nqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nqh0 f23960a;
    public static final nqh0 b;
    public static final /* synthetic */ nqh0[] c;

    static {
        nqh0 nqh0Var = new nqh0("PROFILE", 0);
        f23960a = nqh0Var;
        nqh0 nqh0Var2 = new nqh0("SESSIONS", 1);
        b = nqh0Var2;
        c = new nqh0[]{nqh0Var, nqh0Var2};
    }

    public static nqh0 valueOf(String str) {
        return (nqh0) Enum.valueOf(nqh0.class, str);
    }

    public static nqh0[] values() {
        return (nqh0[]) c.clone();
    }
}
