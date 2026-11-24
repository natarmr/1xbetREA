package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zh30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f44374a;
    public zjj0 b;
    public lul0 c;
    public viq d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public ki30 o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public zh30(MaterialButton materialButton, zjj0 zjj0Var) {
        this.f44374a = materialButton;
        this.b = zjj0Var;
    }

    public final ki30 a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (ki30) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.f44374a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.e;
        int i6 = this.g;
        int i7 = this.f;
        int i8 = this.h;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        if (!this.q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void c() {
        ki30 ki30Var = new ki30(this.b);
        lul0 lul0Var = this.c;
        if (lul0Var != null) {
            ki30Var.q(lul0Var);
        }
        viq viqVar = this.d;
        if (viqVar != null) {
            ki30Var.f1 = viqVar;
        }
        MaterialButton materialButton = this.f44374a;
        Context context = materialButton.getContext();
        ki30Var.o(context);
        ki30Var.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            ki30Var.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        ki30Var.b.j = f;
        ki30Var.invalidateSelf();
        ii30 ii30Var = ki30Var.b;
        if (ii30Var.d != colorStateList) {
            ii30Var.d = colorStateList;
            ki30Var.onStateChange(ki30Var.getState());
        }
        ki30 ki30Var2 = new ki30(this.b);
        lul0 lul0Var2 = this.c;
        if (lul0Var2 != null) {
            ki30Var2.q(lul0Var2);
        }
        ki30Var2.setTint(0);
        float f2 = this.j;
        int iH = this.p ? d7x.H(materialButton.getContext(), n6x.V(materialButton, R.attr.colorSurface)) : 0;
        ki30Var2.b.j = f2;
        ki30Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iH);
        ii30 ii30Var2 = ki30Var2.b;
        if (ii30Var2.d != colorStateListValueOf) {
            ii30Var2.d = colorStateListValueOf;
            ki30Var2.onStateChange(ki30Var2.getState());
        }
        ki30 ki30Var3 = new ki30(this.b);
        this.o = ki30Var3;
        lul0 lul0Var3 = this.c;
        if (lul0Var3 != null) {
            ki30Var3.q(lul0Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(ocg0.b(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{ki30Var2, ki30Var}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable.f(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        ki30 ki30VarA = a(false);
        if (ki30VarA != null) {
            ki30VarA.r(this.v);
            ki30VarA.setState(materialButton.getDrawableState());
        }
        FocusRingDrawable focusRingDrawableC = FocusRingDrawable.c(materialButton.getBackground());
        if (focusRingDrawableC != null) {
            focusRingDrawableC.h = new WeakReference(ki30VarA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public final void d() {
        blj0 blj0Var;
        ki30 ki30VarA = a(false);
        if (ki30VarA != null) {
            ki30VarA.v(this.b);
            lul0 lul0Var = this.c;
            if (lul0Var != null) {
                ki30VarA.q(lul0Var);
            }
        }
        ki30 ki30VarA2 = a(true);
        if (ki30VarA2 != null) {
            ki30VarA2.v(this.b);
            lul0 lul0Var2 = this.c;
            if (lul0Var2 != null) {
                ki30VarA2.q(lul0Var2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (objFindDrawableByLayerId instanceof blj0) {
                blj0Var = (blj0) objFindDrawableByLayerId;
            } else {
                blj0Var = null;
            }
        } else {
            blj0Var = null;
        }
        if (blj0Var != null) {
            boolean z = blj0Var instanceof ki30;
            zjj0 zjj0Var = this.b;
            if (!z) {
                blj0Var.setShapeAppearanceModel(zjj0Var.d());
                return;
            }
            ki30 ki30Var = (ki30) blj0Var;
            ki30Var.v(zjj0Var);
            lul0 lul0Var3 = this.c;
            if (lul0Var3 != null) {
                ki30Var.q(lul0Var3);
            }
        }
    }

    public final void e() {
        int iH = 0;
        ki30 ki30VarA = a(false);
        ki30 ki30VarA2 = a(true);
        if (ki30VarA != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            ki30VarA.b.j = f;
            ki30VarA.invalidateSelf();
            ii30 ii30Var = ki30VarA.b;
            if (ii30Var.d != colorStateList) {
                ii30Var.d = colorStateList;
                ki30VarA.onStateChange(ki30VarA.getState());
            }
            if (ki30VarA2 != null) {
                float f2 = this.j;
                if (this.p) {
                    MaterialButton materialButton = this.f44374a;
                    iH = d7x.H(materialButton.getContext(), n6x.V(materialButton, R.attr.colorSurface));
                }
                ki30VarA2.b.j = f2;
                ki30VarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iH);
                ii30 ii30Var2 = ki30VarA2.b;
                if (ii30Var2.d != colorStateListValueOf) {
                    ii30Var2.d = colorStateListValueOf;
                    ki30VarA2.onStateChange(ki30VarA2.getState());
                }
            }
        }
    }
}
