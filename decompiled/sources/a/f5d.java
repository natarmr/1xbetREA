package a;

import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class f5d implements dlz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8957a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f5d(ilz ilzVar, Object obj, Object obj2, byte b) {
        this.f8957a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.dlz
    public final void a() {
        View decorView;
        byte b = this.f8957a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Window window = (Window) obj2;
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.removeCallbacks((e5d) obj);
                    break;
                }
                break;
            default:
                ((OnBackInvokedDispatcher) obj2).unregisterOnBackInvokedCallback((ma3) obj);
                break;
        }
    }
}
