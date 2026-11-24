package a;

import android.view.View;
import org.xplatform.uikit_sport.sport_coupon_card.common.DsSportCouponCard;

/* JADX INFO: loaded from: classes5.dex */
public final class scu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSportCouponCard f32006a;
    public final DsSportCouponCard b;

    public scu0(DsSportCouponCard dsSportCouponCard, DsSportCouponCard dsSportCouponCard2) {
        this.f32006a = dsSportCouponCard;
        this.b = dsSportCouponCard2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32006a;
    }
}
