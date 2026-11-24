package a;

import org.xplatform.coupon.impl.notify.CouponNotificationWorker;

/* JADX INFO: loaded from: classes.dex */
public final class n0f extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ CouponNotificationWorker j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0f(CouponNotificationWorker couponNotificationWorker, zje zjeVar) {
        super(zjeVar);
        this.j = couponNotificationWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
