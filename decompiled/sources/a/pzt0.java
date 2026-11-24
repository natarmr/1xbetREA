package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pzt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27862a;
    public final /* synthetic */ tzt0 b;

    public /* synthetic */ pzt0(tzt0 tzt0Var, byte b) {
        this.f27862a = b;
        this.b = tzt0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f27862a;
        tzt0 tzt0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                mdm mdmVarB = g2v.b(tzt0Var.k, ozb.J(tzt0Var.b.b, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, ((da10) tzt0Var.I.getValue()).f5727a, 0L, 602);
                p7m0 p7m0Var = tzt0Var.D;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new lzt0(mdmVarB)));
                tzt0Var.c.b(th, new i9t0((byte) 8));
                break;
            default:
                tzt0Var.E.f(new hzt0(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
