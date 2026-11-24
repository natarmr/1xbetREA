package a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class igu0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static xiv0 b(View view, xiv0 xiv0Var, Rect rect) {
        WindowInsets windowInsetsG = xiv0Var.g();
        if (windowInsetsG != null) {
            return xiv0.h(view.computeSystemWindowInsets(windowInsetsG, rect), view);
        }
        rect.setEmpty();
        return xiv0Var;
    }

    public static void c(View view, zf60 zf60Var) {
        hgu0 hgu0Var = zf60Var != null ? new hgu0(view, zf60Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, hgu0Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (hgu0Var != null) {
            view.setOnApplyWindowInsetsListener(hgu0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
