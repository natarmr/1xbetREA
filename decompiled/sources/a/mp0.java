package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class mp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mp0 f22154a;
    public static final mp0 b;
    public static final mp0 c;
    public static final mp0 d;
    public static final /* synthetic */ mp0[] e;

    static {
        mp0 mp0Var = new mp0("CHIPS_S", 0);
        f22154a = mp0Var;
        mp0 mp0Var2 = new mp0("CHIPS_L", 1);
        b = mp0Var2;
        mp0 mp0Var3 = new mp0("TABS_LINE", 2);
        c = mp0Var3;
        mp0 mp0Var4 = new mp0("TABS_FILLED", 3);
        d = mp0Var4;
        e = new mp0[]{mp0Var, mp0Var2, mp0Var3, mp0Var4};
    }

    public static mp0 valueOf(String str) {
        return (mp0) Enum.valueOf(mp0.class, str);
    }

    public static mp0[] values() {
        return (mp0[]) e.clone();
    }
}
