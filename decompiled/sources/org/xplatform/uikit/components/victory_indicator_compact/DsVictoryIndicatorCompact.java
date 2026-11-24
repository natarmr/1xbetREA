package org.xplatform.uikit.components.victory_indicator_compact;

import a.bqd0;
import a.ktt0;
import a.u46;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class DsVictoryIndicatorCompact extends u46 {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsVictoryIndicatorCompact(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.u0, 0, 0);
        setRegularIndicator(typedArrayObtainStyledAttributes.getDrawable(0));
        setWinIndicator(typedArrayObtainStyledAttributes.getDrawable(2));
        setIndicatorWidth(typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.size_6));
        int i2 = this.d;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.e, i2);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, this.e, i2);
        }
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 1);
        if (numL != null) {
            setWinIndicatorColor(numL.intValue());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension((getSpaceCount() * getGapSize()) + (getTotalCount() * getIndicatorWidth()), getIndicatorHeight());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsVictoryIndicatorCompact(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsVictoryIndicatorCompact(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
