package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e10 f7015a;
    public static final e10 b;
    public static final e10 c;
    public static final /* synthetic */ e10[] d;

    static {
        e10 e10Var = new e10("INITIALIZE", 0);
        f7015a = e10Var;
        e10 e10Var2 = new e10("CONTENT", 1);
        b = e10Var2;
        e10 e10Var3 = new e10("ERROR", 2);
        c = e10Var3;
        d = new e10[]{e10Var, e10Var2, e10Var3};
    }

    public static e10 valueOf(String str) {
        return (e10) Enum.valueOf(e10.class, str);
    }

    public static e10[] values() {
        return (e10[]) d.clone();
    }
}
