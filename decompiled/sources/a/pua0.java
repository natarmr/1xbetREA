package a;

import java.net.UnknownHostException;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class pua0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27606a;
    public final /* synthetic */ rua0 b;

    public /* synthetic */ pua0(rua0 rua0Var, byte b) {
        this.f27606a = b;
        this.b = rua0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        byte b = this.f27606a;
        rua0 rua0Var = this.b;
        switch (b) {
            case 0:
                knb knbVar = (knb) obj;
                List list = rua0.G;
                p7m0 p7m0Var = rua0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    rua0Var.f.getClass();
                } while (!p7m0Var.m(value, gua0.a((gua0) value, new dua0(knbVar), null, null, null, null, false, false, null, false, null, false, 131006)));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!zBooleanValue && (((gua0) rua0Var.D()).f11919a instanceof eua0)) {
                    p7m0 p7m0Var2 = rua0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        rua0Var.f.getClass();
                    } while (!p7m0Var2.m(value2, gua0.a((gua0) value2, new cua0(new UnknownHostException()), null, null, null, null, false, false, null, false, null, false, 131070)));
                } else if (zBooleanValue && !(((gua0) rua0Var.D()).f11919a instanceof dua0)) {
                    rua0Var.N(false);
                }
                break;
        }
        return Unit.f46060a;
    }
}
