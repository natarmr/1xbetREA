package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ds9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ds9 f6602a;
    public static final ds9 b;
    public static final ds9 c;
    public static final ds9 d;
    public static final ds9 e;
    public static final /* synthetic */ ds9[] f;

    static {
        ds9 ds9Var = new ds9("INITIAL", 0);
        f6602a = ds9Var;
        ds9 ds9Var2 = new ds9("LOADING", 1);
        b = ds9Var2;
        ds9 ds9Var3 = new ds9("ERROR", 2);
        c = ds9Var3;
        ds9 ds9Var4 = new ds9("SUCCESS_WITH_EMPTY", 3);
        d = ds9Var4;
        ds9 ds9Var5 = new ds9("SUCCESS", 4);
        e = ds9Var5;
        f = new ds9[]{ds9Var, ds9Var2, ds9Var3, ds9Var4, ds9Var5};
    }

    public static ds9 valueOf(String str) {
        return (ds9) Enum.valueOf(ds9.class, str);
    }

    public static ds9[] values() {
        return (ds9[]) f.clone();
    }
}
