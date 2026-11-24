package a;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wly implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39378a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wly(Object obj, byte b) {
        this.f39378a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        gxv0 gxv0Var;
        gxv0 gxv0Var2;
        byte b = this.f39378a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((zly) obj).a1();
                break;
            default:
                View view = (View) obj;
                if (z) {
                    ViewParent parent = view.getParent();
                    vjk vjkVar = parent instanceof vjk ? (vjk) parent : null;
                    Window window = vjkVar != null ? vjkVar.getWindow() : null;
                    if (window != null && (gxv0Var2 = (gxv0) hxv0.f13831a.get(window)) != null) {
                        if (gxv0Var2.d) {
                            window.addFlags(Integer.MIN_VALUE);
                        }
                        window.setStatusBarColor(0);
                        window.setNavigationBarColor(0);
                        if (Build.VERSION.SDK_INT >= 29) {
                            window.setNavigationBarContrastEnforced(false);
                        }
                    }
                    Window windowL = etm0.l(view);
                    if (windowL != null && (gxv0Var = (gxv0) hxv0.f13831a.get(windowL)) != null) {
                        if (gxv0Var.d) {
                            windowL.addFlags(Integer.MIN_VALUE);
                        }
                        windowL.setStatusBarColor(0);
                        windowL.setNavigationBarColor(0);
                        if (Build.VERSION.SDK_INT >= 29) {
                            windowL.setNavigationBarContrastEnforced(false);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
