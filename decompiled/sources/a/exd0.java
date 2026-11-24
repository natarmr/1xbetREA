package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class exd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8571a;
    public final /* synthetic */ hxd0 b;

    public /* synthetic */ exd0(hxd0 hxd0Var, byte b) {
        this.f8571a = b;
        this.b = hxd0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f8571a;
        hxd0 hxd0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                mdm mdmVarB = g2v.b(hxd0Var.k, ozb.J(hxd0Var.b.b, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, ((da10) hxd0Var.I.getValue()).f5727a, 0L, 602);
                p7m0 p7m0Var = hxd0Var.D;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new axd0(mdmVarB)));
                hxd0Var.c.b(th, new ksc0((byte) 18));
                break;
            default:
                hxd0Var.E.f(new xwd0(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
