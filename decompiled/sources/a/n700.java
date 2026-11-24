package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class n700 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n700 f23018a;
    public static final /* synthetic */ n700[] b;

    static {
        n700 n700Var = new n700("CIRCLE", 0);
        f23018a = n700Var;
        b = new n700[]{n700Var, new n700("SQUARE", 1), new n700("TRIANGLE", 2)};
    }

    public static n700 valueOf(String str) {
        return (n700) Enum.valueOf(n700.class, str);
    }

    public static n700[] values() {
        return (n700[]) b.clone();
    }
}
