package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ea10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ea10 f7448a;
    public static final /* synthetic */ ea10[] b;

    static {
        ea10 ea10Var = new ea10("Immediately", 0);
        f7448a = ea10Var;
        b = new ea10[]{ea10Var, new ea10("OnIterationFinish", 1)};
    }

    public static ea10 valueOf(String str) {
        return (ea10) Enum.valueOf(ea10.class, str);
    }

    public static ea10[] values() {
        return (ea10[]) b.clone();
    }
}
