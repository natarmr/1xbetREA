package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xa20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xa20 f40534a;
    public static final xa20 b;
    public static final xa20 c;
    public static final xa20 d;
    public static final xa20 e;
    public static final xa20 f;
    public static final xa20 g;
    public static final xa20 h;
    public static final xa20 i;
    public static final xa20 j;
    public static final xa20 k;
    public static final xa20 l;
    public static final /* synthetic */ xa20[] m;

    static {
        xa20 xa20Var = new xa20("ACCEPT_CHANGES", 0);
        f40534a = xa20Var;
        xa20 xa20Var2 = new xa20("ANY_CHANGES", 1);
        b = xa20Var2;
        xa20 xa20Var3 = new xa20("INCREASE_CHANGES", 2);
        c = xa20Var3;
        xa20 xa20Var4 = new xa20("PUSH_AFTER_BET", 3);
        d = xa20Var4;
        xa20 xa20Var5 = new xa20("CLEAR_COUPON_AFTER_BET", 4);
        e = xa20Var5;
        xa20 xa20Var6 = new xa20("RESET_SCORE", 5);
        f = xa20Var6;
        xa20 xa20Var7 = new xa20("TRANS_FROM_LINE_TO_LIVE", 6);
        g = xa20Var7;
        xa20 xa20Var8 = new xa20("FAST_BET", 7);
        h = xa20Var8;
        xa20 xa20Var9 = new xa20("AUTOMAX", 8);
        i = xa20Var9;
        xa20 xa20Var10 = new xa20("VIP_BET", 9);
        j = xa20Var10;
        xa20 xa20Var11 = new xa20("SET_AMOUNT_MANUALLY", 10);
        k = xa20Var11;
        xa20 xa20Var12 = new xa20("DELETE_COMPLETED_EVENTS", 11);
        l = xa20Var12;
        m = new xa20[]{xa20Var, xa20Var2, xa20Var3, xa20Var4, xa20Var5, xa20Var6, xa20Var7, xa20Var8, xa20Var9, xa20Var10, xa20Var11, xa20Var12};
    }

    public static xa20 valueOf(String str) {
        return (xa20) Enum.valueOf(xa20.class, str);
    }

    public static xa20[] values() {
        return (xa20[]) m.clone();
    }

    public final String a(boolean z) {
        switch (ordinal()) {
            case 0:
                return z ? "submit_changes_on" : "";
            case 1:
                return z ? "accept_changes_on" : "";
            case 2:
                return z ? "accent_rising_on" : "";
            case 3:
                return z ? "get_push_on" : "get_push_off";
            case 4:
                return z ? "clear_coupon_on" : "clear_coupon_off";
            case 5:
                return z ? "clear_changes_on" : "clear_changes_off";
            case 6:
                return z ? "allow_transition_on" : "allow_transition_off";
            case 7:
                return z ? "fast_bets_on" : "fast_bets_off";
            case 8:
                return z ? "automax_on" : "automax_off";
            case 9:
                return z ? "VIP_on" : "VIP_off";
            case 10:
                return z ? "by_hand_on" : "by_hand_off";
            case 11:
                return z ? "delete_completed_events_on" : "delete_completed_events_off";
            default:
                t9f.b();
                return null;
        }
    }
}
