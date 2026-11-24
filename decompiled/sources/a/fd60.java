package a;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class fd60 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ long j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd60(Object obj, long j, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
        this.j = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.k;
        switch (b) {
            case 0:
                return new fd60((rrd) obj, this.j, yjeVar, (byte) 0);
            case 1:
                return new fd60((rrd) obj, this.j, yjeVar, (byte) 1);
            default:
                return new fd60((zco0) obj, this.j, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((fd60) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kxv kxvVarO;
        byte b = this.i;
        long j = this.j;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                Pair pair = (Pair) ((nx20) ((pvt) ((rrd) obj2).c).f27678a.b).b.b();
                return Boolean.valueOf(((pair == null || ((Number) pair.f46059a).longValue() != j) ? iun.f15405a : (List) pair.b).isEmpty());
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                Pair pair2 = (Pair) ((nx20) ((qvt) ((rrd) obj2).c).f29403a.b).f24263a.b();
                return Boolean.valueOf(((pair2 == null || ((Number) pair2.f46059a).longValue() != j) ? iun.f15405a : (List) pair2.b).isEmpty());
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                zco0 zco0Var = (zco0) obj2;
                int i = zco0.r0;
                bby bbyVar = zco0Var.q0;
                if ((bbyVar == null || !bbyVar.isActive()) && (kxvVarO = zco0Var.O(j)) != null) {
                    zco0Var.q0 = sac.V(jiu0.a(zco0Var), new ndn0(1, zco0Var, zco0.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, null, new kpb0(kxvVarO, zco0Var, new npn(kxvVarO.f19077a, kxvVarO.b, (Long) 0L, kxvVarO.i), null, (byte) 18), 14);
                }
                return Unit.f46060a;
        }
    }
}
