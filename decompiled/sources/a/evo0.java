package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class evo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evo0 f8481a;
    public static final evo0 b;
    public static final /* synthetic */ evo0[] c;

    static {
        evo0 evo0Var = new evo0("COLLAPSED", 0);
        f8481a = evo0Var;
        evo0 evo0Var2 = new evo0("EXPANDED", 1);
        b = evo0Var2;
        c = new evo0[]{evo0Var, evo0Var2};
    }

    public static evo0 valueOf(String str) {
        return (evo0) Enum.valueOf(evo0.class, str);
    }

    public static evo0[] values() {
        return (evo0[]) c.clone();
    }
}
