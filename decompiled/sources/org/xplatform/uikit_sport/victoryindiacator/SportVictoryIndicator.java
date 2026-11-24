package org.xplatform.uikit_sport.victoryindiacator;

import a.cqd0;
import a.gne0;
import a.hql0;
import a.ktt0;
import a.t9f;
import a.u46;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class SportVictoryIndicator extends u46 {
    public final hql0 j;
    public boolean k;

    /* JADX WARN: Illegal instructions before constructor call */
    public SportVictoryIndicator(Context context, AttributeSet attributeSet, int i) {
        Object next;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet);
        setTag("SportVictoryIndicatorTestTag");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.j, 0, 0);
        gne0 gne0Var = hql0.b;
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 0);
        gne0Var.getClass();
        Iterator it = hql0.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hql0) next).f13490a != i2);
        hql0 hql0Var = (hql0) next;
        this.j = hql0Var == null ? hql0.LEFT : hql0Var;
        setRegularIndicator(typedArrayObtainStyledAttributes.getDrawable(0));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(3);
        setWinIndicator(drawable != null ? drawable.mutate() : null);
        setIndicatorWidth(typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.size_10));
        int i3 = this.d;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, this.e, i3);
        }
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, this.e, i3);
        }
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 2);
        if (numL != null) {
            setWinIndicatorColor(numL.intValue());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final hql0 getLeftRelativeIndicatorType() {
        return (this.k && getLayoutDirection() == 1) ? hql0.RIGHT : hql0.LEFT;
    }

    private final hql0 getRightRelativeIndicatorType() {
        return (this.k && getLayoutDirection() == 1) ? hql0.LEFT : hql0.RIGHT;
    }

    @Override // a.u46
    public final void a(Canvas canvas, int i, boolean z) {
        hql0 rightRelativeIndicatorType;
        canvas.getClass();
        int height = (getHeight() - ((getGapSize() * (getTotalCount() - 1)) + (getIndicatorHeight() * getTotalCount()))) / 2;
        hql0 hql0Var = this.j;
        if (hql0Var == null) {
            Intrinsics.h("indicatorType");
            throw null;
        }
        int iOrdinal = hql0Var.ordinal();
        if (iOrdinal == 0) {
            rightRelativeIndicatorType = getRightRelativeIndicatorType();
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            rightRelativeIndicatorType = getLeftRelativeIndicatorType();
        }
        int iOrdinal2 = rightRelativeIndicatorType.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                c(canvas, i, z, height);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        float width = canvas.getWidth() / 2.0f;
        int iSave = canvas.save();
        canvas.scale(-1.0f, 1.0f, width, 0.0f);
        try {
            c(canvas, i, z, height);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void c(Canvas canvas, int i, boolean z, int i2) {
        int gapSize = getGapSize() * i;
        int indicatorHeight = ((getIndicatorHeight() + (i == 0 ? 0 : getGapSize())) * i) + i2;
        int iSave = canvas.save();
        canvas.translate(gapSize, indicatorHeight);
        try {
            if (z) {
                Drawable winIndicator = getWinIndicator();
                if (winIndicator != null) {
                    winIndicator.draw(canvas);
                }
            } else {
                Drawable regularIndicator = getRegularIndicator();
                if (regularIndicator != null) {
                    regularIndicator.draw(canvas);
                }
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension((getSpaceCount() * getGapSize()) + getIndicatorWidth(), (getSpaceCount() * getGapSize()) + (getMaxTotalCount() * getIndicatorHeight()));
    }

    public final void setRtlSupportEnabled(boolean z) {
        this.k = z;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportVictoryIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportVictoryIndicator(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
