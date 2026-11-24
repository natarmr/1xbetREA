package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fu90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gu90 l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu90(gu90 gu90Var, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = gu90Var;
        this.m = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                fu90 fu90Var = new fu90(this.l, this.m, yjeVar, (byte) 0);
                fu90Var.k = obj;
                return fu90Var;
            default:
                fu90 fu90Var2 = new fu90(this.l, this.m, yjeVar, (byte) 1);
                fu90Var2.k = obj;
                return fu90Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((fu90) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        gu90 gu90Var = this.l;
        switch (b) {
            case 0:
                vne vneVar = (vne) this.k;
                Object obj2 = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (!gu90Var.d.f15225a.a()) {
                        d5c.G(vneVar, null);
                        return Unit.f46060a;
                    }
                    iw20 iw20Var = gu90Var.f11918a;
                    this.k = null;
                    this.j = true;
                    ali aliVar = (ali) iw20Var.f15470a;
                    Object objD0 = qjj.d0(((mne) aliVar.b).b, new hij(aliVar, null, (byte) 24), this);
                    if (objD0 != obj2) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 != obj2) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                uen uenVar = wen.b;
                long jK = wen.k(ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS), this.m);
                ugf0 ugf0Var = gu90Var.c;
                ((ulk) ((ali) ugf0Var.f35622a).c).f35876a.g("LAST_TIME_PING_KEY", wen.e(jK));
                return Unit.f46060a;
            default:
                vne vneVar2 = (vne) this.k;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                long j = this.m;
                if (!z2) {
                    z1x.P(obj);
                    uen uenVar2 = wen.b;
                    vwb0 vwb0Var = ((ulk) ((ali) gu90Var.b.f2175a).c).f35876a;
                    vwb0Var.getClass();
                    long j2 = vwb0Var.b().getLong("LAST_TIME_PING_KEY", 0L);
                    bfn bfnVar = bfn.MILLISECONDS;
                    wen wenVar = new wen(wen.j(wen.k(ibc.w0(System.currentTimeMillis(), bfnVar), j), ibc.w0(j2, bfnVar)));
                    wen.b.getClass();
                    wen wenVar2 = new wen(0L);
                    if (wenVar.compareTo(wenVar2) < 0) {
                        wenVar = wenVar2;
                    }
                    wen wenVar3 = new wen(wen.j(gu90.h, wenVar.f39026a));
                    wen wenVar4 = new wen(0L);
                    if (wenVar3.compareTo(wenVar4) < 0) {
                        wenVar3 = wenVar4;
                    }
                    this.k = vneVar2;
                    this.j = true;
                    if (qcc.P(wenVar3.f39026a, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                dvj dvjVar = gu90Var.e.b;
                long j3 = gu90.h;
                uen uenVar3 = wen.b;
                bfn bfnVar2 = bfn.SECONDS;
                gu90 gu90Var2 = this.l;
                sac.d0(vneVar2, "PingExecutorImpl_sendPing", wen.l(j3, bfnVar2), 0L, dvjVar, wen.l(j3, bfnVar2), kotlin.collections.a.c(oqt0.class), new yi90(1, gu90Var2, gu90.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), new fu90(gu90Var2, j, null, (byte) 0), 20);
                return Unit.f46060a;
        }
    }
}
