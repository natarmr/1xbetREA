package a;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jjc implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return Math.abs(1.0f - f);
    }
}
