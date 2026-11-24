package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class m5w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ q5w j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5w(q5w q5wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = q5wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        q5w q5wVar = this.j;
        switch (b) {
            case 0:
                return new m5w(q5wVar, yjeVar, (byte) 0);
            case 1:
                return new m5w(q5wVar, yjeVar, (byte) 1);
            default:
                return new m5w(q5wVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((m5w) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        n3w n3wVar;
        byte b = this.i;
        q5w q5wVar = this.j;
        byte b2 = 0;
        byte b3 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = q5w.G;
                if (q5wVar.v().j1) {
                    Long lT0 = StringsKt.t0(q5wVar.v().f22868a);
                    if ((lT0 != null ? lT0.longValue() : 0L) > 0) {
                        ((ev7) ((mii0) q5wVar.z.b).d).f8454a.add(Long.valueOf(Long.parseLong(q5wVar.v().f22868a)));
                        p7m0 p7m0Var = q5wVar.C;
                        do {
                            value = p7m0Var.getValue();
                            n3wVar = (n3w) value;
                        } while (!p7m0Var.m(value, n3w.d(n3wVar, null, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, !n3wVar.j1, null, null, null, -1, -17)));
                    }
                }
                q5wVar.E.o(null, k5w.f17739a);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                q5wVar.F.o(null, new c5w(false, false));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                q5w q5wVar2 = this.j;
                ol60 ol60Var = q5wVar2.D;
                mne mneVar = q5wVar2.t;
                List list2 = q5w.G;
                Long lT1 = StringsKt.t0(q5wVar2.v().f22868a);
                long jLongValue = lT1 != null ? lT1.longValue() : 0L;
                if (q5wVar2.v().j1 && jLongValue > 0) {
                    sac.V(jiu0.a(q5wVar2.s()), new n5w(1, q5wVar2, q5w.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, mneVar.b, new p5w(q5wVar2, yjeVar, b3), 10);
                } else if (!((u760) q5wVar2.m.a()).f()) {
                    ol60Var.f(e5w.c);
                } else if (q5wVar2.p.a()) {
                    sac.V(jiu0.a(q5wVar2.s()), new n5w(1, q5wVar2, q5w.class, "handleSelfExclusionError", "handleSelfExclusionError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, mneVar.b, new p5w(q5wVar2, yjeVar, b2), 10);
                } else {
                    ol60Var.f(e5w.b);
                }
                break;
        }
        return Unit.f46060a;
    }
}
