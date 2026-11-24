package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class flk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final flk0 f9742a;
    public static final /* synthetic */ flk0[] b;

    static {
        flk0 flk0Var = new flk0("ASCENDING", 0);
        f9742a = flk0Var;
        b = new flk0[]{flk0Var, new flk0("DESCENDING", 1)};
    }

    public static flk0 valueOf(String str) {
        return (flk0) Enum.valueOf(flk0.class, str);
    }

    public static flk0[] values() {
        return (flk0[]) b.clone();
    }
}
