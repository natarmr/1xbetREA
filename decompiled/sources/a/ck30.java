package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ck30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ck30 f4488a;
    public static final ck30 b;
    public static final /* synthetic */ ck30[] c;

    static {
        ck30 ck30Var = new ck30("Min", 0);
        f4488a = ck30Var;
        ck30 ck30Var2 = new ck30("Max", 1);
        b = ck30Var2;
        c = new ck30[]{ck30Var, ck30Var2};
    }

    public static ck30 valueOf(String str) {
        return (ck30) Enum.valueOf(ck30.class, str);
    }

    public static ck30[] values() {
        return (ck30[]) c.clone();
    }
}
