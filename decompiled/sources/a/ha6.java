package a;

import android.os.Trace;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12710a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ha6(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.f12710a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nz40 nz40VarC;
        byte b = this.f12710a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                y9q0 y9q0Var = (y9q0) obj5;
                k6z k6zVar = (k6z) obj4;
                String str = (String) obj3;
                w6k w6kVar = (w6k) obj2;
                mrq mrqVar = (mrq) obj;
                boolean z = this.b;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    rfk0 rfk0VarH = xfk0.h();
                    nz40 nz40Var = rfk0VarH instanceof nz40 ? (nz40) rfk0VarH : null;
                    if (nz40Var == null || (nz40VarC = nz40Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        rfk0 rfk0VarJ = nz40VarC.j();
                        try {
                            y9q0 y9q0VarA = afn0.A(y9q0Var, k6zVar);
                            iun iunVar = iun.f15405a;
                            v03 v03Var = new v03(str, y9q0VarA, iunVar, iunVar, mrqVar, w6kVar, z);
                            v03Var.e();
                            v03Var.f();
                            rfk0.q(rfk0VarJ);
                            nz40VarC.w().L();
                            nz40VarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            rfk0.q(rfk0VarJ);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            nz40VarC.c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                Pair pair = (Pair) obj4;
                ((go30) obj5).b.i.B(((Integer) pair.first).intValue(), (vn30) pair.second, (wn00) obj3, (in30) obj2, (IOException) obj, this.b);
                return;
        }
    }
}
