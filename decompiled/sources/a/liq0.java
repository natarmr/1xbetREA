package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class liq0 implements vrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final liq0 f20118a;
    public static final /* synthetic */ liq0[] b;

    static {
        liq0 liq0Var = new liq0("SELF_EXCLUSION", 0);
        f20118a = liq0Var;
        b = new liq0[]{liq0Var};
    }

    public static liq0 valueOf(String str) {
        return (liq0) Enum.valueOf(liq0.class, str);
    }

    public static liq0[] values() {
        return (liq0[]) b.clone();
    }

    @Override // a.vrz
    public final int getId() {
        return 30;
    }
}
