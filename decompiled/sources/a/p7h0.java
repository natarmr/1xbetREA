package a;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class p7h0 implements kzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26505a;
    public ValueAnimator b;
    public final /* synthetic */ q7h0 c;

    public p7h0(q7h0 q7h0Var) {
        this.c = q7h0Var;
    }

    @Override // a.kzw
    public final void a(long j, lzw lzwVar) {
        l8x.U("ScreenFlashView", "ScreenFlash#apply");
        q7h0 q7h0Var = this.c;
        this.f26505a = q7h0Var.getBrightness();
        q7h0Var.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wss wssVar = new wss(lzwVar, (byte) 28);
        l8x.U("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(q7h0Var.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new fd5(q7h0Var, (byte) 23));
        valueAnimatorOfFloat.addListener(new r9g(wssVar, (byte) 10));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    @Override // a.kzw
    public final void clear() {
        l8x.U("ScreenFlashView", "ScreenFlash#clear");
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        q7h0 q7h0Var = this.c;
        q7h0Var.setAlpha(0.0f);
        q7h0Var.setBrightness(this.f26505a);
    }
}
