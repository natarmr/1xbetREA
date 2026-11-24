package org.xplatform.cyber.section.impl.championships.regular.presentation.world_cup.tournament_info;

import a.fd5;
import a.xdx;
import a.zmo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpandableTextView extends AppCompatTextView {
    public static final /* synthetic */ int j = 0;
    public boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
    }

    public final void j(String str, boolean z) {
        str.getClass();
        if (this.i) {
            return;
        }
        this.i = true;
        int measuredHeight = getMeasuredHeight();
        if (z) {
            setText(str);
        }
        TextPaint paint = getPaint();
        paint.getClass();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(measuredHeight, xdx.I(str, paint, getWidth(), getLineCount(), getEllipsize(), 0, null, 3568).getHeight());
        valueAnimatorOfInt.addUpdateListener(new fd5(this, (byte) 18));
        valueAnimatorOfInt.addListener(new zmo(this, z, str));
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.setDuration(300L).start();
    }

    public final void setTextWithoutAnimation(String str) {
        str.getClass();
        if (this.i) {
            return;
        }
        setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
