package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class sqg extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ vqg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqg(vqg vqgVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vqgVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vqg vqgVar = this.k;
        switch (b) {
            case 0:
                return new sqg(vqgVar, yjeVar, (byte) 0);
            case 1:
                sqg sqgVar = new sqg(vqgVar, yjeVar, (byte) 1);
                sqgVar.j = ((Boolean) obj).booleanValue();
                return sqgVar;
            case 2:
                return new sqg(vqgVar, yjeVar, (byte) 2);
            default:
                return new sqg(vqgVar, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sqg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((sqg) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((sqg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sqg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        bby bbyVar;
        byte b = this.i;
        vqg vqgVar = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                CyberGameStatisticScreenParams cyberGameStatisticScreenParams = vqgVar.b;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    j3c j3cVar = vqgVar.m;
                    long j = cyberGameStatisticScreenParams.b;
                    this.j = true;
                    obj = j3cVar.a(40L, j, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                bqr bqrVar = new bqr(40L, cyberGameStatisticScreenParams.b, ((ypl0) obj).c.i);
                p7m0 p7m0Var = vqgVar.J;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, kpb.o0(bqrVar, false)));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    vqgVar.w();
                } else {
                    bby bbyVar2 = vqgVar.C;
                    if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = vqgVar.C) != null) {
                        bbyVar.cancel(null);
                    }
                    if (vqgVar.E == null) {
                        vqgVar.z();
                    }
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    int i = 3;
                    dnq dnqVar = new dnq(new p6d(new p6d(vqgVar.H, vqgVar.K, new znc(i, yjeVar, b2), b2), vqgVar.L, new y0g(vqgVar, (yje) null, (byte) 1), b2), new lo3(i, yjeVar, (byte) 10), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    h3c h3cVar = vqgVar.s;
                    long j2 = vqgVar.b.b;
                    this.j = true;
                    obj = h3cVar.a(40L, j2, this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                vqgVar.r.c().d(new v4f(vqgVar, (String) obj, (byte) 22));
                return Unit.f46060a;
        }
    }
}
