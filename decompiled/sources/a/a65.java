package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a65 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a65 f301a;
    public static final a65 b;
    public static final a65 c;
    public static final /* synthetic */ a65[] d;

    static {
        a65 a65Var = new a65("NONE", 0);
        f301a = a65Var;
        a65 a65Var2 = new a65("AVAILABLE", 1);
        b = a65Var2;
        a65 a65Var3 = new a65("UNAVAILABLE", 2);
        c = a65Var3;
        d = new a65[]{a65Var, a65Var2, a65Var3};
    }

    public static a65 valueOf(String str) {
        return (a65) Enum.valueOf(a65.class, str);
    }

    public static a65[] values() {
        return (a65[]) d.clone();
    }
}
