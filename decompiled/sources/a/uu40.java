package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class uu40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uu40 f36284a;
    public static final uu40 b;
    public static final uu40 c;
    public static final uu40 d;
    public static final /* synthetic */ uu40[] e;

    static {
        uu40 uu40Var = new uu40("RIGHT", 0);
        f36284a = uu40Var;
        uu40 uu40Var2 = new uu40("TOP", 1);
        b = uu40Var2;
        uu40 uu40Var3 = new uu40("BOTTOM", 2);
        c = uu40Var3;
        uu40 uu40Var4 = new uu40("LEFT", 3);
        d = uu40Var4;
        e = new uu40[]{uu40Var, uu40Var2, uu40Var3, uu40Var4};
    }

    public static uu40 valueOf(String str) {
        return (uu40) Enum.valueOf(uu40.class, str);
    }

    public static uu40[] values() {
        return (uu40[]) e.clone();
    }
}
