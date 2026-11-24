package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class meb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final meb0 f21636a;
    public static final meb0 b;
    public static final /* synthetic */ meb0[] c;

    static {
        meb0 meb0Var = new meb0("LuckyWheel", 0);
        f21636a = meb0Var;
        meb0 meb0Var2 = new meb0("Jackpot", 1);
        b = meb0Var2;
        c = new meb0[]{meb0Var, meb0Var2};
    }

    public static meb0 valueOf(String str) {
        return (meb0) Enum.valueOf(meb0.class, str);
    }

    public static meb0[] values() {
        return (meb0[]) c.clone();
    }
}
