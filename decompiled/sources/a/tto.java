package a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class tto {
    public static tmv a(kjv0 kjv0Var, FoldingFeature foldingFeature) {
        y60 y60Var;
        m60 m60Var;
        kjv0Var.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            y60Var = y60.f;
        } else {
            if (type != 2) {
                return null;
            }
            y60Var = y60.g;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            m60Var = m60.f;
        } else {
            if (state != 2) {
                return null;
            }
            m60Var = m60.g;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        tq8 tq8Var = new tq8(bounds);
        Rect rectC = kjv0Var.f18406a.c();
        if (tq8Var.a() == 0 && tq8Var.b() == 0) {
            return null;
        }
        if (tq8Var.b() != rectC.width() && tq8Var.a() != rectC.height()) {
            return null;
        }
        if (tq8Var.b() < rectC.width() && tq8Var.a() < rectC.height()) {
            return null;
        }
        if (tq8Var.b() == rectC.width() && tq8Var.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new tmv(new tq8(bounds2), y60Var, m60Var);
    }

    public static jjv0 b(kjv0 kjv0Var, WindowLayoutInfo windowLayoutInfo) {
        kjv0Var.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayListU = twn.u(displayFeatures);
        for (FoldingFeature foldingFeature : displayFeatures) {
            tmv tmvVarA = foldingFeature instanceof FoldingFeature ? a(kjv0Var, foldingFeature) : null;
            if (tmvVarA != null) {
                arrayListU.add(tmvVarA);
            }
        }
        return new jjv0(arrayListU);
    }

    public static jjv0 c(Context context, WindowLayoutInfo windowLayoutInfo) {
        ojv0 ojv0Var = hfk0.h;
        wq8 wq8Var = wq8.b;
        y6k y6kVar = y6k.b;
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        x6k x6kVar = i >= 34 ? y6k.f42101a : rv00.l;
        q3d.e(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                ojv0Var = y6kVar;
            } else if (i >= 30) {
                ojv0Var = wq8Var;
            }
            return b(ojv0Var.g(context, x6kVar), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            v4i0.p("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            ojv0Var = y6kVar;
        } else if (i >= 30) {
            ojv0Var = wq8Var;
        }
        return b(ojv0Var.b(activity, x6kVar), windowLayoutInfo);
    }
}
