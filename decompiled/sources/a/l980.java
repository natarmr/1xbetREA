package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l980 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ aa80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l980(aa80 aa80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = aa80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        aa80 aa80Var = this.k;
        switch (b) {
            case 0:
                return new l980(aa80Var, yjeVar, (byte) 0);
            case 1:
                return new l980(aa80Var, yjeVar, (byte) 1);
            default:
                l980 l980Var = new l980(aa80Var, yjeVar, (byte) 2);
                l980Var.j = ((Boolean) obj).booleanValue();
                return l980Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((l980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((l980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((l980) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        d980 d980Var;
        Object value2;
        byte b = this.i;
        yje yjeVar = null;
        aa80 aa80Var = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ivn ivnVar = aa80Var.n;
                    this.j = true;
                    ju9 ju9Var = (ju9) ivnVar.f15453a;
                    obj = qjj.d0(ju9Var.c.b, new hu9(ju9Var, yjeVar, b2), this);
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
                List list = (List) obj;
                bt9 bt9VarC = aa80Var.o.c(list);
                p7m0 p7m0Var = aa80Var.z;
                do {
                    value = p7m0Var.getValue();
                    d980Var = (d980) value;
                    b980 b980Var = d980Var.e;
                } while (!p7m0Var.m(value, d980.a(d980Var, false, null, null, null, new b980(list, bt9VarC), false, false, 15)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    es esVar = aa80Var.k;
                    k0j0 k0j0Var = aa80Var.u;
                    List list2 = k0j0Var.b;
                    List list3 = k0j0Var.c;
                    this.j = true;
                    obj = esVar.p(list2, list3, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                qkt qktVar = (qkt) obj;
                if (qktVar.f28902a != -1) {
                    p7m0 p7m0Var2 = aa80Var.z;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, d980.a((d980) value2, false, null, null, mbc.e0(qktVar, true), null, false, false, 119)));
                }
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    bby bbyVar = aa80Var.w;
                    if (bbyVar != null && bbyVar.isCancelled()) {
                        aa80Var.x();
                    }
                    bby bbyVar2 = aa80Var.x;
                    if (bbyVar2 != null && bbyVar2.isCancelled()) {
                        aa80Var.w();
                    }
                }
                return Unit.f46060a;
        }
    }
}
