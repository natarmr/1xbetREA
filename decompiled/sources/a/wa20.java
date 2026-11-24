package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wa20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wa20 f38809a;
    public static final wa20 b;
    public static final wa20 c;
    public static final wa20 d;
    public static final wa20 e;
    public static final wa20 f;
    public static final wa20 g;
    public static final wa20 h;
    public static final wa20 i;
    public static final wa20 j;
    public static final wa20 k;
    public static final wa20 l;
    public static final /* synthetic */ wa20[] m;

    static {
        wa20 wa20Var = new wa20("ACCEPT_CHANGES", 0);
        f38809a = wa20Var;
        wa20 wa20Var2 = new wa20("ANY_CHANGES", 1);
        b = wa20Var2;
        wa20 wa20Var3 = new wa20("INCREASE_CHANGES", 2);
        c = wa20Var3;
        wa20 wa20Var4 = new wa20("PUSH_AFTER_BET", 3);
        d = wa20Var4;
        wa20 wa20Var5 = new wa20("CLEAR_COUPON_AFTER_BET", 4);
        e = wa20Var5;
        wa20 wa20Var6 = new wa20("RESET_SCORE", 5);
        f = wa20Var6;
        wa20 wa20Var7 = new wa20("TRANS_FROM_LINE_TO_LIVE", 6);
        g = wa20Var7;
        wa20 wa20Var8 = new wa20("FAST_BET", 7);
        h = wa20Var8;
        wa20 wa20Var9 = new wa20("AUTOMAX", 8);
        i = wa20Var9;
        wa20 wa20Var10 = new wa20("VIP_BET", 9);
        j = wa20Var10;
        wa20 wa20Var11 = new wa20("SET_AMOUNT_MANUALLY", 10);
        k = wa20Var11;
        wa20 wa20Var12 = new wa20("DELETE_COMPLETED_EVENTS", 11);
        l = wa20Var12;
        m = new wa20[]{wa20Var, wa20Var2, wa20Var3, wa20Var4, wa20Var5, wa20Var6, wa20Var7, wa20Var8, wa20Var9, wa20Var10, wa20Var11, wa20Var12};
    }

    public static wa20 valueOf(String str) {
        return (wa20) Enum.valueOf(wa20.class, str);
    }

    public static wa20[] values() {
        return (wa20[]) m.clone();
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
