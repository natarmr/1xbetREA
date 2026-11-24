package org.xplatform.uikit.components.market.view;

import a.fy20;
import a.j0d;
import a.lt20;
import a.nr20;
import a.pr20;
import a.q3d;
import a.qr20;
import android.content.Context;
import android.text.StaticLayout;
import android.util.AttributeSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;

/* JADX INFO: loaded from: classes6.dex */
public final class DsMarketCoefficient extends nr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pr20 f47252a;
    public final fy20 b;
    public final qr20 c;
    public final List d;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsMarketCoefficient(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.marketStyle);
        pr20 pr20Var = new pr20(this, attributeSet, R.attr.marketStyle);
        this.f47252a = pr20Var;
        fy20 fy20Var = new fy20(this, attributeSet, R.attr.marketStyle);
        this.b = fy20Var;
        qr20 qr20Var = new qr20(this, attributeSet);
        this.c = qr20Var;
        this.d = q3d.j(pr20Var, fy20Var, qr20Var);
    }

    public final String getCoefficientMarket() {
        return this.b.i;
    }

    public final j0d getCoefficientState() {
        return this.b.r;
    }

    @Override // a.nr20
    public List<lt20> getDelegates() {
        return this.d;
    }

    public final String getDescriptionMarket() {
        CharSequence text;
        String string;
        StaticLayout staticLayout = this.b.v;
        return (staticLayout == null || (text = staticLayout.getText()) == null || (string = text.toString()) == null) ? "" : string;
    }

    public final boolean getShowBlock() {
        return this.c.i;
    }

    public final boolean getShowCoupon() {
        return this.c.g;
    }

    public final boolean getShowPopular() {
        return this.c.j;
    }

    public final boolean getShowTrack() {
        return this.c.h;
    }

    public final void setCoefficientMarket(String str) {
        str.getClass();
        fy20 fy20Var = this.b;
        fy20Var.getClass();
        if (Intrinsics.d(fy20Var.h, str)) {
            return;
        }
        fy20Var.h = str;
        requestLayout();
    }

    public final void setCoefficientState(j0d j0dVar) {
        j0dVar.getClass();
        fy20 fy20Var = this.b;
        fy20Var.getClass();
        fy20Var.r = j0dVar;
        fy20Var.c();
        refreshDrawableState();
    }

    public final void setDescriptionMarket(String str) {
        str.getClass();
        fy20 fy20Var = this.b;
        fy20Var.getClass();
        if (Intrinsics.d(fy20Var.g, str)) {
            return;
        }
        fy20Var.g = str;
        requestLayout();
    }

    public final void setMaxLines(int i) {
        this.b.s = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        DsBadge dsBadge;
        DsBadge dsBadge2;
        DsBadge dsBadge3;
        DsBadge dsBadge4;
        super.setVisibility(i);
        qr20 qr20Var = this.c;
        if (qr20Var.g && (dsBadge4 = qr20Var.c) != null) {
            dsBadge4.setVisibility(i);
        }
        if (qr20Var.h && (dsBadge3 = qr20Var.d) != null) {
            dsBadge3.setVisibility(i);
        }
        if (qr20Var.i && (dsBadge2 = qr20Var.e) != null) {
            dsBadge2.setVisibility(i);
        }
        if (qr20Var.j && (dsBadge = qr20Var.f) != null) {
            dsBadge.setVisibility(i);
        }
        if (i == 0) {
            qr20Var.h();
        }
    }

    public final void setCoefficientMarket(CharSequence charSequence) {
        if (this.b.h(charSequence)) {
            requestLayout();
        }
    }

    public final void setDescriptionMarket(CharSequence charSequence) {
        if (this.b.i(charSequence)) {
            requestLayout();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMarketCoefficient(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMarketCoefficient(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
