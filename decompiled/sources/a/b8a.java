package a;

import android.app.AlertDialog;
import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class b8a {
    public static final /* synthetic */ int n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureActivity f2147a;
    public final DecoratedBarcodeView b;
    public final cwj h;
    public final kb6 i;
    public final Handler j;
    public boolean m;
    public int c = -1;
    public boolean d = false;
    public boolean e = true;
    public String f = "";
    public boolean g = false;
    public boolean k = false;
    public final a8a l = new a8a(this);

    public b8a(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        c2a c2aVar = new c2a(this, (byte) 1);
        this.m = false;
        this.f2147a = captureActivity;
        this.b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().j.add(c2aVar);
        this.j = new Handler();
        this.h = new cwj(captureActivity, new z7a(this, (byte) 0));
        this.i = new kb6(captureActivity);
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.b;
        q0a q0aVar = decoratedBarcodeView.getBarcodeView().f5345a;
        if (q0aVar == null || q0aVar.g) {
            this.f2147a.finish();
        } else {
            this.k = true;
        }
        decoratedBarcodeView.d();
        this.h.c();
    }

    public final void b(String str) {
        CaptureActivity captureActivity = this.f2147a;
        if (captureActivity.isFinishing() || this.g || this.k) {
            return;
        }
        if (str.isEmpty()) {
            str = captureActivity.getString(R.string.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
        builder.setTitle(captureActivity.getString(R.string.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(R.string.zxing_button_ok, new x5(this, (byte) 1));
        builder.setOnCancelListener(new gx5(this, (byte) 1));
        builder.show();
    }
}
