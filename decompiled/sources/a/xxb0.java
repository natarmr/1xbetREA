package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xxb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xxb0 f41650a;
    public static final xxb0 b;
    public static final /* synthetic */ xxb0[] c;

    static {
        xxb0 xxb0Var = new xxb0("PLACES_COUNT", 0);
        f41650a = xxb0Var;
        xxb0 xxb0Var2 = new xxb0("PRIZES_COUNT", 1);
        b = xxb0Var2;
        c = new xxb0[]{xxb0Var, xxb0Var2};
    }

    public static xxb0 valueOf(String str) {
        return (xxb0) Enum.valueOf(xxb0.class, str);
    }

    public static xxb0[] values() {
        return (xxb0[]) c.clone();
    }
}
