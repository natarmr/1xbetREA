package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qnf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qnf0 f29025a;
    public static final qnf0 b;
    public static final qnf0 c;
    public static final /* synthetic */ qnf0[] d;

    static {
        qnf0 qnf0Var = new qnf0("INIT", 0);
        f29025a = qnf0Var;
        qnf0 qnf0Var2 = new qnf0("REOPEN_FRAGMENT", 1);
        b = qnf0Var2;
        qnf0 qnf0Var3 = new qnf0("INTERNET_OK", 2);
        c = qnf0Var3;
        d = new qnf0[]{qnf0Var, qnf0Var2, qnf0Var3};
    }

    public static qnf0 valueOf(String str) {
        return (qnf0) Enum.valueOf(qnf0.class, str);
    }

    public static qnf0[] values() {
        return (qnf0[]) d.clone();
    }
}
