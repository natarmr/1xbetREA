package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pv80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rv80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv80(rv80 rv80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rv80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rv80 rv80Var = this.k;
        switch (b) {
            case 0:
                return new pv80(rv80Var, yjeVar, (byte) 0);
            case 1:
                return new pv80(rv80Var, yjeVar, (byte) 1);
            case 2:
                pv80 pv80Var = new pv80(rv80Var, yjeVar, (byte) 2);
                pv80Var.j = ((Boolean) obj).booleanValue();
                return pv80Var;
            default:
                return new pv80(rv80Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pv80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((pv80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pv80) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pv80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        k7k k7kVar;
        String str;
        Object value;
        byte b = this.i;
        rv80 rv80Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kb0 kb0Var = rv80Var.D;
                    String str2 = rv80Var.M;
                    str2.getClass();
                    long j = ((yu80) rv80Var.D()).l.c;
                    if (j == nw80.h.getId()) {
                        k7kVar = k7k.AggregatorTvGames;
                    } else if (j == nw80.c.getId()) {
                        k7kVar = k7k.AggregatorBingo;
                    } else if (j == nw80.f.getId()) {
                        k7kVar = k7k.AggregatorFishHunt;
                    } else if (j == nw80.g.getId()) {
                        k7kVar = k7k.AggregatorScratch;
                    } else if (j == nw80.k.getId()) {
                        k7kVar = k7k.AggregatorCrash;
                    } else if (j == nw80.e.getId()) {
                        k7kVar = k7k.AggregatorVirtualSport;
                    } else if (j == nw80.l.getId()) {
                        k7kVar = k7k.AggregatorKeno;
                    } else if (j == nw80.m.getId()) {
                        k7kVar = k7k.AggregatorAsianGames;
                    } else if (j == nw80.i.getId()) {
                        k7kVar = k7k.AggregatorTvBets;
                    } else if (j == nw80.s.getId()) {
                        k7kVar = k7k.AggregatorFastBet;
                    } else if (j == nw80.j.getId()) {
                        k7kVar = k7k.AggregatorVolcano;
                    } else {
                        k7kVar = j == nw80.Y.getId() ? k7k.AggregatorQuickPlay : k7k.UNKNOWN;
                    }
                    db0 db0Var = new db0(str2, k7kVar, rv80Var.K.g());
                    this.j = true;
                    kb0Var.getClass();
                    if (kb0Var.o(db0Var, this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kb0 kb0Var2 = rv80Var.D;
                    String str3 = rv80Var.M;
                    str3.getClass();
                    long j2 = ((yu80) rv80Var.D()).l.c;
                    if (j2 == nw80.h.getId()) {
                        str = "aggregator_tv_games";
                    } else if (j2 == nw80.f.getId()) {
                        str = "aggregator_fish_hunt";
                    } else if (j2 == nw80.k.getId()) {
                        str = "aggregator_crush";
                    } else if (j2 == nw80.l.getId()) {
                        str = "aggregator_keno";
                    } else if (j2 == nw80.i.getId()) {
                        str = "aggregator_tvbets";
                    } else if (j2 == nw80.c.getId()) {
                        str = "aggregator_bingo";
                    } else if (j2 == nw80.g.getId()) {
                        str = "aggregator_scratch";
                    } else if (j2 == nw80.e.getId()) {
                        str = "aggregator_virtual_sport";
                    } else if (j2 == nw80.m.getId()) {
                        str = "aggregator_asian";
                    } else if (j2 == nw80.j.getId()) {
                        str = "aggregator_vulkan";
                    } else if (j2 == nw80.s.getId()) {
                        str = "aggregator_fast_bet";
                    } else {
                        str = j2 == nw80.Y.getId() ? "aggregator_quick_play" : "";
                    }
                    cb0 cb0Var = new cb0(str3, str);
                    this.j = true;
                    kb0Var2.getClass();
                    if (kb0Var2.o(cb0Var, this) == wneVar2) {
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
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!((yu80) rv80Var.D()).e && z3) {
                    if (((yu80) rv80Var.D()).o.equals(eu80.f8408a)) {
                        rv80Var.O();
                    }
                    if (((yu80) rv80Var.D()).b) {
                        rv80Var.o.b();
                        rv80Var.Q();
                        rv80Var.R();
                    }
                }
                p7m0 p7m0Var = rv80Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, yu80.a((yu80) value, false, false, false, false, z3, null, null, null, null, 131055)));
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    kd30 kd30Var = rv80Var.I;
                    this.j = true;
                    if (kd30Var.N() == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
