package a;

import android.util.Log;
import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;

/* JADX INFO: loaded from: classes2.dex */
public final class b2a implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeView f1844a;

    public b2a(BarcodeView barcodeView) {
        this.f1844a = barcodeView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == null) {
            int i4 = d2a.A;
            Log.e("d2a", "*** WARNING *** surfaceChanged() gave us a null surface!");
        } else {
            g7k0 g7k0Var = new g7k0(i2, i3);
            BarcodeView barcodeView = this.f1844a;
            barcodeView.p = g7k0Var;
            barcodeView.g();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f1844a.p = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
