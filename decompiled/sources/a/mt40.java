package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mt40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mt40 f22354a;
    public static final mt40 b;
    public static final /* synthetic */ mt40[] c;

    static {
        mt40 mt40Var = new mt40("CONTENT", 0);
        f22354a = mt40Var;
        mt40 mt40Var2 = new mt40("TITLE", 1);
        b = mt40Var2;
        c = new mt40[]{mt40Var, mt40Var2};
    }

    public static mt40 valueOf(String str) {
        return (mt40) Enum.valueOf(mt40.class, str);
    }

    public static mt40[] values() {
        return (mt40[]) c.clone();
    }
}
