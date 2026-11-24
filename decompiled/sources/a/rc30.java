package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class rc30 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ xc30 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc30(xc30 xc30Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = xc30Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xc30 xc30Var = this.j;
        switch (b) {
            case 0:
                return new rc30(xc30Var, yjeVar, (byte) 0);
            default:
                return new rc30(xc30Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((rc30) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        xc30 xc30Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = xc30.H;
                p7m0 p7m0Var = xc30Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    xc30Var.f.getClass();
                } while (!p7m0Var.m(value, hc30.a((hc30) value, null, null, false, false, true, false, null, 0L, Response.PROXY_AUTHENTICATION_REQUIRED)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = xc30.H;
                p7m0 p7m0Var2 = xc30Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    xc30Var.f.getClass();
                } while (!p7m0Var2.m(value2, hc30.a((hc30) value2, null, null, false, false, true, false, null, 0L, Response.PROXY_AUTHENTICATION_REQUIRED)));
                break;
        }
        return Unit.f46060a;
    }
}
