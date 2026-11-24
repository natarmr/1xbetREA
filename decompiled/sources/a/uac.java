package a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class uac extends ki30 implements Drawable.Callback, q5q0 {
    public static final int[] r2 = {R.attr.state_enabled};
    public static final ShapeDrawable s2 = new ShapeDrawable(new OvalShape());
    public SpannableStringBuilder A1;
    public boolean B1;
    public boolean C1;
    public Drawable D1;
    public ColorStateList E1;
    public zt40 F1;
    public zt40 G1;
    public float H1;
    public float I1;
    public float J1;
    public float K1;
    public float L1;
    public float M1;
    public float N1;
    public float O1;
    public final Context P1;
    public final Paint Q1;
    public final Paint.FontMetrics R1;
    public final RectF S1;
    public final PointF U1;
    public final Path V1;
    public final r5q0 W1;
    public int X1;
    public int Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public boolean d2;
    public int e2;
    public int f2;
    public ColorFilter g2;
    public PorterDuffColorFilter h2;
    public ColorStateList i1;
    public ColorStateList i2;
    public ColorStateList j1;
    public PorterDuff.Mode j2;
    public float k1;
    public int[] k2;
    public float l1;
    public ColorStateList l2;
    public ColorStateList m1;
    public WeakReference m2;
    public float n1;
    public TextUtils.TruncateAt n2;
    public ColorStateList o1;
    public boolean o2;
    public CharSequence p1;
    public int p2;
    public boolean q1;
    public boolean q2;
    public Drawable r1;
    public ColorStateList s1;
    public float t1;
    public boolean u1;
    public boolean v1;
    public Drawable w1;
    public RippleDrawable x1;
    public ColorStateList y1;
    public float z1;

    public uac(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.xbet.client1.R.attr.chipStyle, org.xbet.client1.R.style.Widget_MaterialComponents_Chip_Action);
        this.l1 = -1.0f;
        this.Q1 = new Paint(1);
        this.R1 = new Paint.FontMetrics();
        this.S1 = new RectF();
        this.U1 = new PointF();
        this.V1 = new Path();
        this.f2 = 255;
        this.j2 = PorterDuff.Mode.SRC_IN;
        this.m2 = new WeakReference(null);
        o(context);
        this.P1 = context;
        r5q0 r5q0Var = new r5q0(this);
        this.W1 = r5q0Var;
        this.p1 = "";
        r5q0Var.f29901a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = r2;
        setState(iArr);
        Y(iArr);
        this.o2 = true;
        s2.setTint(-1);
    }

    public static boolean F(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean G(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void h0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void A(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.w1) {
            drawable.setTintList(this.y1);
            if (drawable.isStateful()) {
                drawable.setState(this.k2);
                return;
            }
            return;
        }
        Drawable drawable2 = this.r1;
        if (drawable == drawable2 && this.u1) {
            drawable2.setTintList(this.s1);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (f0() || e0()) {
            float f = this.H1 + this.I1;
            Drawable drawable = this.d2 ? this.D1 : this.r1;
            float intrinsicWidth = this.t1;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.d2 ? this.D1 : this.r1;
            float fCeil = this.t1;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(afn0.l(24, this.P1));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float C() {
        if (!f0() && !e0()) {
            return 0.0f;
        }
        float f = this.I1;
        Drawable drawable = this.d2 ? this.D1 : this.r1;
        float intrinsicWidth = this.t1;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.J1;
    }

    public final float D() {
        if (g0()) {
            return this.M1 + this.z1 + this.N1;
        }
        return 0.0f;
    }

    public final float E() {
        return this.q2 ? l() : this.l1;
    }

    public final void H() {
        tac tacVar = (tac) this.m2.get();
        if (tacVar != null) {
            Chip chip = (Chip) tacVar;
            chip.b(chip.q);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    public final boolean I(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.i1;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.X1) : 0);
        boolean state = true;
        if (this.X1 != iD) {
            this.X1 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.j1;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.Y1) : 0);
        if (this.Y1 != iD2) {
            this.Y1 = iD2;
            zOnStateChange = true;
        }
        int iC = k5d.c(iD2, iD);
        if ((this.Z1 != iC) | (this.b.c == null)) {
            this.Z1 = iC;
            s(ColorStateList.valueOf(iC));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.m1;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.a2) : 0;
        if (this.a2 != colorForState2) {
            this.a2 = colorForState2;
            zOnStateChange = true;
        }
        if (this.l2 != null) {
            int[] iArr3 = ocg0.f25026a;
            boolean z3 = false;
            boolean z4 = false;
            for (int i : iArr) {
                if (i == 16842910) {
                    z3 = true;
                } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                    z4 = true;
                }
            }
            if (z3 && z4) {
                colorForState = this.l2.getColorForState(iArr, this.b2);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.b2 != colorForState) {
            this.b2 = colorForState;
        }
        p2q0 p2q0Var = this.W1.g;
        int colorForState3 = (p2q0Var == null || (colorStateList = p2q0Var.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.c2);
        if (this.c2 != colorForState3) {
            this.c2 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
            break;
        }
        int length = state2.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (state2[i2] == 16842912) {
                    if (this.B1) {
                        z = true;
                        break;
                    }
                } else {
                    i2++;
                }
            }
            z = false;
            break;
        }
        if (this.d2 == z || this.D1 == null) {
            z2 = false;
        } else {
            float fC = C();
            this.d2 = z;
            if (fC != C()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.i2;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.e2) : 0;
        if (this.e2 != colorForState4) {
            this.e2 = colorForState4;
            ColorStateList colorStateList6 = this.i2;
            PorterDuff.Mode mode = this.j2;
            this.h2 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (G(this.r1)) {
            state |= this.r1.setState(iArr);
        }
        if (G(this.D1)) {
            state |= this.D1.setState(iArr);
        }
        if (G(this.w1)) {
            int[] iArr4 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
            state |= this.w1.setState(iArr4);
        }
        if (G(this.x1)) {
            state |= this.x1.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            H();
        }
        return state;
    }

    public final void J(boolean z) {
        if (this.B1 != z) {
            this.B1 = z;
            float fC = C();
            if (!z && this.d2) {
                this.d2 = false;
            }
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void K(Drawable drawable) {
        if (this.D1 != drawable) {
            float fC = C();
            this.D1 = drawable;
            float fC2 = C();
            h0(this.D1);
            A(this.D1);
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.E1 != colorStateList) {
            this.E1 = colorStateList;
            if (this.C1 && (drawable = this.D1) != null && this.B1) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        if (this.C1 != z) {
            boolean zE0 = e0();
            this.C1 = z;
            boolean zE1 = e0();
            if (zE0 != zE1) {
                Drawable drawable = this.D1;
                if (zE1) {
                    A(drawable);
                } else {
                    h0(drawable);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public final void N(float f) {
        if (this.l1 != f) {
            this.l1 = f;
            setShapeAppearanceModel(j().a(f));
        }
    }

    public final void O(Drawable drawable) {
        Drawable drawable2 = this.r1;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fC = C();
            this.r1 = drawable != null ? drawable.mutate() : null;
            float fC2 = C();
            h0(drawable2);
            if (f0()) {
                A(this.r1);
            }
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void P(float f) {
        if (this.t1 != f) {
            float fC = C();
            this.t1 = f;
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        this.u1 = true;
        if (this.s1 != colorStateList) {
            this.s1 = colorStateList;
            if (f0()) {
                this.r1.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z) {
        if (this.q1 != z) {
            boolean zF0 = f0();
            this.q1 = z;
            boolean zF1 = f0();
            if (zF0 != zF1) {
                Drawable drawable = this.r1;
                if (zF1) {
                    A(drawable);
                } else {
                    h0(drawable);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public final void S(ColorStateList colorStateList) {
        if (this.m1 != colorStateList) {
            this.m1 = colorStateList;
            if (this.q2) {
                ii30 ii30Var = this.b;
                if (ii30Var.d != colorStateList) {
                    ii30Var.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void T(float f) {
        if (this.n1 != f) {
            this.n1 = f;
            this.Q1.setStrokeWidth(f);
            if (this.q2) {
                this.b.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void U(Drawable drawable) {
        Drawable drawable2 = this.w1;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fD = D();
            this.w1 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(ocg0.b(this.o1), this.w1, s2);
            FocusRingDrawable.f(this.P1, rippleDrawable, null);
            this.x1 = rippleDrawable;
            float fD2 = D();
            h0(drawable2);
            if (g0()) {
                A(this.w1);
            }
            invalidateSelf();
            if (fD != fD2) {
                H();
            }
        }
    }

    public final void V(float f) {
        if (this.N1 != f) {
            this.N1 = f;
            invalidateSelf();
            if (g0()) {
                H();
            }
        }
    }

    public final void W(float f) {
        if (this.z1 != f) {
            this.z1 = f;
            invalidateSelf();
            if (g0()) {
                H();
            }
        }
    }

    public final void X(float f) {
        if (this.M1 != f) {
            this.M1 = f;
            invalidateSelf();
            if (g0()) {
                H();
            }
        }
    }

    public final boolean Y(int[] iArr) {
        if (Arrays.equals(this.k2, iArr)) {
            return false;
        }
        this.k2 = iArr;
        if (g0()) {
            return I(getState(), iArr);
        }
        return false;
    }

    public final void Z(ColorStateList colorStateList) {
        if (this.y1 != colorStateList) {
            this.y1 = colorStateList;
            if (g0()) {
                this.w1.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // a.q5q0
    public final void a() {
        H();
        invalidateSelf();
    }

    public final void a0(boolean z) {
        if (this.v1 != z) {
            boolean zG0 = g0();
            this.v1 = z;
            boolean zG1 = g0();
            if (zG0 != zG1) {
                Drawable drawable = this.w1;
                if (zG1) {
                    A(drawable);
                } else {
                    h0(drawable);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public final void b0(float f) {
        if (this.J1 != f) {
            float fC = C();
            this.J1 = f;
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void c0(float f) {
        if (this.I1 != f) {
            float fC = C();
            this.I1 = f;
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void d0(ColorStateList colorStateList) {
        if (this.o1 != colorStateList) {
            this.o1 = colorStateList;
            this.l2 = null;
            onStateChange(getState());
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: a.uac
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.RippleDrawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v55 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v55 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v57 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v57 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: a.uac
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.LayerDrawable
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // a.ki30, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uac.draw(android.graphics.Canvas):void");
    }

    public final boolean e0() {
        return this.C1 && this.D1 != null && this.d2;
    }

    public final boolean f0() {
        return this.q1 && this.r1 != null;
    }

    public final boolean g0() {
        return this.v1 && this.w1 != null;
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.g2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.k1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fC = C() + this.H1 + this.K1;
        String string = this.p1.toString();
        r5q0 r5q0Var = this.W1;
        if (r5q0Var.e) {
            r5q0Var.a(string);
        }
        return Math.min(Math.round(D() + r5q0Var.c + fC + this.L1 + this.O1), this.p2);
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.q2) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.k1, this.l1);
        } else {
            outline.setRoundRect(bounds, this.l1);
            outline2 = outline;
        }
        outline2.setAlpha(this.f2 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (F(this.i1) || F(this.j1) || F(this.m1)) {
            return true;
        }
        p2q0 p2q0Var = this.W1.g;
        if (p2q0Var == null || (colorStateList = p2q0Var.k) == null || !colorStateList.isStateful()) {
            return (this.C1 && this.D1 != null && this.B1) || G(this.r1) || G(this.D1) || F(this.i2);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (f0()) {
            zOnLayoutDirectionChanged |= this.r1.setLayoutDirection(i);
        }
        if (e0()) {
            zOnLayoutDirectionChanged |= this.D1.setLayoutDirection(i);
        }
        if (g0()) {
            zOnLayoutDirectionChanged |= this.w1.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (f0()) {
            zOnLevelChange |= this.r1.setLevel(i);
        }
        if (e0()) {
            zOnLevelChange |= this.D1.setLevel(i);
        }
        if (g0()) {
            zOnLevelChange |= this.w1.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.q2) {
            super.onStateChange(iArr);
        }
        return I(iArr, this.k2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f2 != i) {
            this.f2 = i;
            invalidateSelf();
        }
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.g2 != colorFilter) {
            this.g2 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.i2 != colorStateList) {
            this.i2 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // a.ki30, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.j2 != mode) {
            this.j2 = mode;
            ColorStateList colorStateList = this.i2;
            this.h2 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (f0()) {
            visible |= this.r1.setVisible(z, z2);
        }
        if (e0()) {
            visible |= this.D1.setVisible(z, z2);
        }
        if (g0()) {
            visible |= this.w1.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
