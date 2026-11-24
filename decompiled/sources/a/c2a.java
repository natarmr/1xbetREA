package a;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.Iterator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3616a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2a(Object obj, byte b) {
        this.f3616a = b;
        this.b = obj;
    }

    public final void a() {
        byte b = this.f3616a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((BarcodeView) obj).j.iterator();
                while (it.hasNext()) {
                    ((c2a) it.next()).a();
                }
                break;
            case 1:
                b8a b8aVar = (b8a) obj;
                if (b8aVar.k) {
                    Log.d("b8a", "Camera closed; finishing activity");
                    b8aVar.f2147a.finish();
                }
                break;
        }
    }

    public final void c(Exception exc) {
        byte b = this.f3616a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((BarcodeView) obj).j.iterator();
                while (it.hasNext()) {
                    ((c2a) it.next()).c(exc);
                }
                break;
            case 1:
                b8a b8aVar = (b8a) obj;
                b8aVar.b(b8aVar.f2147a.getString(R.string.zxing_msg_camera_framework_bug));
                break;
        }
    }

    public final void e() {
        byte b = this.f3616a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((BarcodeView) obj).j.iterator();
                while (it.hasNext()) {
                    ((c2a) it.next()).e();
                }
                break;
            case 1:
                break;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) obj;
                d2a d2aVar = viewfinderView.i;
                if (d2aVar != null) {
                    Rect framingRect = d2aVar.getFramingRect();
                    g7k0 previewSize = viewfinderView.i.getPreviewSize();
                    if (framingRect != null && previewSize != null) {
                        viewfinderView.j = framingRect;
                        viewfinderView.k = previewSize;
                    }
                }
                viewfinderView.invalidate();
                break;
        }
    }

    public final void g() {
        switch (this.f3616a) {
            case 0:
                Iterator it = ((BarcodeView) this.b).j.iterator();
                while (it.hasNext()) {
                    ((c2a) it.next()).g();
                }
                break;
        }
    }

    public final void j() {
        switch (this.f3616a) {
            case 0:
                Iterator it = ((BarcodeView) this.b).j.iterator();
                while (it.hasNext()) {
                    ((c2a) it.next()).j();
                }
                break;
        }
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void d(Exception exc) {
    }
}
