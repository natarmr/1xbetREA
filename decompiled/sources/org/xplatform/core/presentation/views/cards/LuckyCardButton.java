package org.xplatform.core.presentation.views.cards;

import a.a8z;
import a.agu0;
import a.maz;
import a.nsr;
import a.wez;
import a.wg;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LuckyCardButton extends FrameLayout {
    public static final int[] c = {R.attr.state_blackout};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46465a;
    public boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public LuckyCardButton(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46465a = maz.a(wez.b, new nsr((Object) this, (Object) this, (byte) 27));
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, R.animator.lucky_card_state_list));
    }

    public final void a(int i, String str) {
        str.getClass();
        getBinding().g.setText(str);
        getBinding().c.setImageResource(i);
        getBinding().d.setVisibility(8);
        getBinding().e.setVisibility(8);
    }

    public final void b(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        getBinding().g.setText(str);
        getBinding().e.setText(str2);
        getBinding().e.setTextColor(getContext().getColor(i));
        getBinding().f.setVisibility(8);
    }

    public final agu0 getBinding() {
        Object value = this.f46465a.getValue();
        value.getClass();
        return (agu0) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        iArrOnCreateDrawableState.getClass();
        return iArrOnCreateDrawableState;
    }

    public final void setBlackout(boolean z) {
        if (this.b != z) {
            this.b = z;
            refreshDrawableState();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getBinding().b.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            getBinding().b.setOnClickListener(null);
        } else {
            getBinding().b.setOnClickListener(new wg((Object) onClickListener, (Object) this, (byte) 27));
        }
    }

    public final void setText(String str) {
        str.getClass();
        getBinding().g.setText(str);
    }

    public final void setTextColor(int i) {
        getBinding().g.setTextColor(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyCardButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyCardButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
