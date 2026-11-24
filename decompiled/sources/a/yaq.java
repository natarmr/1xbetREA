package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class yaq extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ebq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yaq(ebq ebqVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ebqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ebq ebqVar = this.k;
        switch (b) {
            case 0:
                yaq yaqVar = new yaq(ebqVar, yjeVar, (byte) 0);
                yaqVar.j = obj;
                return yaqVar;
            default:
                yaq yaqVar2 = new yaq(ebqVar, yjeVar, (byte) 1);
                yaqVar2.j = obj;
                return yaqVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yaq) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yaq) create((ehn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        ebq ebqVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                ql5 ql5Var = (ql5) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                g9q g9qVar = ((oaq) ebqVar.D()).d;
                if (g9qVar != null && g9qVar.f10928a == ql5Var.f28916a) {
                    p7m0 p7m0Var = ebqVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, oaq.a((oaq) value, null, false, null, vcc.k0(ql5Var), null, null, null, false, false, 0, null, false, 4087)));
                }
                break;
            default:
                ehn0 ehn0Var = (ehn0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = ebq.f0;
                ebqVar.G(caq.f4024a);
                boolean z = ehn0Var.f7816a;
                String str = ehn0Var.f;
                String str2 = ehn0Var.b;
                if (z) {
                    ebqVar.G(new laq(ehn0Var.c, str2, str));
                } else {
                    ebqVar.G(new haq(ehn0Var.e, ehn0Var.c, str2, ehn0Var.d, str, ehn0Var.g, ehn0Var.h, ehn0Var.i));
                }
                break;
        }
        return Unit.f46060a;
    }
}
