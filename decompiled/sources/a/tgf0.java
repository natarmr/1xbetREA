package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tgf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tgf0 f33909a;
    public static final /* synthetic */ tgf0[] b;

    static {
        tgf0 tgf0Var = new tgf0("LAUNCH_INITIAL_REFRESH", 0);
        f33909a = tgf0Var;
        b = new tgf0[]{tgf0Var, new tgf0("SKIP_INITIAL_REFRESH", 1)};
    }

    public static tgf0 valueOf(String str) {
        return (tgf0) Enum.valueOf(tgf0.class, str);
    }

    public static tgf0[] values() {
        return (tgf0[]) b.clone();
    }
}
