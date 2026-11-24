package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class i92 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n92 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i92(n92 n92Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = n92Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n92 n92Var = this.k;
        switch (b) {
            case 0:
                i92 i92Var = new i92(n92Var, yjeVar, (byte) 0);
                i92Var.j = obj;
                return i92Var;
            case 1:
                i92 i92Var2 = new i92(n92Var, yjeVar, (byte) 1);
                i92Var2.j = obj;
                return i92Var2;
            case 2:
                i92 i92Var3 = new i92(n92Var, yjeVar, (byte) 2);
                i92Var3.j = obj;
                return i92Var3;
            default:
                i92 i92Var4 = new i92(n92Var, yjeVar, (byte) 3);
                i92Var4.j = obj;
                return i92Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((i92) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((i92) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((i92) create((uf50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((i92) create((dj50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        n92 n92Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                IntRange intRange = n92.h0;
                p7m0 p7m0Var = n92Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, d92.a((d92) value, null, null, list, null, null, 0L, null, 2039)));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                k92 k92Var = new k92((uaq0) obj2, (byte) 0);
                IntRange intRange2 = n92.h0;
                n92Var.H(k92Var);
                break;
            case 2:
                uf50 uf50Var = (uf50) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                o00 o00Var = new o00(uf50Var, (byte) 29);
                IntRange intRange3 = n92.h0;
                n92Var.H(o00Var);
                if (uf50Var == null && ((d92) n92Var.D()).b.d.r) {
                    bby bbyVar = n92Var.e0;
                    byte b2 = 1;
                    yje yjeVar = null;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        n92Var.e0 = sac.V(jiu0.a(n92Var), new g92(n92Var, (byte) 3), null, n92Var.r.f22085a, new pa(n92Var, (yje) null, (byte) 20), 10);
                    }
                    c4m0 c4m0Var = n92Var.f0;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        n92Var.f0 = i3t0.L(n92Var, new dnq(new fnq(new i89(((d5m0) n92Var.P.b).f5514a.f3779a, (byte) 22), new yg1(n92Var, yjeVar, b2), (byte) 4), new l92(n92Var, null, (byte) 2), (byte) 1), null, null, 3);
                    }
                } else {
                    v3c.N(n92Var.e0);
                    v3c.N(n92Var.f0);
                    n92Var.Q.f14248a.f5514a.b = false;
                    p7m0 p7m0Var2 = n92Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        n92Var.f.getClass();
                    } while (!p7m0Var2.m(value2, d92.a((d92) value2, null, null, null, null, null, 0L, null, 1791)));
                }
                break;
            default:
                dj50 dj50Var = (dj50) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                IntRange intRange4 = n92.h0;
                p7m0 p7m0Var3 = n92Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, d92.a((d92) value3, null, null, null, null, dj50Var, 0L, null, 1983)));
                break;
        }
        return Unit.f46060a;
    }
}
