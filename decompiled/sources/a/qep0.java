package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class qep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qep0 f28595a;
    public static final qep0 b;
    public static final /* synthetic */ qep0[] c;

    static {
        qep0 qep0Var = new qep0("LOGO_TO_NAME", 0);
        f28595a = qep0Var;
        qep0 qep0Var2 = new qep0("NAME_TO_LOGO", 1);
        b = qep0Var2;
        c = new qep0[]{qep0Var, qep0Var2};
    }

    public static qep0 valueOf(String str) {
        return (qep0) Enum.valueOf(qep0.class, str);
    }

    public static qep0[] values() {
        return (qep0[]) c.clone();
    }
}
