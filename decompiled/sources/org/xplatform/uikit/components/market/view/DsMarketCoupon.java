package org.xplatform.uikit.components.market.view;

import a.fy20;
import a.j0d;
import a.lt20;
import a.mt20;
import a.nr20;
import a.pr20;
import a.q3d;
import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsMarketCoupon extends nr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy20 f47253a;
    public final List b;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsMarketCoupon(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.couponStyle);
        pr20 pr20Var = new pr20(this, attributeSet, R.attr.couponStyle);
        fy20 fy20Var = new fy20(this, attributeSet, R.attr.couponStyle);
        this.f47253a = fy20Var;
        mt20 mt20Var = new mt20(this, attributeSet, R.attr.couponStyle);
        setTag("DsMarketCoupon");
        this.b = q3d.j(pr20Var, fy20Var, mt20Var);
    }

    @Override // a.nr20
    public List<lt20> getDelegates() {
        return this.b;
    }

    public final void setCoefficientMarket(String str) {
        str.getClass();
        fy20 fy20Var = this.f47253a;
        fy20Var.getClass();
        if (Intrinsics.d(fy20Var.h, str)) {
            return;
        }
        fy20Var.h = str;
        requestLayout();
    }

    public final void setCoefficientState(j0d j0dVar) {
        j0dVar.getClass();
        fy20 fy20Var = this.f47253a;
        fy20Var.getClass();
        fy20Var.r = j0dVar;
        fy20Var.c();
        refreshDrawableState();
    }

    public final void setDescriptionMarket(String str) {
        str.getClass();
        fy20 fy20Var = this.f47253a;
        fy20Var.getClass();
        if (Intrinsics.d(fy20Var.g, str)) {
            return;
        }
        fy20Var.g = str;
        requestLayout();
    }

    public final void setCoefficientMarket(CharSequence charSequence) {
        if (this.f47253a.h(charSequence)) {
            requestLayout();
        }
    }

    public final void setDescriptionMarket(CharSequence charSequence) {
        if (this.f47253a.i(charSequence)) {
            requestLayout();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMarketCoupon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMarketCoupon(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
