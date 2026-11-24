package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class wfj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wfj0 f39075a;
    public static final wfj0 b;
    public static final /* synthetic */ wfj0[] c;

    static {
        wfj0 wfj0Var = new wfj0("DEPOSIT", 0);
        f39075a = wfj0Var;
        wfj0 wfj0Var2 = new wfj0("PAYOUT", 1);
        b = wfj0Var2;
        c = new wfj0[]{wfj0Var, wfj0Var2};
    }

    public static wfj0 valueOf(String str) {
        return (wfj0) Enum.valueOf(wfj0.class, str);
    }

    public static wfj0[] values() {
        return (wfj0[]) c.clone();
    }
}
