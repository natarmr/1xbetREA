package a;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yu5 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43252a;
    public final /* synthetic */ BarcodeView b;

    public /* synthetic */ yu5(BarcodeView barcodeView, byte b) {
        this.f43252a = b;
        this.b = barcodeView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        dlj dljVar;
        zz2 zz2Var;
        byte b = this.f43252a;
        BarcodeView barcodeView = this.b;
        switch (b) {
            case 0:
                int i = message.what;
                if (i != R.id.zxing_decode_succeeded) {
                    if (i != R.id.zxing_decode_failed) {
                        if (i != R.id.zxing_possible_result_points) {
                            return false;
                        }
                        List list = (List) message.obj;
                        dlj dljVar2 = barcodeView.f1;
                        if (dljVar2 != null) {
                            z = true;
                            if (barcodeView.B != 1) {
                                dljVar2.a(list);
                            }
                        }
                    }
                    return z;
                }
                lu5 lu5Var = (lu5) message.obj;
                if (lu5Var != null && (dljVar = barcodeView.f1) != null && barcodeView.B != 1) {
                    dljVar.b(lu5Var);
                    if (barcodeView.B == 2) {
                        barcodeView.B = 1;
                        barcodeView.f1 = null;
                        barcodeView.j();
                        return true;
                    }
                }
                z = true;
                return z;
            default:
                c2a c2aVar = barcodeView.z;
                int i2 = message.what;
                if (i2 == R.id.zxing_prewiew_size_ready) {
                    g7k0 g7k0Var = (g7k0) message.obj;
                    barcodeView.n = g7k0Var;
                    g7k0 g7k0Var2 = barcodeView.m;
                    if (g7k0Var2 != null) {
                        if (g7k0Var == null || (zz2Var = barcodeView.k) == null) {
                            barcodeView.r = null;
                            barcodeView.q = null;
                            barcodeView.o = null;
                            jf4.n("containerSize or previewSize is not set yet");
                        } else {
                            int i3 = g7k0Var.f10819a;
                            int i4 = g7k0Var.b;
                            int i5 = g7k0Var2.f10819a;
                            int i6 = g7k0Var2.b;
                            Rect rectB = ((tub0) zz2Var.c).b(g7k0Var, (g7k0) zz2Var.b);
                            if (rectB.width() > 0 && rectB.height() > 0) {
                                barcodeView.o = rectB;
                                Rect rect = new Rect(0, 0, i5, i6);
                                Rect rect2 = barcodeView.o;
                                Rect rect3 = new Rect(rect);
                                rect3.intersect(rect2);
                                if (barcodeView.s != null) {
                                    rect3.inset(Math.max(0, (rect3.width() - barcodeView.s.f10819a) / 2), Math.max(0, (rect3.height() - barcodeView.s.b) / 2));
                                } else {
                                    int iMin = (int) Math.min(((double) rect3.width()) * barcodeView.t, ((double) rect3.height()) * barcodeView.t);
                                    rect3.inset(iMin, iMin);
                                    if (rect3.height() > rect3.width()) {
                                        rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                                    }
                                }
                                barcodeView.q = rect3;
                                Rect rect4 = new Rect(barcodeView.q);
                                Rect rect5 = barcodeView.o;
                                rect4.offset(-rect5.left, -rect5.top);
                                Rect rect6 = new Rect((rect4.left * i3) / barcodeView.o.width(), (rect4.top * i4) / barcodeView.o.height(), (rect4.right * i3) / barcodeView.o.width(), (rect4.bottom * i4) / barcodeView.o.height());
                                barcodeView.r = rect6;
                                if (rect6.width() <= 0 || barcodeView.r.height() <= 0) {
                                    barcodeView.r = null;
                                    barcodeView.q = null;
                                    Log.w("d2a", "Preview frame is too small");
                                } else {
                                    c2aVar.e();
                                }
                            }
                            barcodeView.requestLayout();
                            barcodeView.g();
                        }
                    }
                    return true;
                }
                if (i2 == R.id.zxing_camera_error) {
                    Exception exc = (Exception) message.obj;
                    if (barcodeView.f5345a != null) {
                        barcodeView.c();
                        c2aVar.c(exc);
                    }
                } else if (i2 == R.id.zxing_camera_closed) {
                    c2aVar.a();
                }
                return false;
        }
    }
}
