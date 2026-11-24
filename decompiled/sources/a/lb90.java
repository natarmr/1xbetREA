package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lb90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lb90 f19744a;
    public static final lb90 b;
    public static final /* synthetic */ lb90[] c;

    static {
        lb90 lb90Var = new lb90("WHOLE_PAYOUT", 0);
        f19744a = lb90Var;
        lb90 lb90Var2 = new lb90("FREE_BET_PAYOUT", 1);
        b = lb90Var2;
        c = new lb90[]{lb90Var, lb90Var2};
    }

    public static lb90 valueOf(String str) {
        return (lb90) Enum.valueOf(lb90.class, str);
    }

    public static lb90[] values() {
        return (lb90[]) c.clone();
    }
}
