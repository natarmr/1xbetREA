package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class t360 extends bnn0 implements ydr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ ql5 k;
    public /* synthetic */ boolean l;
    public final /* synthetic */ v360 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t360(v360 v360Var, yje yjeVar) {
        super(4, yjeVar);
        this.m = v360Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        v360 v360Var = this.m;
        pru pruVar = v360Var.D;
        kmq kmqVar = this.j;
        ql5 ql5Var = this.k;
        boolean z = this.l;
        wne wneVar = wne.f39444a;
        boolean z2 = this.i;
        if (!z2) {
            z1x.P(obj);
            oz50 oz50Var = ((c260) v360Var.D()).b;
            boolean zJ = oz50Var != null ? oz50Var.j : v360Var.r0.j();
            Object dm5Var = hm5.f13289a;
            if (!zJ && z && pruVar.a().L.f30534a) {
                String str = ql5Var.f;
                oz50 oz50Var2 = ((c260) v360Var.D()).b;
                dm5Var = new dm5(ql5Var, str, oz50Var2 != null ? oz50Var2.c : pruVar.a().g.i.f12896a);
            }
            this.j = null;
            this.k = null;
            this.l = z;
            this.i = true;
            if (kmqVar.a(dm5Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        t360 t360Var = new t360(this.m, (yje) obj4);
        t360Var.j = (kmq) obj;
        t360Var.k = (ql5) obj2;
        t360Var.l = zBooleanValue;
        return t360Var.invokeSuspend(Unit.f46060a);
    }
}
