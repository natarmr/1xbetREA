package org.xplatform.make_bet.impl.presentation.view;

import a.wgm0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class OptionBetLabelView extends FrameLayout {
    /* JADX WARN: Illegal instructions before constructor call */
    public OptionBetLabelView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.item_option_bet_label, (ViewGroup) this, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            wgm0.r(this, viewGroup, R.dimen.size_86, R.dimen.size_48);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionBetLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionBetLabelView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
