package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class l87 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l87(long j, d650 d650Var, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.j = j;
        this.l = d650Var;
        this.k = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new l87((f97) obj2, this.j, this.k, yjeVar, (byte) 0);
            case 1:
                return new l87((hq7) obj2, this.j, this.k, yjeVar, (byte) 1);
            case 2:
                l87 l87Var = new l87((n530) obj2, this.k, yjeVar);
                l87Var.j = ((Number) obj).longValue();
                return l87Var;
            case 3:
                return new l87(this.j, (d650) obj2, this.k, yjeVar);
            default:
                return new l87((bv70) obj2, this.j, this.k, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((l87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((l87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((l87) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((l87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l87) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        long j = this.k;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                f97 f97Var = (f97) obj2;
                k87 k87Var = new k87((byte) 0, this.j, this.k);
                int i = f97.R0;
                f97Var.H(k87Var);
                f97Var.a0();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gr00 gr00Var = ((hq7) obj2).p;
                ((oeg0) gr00Var.f11760a).c().d(new qp7((Object) gr00Var, this.j, this.k, (byte) 0));
                return Unit.f46060a;
            case 2:
                long j2 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return ((n530) obj2).b(new i530(j, j2));
            case 3:
                d650 d650Var = (d650) obj2;
                mne mneVar = d650Var.L;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                long j3 = this.j;
                if (j3 == 0) {
                    return Unit.f46060a;
                }
                s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
                if (j3 != -1) {
                    yje yjeVar = null;
                    if (j3 == -10) {
                        int i2 = d650.k1;
                        sac.V(jiu0.a(d650Var), w550.f38569a, null, mneVar.f22085a, new x550(d650Var, true, yjeVar, 1 == true ? 1 : 0), 10);
                    } else {
                        sac.V(jiu0.a(d650Var), new f340(1, d650Var, d650.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.f22085a, new o550(d650Var, j3, yjeVar, (byte) 1), 10);
                    }
                } else if (!d650Var.c1) {
                    d650Var.H.c(new AggregatorScreenModel(null, null, 0L, new lm1(j), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                }
                return Unit.f46060a;
            default:
                long j4 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                bv70 bv70Var = (bv70) obj2;
                bv70Var.K.a(suy.a(((hu70) bv70Var.D()).t, wuy.d, j + j4, !((hu70) bv70Var.D()).t.e ? j4 : ((hu70) bv70Var.D()).t.d, false, 2));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l87(n530 n530Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.l = n530Var;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l87(i3t0 i3t0Var, long j, long j2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = i3t0Var;
        this.j = j;
        this.k = j2;
    }
}
