package a;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class cs40 implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4871a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs40(Object obj, byte b) {
        this.f4871a = b;
        this.b = obj;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        byte b = this.f4871a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (float) ((fhn) obj).d(f);
            case 1:
                return (float) ((fhn) obj).d(f);
            case 2:
                return (float) ((fhn) obj).d(f);
            default:
                return ((ygu0) obj).u.getInterpolation(f);
        }
    }
}
