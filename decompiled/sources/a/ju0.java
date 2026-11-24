package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ju0 f17126a;
    public static final ju0 b;
    public static final ju0 c;
    public static final ju0 d;
    public static final ju0 e;
    public static final ju0 f;
    public static final /* synthetic */ ju0[] g;

    static {
        ju0 ju0Var = new ju0("CHOOSE_BALANCE", 0);
        f17126a = ju0Var;
        ju0 ju0Var2 = new ju0("CHANGE_BALANCE", 1);
        b = ju0Var2;
        ju0 ju0Var3 = new ju0("GAME_MODE", 2);
        c = ju0Var3;
        ju0 ju0Var4 = new ju0("TRANSFER_MONEY", 3);
        d = ju0Var4;
        ju0 ju0Var5 = new ju0("PLAY_FOR_REAL", 4);
        e = ju0Var5;
        ju0 ju0Var6 = new ju0("CREATE_NICKNAME", 5);
        f = ju0Var6;
        g = new ju0[]{ju0Var, ju0Var2, ju0Var3, ju0Var4, ju0Var5, ju0Var6};
    }

    public static ju0 valueOf(String str) {
        return (ju0) Enum.valueOf(ju0.class, str);
    }

    public static ju0[] values() {
        return (ju0[]) g.clone();
    }
}
