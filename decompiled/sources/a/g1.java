package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10484a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ g1(h1 h1Var, byte b) {
        this.f10484a = b;
        this.b = h1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10484a;
        h1 h1Var = this.b;
        switch (b) {
            case 0:
                cr30 cr30VarK0 = h1Var.k0();
                w0 w0Var = new w0((Object) this, (byte) 1);
                a2o a2oVar = e0t0.f7005a;
                if (f2o.f(h1Var)) {
                    return f2o.c(c2o.k, h1Var.toString());
                }
                iys0 iys0VarH = h1Var.h();
                if (iys0VarH == null) {
                    e0t0.a(12);
                    throw null;
                }
                if (cr30VarK0 == null) {
                    e0t0.a(13);
                    throw null;
                }
                List listD = e0t0.d(iys0VarH.getParameters());
                ays0.b.getClass();
                return ucx.i0(ays0.c, iys0VarH, listD, false, cr30VarK0, w0Var);
            case 1:
                return new pdx(h1Var.k0());
            default:
                return new c8z(h1Var);
        }
    }
}
