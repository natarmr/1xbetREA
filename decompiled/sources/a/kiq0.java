package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kiq0 implements urz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kiq0 f18349a;
    public static final /* synthetic */ kiq0[] b;

    static {
        kiq0 kiq0Var = new kiq0("SELF_EXCLUSION", 0);
        f18349a = kiq0Var;
        b = new kiq0[]{kiq0Var};
    }

    public static kiq0 valueOf(String str) {
        return (kiq0) Enum.valueOf(kiq0.class, str);
    }

    public static kiq0[] values() {
        return (kiq0[]) b.clone();
    }
}
