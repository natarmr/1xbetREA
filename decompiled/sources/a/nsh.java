package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class nsh extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rsh k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nsh(rsh rshVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rshVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rsh rshVar = this.k;
        switch (b) {
            case 0:
                nsh nshVar = new nsh(rshVar, yjeVar, (byte) 0);
                nshVar.j = ((Boolean) obj).booleanValue();
                return nshVar;
            default:
                return new nsh(rshVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((nsh) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nsh) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        rsh rshVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    rshVar.w();
                } else if (rshVar.q == null) {
                    rshVar.x();
                    bby bbyVar = rshVar.r;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    fnq fnqVar = new fnq(dub.d0(new aen(vtb.M((mz40) ((udg) rshVar.c.f13549a).b.c.getValue()), (byte) 1), new p6d(rshVar.m, rshVar.n, new t82(3, null, (byte) 3), (byte) 1), rshVar.o, new i89(new h2c(((or30) rshVar.i.f11992a.f1850a.b).f25719a, (byte) 16), (byte) 22), new vsg0(new ex1((Object) rshVar, yjeVar, (byte) 28)), new psh(rshVar, null)), new wib(rshVar, yjeVar, (byte) 21));
                    this.j = true;
                    if (slb.N(fnqVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
