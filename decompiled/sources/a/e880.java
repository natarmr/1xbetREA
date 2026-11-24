package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e880 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ n880 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e880(n880 n880Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = n880Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n880 n880Var = this.k;
        switch (b) {
            case 0:
                return new e880(n880Var, yjeVar, (byte) 0);
            case 1:
                return new e880(n880Var, yjeVar, (byte) 1);
            default:
                e880 e880Var = new e880(n880Var, yjeVar, (byte) 2);
                e880Var.j = ((Boolean) obj).booleanValue();
                return e880Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e880) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((e880) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((e880) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objD0;
        Object value;
        Object objP;
        byte b = this.i;
        yje yjeVar = null;
        n880 n880Var = this.k;
        boolean z = true;
        char c = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ivn ivnVar = n880Var.A;
                    this.j = true;
                    ju9 ju9Var = (ju9) ivnVar.f15453a;
                    objD0 = qjj.d0(ju9Var.c.b, new hu9(ju9Var, yjeVar, c == true ? 1 : 0), this);
                    if (objD0 == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                List list = (List) objD0;
                bt9 bt9VarC = n880Var.B.c(list);
                p7m0 p7m0Var = n880Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, y780.a((y780) value, null, 0, list, bt9VarC, null, null, null, null, null, null, false, null, false, false, false, false, 180211)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    k0j0 k0j0VarB = n880Var.G.f5239a.b();
                    es esVar = n880Var.x;
                    List list2 = k0j0VarB.b;
                    List list3 = k0j0VarB.c;
                    this.j = true;
                    objP = esVar.p(list2, list3, this);
                    if (objP == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objP = obj;
                }
                qkt qktVar = (qkt) objP;
                if (qktVar.f28902a != -1) {
                    int i = n880.L;
                    n880Var.H(new rb4(qktVar, z, (byte) 3));
                }
                return Unit.f46060a;
            default:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z4) {
                    bby bbyVar = n880Var.I;
                    if (bbyVar != null && bbyVar.isCancelled()) {
                        n880Var.N();
                    }
                    bby bbyVar2 = n880Var.J;
                    if (bbyVar2 != null && bbyVar2.isCancelled()) {
                        n880Var.M();
                    }
                }
                return Unit.f46060a;
        }
    }
}
