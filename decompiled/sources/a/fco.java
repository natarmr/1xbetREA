package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fco extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l7m0 k;
    public final /* synthetic */ xk80 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fco(byte b, yje yjeVar, xk80 xk80Var, l7m0 l7m0Var) {
        super(2, yjeVar);
        this.i = b;
        this.k = l7m0Var;
        this.l = xk80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                fco fcoVar = new fco((byte) 0, yjeVar, this.l, this.k);
                fcoVar.j = obj;
                return fcoVar;
            case 1:
                fco fcoVar2 = new fco((byte) 1, yjeVar, this.l, this.k);
                fcoVar2.j = obj;
                return fcoVar2;
            default:
                fco fcoVar3 = new fco((byte) 2, yjeVar, this.l, this.k);
                fcoVar3.j = obj;
                return fcoVar3;
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
        return ((fco) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        a4x a4xVar;
        a4x a4xVar2;
        a4x a4xVar3;
        byte b = this.i;
        l7m0 l7m0Var = this.k;
        xk80 xk80Var = this.l;
        vne vneVar = (vne) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gkw gkwVar = (gkw) l7m0Var.getValue();
                ekw ekwVar = (gkwVar == null || (a4xVar = gkwVar.b) == null) ? null : (ekw) a4xVar.get(xk80Var.k());
                gkw gkwVar2 = (gkw) l7m0Var.getValue();
                if (!Intrinsics.d(ekwVar, gkwVar2 != null ? gkwVar2.c : null)) {
                    qjj.W(vneVar, null, null, new eyj((byte) 1, null, xk80Var, l7m0Var), 3);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gkw gkwVar3 = (gkw) l7m0Var.getValue();
                ekw ekwVar2 = (gkwVar3 == null || (a4xVar2 = gkwVar3.b) == null) ? null : (ekw) a4xVar2.get(xk80Var.k());
                gkw gkwVar4 = (gkw) l7m0Var.getValue();
                if (!Intrinsics.d(ekwVar2, gkwVar4 != null ? gkwVar4.c : null)) {
                    qjj.W(vneVar, null, null, new eyj((byte) 2, null, xk80Var, l7m0Var), 3);
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                gkw gkwVar5 = (gkw) l7m0Var.getValue();
                ekw ekwVar3 = (gkwVar5 == null || (a4xVar3 = gkwVar5.b) == null) ? null : (ekw) a4xVar3.get(xk80Var.k());
                gkw gkwVar6 = (gkw) l7m0Var.getValue();
                if (!Intrinsics.d(ekwVar3, gkwVar6 != null ? gkwVar6.c : null)) {
                    qjj.W(vneVar, null, null, new eyj((byte) 3, null, xk80Var, l7m0Var), 3);
                }
                break;
        }
        return Unit.f46060a;
    }
}
