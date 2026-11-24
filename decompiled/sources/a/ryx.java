package a;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class ryx implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31333a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f31333a) {
            case 0:
                return f * f * f * f * f;
            case 1:
            case 2:
            case 3:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
