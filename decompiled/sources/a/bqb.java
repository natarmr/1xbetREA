package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class bqb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ eqb l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqb(eqb eqbVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = eqbVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eqb eqbVar = this.l;
        switch (b) {
            case 0:
                bqb bqbVar = new bqb(eqbVar, yjeVar, (byte) 0);
                bqbVar.k = obj;
                return bqbVar;
            default:
                bqb bqbVar2 = new bqb(eqbVar, yjeVar, (byte) 1);
                bqbVar2.k = obj;
                return bqbVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bqb) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bqb) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        eqb eqbVar = this.l;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    Long l = new Long(eqbVar.h.b());
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(l, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                Pair pair = (Pair) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    e7a e7aVar = (e7a) pair.f46059a;
                    if (e7aVar instanceof d7a) {
                        rwj rwjVar = tvk.f34603a;
                        vs10 vs10Var = ys10.f43147a;
                        d09 d09Var = new d09(eqbVar, e7aVar, (yje) null, (byte) 28);
                        this.k = null;
                        this.j = true;
                        if (qjj.d0(vs10Var, d09Var, this) == wneVar2) {
                            return wneVar2;
                        }
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
