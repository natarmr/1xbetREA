package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class miq0 implements trz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final miq0 f21857a;
    public static final /* synthetic */ miq0[] b;

    static {
        miq0 miq0Var = new miq0("SELF_EXCLUSION", 0);
        f21857a = miq0Var;
        b = new miq0[]{miq0Var};
    }

    public static miq0 valueOf(String str) {
        return (miq0) Enum.valueOf(miq0.class, str);
    }

    public static miq0[] values() {
        return (miq0[]) b.clone();
    }

    @Override // a.trz
    public final int getId() {
        return 30;
    }
}
