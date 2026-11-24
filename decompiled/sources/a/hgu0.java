package a;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hgu0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xiv0 f13031a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ zf60 c;

    public hgu0(View view, zf60 zf60Var) {
        this.b = view;
        this.c = zf60Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        xiv0 xiv0VarH = xiv0.h(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        zf60 zf60Var = this.c;
        if (i < 30) {
            igu0.a(windowInsets, this.b);
            if (xiv0VarH.equals(this.f13031a)) {
                return zf60Var.l(view, xiv0VarH).g();
            }
        }
        this.f13031a = xiv0VarH;
        xiv0 xiv0VarL = zf60Var.l(view, xiv0VarH);
        if (i >= 30) {
            return xiv0VarL.g();
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        view.requestApplyInsets();
        return xiv0VarL.g();
    }
}
