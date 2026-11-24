package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fc8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fc8 f9298a;
    public static final fc8 b;
    public static final /* synthetic */ fc8[] c;

    static {
        fc8 fc8Var = new fc8("WILD_FREEBET_ACTIVATION", 0);
        f9298a = fc8Var;
        fc8 fc8Var2 = new fc8("WILD_FREEBET_CHANGE_GAME", 1);
        b = fc8Var2;
        c = new fc8[]{fc8Var, fc8Var2};
    }

    public static fc8 valueOf(String str) {
        return (fc8) Enum.valueOf(fc8.class, str);
    }

    public static fc8[] values() {
        return (fc8[]) c.clone();
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        t9f.b();
        return 0;
    }
}
