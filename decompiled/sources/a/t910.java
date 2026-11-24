package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t910 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ float k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t910(u910 u910Var, fa10 fa10Var, float f, boolean z, yje yjeVar) {
        super(1, yjeVar);
        this.l = u910Var;
        this.m = fa10Var;
        this.k = f;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        switch (this.i) {
            case 0:
                return new t910((u910) this.l, (fa10) this.m, this.k, this.j, yjeVar);
            default:
                return new t910((glt0) this.l, this.k, (j73) this.m, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((t910) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.m;
        float f = this.k;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                u910 u910Var = (u910) obj3;
                ((hgk0) u910Var.i).setValue((fa10) obj2);
                u910Var.k(f);
                u910Var.i(1);
                u910Var.j(false);
                if (this.j) {
                    ((hgk0) u910Var.l).setValue(Long.MIN_VALUE);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    Object objA = t33.a((t33) ((glt0) obj3).c, new Float(f), (j73) obj2, null, null, this, 12);
                    return objA == wneVar2 ? wneVar2 : objA;
                }
                if (z) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t910(glt0 glt0Var, float f, j73 j73Var, yje yjeVar) {
        super(1, yjeVar);
        this.l = glt0Var;
        this.k = f;
        this.m = j73Var;
    }
}
