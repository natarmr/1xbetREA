package a;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class htf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13632a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ htf0(Object obj, int i, byte b) {
        this.f13632a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f13632a;
        byte b2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((xvw) obj).T(b2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.A(view, b2, false);
                }
                break;
        }
    }
}
