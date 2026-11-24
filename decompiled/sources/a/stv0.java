package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class stv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final stv0 f32793a;
    public static final stv0 b;
    public static final stv0 c;
    public static final /* synthetic */ stv0[] d;

    static {
        stv0 stv0Var = new stv0("Free", 0);
        f32793a = stv0Var;
        stv0 stv0Var2 = new stv0("AnchorsOnly", 1);
        b = stv0Var2;
        stv0 stv0Var3 = new stv0("None", 2);
        c = stv0Var3;
        d = new stv0[]{stv0Var, stv0Var2, stv0Var3};
    }

    public static stv0 valueOf(String str) {
        return (stv0) Enum.valueOf(stv0.class, str);
    }

    public static stv0[] values() {
        return (stv0[]) d.clone();
    }
}
