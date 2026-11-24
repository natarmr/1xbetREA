package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qt8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qt8 f29287a;
    public static final qt8 b;
    public static final qt8 c;
    public static final /* synthetic */ qt8[] d;

    static {
        qt8 qt8Var = new qt8("None", 0);
        f29287a = qt8Var;
        qt8 qt8Var2 = new qt8("Top", 1);
        b = qt8Var2;
        qt8 qt8Var3 = new qt8("Bottom", 2);
        c = qt8Var3;
        d = new qt8[]{qt8Var, qt8Var2, qt8Var3};
    }

    public static qt8 valueOf(String str) {
        return (qt8) Enum.valueOf(qt8.class, str);
    }

    public static qt8[] values() {
        return (qt8[]) d.clone();
    }
}
