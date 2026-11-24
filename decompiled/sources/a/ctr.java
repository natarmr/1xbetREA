package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ctr extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AnimatorSet f4954a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setClickable(true);
        setFocusableInTouchMode(true);
        setKeepScreenOn(true);
    }

    private final void setControlViewsEnabling(boolean z) {
        if (z) {
            getBroadcastingControlPanelView().w();
        } else {
            getBroadcastingControlPanelView().v();
        }
        View soundEnableButton = getSoundEnableButton();
        if (soundEnableButton != null) {
            soundEnableButton.setEnabled(z);
        }
        View soundEnableButton2 = getSoundEnableButton();
        if (soundEnableButton2 != null) {
            soundEnableButton2.setClickable(z);
        }
    }

    public final void a(float f) {
        AnimatorSet animatorSet = this.f4954a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f4954a = null;
        if (getBroadcastingControlPanelView().getAlpha() == f) {
            return;
        }
        Context context = getContext();
        context.getClass();
        if (!sj3.J(context)) {
            getBroadcastingControlPanelView().setAlpha(f);
            View soundEnableButton = getSoundEnableButton();
            if (soundEnableButton != null) {
                soundEnableButton.setAlpha(f);
                return;
            }
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getBroadcastingControlPanelView(), (Property<GameBroadcastingControlPanelView, Float>) property, f);
        objectAnimatorOfFloat.getClass();
        View soundEnableButton2 = getSoundEnableButton();
        if (soundEnableButton2 != null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(soundEnableButton2, (Property<View, Float>) property, f);
            objectAnimatorOfFloat2.getClass();
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        } else {
            animatorSet2.play(objectAnimatorOfFloat);
        }
        animatorSet2.start();
        this.f4954a = animatorSet2;
    }

    public final void b() {
        setControlViewsEnabling(false);
        a(0.0f);
    }

    public final void c() {
        setControlViewsEnabling(true);
        a(1.0f);
    }

    public final void d() {
        getBroadcastingContainerView().setVisibility(0);
    }

    public abstract View getBroadcastingContainerView();

    public abstract GameBroadcastingControlPanelView getBroadcastingControlPanelView();

    public abstract Function0<Unit> getOnMediaFileReddyListener();

    public abstract View getProgressView();

    public View getSoundEnableButton() {
        return null;
    }

    public abstract void setBroadcastingUrl(String str);

    public final void setOnContainerClickListener(Function0<Unit> function0) {
        function0.getClass();
        dyb.N(getBroadcastingContainerView(), ymx.INTERVAL_2000, new cjl(function0, (byte) 29));
    }

    public abstract void setOnMediaFileReddyListener(Function0<Unit> function0);

    public final void setPlayDrawable(boolean z) {
        getBroadcastingControlPanelView().setPlayDrawable(z);
    }

    public void setProgressVisible(boolean z) {
        getProgressView().setVisibility(z ? 0 : 8);
    }

    public final void setSoundEnableButtonClickListener(Function0<Unit> function0) {
        function0.getClass();
        View soundEnableButton = getSoundEnableButton();
        if (soundEnableButton != null) {
            dyb.O(soundEnableButton, new cjl(function0, (byte) 28));
        }
    }
}
