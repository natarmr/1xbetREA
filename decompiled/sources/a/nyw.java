package a;

import androidx.camera.core.ImageProcessingUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nyw implements iwq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24349a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nyw(b1x b1xVar, b1x b1xVar2) {
        this.f24349a = (byte) 1;
        this.b = b1xVar2;
    }

    @Override // a.iwq
    public final void a(jwq jwqVar) throws Exception {
        ito0 ito0Var;
        byte b = this.f24349a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pyw pywVar = (pyw) ((WeakReference) ((oyw) obj).e).get();
                if (pywVar != null) {
                    pywVar.p.execute(new wss(pywVar, (byte) 2));
                    return;
                }
                return;
            case 1:
                int i = ImageProcessingUtil.f45331a;
                ((b1x) obj).close();
                return;
            default:
                ibe0 ibe0Var = (ibe0) obj;
                synchronized (ibe0Var.c) {
                    try {
                        int i2 = ibe0Var.f14483a - 1;
                        ibe0Var.f14483a = i2;
                        if (ibe0Var.b && i2 == 0) {
                            ibe0Var.close();
                        }
                        ito0Var = (ito0) ibe0Var.f;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (ito0Var != null) {
                    ito0Var.a(jwqVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ nyw(Object obj, byte b) {
        this.f24349a = b;
        this.b = obj;
    }
}
