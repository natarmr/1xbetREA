package a;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class div0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public civ0 f6156a;

    public div0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6156a = new biv0(tmb0.j(i, interpolator, j));
        } else {
            this.f6156a = new yhv0(i, interpolator, j);
        }
    }

    public static void a(View view, oyc oycVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(oycVar != null ? new aiv0(oycVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = yhv0.e;
        View.OnApplyWindowInsetsListener xhv0Var = oycVar != null ? new xhv0(view, oycVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, xhv0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(xhv0Var);
        }
    }
}
