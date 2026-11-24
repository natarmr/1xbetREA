package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vaq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37103a;
    public final /* synthetic */ ebq b;

    public /* synthetic */ vaq(ebq ebqVar, byte b) {
        this.f37103a = b;
        this.b = ebqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        byte b = this.f37103a;
        ebq ebqVar = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ebqVar.G(caq.f4024a);
                p7m0 p7m0Var = ebqVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ebqVar.f.getClass();
                } while (!p7m0Var.m(value, oaq.a((oaq) value, null, false, null, null, null, null, null, false, true, 0, null, false, 3711)));
                break;
            default:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                if (th instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th;
                    String strJ0 = sj3.j0(zhi0Var.getMessage(), ebqVar.z.f(R.string.error_something_went_wrong, new Object[0]));
                    kuw kuwVar = zhi0Var.c;
                    if (kuwVar == i2o.BetExistsError) {
                        ebqVar.G(new gaq(strJ0));
                    } else if (kuwVar == i2o.q) {
                        ebqVar.G(new iaq(strJ0));
                    } else if (kuwVar == i2o.BetSumExceededNew || kuwVar == i2o.BetSumExceeded) {
                        ebqVar.G(new maq(strJ0));
                    } else {
                        ebqVar.G(new maq(str));
                    }
                } else {
                    ebqVar.G(new maq(str));
                }
                break;
        }
        return Unit.f46060a;
    }
}
