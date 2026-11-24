package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class rh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jdk0 f30465a;
    public static final rh1 b;
    public static final rh1 c;
    public static final rh1 d;
    public static final rh1 e;
    public static final /* synthetic */ rh1[] f;

    static {
        rh1 rh1Var = new rh1("BrandS", 0);
        b = rh1Var;
        rh1 rh1Var2 = new rh1("BrandSExtended", 1);
        c = rh1Var2;
        rh1 rh1Var3 = new rh1("BrandM", 2);
        d = rh1Var3;
        rh1 rh1Var4 = new rh1("BrandMExtended", 3);
        e = rh1Var4;
        f = new rh1[]{rh1Var, rh1Var2, rh1Var3, rh1Var4};
        f30465a = new jdk0();
    }

    public static rh1 valueOf(String str) {
        return (rh1) Enum.valueOf(rh1.class, str);
    }

    public static rh1[] values() {
        return (rh1[]) f.clone();
    }
}
