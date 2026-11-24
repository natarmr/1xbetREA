package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hg8 f13005a;
    public static final hg8 b;
    public static final hg8 c;
    public static final /* synthetic */ hg8[] d;

    static {
        hg8 hg8Var = new hg8("OUTSIDE", 0);
        f13005a = hg8Var;
        hg8 hg8Var2 = new hg8("GAME_BONUSES", 1);
        b = hg8Var2;
        hg8 hg8Var3 = new hg8("NONE", 2);
        c = hg8Var3;
        d = new hg8[]{hg8Var, hg8Var2, hg8Var3};
    }

    public static hg8 valueOf(String str) {
        return (hg8) Enum.valueOf(hg8.class, str);
    }

    public static hg8[] values() {
        return (hg8[]) d.clone();
    }
}
