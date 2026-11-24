package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class byv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byv f3437a;
    public static final byv b;
    public static final byv c;
    public static final byv d;
    public static final byv e;
    public static final byv f;
    public static final byv g;
    public static final byv h;
    public static final byv i;
    public static final byv j;
    public static final byv k;
    public static final byv l;
    public static final byv m;
    public static final /* synthetic */ byv[] n;

    static {
        byv byvVar = new byv("BET_ACTION_EVENT", 0);
        f3437a = byvVar;
        byv byvVar2 = new byv("BET_ACTION", 1);
        b = byvVar2;
        byv byvVar3 = new byv("BET_ACTION_COPY", 2);
        c = byvVar3;
        byv byvVar4 = new byv("BET_ACTION_PRINT", 3);
        d = byvVar4;
        byv byvVar5 = new byv("BET_ACTION_POWER_BET", 4);
        e = byvVar5;
        byv byvVar6 = new byv("BET_ACTION_EDIT", 5);
        f = byvVar6;
        byv byvVar7 = new byv("BET_ACTION_AUTO_SALE", 6);
        g = byvVar7;
        byv byvVar8 = new byv("BET_ACTION_SALE", 7);
        h = byvVar8;
        byv byvVar9 = new byv("BET_ACTION_SHARE", 8);
        i = byvVar9;
        byv byvVar10 = new byv("BET_ACTION_HIDE", 9);
        j = byvVar10;
        byv byvVar11 = new byv("BET_ACTION_TRANSACTION", 10);
        k = byvVar11;
        byv byvVar12 = new byv("BET_ACTION_CANCEL", 11);
        l = byvVar12;
        byv byvVar13 = new byv("BET_ACTION_DUPLICATE_COUPON", 12);
        m = byvVar13;
        n = new byv[]{byvVar, byvVar2, byvVar3, byvVar4, byvVar5, byvVar6, byvVar7, byvVar8, byvVar9, byvVar10, byvVar11, byvVar12, byvVar13};
    }

    public static byv valueOf(String str) {
        return (byv) Enum.valueOf(byv.class, str);
    }

    public static byv[] values() {
        return (byv[]) n.clone();
    }

    public final String a() {
        switch (ordinal()) {
            case 0:
                return "bet_action";
            case 1:
                return "action";
            case 2:
                return "copy";
            case 3:
                return "print";
            case 4:
                return "powerbet";
            case 5:
                return "edit";
            case 6:
                return "autosale";
            case 7:
                return "sale";
            case 8:
                return "share";
            case 9:
                return "hide";
            case 10:
                return "transaction";
            case 11:
                return "cancel";
            case 12:
                return "duplicate_coupon";
            default:
                t9f.b();
                return null;
        }
    }
}
