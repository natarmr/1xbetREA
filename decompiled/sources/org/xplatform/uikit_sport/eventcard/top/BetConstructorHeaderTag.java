package org.xplatform.uikit_sport.eventcard.top;

import a.jgp0;
import a.lbo;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public final class BetConstructorHeaderTag extends DsTag implements lbo {
    public final jgp0 m;

    /* JADX WARN: Illegal instructions before constructor call */
    public BetConstructorHeaderTag(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.betConstructorHeaderTagStyle);
        this.m = jgp0.f16491a;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        jgp0 jgp0Var = jgp0.b;
        int i2 = R.attr.state_first;
        jgp0 jgp0Var2 = this.m;
        if (jgp0Var2 != jgp0Var) {
            i2 = -R.attr.state_first;
        }
        jgp0 jgp0Var3 = jgp0.c;
        int i3 = R.attr.state_second;
        if (jgp0Var2 != jgp0Var3) {
            i3 = -R.attr.state_second;
        }
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{i2, i3});
        iArrMergeDrawableStates.getClass();
        return iArrMergeDrawableStates;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetConstructorHeaderTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetConstructorHeaderTag(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
