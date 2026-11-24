package org.xplatform.sportgame.classic.impl.presentation.legacy.views;

import a.a8z;
import a.ic3;
import a.klu0;
import a.maz;
import a.n0o0;
import a.wez;
import a.x9m0;
import a.xke;
import a.yke;
import a.ywm0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.behaviors.BettingContainerBehavior;

/* JADX INFO: loaded from: classes5.dex */
public final class SubGamesContainerView extends FrameLayout implements xke {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46997a;
    public final n0o0 b;
    public final int c;
    public boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    public SubGamesContainerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46997a = maz.a(wez.b, new ywm0(this, this, (byte) 0));
        this.b = maz.b(new x9m0((byte) 21));
        this.c = getResources().getDimensionPixelSize(R.dimen.corner_radius_16);
        this.d = true;
    }

    private final BettingContainerBehavior getBehavior() {
        return (BettingContainerBehavior) this.b.getValue();
    }

    private final klu0 getBinding() {
        Object value = this.f46997a.getValue();
        value.getClass();
        return (klu0) value;
    }

    public final int getFragmentContainerId() {
        return getBinding().b.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        setClipToOutline(true);
        setOutlineProvider(new ic3(this, (byte) 5));
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setTouchable(boolean z) {
        this.d = z;
    }

    @Override // a.xke
    /* JADX INFO: renamed from: getBehavior, reason: collision with other method in class */
    public yke mo39getBehavior() {
        return getBehavior();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubGamesContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubGamesContainerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
