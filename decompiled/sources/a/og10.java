package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class og10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final og10 f25195a;
    public static final og10 b;
    public static final /* synthetic */ og10[] c;

    static {
        og10 og10Var = new og10("SUPPORT", 0);
        f25195a = og10Var;
        og10 og10Var2 = new og10("WEEKLY_BONUS", 1);
        b = og10Var2;
        c = new og10[]{og10Var, og10Var2};
    }

    public static og10 valueOf(String str) {
        return (og10) Enum.valueOf(og10.class, str);
    }

    public static og10[] values() {
        return (og10[]) c.clone();
    }
}
