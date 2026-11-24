package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qe9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qe9 f28572a;
    public static final qe9 b;
    public static final qe9 c;
    public static final /* synthetic */ qe9[] d;

    static {
        qe9 qe9Var = new qe9("Selected", 0);
        f28572a = qe9Var;
        qe9 qe9Var2 = new qe9("Error", 1);
        b = qe9Var2;
        qe9 qe9Var3 = new qe9("Default", 2);
        c = qe9Var3;
        d = new qe9[]{qe9Var, qe9Var2, qe9Var3};
    }

    public static qe9 valueOf(String str) {
        return (qe9) Enum.valueOf(qe9.class, str);
    }

    public static qe9[] values() {
        return (qe9[]) d.clone();
    }
}
