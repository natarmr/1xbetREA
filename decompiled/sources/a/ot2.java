package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ot2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ot2 f25810a;
    public static final ot2 b;
    public static final /* synthetic */ ot2[] c;

    static {
        ot2 ot2Var = new ot2("EXPANDED", 0);
        f25810a = ot2Var;
        ot2 ot2Var2 = new ot2("COLLAPSED", 1);
        b = ot2Var2;
        c = new ot2[]{ot2Var, ot2Var2};
    }

    public static ot2 valueOf(String str) {
        return (ot2) Enum.valueOf(ot2.class, str);
    }

    public static ot2[] values() {
        return (ot2[]) c.clone();
    }
}
