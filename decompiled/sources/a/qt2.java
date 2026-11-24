package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qt2 f29279a;
    public static final qt2 b;
    public static final /* synthetic */ qt2[] c;

    static {
        qt2 qt2Var = new qt2("EXPANDED", 0);
        f29279a = qt2Var;
        qt2 qt2Var2 = new qt2("COLLAPSED", 1);
        b = qt2Var2;
        c = new qt2[]{qt2Var, qt2Var2};
    }

    public static qt2 valueOf(String str) {
        return (qt2) Enum.valueOf(qt2.class, str);
    }

    public static qt2[] values() {
        return (qt2[]) c.clone();
    }
}
