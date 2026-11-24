package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class g8i0 implements wrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g8i0 f10866a;
    public static final /* synthetic */ g8i0[] b;

    static {
        g8i0 g8i0Var = new g8i0("SELF_EXCLUSION", 0);
        f10866a = g8i0Var;
        b = new g8i0[]{g8i0Var};
    }

    public static g8i0 valueOf(String str) {
        return (g8i0) Enum.valueOf(g8i0.class, str);
    }

    public static g8i0[] values() {
        return (g8i0[]) b.clone();
    }

    @Override // a.wrz
    public final int getId() {
        return 30;
    }
}
