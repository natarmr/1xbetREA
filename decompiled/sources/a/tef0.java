package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class tef0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tef0 f33818a;
    public static final tef0 b;
    public static final tef0 c;
    public static final /* synthetic */ tef0[] d;

    static {
        tef0 tef0Var = new tef0("SPORT_GAME_SCREEN", 0);
        f33818a = tef0Var;
        tef0 tef0Var2 = new tef0("DUEL_SCREEN", 1);
        b = tef0Var2;
        tef0 tef0Var3 = new tef0("RELATED_GAMES_SCREEN", 2);
        c = tef0Var3;
        d = new tef0[]{tef0Var, tef0Var2, tef0Var3, new tef0("CYBER_GAMES_SCREEN", 3)};
    }

    public static tef0 valueOf(String str) {
        return (tef0) Enum.valueOf(tef0.class, str);
    }

    public static tef0[] values() {
        return (tef0[]) d.clone();
    }
}
