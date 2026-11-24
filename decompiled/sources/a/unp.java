package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class unp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ eop j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ unp(eop eopVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = eopVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eop eopVar = this.j;
        switch (b) {
            case 0:
                return new unp(eopVar, yjeVar, (byte) 0);
            case 1:
                return new unp(eopVar, yjeVar, (byte) 1);
            default:
                return new unp(eopVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((unp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((unp) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((unp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Iterable iterableF;
        Object value;
        Object value2;
        byte b = this.i;
        eop eopVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                sff0 sff0VarA = eopVar.A.a();
                mum0 mum0Var = sff0VarA.g;
                h8l0 h8l0Var = mum0Var.v;
                j8l0 j8l0Var = mum0Var.o;
                g8l0 g8l0Var = mum0Var.z;
                boolean z = (!sff0VarA.J || eopVar.D.j() || eopVar.t == j700.c) ? false : true;
                boolean z2 = g8l0Var == g8l0.CHIPS;
                if (z2) {
                    sqt sqtVar = eopVar.M;
                    jhq0 jhq0Var = eopVar.M() ? jhq0.b : jhq0.f16541a;
                    sqtVar.getClass();
                    iterableF = sqt.f(jhq0Var);
                } else {
                    iterableF = iun.f15405a;
                }
                a4x a4xVarO0 = dyb.o0(iterableF);
                boolean z3 = sff0VarA.c.f7565a.d;
                p7m0 p7m0Var = eopVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, pnp.a((pnp) value, new hop(j8l0Var, h8l0Var, z3), false, null, null, false, z2, a4xVarO0, z, 0, null, false, false, false, false, null, null, 2096254)));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = eop.Z;
                p7m0 p7m0Var2 = eopVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, pnp.a((pnp) value2, null, false, null, null, false, false, null, false, 0, null, false, false, false, false, null, null, 2097087)));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                eopVar.G(new ckp(((pnp) eopVar.D()).u, eopVar.M() ? jhq0.b : jhq0.f16541a));
                break;
        }
        return Unit.f46060a;
    }
}
