package a;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t06 extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u06 f33104a;
    public int b;
    public final boolean c;
    public final int d;
    public long e;
    public w73 f;
    public boolean g;
    public int h;
    public boolean i;
    public final q06 j;
    public final r06 k;
    public final r06 l;
    public final s06 m;
    public final s06 n;

    public t06(Context context, AttributeSet attributeSet, int i, int i2) {
        super(dwi0.V(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.e = -1L;
        this.g = false;
        this.h = 4;
        this.j = new q06(this);
        this.k = new r06(this, (byte) 0);
        this.l = new r06(this, (byte) 1);
        this.m = new s06(this, (byte) 0);
        this.n = new s06(this, (byte) 1);
        Context context2 = getContext();
        this.f33104a = a(context2, attributeSet);
        mrv.c0(context2, attributeSet, i, i2);
        int[] iArr = rpd0.d;
        mrv.d0(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        typedArrayObtainStyledAttributes.getInt(7, -1);
        this.d = Math.min(typedArrayObtainStyledAttributes.getInt(5, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.f = new w73();
        this.c = true;
    }

    private whl getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().n;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().n;
    }

    public u06 a(Context context, AttributeSet attributeSet) {
        dkc dkcVar = new dkc(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        mrv.c0(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = rpd0.i;
        mrv.d0(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        dkcVar.q = typedArrayObtainStyledAttributes.getInt(0, 0);
        dkcVar.r = Math.max(g7x.C(context, typedArrayObtainStyledAttributes, 4, dimensionPixelSize), dkcVar.f34840a * 2);
        dkcVar.s = g7x.C(context, typedArrayObtainStyledAttributes, 3, dimensionPixelSize2);
        dkcVar.t = typedArrayObtainStyledAttributes.getInt(2, 0);
        dkcVar.u = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        dkcVar.d();
        return dkcVar;
    }

    public final void b() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().o.F(this.m);
    }

    public void c(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.g = true;
            if (getIndeterminateDrawable().isVisible()) {
                w73 w73Var = this.f;
                ContentResolver contentResolver = getContext().getContentResolver();
                w73Var.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().o.H();
                    return;
                }
            }
            this.m.a(getIndeterminateDrawable());
        }
    }

    public final boolean d() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f33104a.h;
    }

    @Override // android.widget.ProgressBar
    public d5x getIndeterminateDrawable() {
        return (d5x) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f33104a.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f33104a.i;
    }

    @Override // android.widget.ProgressBar
    public hgk getProgressDrawable() {
        return (hgk) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f33104a.g;
    }

    public int getTrackColor() {
        return this.f33104a.f;
    }

    public int getTrackCornerRadius() {
        return this.f33104a.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f33104a.c;
    }

    public int getTrackThickness() {
        return this.f33104a.f34840a;
    }

    public int getWaveAmplitude() {
        return this.f33104a.l;
    }

    public int getWaveSpeed() {
        return this.f33104a.m;
    }

    public int getWavelengthDeterminate() {
        return this.f33104a.j;
    }

    public int getWavelengthIndeterminate() {
        return this.f33104a.k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        hgk progressDrawable = getProgressDrawable();
        s06 s06Var = this.n;
        if (progressDrawable != null) {
            hgk progressDrawable2 = getProgressDrawable();
            ArrayList arrayList = progressDrawable2.g;
            if (arrayList == null) {
                arrayList = new ArrayList();
                progressDrawable2.g = arrayList;
            }
            if (!arrayList.contains(s06Var)) {
                progressDrawable2.g.add(s06Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            d5x indeterminateDrawable = getIndeterminateDrawable();
            ArrayList arrayList2 = indeterminateDrawable.g;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                indeterminateDrawable.g = arrayList2;
            }
            if (!arrayList2.contains(s06Var)) {
                indeterminateDrawable.g.add(s06Var);
            }
        }
        if (d()) {
            if (this.d > 0) {
                this.e = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.l);
        removeCallbacks(this.k);
        ((shl) getCurrentDrawable()).d(false, false, false);
        d5x indeterminateDrawable = getIndeterminateDrawable();
        s06 s06Var = this.n;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(s06Var);
            getIndeterminateDrawable().o.K();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(s06Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            whl currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.c) {
            ((shl) getCurrentDrawable()).d(d(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.c) {
            ((shl) getCurrentDrawable()).d(d(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(w73 w73Var) {
        this.f = w73Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = w73Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = w73Var;
        }
    }

    public void setHideAfterMaxProgress(boolean z) {
        if (getProgressDrawable() == null) {
            return;
        }
        q06 q06Var = this.j;
        if (z) {
            ArrayList arrayList = getProgressDrawable().o.k;
            if (arrayList.contains(q06Var)) {
                return;
            }
            arrayList.add(q06Var);
            return;
        }
        ArrayList arrayList2 = getProgressDrawable().o.k;
        int iIndexOf = arrayList2.indexOf(q06Var);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f33104a.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            shl shlVar = (shl) getCurrentDrawable();
            if (shlVar != null) {
                shlVar.d(false, false, false);
            }
            super.setIndeterminate(z);
            shl shlVar2 = (shl) getCurrentDrawable();
            if (shlVar2 != null) {
                shlVar2.d(d(), false, false);
            }
            if ((shlVar2 instanceof d5x) && d()) {
                ((d5x) shlVar2).o.J();
            }
            this.g = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        u06 u06Var = this.f33104a;
        if (u06Var.n != f) {
            u06Var.n = f;
            getIndeterminateDrawable().o.t();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof d5x) {
            ((shl) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.i) {
            jf4.o("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            Integer numY = d7x.y(R.attr.colorPrimary, getContext());
            iArr = new int[]{numY != null ? numY.intValue() : -1};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f33104a.e = iArr;
        getIndeterminateDrawable().o.t();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        u06 u06Var = this.f33104a;
        if (u06Var.i != i) {
            u06Var.i = i;
            u06Var.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        c(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof hgk) {
            hgk hgkVar = (hgk) drawable;
            hgkVar.d(false, false, false);
            super.setProgressDrawable(hgkVar);
            hgkVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.i) {
            jf4.o("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f33104a.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        u06 u06Var = this.f33104a;
        if (u06Var.f != i) {
            u06Var.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        u06 u06Var = this.f33104a;
        if (u06Var.b != i) {
            u06Var.b = Math.min(i, u06Var.f34840a / 2);
            u06Var.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        u06 u06Var = this.f33104a;
        if (u06Var.c != f) {
            u06Var.c = Math.min(f, 0.5f);
            u06Var.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        u06 u06Var = this.f33104a;
        if (u06Var.f34840a != i) {
            u06Var.f34840a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.h = i;
        } else {
            jf4.o("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        u06 u06Var = this.f33104a;
        if (u06Var.l != i) {
            u06Var.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        hgk progressDrawable = getProgressDrawable();
        progressDrawable.b.p = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        hgk progressDrawable = getProgressDrawable();
        progressDrawable.b.o = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveSpeed(int i) {
        u06 u06Var = this.f33104a;
        u06Var.m = i;
        hgk progressDrawable = getProgressDrawable();
        boolean z = u06Var.m != 0;
        ValueAnimator valueAnimator = progressDrawable.s;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        u06 u06Var = this.f33104a;
        if (u06Var.j != i) {
            u06Var.j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        u06 u06Var = this.f33104a;
        if (u06Var.k != i) {
            u06Var.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
