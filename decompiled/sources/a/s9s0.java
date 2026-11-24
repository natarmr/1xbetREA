package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class s9s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s9s0 f31863a;
    public static final s9s0 b;
    public static final s9s0 c;
    public static final s9s0 d;
    public static final /* synthetic */ s9s0[] e;

    static {
        s9s0 s9s0Var = new s9s0("MAIN", 0);
        f31863a = s9s0Var;
        s9s0 s9s0Var2 = new s9s0("GAMES", 1);
        b = s9s0Var2;
        s9s0 s9s0Var3 = new s9s0("RESULTS", 2);
        c = s9s0Var3;
        s9s0 s9s0Var4 = new s9s0("CONDITIONS", 3);
        d = s9s0Var4;
        e = new s9s0[]{s9s0Var, s9s0Var2, s9s0Var3, s9s0Var4};
    }

    public static s9s0 valueOf(String str) {
        return (s9s0) Enum.valueOf(s9s0.class, str);
    }

    public static s9s0[] values() {
        return (s9s0[]) e.clone();
    }
}
