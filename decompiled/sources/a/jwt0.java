package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jwt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jwt0 f17271a;
    public static final jwt0 b;
    public static final jwt0 c;
    public static final jwt0 d;
    public static final /* synthetic */ jwt0[] e;

    static {
        jwt0 jwt0Var = new jwt0("VALID", 0);
        f17271a = jwt0Var;
        jwt0 jwt0Var2 = new jwt0("MAX_ERROR", 1);
        b = jwt0Var2;
        jwt0 jwt0Var3 = new jwt0("MIN_ERROR", 2);
        c = jwt0Var3;
        jwt0 jwt0Var4 = new jwt0("MULTIPLY_OF_TEN_ERROR", 3);
        d = jwt0Var4;
        e = new jwt0[]{jwt0Var, jwt0Var2, jwt0Var3, jwt0Var4};
    }

    public static jwt0 valueOf(String str) {
        return (jwt0) Enum.valueOf(jwt0.class, str);
    }

    public static jwt0[] values() {
        return (jwt0[]) e.clone();
    }
}
