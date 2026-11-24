package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class cw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cw1 f5057a;
    public static final cw1 b;
    public static final cw1 c;
    public static final cw1 d;
    public static final /* synthetic */ cw1[] e;

    static {
        cw1 cw1Var = new cw1("BACKGROUND_PICTURE", 0);
        f5057a = cw1Var;
        cw1 cw1Var2 = new cw1("PICTURE_S", 1);
        b = cw1Var2;
        cw1 cw1Var3 = new cw1("DATES", 2);
        c = cw1Var3;
        cw1 cw1Var4 = new cw1("BACKGROUND_ILLUSTRATION", 3);
        d = cw1Var4;
        e = new cw1[]{cw1Var, cw1Var2, cw1Var3, cw1Var4};
    }

    public static cw1 valueOf(String str) {
        return (cw1) Enum.valueOf(cw1.class, str);
    }

    public static cw1[] values() {
        return (cw1[]) e.clone();
    }
}
