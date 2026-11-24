package a;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class xon0 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41230a;
    public final /* synthetic */ short b;
    public final /* synthetic */ SwipeRefreshLayout c;

    /* JADX WARN: Multi-variable type inference failed */
    public xon0(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.f41230a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ckc ckcVar = this.c.z;
        int i = this.f41230a;
        ckcVar.setAlpha((int) (((this.b - i) * f) + i));
    }
}
