package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uxs0 f30405a;
    public static final rfu0 b;
    public static final rfu0 c;
    public static final rfu0 d;
    public static final rfu0 e;
    public static final /* synthetic */ rfu0[] f;

    static {
        rfu0 rfu0Var = new rfu0("UNSPECIFIED", 0);
        b = rfu0Var;
        rfu0 rfu0Var2 = new rfu0("OFF", 1);
        c = rfu0Var2;
        rfu0 rfu0Var3 = new rfu0("ON", 2);
        d = rfu0Var3;
        rfu0 rfu0Var4 = new rfu0("PREVIEW", 3);
        e = rfu0Var4;
        f = new rfu0[]{rfu0Var, rfu0Var2, rfu0Var3, rfu0Var4};
        f30405a = new uxs0((byte) 8);
    }

    public static rfu0 valueOf(String str) {
        return (rfu0) Enum.valueOf(rfu0.class, str);
    }

    public static rfu0[] values() {
        return (rfu0[]) f.clone();
    }
}
