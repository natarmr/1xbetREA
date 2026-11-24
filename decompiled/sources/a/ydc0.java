package a;

import android.javax.sip.header.SubscriptionStateHeader;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public enum ydc0 {
    ALL(R.string.all),
    ACTIVE(R.string.promo_active),
    USED(R.string.promo_used),
    EXPIRED(R.string.promo_wasted),
    INACTIVE(R.string.promo_inactive);

    public static final nh70 b = new nh70();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42428a;

    ydc0(int i) {
        this.f42428a = i;
    }

    public final String C() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "all";
        }
        if (iOrdinal == 1) {
            return SubscriptionStateHeader.ACTIVE;
        }
        if (iOrdinal == 2) {
            return "used";
        }
        if (iOrdinal == 3) {
            return "overdue";
        }
        if (iOrdinal == 4) {
            return "non_active";
        }
        t9f.b();
        return null;
    }
}
