package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v210 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36662a;
    public final /* synthetic */ b310 b;

    public /* synthetic */ v210(b310 b310Var, byte b) {
        this.f36662a = b;
        this.b = b310Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f36662a;
        b310 b310Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                mdm mdmVarB = g2v.b(b310Var.k, ozb.J(b310Var.b.b, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, ((da10) b310Var.I.getValue()).f5727a, 0L, 602);
                p7m0 p7m0Var = b310Var.D;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new r210(mdmVarB)));
                b310Var.c.a(th);
                break;
            default:
                b310Var.E.f(new w210(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
