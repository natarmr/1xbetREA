package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class yhv0 extends civ0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final f0p f = new f0p((byte) 0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, div0 div0Var) {
        oyc oycVarJ = j(view);
        if (oycVarJ != null) {
            oycVarJ.f(div0Var);
            if (oycVarJ.f26055a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), div0Var);
            }
        }
    }

    public static void g(View view, div0 div0Var, xiv0 xiv0Var, boolean z) {
        oyc oycVarJ = j(view);
        if (oycVarJ != null) {
            oycVarJ.b = xiv0Var;
            if (!z) {
                oycVarJ.g(div0Var);
                z = oycVarJ.f26055a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), div0Var, xiv0Var, z);
            }
        }
    }

    public static void h(View view, xiv0 xiv0Var, List list) {
        oyc oycVarJ = j(view);
        if (oycVarJ != null) {
            xiv0Var = oycVarJ.h(xiv0Var, list);
            if (oycVarJ.f26055a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), xiv0Var, list);
            }
        }
    }

    public static void i(View view, div0 div0Var, hcp0 hcp0Var) {
        oyc oycVarJ = j(view);
        if (oycVarJ != null) {
            oycVarJ.i(div0Var, hcp0Var);
            if (oycVarJ.f26055a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), div0Var, hcp0Var);
            }
        }
    }

    public static oyc j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof xhv0) {
            return ((xhv0) tag).f40914a;
        }
        return null;
    }
}
