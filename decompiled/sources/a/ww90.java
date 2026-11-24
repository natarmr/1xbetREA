package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ww90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ww90 f39878a;
    public static final ww90 b;
    public static final ww90 c;
    public static final ww90 d;
    public static final /* synthetic */ ww90[] e;

    static {
        ww90 ww90Var = new ww90("PLAY", 0);
        f39878a = ww90Var;
        ww90 ww90Var2 = new ww90("ALL_GAMES", 1);
        b = ww90Var2;
        ww90 ww90Var3 = new ww90("ALL_GAMES_SLOTS", 2);
        c = ww90Var3;
        ww90 ww90Var4 = new ww90("ALL_PUBLISHER", 3);
        d = ww90Var4;
        e = new ww90[]{ww90Var, ww90Var2, ww90Var3, ww90Var4, new ww90("ERROR", 4)};
    }

    public static ww90 valueOf(String str) {
        return (ww90) Enum.valueOf(ww90.class, str);
    }

    public static ww90[] values() {
        return (ww90[]) e.clone();
    }
}
