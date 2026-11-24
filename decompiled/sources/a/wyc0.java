package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wyc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wyc0 f39969a;
    public static final wyc0 b;
    public static final /* synthetic */ wyc0[] c;

    static {
        wyc0 wyc0Var = new wyc0("Primary", 0);
        f39969a = wyc0Var;
        wyc0 wyc0Var2 = new wyc0("Disabled", 1);
        b = wyc0Var2;
        c = new wyc0[]{wyc0Var, wyc0Var2};
    }

    public static wyc0 valueOf(String str) {
        return (wyc0) Enum.valueOf(wyc0.class, str);
    }

    public static wyc0[] values() {
        return (wyc0[]) c.clone();
    }
}
