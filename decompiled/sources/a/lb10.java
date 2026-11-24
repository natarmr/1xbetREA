package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lb10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lb10 f19735a;
    public static final lb10 b;
    public static final /* synthetic */ lb10[] c;

    static {
        lb10 lb10Var = new lb10("NO_ERROR", 0);
        f19735a = lb10Var;
        lb10 lb10Var2 = new lb10("CONTENT_ERROR", 1);
        b = lb10Var2;
        c = new lb10[]{lb10Var, lb10Var2};
    }

    public static lb10 valueOf(String str) {
        return (lb10) Enum.valueOf(lb10.class, str);
    }

    public static lb10[] values() {
        return (lb10[]) c.clone();
    }
}
