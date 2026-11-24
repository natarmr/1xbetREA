package a;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class jgu0 {
    public static xiv0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        xiv0 xiv0VarH = xiv0.h(rootWindowInsets, null);
        uiv0 uiv0Var = xiv0VarH.f40966a;
        uiv0Var.y(xiv0VarH);
        View rootView = view.getRootView();
        uiv0Var.d(rootView);
        uiv0Var.p(rootView);
        uiv0Var.q();
        return xiv0VarH;
    }
}
