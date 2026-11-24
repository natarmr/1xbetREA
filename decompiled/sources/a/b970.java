package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b970 f2195a;
    public static final b970 b;
    public static final b970 c;
    public static final /* synthetic */ b970[] d;

    static {
        b970 b970Var = new b970("OUTSIDE", 0);
        f2195a = b970Var;
        b970 b970Var2 = new b970("GAME_BONUSES", 1);
        b = b970Var2;
        b970 b970Var3 = new b970("NONE", 2);
        c = b970Var3;
        d = new b970[]{b970Var, b970Var2, b970Var3};
    }

    public static b970 valueOf(String str) {
        return (b970) Enum.valueOf(b970.class, str);
    }

    public static b970[] values() {
        return (b970[]) d.clone();
    }
}
