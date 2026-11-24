package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class fl70 implements xsy {
    public static int b(fza0 fza0Var) {
        switch (fza0Var.ordinal()) {
            case 0:
                return R.string.aggregator_one_x_live;
            case 1:
                return R.string.live_casino_title;
            case 2:
                return R.string.array_slots;
            case 3:
                return R.string.empty_str;
            case 4:
                return R.string.popular;
            case 5:
                return R.string.slots_popular;
            case 6:
                return R.string.live_casino_popular;
            case 7:
                return R.string.top_choice;
            case 8:
                return R.string.new_slots;
            case 9:
                return R.string.exclusive_slots;
            case 10:
                return R.string.recommendation;
            default:
                t9f.b();
                return 0;
        }
    }

    public static boolean c(double d, double d2, double d3, double d4, boolean z, boolean z2, double d5) {
        return ((d3 <= d2 && d2 <= d4) || d2 == d5 || z || z2) && d > 0.0d;
    }

    @Override // a.xsy
    public boolean a(iys0 iys0Var, iys0 iys0Var2) {
        return iys0Var.equals(iys0Var2);
    }
}
