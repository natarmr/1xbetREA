package org.xplatform.ui_core.viewcomponents.layouts.frame;

import a.a8z;
import a.aqd0;
import a.epv0;
import a.ha30;
import a.maz;
import a.r3c0;
import a.wez;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ProgressBarWithSendClock extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47193a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ProgressBarWithSendClock(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47193a = maz.a(wez.b, new ha30(this, this, (byte) 26));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.r);
        typedArrayObtainStyledAttributes.getClass();
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final r3c0 getBinding() {
        return (r3c0) this.f47193a.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().b.setBackground(epv0.U(R.drawable.progressbar_send_clock_bg, getContext()));
        getBinding().c.setBackground(epv0.U(R.drawable.ic_progress_back, getContext()));
        getBinding().d.setBackground(epv0.U(R.drawable.ic_send_clock, getContext()));
        if (this.b) {
            getBinding().c.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.rotate));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressBarWithSendClock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressBarWithSendClock(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
