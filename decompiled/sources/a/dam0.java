package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class dam0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dam0 f5756a;
    public static final dam0 b;
    public static final /* synthetic */ dam0[] c;

    static {
        dam0 dam0Var = new dam0("GAME", 0);
        f5756a = dam0Var;
        dam0 dam0Var2 = new dam0("POST_GAME", 1);
        b = dam0Var2;
        c = new dam0[]{dam0Var, dam0Var2};
    }

    public static dam0 valueOf(String str) {
        return (dam0) Enum.valueOf(dam0.class, str);
    }

    public static dam0[] values() {
        return (dam0[]) c.clone();
    }
}
