package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t7s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t7s0 f33482a;
    public static final t7s0 b;
    public static final t7s0 c;
    public static final /* synthetic */ t7s0[] d;

    static {
        t7s0 t7s0Var = new t7s0("WAITING_START", 0);
        f33482a = t7s0Var;
        t7s0 t7s0Var2 = new t7s0("ACTIVE", 1);
        b = t7s0Var2;
        t7s0 t7s0Var3 = new t7s0("COMPLETED", 2);
        c = t7s0Var3;
        d = new t7s0[]{t7s0Var, t7s0Var2, t7s0Var3};
    }

    public static t7s0 valueOf(String str) {
        return (t7s0) Enum.valueOf(t7s0.class, str);
    }

    public static t7s0[] values() {
        return (t7s0[]) d.clone();
    }
}
