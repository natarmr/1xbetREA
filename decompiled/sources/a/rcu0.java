package a;

import android.view.View;
import org.xplatform.coupon.impl.core.presentation.base.view.CouponCardBlock;

/* JADX INFO: loaded from: classes5.dex */
public final class rcu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CouponCardBlock f30258a;
    public final CouponCardBlock b;

    public rcu0(CouponCardBlock couponCardBlock, CouponCardBlock couponCardBlock2) {
        this.f30258a = couponCardBlock;
        this.b = couponCardBlock2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f30258a;
    }
}
