package org.xplatform.uikit.components.segmented_control;

import a.aem0;
import a.aim;
import a.bqd0;
import a.e0g0;
import a.fd5;
import a.g0g0;
import a.ivb0;
import a.j0g0;
import a.jmu0;
import a.ktt0;
import a.tnq0;
import a.ymx;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSegmentItem extends AppCompatTextView {
    public static final /* synthetic */ int q = 0;
    public final int i;
    public final int j;
    public final ObjectAnimator k;
    public final Drawable l;
    public final ObjectAnimator m;
    public Function1 n;
    public Function1 o;
    public ymx p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsSegmentItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.k = ObjectAnimator.ofArgb(this, "textColor", 0);
        Drawable drawableMutate = getResources().getDrawable(R.drawable.rounded_full, context.getTheme()).mutate();
        drawableMutate.getClass();
        this.l = drawableMutate;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(drawableMutate, "alpha", 0);
        objectAnimatorOfInt.addUpdateListener(new fd5(this, (byte) 16));
        this.m = objectAnimatorOfInt;
        this.o = new aim((byte) 12);
        this.p = ivb0.b;
        if (getId() == -1) {
            setId(jmu0.d());
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.j0, 0, 0);
        ktt0.h(typedArrayObtainStyledAttributes, this, 3);
        this.i = typedArrayObtainStyledAttributes.getColor(0, this.i);
        this.j = typedArrayObtainStyledAttributes.getColor(2, this.j);
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 1);
        if (numL != null) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(numL.intValue(), PorterDuff.Mode.SRC_IN));
        }
        setAutoSizeText(typedArrayObtainStyledAttributes.getResourceId(3, 0));
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
        setFocusable(true);
    }

    private final void setAutoSizeText(int i) {
        Object g0g0Var;
        Context context = getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.s0);
        try {
            e0g0 e0g0Var = j0g0.b;
            typedArrayObtainStyledAttributes.getClass();
            tnq0.i(typedArrayObtainStyledAttributes, 9);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
            tnq0.i(typedArrayObtainStyledAttributes, 8);
            aem0.r(this, dimensionPixelSize, typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0), 1, 0);
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            aem0.s(0, this);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void j(boolean z, boolean z2) {
        int i = z ? 255 : 0;
        Drawable drawable = this.l;
        if (!z2) {
            drawable.setAlpha(i);
            return;
        }
        int[] iArr = {drawable.getAlpha(), i};
        ObjectAnimator objectAnimator = this.m;
        objectAnimator.setIntValues(iArr);
        objectAnimator.start();
    }

    public final void k(boolean z, boolean z2) {
        int currentTextColor;
        super.setSelected(z);
        int i = this.i;
        int i2 = this.j;
        if (z2) {
            currentTextColor = getCurrentTextColor();
        } else {
            currentTextColor = isSelected() ? i2 : i;
        }
        if (z) {
            i = i2;
        }
        ObjectAnimator objectAnimator = this.k;
        objectAnimator.setIntValues(currentTextColor, i);
        objectAnimator.start();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        this.l.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.size_1);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.size_8);
        this.l.setBounds(getLayoutDirection() == 0 ? new Rect(i - dimensionPixelOffset, dimensionPixelOffset2, i, i2 - dimensionPixelOffset2) : new Rect(0, dimensionPixelOffset2, dimensionPixelOffset, i2 - dimensionPixelOffset2));
    }

    @Override // android.view.View
    public final boolean performClick() {
        ymx ymxVar = this.p;
        ymxVar.getClass();
        if (SystemClock.uptimeMillis() - ivb0.c <= ymxVar.f42912a) {
            return false;
        }
        if (!isSelected()) {
            this.o.invoke(this);
        }
        setSelected(true);
        return super.performClick();
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        Function1 function1;
        if (isSelected() != z) {
            k(z, isAttachedToWindow());
            if (!z || (function1 = this.n) == null) {
                return;
            }
            function1.invoke(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSegmentItem(Context context) {
        this(context, null);
        context.getClass();
    }
}
