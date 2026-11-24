package com.google.android.material.transformation;

import a.xh;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void x(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetY = y(view, view2, z, z3);
        this.b = animatorSetY;
        animatorSetY.addListener(new xh(this, (byte) 6));
        this.b.start();
        if (z2) {
            return;
        }
        this.b.end();
    }

    public abstract AnimatorSet y(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
