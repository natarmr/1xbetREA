package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bw1 f3302a;
    public static final bw1 b;
    public static final /* synthetic */ bw1[] c;

    static {
        bw1 bw1Var = new bw1("CURRENT", 0);
        f3302a = bw1Var;
        bw1 bw1Var2 = new bw1("COMPLETED", 1);
        b = bw1Var2;
        c = new bw1[]{bw1Var, bw1Var2};
    }

    public static bw1 valueOf(String str) {
        return (bw1) Enum.valueOf(bw1.class, str);
    }

    public static bw1[] values() {
        return (bw1[]) c.clone();
    }
}
