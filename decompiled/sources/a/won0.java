package a;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class won0 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39507a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ won0(SwipeRefreshLayout swipeRefreshLayout, byte b) {
        this.f39507a = b;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.f39507a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (b) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                break;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                break;
            case 2:
                boolean z = swipeRefreshLayout.j1;
                int iAbs = swipeRefreshLayout.x;
                if (!z) {
                    iAbs -= Math.abs(swipeRefreshLayout.w);
                }
                int i = swipeRefreshLayout.v;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout.t.getTop());
                ckc ckcVar = swipeRefreshLayout.z;
                float f2 = 1.0f - f;
                bkc bkcVar = ckcVar.f4499a;
                if (f2 != bkcVar.p) {
                    bkcVar.p = f2;
                }
                ckcVar.invalidateSelf();
                break;
            default:
                swipeRefreshLayout.k(f);
                break;
        }
    }
}
