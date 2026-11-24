package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class aix extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ dix j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aix(dix dixVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = dixVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dix dixVar = this.j;
        switch (b) {
            case 0:
                return new aix(dixVar, yjeVar, (byte) 0);
            default:
                return new aix(dixVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((aix) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((aix) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        dix dixVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                sac.T(new fnq(((n9s) dixVar.r.f40284a).a(), new u5u((Object) dixVar, (yje) null, (byte) 21), (byte) 4), jiu0.a(dixVar), zhx.h);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                dixVar.x.g(idf0.f14583a);
                dixVar.u.b(lx7.f20801a);
                p7m0 p7m0Var = dixVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ohx.a((ohx) value, null, iun.f15405a, null, null, 117)));
                break;
        }
        return Unit.f46060a;
    }
}
