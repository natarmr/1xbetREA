package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class pej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pej0 f26857a;
    public static final pej0 b;
    public static final /* synthetic */ pej0[] c;

    static {
        pej0 pej0Var = new pej0("DEPOSIT", 0);
        f26857a = pej0Var;
        pej0 pej0Var2 = new pej0("PAYOUT", 1);
        b = pej0Var2;
        c = new pej0[]{pej0Var, pej0Var2};
    }

    public static pej0 valueOf(String str) {
        return (pej0) Enum.valueOf(pej0.class, str);
    }

    public static pej0[] values() {
        return (pej0[]) c.clone();
    }
}
