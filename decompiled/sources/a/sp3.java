package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sp3 f32572a;
    public static final sp3 b;
    public static final sp3 c;
    public static final sp3 d;
    public static final sp3 e;
    public static final sp3 f;
    public static final /* synthetic */ sp3[] g;

    static {
        sp3 sp3Var = new sp3("DEFAULT", 0);
        f32572a = sp3Var;
        sp3 sp3Var2 = new sp3("GAME_IN_PROCESS", 1);
        b = sp3Var2;
        sp3 sp3Var3 = new sp3("CELL_IN_MOVE", 2);
        c = sp3Var3;
        sp3 sp3Var4 = new sp3("RESTORE_CELL_IN_MOVE", 3);
        d = sp3Var4;
        sp3 sp3Var5 = new sp3("SHOW_RESULT_CELLS", 4);
        e = sp3Var5;
        sp3 sp3Var6 = new sp3("RESTORE_SHOW_RESULT_CELLS", 5);
        f = sp3Var6;
        g = new sp3[]{sp3Var, sp3Var2, sp3Var3, sp3Var4, sp3Var5, sp3Var6};
    }

    public static sp3 valueOf(String str) {
        return (sp3) Enum.valueOf(sp3.class, str);
    }

    public static sp3[] values() {
        return (sp3[]) g.clone();
    }
}
