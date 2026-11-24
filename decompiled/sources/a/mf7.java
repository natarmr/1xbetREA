package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class mf7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mf7 f21681a;
    public static final mf7 b;
    public static final mf7 c;
    public static final /* synthetic */ mf7[] d;
    public static final /* synthetic */ c0o e;

    /* JADX INFO: Fake field, exist only in values array */
    mf7 EF0;

    static {
        mf7 mf7Var = new mf7("BET0", 0);
        mf7 mf7Var2 = new mf7("BET1500", 1);
        mf7 mf7Var3 = new mf7("BET2500", 2);
        mf7 mf7Var4 = new mf7("BET6000", 3);
        mf7 mf7Var5 = new mf7("BET12000", 4);
        mf7 mf7Var6 = new mf7("BET24000", 5);
        mf7 mf7Var7 = new mf7("BET60000", 6);
        mf7 mf7Var8 = new mf7("BET120000", 7);
        mf7 mf7Var9 = new mf7("BET240000", 8);
        mf7 mf7Var10 = new mf7("BET600000", 9);
        mf7 mf7Var11 = new mf7("BET1200000", 10);
        mf7 mf7Var12 = new mf7("BET2400000", 11);
        f21681a = mf7Var12;
        mf7 mf7Var13 = new mf7("BET6000000", 12);
        b = mf7Var13;
        mf7 mf7Var14 = new mf7("BET12000000", 13);
        c = mf7Var14;
        mf7[] mf7VarArr = {mf7Var, mf7Var2, mf7Var3, mf7Var4, mf7Var5, mf7Var6, mf7Var7, mf7Var8, mf7Var9, mf7Var10, mf7Var11, mf7Var12, mf7Var13, mf7Var14};
        d = mf7VarArr;
        e = new c0o(mf7VarArr);
    }

    public static mf7 valueOf(String str) {
        return (mf7) Enum.valueOf(mf7.class, str);
    }

    public static mf7[] values() {
        return (mf7[]) d.clone();
    }

    public final int a() {
        switch (ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1500;
            case 2:
                return 2500;
            case 3:
                return 6000;
            case 4:
                return 12000;
            case 5:
                return 24000;
            case 6:
                return 60000;
            case 7:
                return 120000;
            case 8:
                return 240000;
            case 9:
                return 600000;
            case 10:
                return 1200000;
            case 11:
                return 2400000;
            case 12:
                return 6000000;
            case 13:
                return 12000000;
            default:
                t9f.b();
                return 0;
        }
    }
}
