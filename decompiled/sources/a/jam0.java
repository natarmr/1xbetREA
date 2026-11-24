package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jam0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jam0 f16197a;
    public static final jam0 b;
    public static final jam0 c;
    public static final jam0 d;
    public static final jam0 e;
    public static final jam0 f;
    public static final jam0 g;
    public static final jam0 h;
    public static final /* synthetic */ jam0[] i;

    static {
        jam0 jam0Var = new jam0("FORECAST", 0);
        f16197a = jam0Var;
        jam0 jam0Var2 = new jam0("GAME_EVENT", 1);
        b = jam0Var2;
        jam0 jam0Var3 = new jam0("LINEUP", 2);
        c = jam0Var3;
        jam0 jam0Var4 = new jam0("PRE_MATCH", 3);
        d = jam0Var4;
        jam0 jam0Var5 = new jam0("LAST_GAME", 4);
        e = jam0Var5;
        jam0 jam0Var6 = new jam0("FUTURE_GAME", 5);
        f = jam0Var6;
        jam0 jam0Var7 = new jam0("GAMES", 6);
        g = jam0Var7;
        jam0 jam0Var8 = new jam0("SCORE", 7);
        h = jam0Var8;
        i = new jam0[]{jam0Var, jam0Var2, jam0Var3, jam0Var4, jam0Var5, jam0Var6, jam0Var7, jam0Var8};
    }

    public static jam0 valueOf(String str) {
        return (jam0) Enum.valueOf(jam0.class, str);
    }

    public static jam0[] values() {
        return (jam0[]) i.clone();
    }
}
