package a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fi30 {
    public static final ColorDrawable A;
    public static final double z = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f9569a;
    public final ki30 c;
    public final ki30 d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public zjj0 n;
    public ColorStateList o;
    public RippleDrawable p;
    public LayerDrawable q;
    public ki30 r;
    public boolean t;
    public ValueAnimator u;
    public final TimeInterpolator v;
    public final int w;
    public final int x;
    public final Rect b = new Rect();
    public boolean s = false;
    public float y = 0.0f;

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public fi30(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.e = -1.0f;
        this.f9569a = materialCardView;
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, eqd0.f8233a, R.attr.materialCardViewStyle, R.style.CardView);
        ki30 ki30Var = new ki30(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.c = ki30Var;
        ki30Var.o(materialCardView.getContext());
        ki30Var.u();
        daf dafVarL = ki30Var.j().l();
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            this.e = dimension;
            dafVarL.R(dimension);
        }
        this.d = new ki30();
        h(dafVarL.c());
        this.v = g7x.W(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, n73.f23021a);
        this.w = n6x.T(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.x = n6x.T(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(qzb qzbVar, float f) {
        if (qzbVar instanceof wgg0) {
            return (float) ((1.0d - z) * ((double) f));
        }
        if (qzbVar instanceof uzf) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float fMax = 0.0f;
        for (akj0 akj0Var : this.n.c()) {
            if (akj0Var != null) {
                qzb qzbVar = akj0Var.f1025a;
                ki30 ki30Var = this.c;
                float fB = b(qzbVar, ki30Var.l());
                qzb qzbVar2 = akj0Var.b;
                float[] fArr = ki30Var.Y;
                float fMax2 = Math.max(fB, b(qzbVar2, fArr != null ? fArr[0] : ki30Var.b.f14810a.d().f.a(ki30Var.h())));
                qzb qzbVar3 = akj0Var.c;
                float[] fArr2 = ki30Var.Y;
                float fB2 = b(qzbVar3, fArr2 != null ? fArr2[1] : ki30Var.b.f14810a.d().g.a(ki30Var.h()));
                qzb qzbVar4 = akj0Var.d;
                float[] fArr3 = ki30Var.Y;
                fMax = Math.max(fMax, Math.max(fMax2, Math.max(fB2, b(qzbVar4, fArr3 != null ? fArr3[2] : ki30Var.b.f14810a.d().h.a(ki30Var.h())))));
            }
        }
        return fMax;
    }

    public final LayerDrawable c() {
        if (this.p == null) {
            this.r = new ki30(this.n);
            this.p = new RippleDrawable(this.l, null, this.r);
        }
        LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.p, this.d, this.k});
        FocusRingDrawable.f(this.f9569a.getContext(), layerDrawable2, this.r);
        layerDrawable2.setId(2, R.id.mtrl_card_checked_layer_id);
        this.q = layerDrawable2;
        return layerDrawable2;
    }

    public final ei30 d(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.f9569a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new ei30(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.q != null) {
            MaterialCardView materialCardView = this.f9569a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.h;
            boolean z2 = (i5 & 8388613) == 8388613;
            int i6 = this.f;
            int i7 = z2 ? ((i - i6) - this.g) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.g) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.g) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.g) - iCeil;
            }
            int i10 = i6;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.q.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.y = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = this.y;
            if (z2) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.u = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.y, f);
            this.u = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new fd5(this, (byte) 22));
            this.u.setInterpolator(this.v);
            this.u.setDuration((long) ((z2 ? this.w : this.x) * f2));
            this.u.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.k = drawableMutate;
            drawableMutate.setTintList(this.m);
            f(this.f9569a.i, false);
        } else {
            this.k = A;
        }
        LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.k);
        }
    }

    public final void h(zjj0 zjj0Var) {
        this.n = zjj0Var;
        ki30 ki30Var = this.c;
        ki30Var.v(zjj0Var);
        this.d.v(zjj0Var);
        ki30 ki30Var2 = this.r;
        if (ki30Var2 != null) {
            ki30Var2.v(zjj0Var);
        }
        ki30Var.x = !ki30Var.p();
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f9569a;
        return materialCardView.getPreventCornerOverlap() && this.c.p() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f9569a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.j;
        Drawable drawableC = j() ? c() : this.d;
        this.j = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f9569a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f9569a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.c.p()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - z) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.b;
        materialCardView.c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        xr xrVar = materialCardView.e;
        CardView cardView = (CardView) xrVar.b;
        if (!cardView.getUseCompatPadding()) {
            xrVar.t(0, 0, 0, 0);
            return;
        }
        xfg0 xfg0Var = (xfg0) xrVar.f41344a;
        float f = xfg0Var.e;
        float f2 = xfg0Var.f40790a;
        int iCeil = (int) Math.ceil(yfg0.a(f, f2, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(yfg0.b(f, f2, cardView.getPreventCornerOverlap()));
        xrVar.t(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z2 = this.s;
        MaterialCardView materialCardView = this.f9569a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.j));
    }
}
