package org.xplatform.bonus_games.impl.treasure.presentation.views;

import a.dqs0;
import a.rh60;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class NineTreasuresView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dqs0 f46443a;
    public rh60 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public NineTreasuresView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
    }

    public final void setOnSelectedListener(rh60 rh60Var) {
        rh60Var.getClass();
        this.b = rh60Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NineTreasuresView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NineTreasuresView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
