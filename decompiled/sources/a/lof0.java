package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lof0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lof0 f20388a;
    public static final lof0 b;
    public static final lof0 c;
    public static final /* synthetic */ lof0[] d;

    static {
        lof0 lof0Var = new lof0("WOMAN", 0);
        f20388a = lof0Var;
        lof0 lof0Var2 = new lof0("SOLDIER", 1);
        b = lof0Var2;
        lof0 lof0Var3 = new lof0("CLOSED", 2);
        c = lof0Var3;
        d = new lof0[]{lof0Var, lof0Var2, lof0Var3};
    }

    public static lof0 valueOf(String str) {
        return (lof0) Enum.valueOf(lof0.class, str);
    }

    public static lof0[] values() {
        return (lof0[]) d.clone();
    }
}
