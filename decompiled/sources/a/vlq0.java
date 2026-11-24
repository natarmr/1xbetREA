package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vlq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vlq0 f37640a;
    public static final /* synthetic */ vlq0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    vlq0 EF0;

    static {
        vlq0 vlq0Var = new vlq0("ONE_HOUR", 0);
        vlq0 vlq0Var2 = new vlq0("SIX_HOUR", 1);
        vlq0 vlq0Var3 = new vlq0("TWELVE_HOUR", 2);
        vlq0 vlq0Var4 = new vlq0("ONE_DAY", 3);
        vlq0 vlq0Var5 = new vlq0("WEEK", 4);
        f37640a = vlq0Var5;
        b = new vlq0[]{vlq0Var, vlq0Var2, vlq0Var3, vlq0Var4, vlq0Var5, new vlq0("ALWAYS", 5)};
    }

    public static vlq0 valueOf(String str) {
        return (vlq0) Enum.valueOf(vlq0.class, str);
    }

    public static vlq0[] values() {
        return (vlq0[]) b.clone();
    }
}
