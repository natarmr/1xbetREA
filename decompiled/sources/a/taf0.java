package a;

import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class taf0 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33610a;
    public final /* synthetic */ Window b;

    public /* synthetic */ taf0(Window window, byte b) {
        this.f33610a = b;
        this.b = window;
    }

    @Override // a.kwk
    public final void a() {
        ycm0 ziv0Var;
        byte b = this.f33610a;
        Window window = this.b;
        switch (b) {
            case 0:
                if (window != null) {
                    View decorView = window.getDecorView();
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    igu0.c(decorView, null);
                }
                break;
            default:
                if (window != null) {
                    WeakHashMap weakHashMap2 = exv0.f8598a;
                    dxv0 dxv0Var = (dxv0) weakHashMap2.get(window);
                    if (dxv0Var != null) {
                        int i = dxv0Var.c - 1;
                        dxv0Var.c = i;
                        if (i <= 0) {
                            ani0 ani0Var = new ani0(window.getDecorView());
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 35) {
                                ziv0Var = new bjv0(window, ani0Var);
                            } else if (i2 >= 30) {
                                ziv0Var = new ajv0(window, ani0Var);
                            } else {
                                ziv0Var = i2 >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                            }
                            ziv0Var.w(dxv0Var.f6865a);
                            ziv0Var.v(dxv0Var.b);
                            weakHashMap2.remove(window);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
