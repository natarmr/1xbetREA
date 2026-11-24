package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.market.view.DsMarketCoefficient;

/* JADX INFO: loaded from: classes6.dex */
public final class qr20 implements lt20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMarketCoefficient f29189a;
    public final int b;
    public DsBadge c;
    public DsBadge d;
    public DsBadge e;
    public final DsBadge f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final boolean j;

    public qr20(DsMarketCoefficient dsMarketCoefficient, AttributeSet attributeSet) {
        this.f29189a = dsMarketCoefficient;
        this.b = dsMarketCoefficient.getContext().getResources().getDimensionPixelSize(R.dimen.space_2);
        Context context = dsMarketCoefficient.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.R, 0, 0);
        j(typedArrayObtainStyledAttributes.getBoolean(21, this.g));
        i(typedArrayObtainStyledAttributes.getBoolean(19, this.i));
        l(typedArrayObtainStyledAttributes.getBoolean(23, this.h));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(22, this.j);
        if (z && this.f == null) {
            this.f = g(R.style.Widget_DSBadge_Market_Popular);
        }
        DsBadge dsBadge = this.f;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
        this.j = z;
        h();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // a.lt20
    public final void a() {
        h();
    }

    @Override // a.lt20
    public final void c() {
        DsBadge dsBadge;
        DsBadge dsBadge2;
        DsBadge dsBadge3;
        ColorStateList imageTintList;
        DsBadge dsBadge4;
        ColorStateList imageTintList2;
        DsBadge dsBadge5;
        ColorStateList imageTintList3;
        DsBadge dsBadge6;
        ColorStateList imageTintList4;
        boolean z = this.g;
        DsMarketCoefficient dsMarketCoefficient = this.f29189a;
        Integer numValueOf = null;
        Integer numValueOf2 = (!z || (dsBadge6 = this.c) == null || (imageTintList4 = dsBadge6.getImageTintList()) == null) ? null : Integer.valueOf(imageTintList4.getColorForState(dsMarketCoefficient.getDrawableState(), 0));
        Integer numValueOf3 = (!this.h || (dsBadge5 = this.d) == null || (imageTintList3 = dsBadge5.getImageTintList()) == null) ? null : Integer.valueOf(imageTintList3.getColorForState(dsMarketCoefficient.getDrawableState(), 0));
        Integer numValueOf4 = (!this.i || (dsBadge4 = this.e) == null || (imageTintList2 = dsBadge4.getImageTintList()) == null) ? null : Integer.valueOf(imageTintList2.getColorForState(dsMarketCoefficient.getDrawableState(), 0));
        boolean z2 = this.j;
        DsBadge dsBadge7 = this.f;
        if (z2 && dsBadge7 != null && (imageTintList = dsBadge7.getImageTintList()) != null) {
            numValueOf = Integer.valueOf(imageTintList.getColorForState(dsMarketCoefficient.getDrawableState(), 0));
        }
        if (numValueOf2 != null && (dsBadge3 = this.c) != null) {
            dsBadge3.setColorFilter(numValueOf2.intValue(), PorterDuff.Mode.SRC_IN);
        }
        if (numValueOf3 != null && (dsBadge2 = this.d) != null) {
            dsBadge2.setColorFilter(numValueOf3.intValue(), PorterDuff.Mode.SRC_IN);
        }
        if (numValueOf4 != null && (dsBadge = this.e) != null) {
            dsBadge.setColorFilter(numValueOf4.intValue(), PorterDuff.Mode.SRC_IN);
        }
        if (numValueOf == null || dsBadge7 == null) {
            return;
        }
        dsBadge7.setColorFilter(numValueOf.intValue(), PorterDuff.Mode.SRC_IN);
    }

    public final DsBadge g(int i) {
        DsMarketCoefficient dsMarketCoefficient = this.f29189a;
        DsBadge dsBadge = new DsBadge(new tje(dsMarketCoefficient.getContext(), i), null, 6);
        dsBadge.a(dsMarketCoefficient, new rx00(this, (byte) 19));
        return dsBadge;
    }

    public final void h() {
        int i;
        int i2;
        int i3;
        DsBadge dsBadge;
        boolean z = this.g;
        int i4 = this.b;
        if (z && (dsBadge = this.c) != null) {
            dsBadge.d(8388659, i4, -i4);
        }
        boolean z2 = this.h;
        DsBadge dsBadge2 = this.f;
        boolean z3 = this.j;
        if (z2) {
            if (this.i) {
                DsBadge dsBadge3 = this.e;
                i2 = -(dsBadge3 != null ? dsBadge3.getMaxWidth() : 0);
            } else {
                i2 = 0;
            }
            if (z3) {
                i3 = -(dsBadge2 != null ? dsBadge2.getMaxWidth() : 0);
            } else {
                i3 = 0;
            }
            int i5 = (i2 == 0 && i3 == 0) ? i4 : i2 + i3;
            DsBadge dsBadge4 = this.d;
            if (dsBadge4 != null) {
                dsBadge4.d(8388661, i5, 0);
            }
        }
        if (this.i) {
            if (z3) {
                i = -(dsBadge2 != null ? dsBadge2.getMaxWidth() : 0);
            } else {
                i = i4;
            }
            DsBadge dsBadge5 = this.e;
            if (dsBadge5 != null) {
                dsBadge5.d(8388661, i, 0);
            }
        }
        if (!z3 || dsBadge2 == null) {
            return;
        }
        dsBadge2.d(8388661, i4, 0);
    }

    public final void i(boolean z) {
        if (z && this.e == null) {
            this.e = g(R.style.Widget_DSBadge_Market_Block);
        }
        DsBadge dsBadge = this.e;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
        this.i = z;
        h();
    }

    public final void j(boolean z) {
        if (z && this.c == null) {
            this.c = g(R.style.Widget_DSBadge_Market_Coupon);
        }
        DsBadge dsBadge = this.c;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
        this.g = z;
        h();
    }

    public final void l(boolean z) {
        if (z && this.d == null) {
            this.d = g(R.style.Widget_DSBadge_Market_Track);
        }
        DsBadge dsBadge = this.d;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
        this.h = z;
        h();
    }
}
