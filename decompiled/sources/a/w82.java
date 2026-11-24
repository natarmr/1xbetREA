package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class w82 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ f3d k;
    public final /* synthetic */ l7m0 l;
    public final /* synthetic */ qno0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w82(f3d f3dVar, l7m0 l7m0Var, qno0 qno0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f3dVar;
        this.l = l7m0Var;
        this.m = qno0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new w82(this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new w82(this.k, this.l, this.m, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((w82) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        qno0 qno0Var = this.m;
        l7m0 l7m0Var = this.l;
        f3d f3dVar = this.k;
        switch (b) {
            case 0:
                Object obj2 = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new s82(f3dVar, (byte) 0));
                    gmq gmqVarW = i120.W(aoq.c(ydx.V(null, new jb(l7m0Var, (byte) 17)), new v82(null, qno0Var, (byte) 0)));
                    t82 t82Var = new t82(3, null, (byte) 0);
                    u82 u82Var = new u82(f3dVar, (byte) 0);
                    this.j = true;
                    Object objG = tdc.G(this, u82Var, new kh1((Object) t82Var, (yje) null, (byte) 9), pul.j, new gmq[]{vsg0VarV, gmqVarW});
                    if (objG != wne.f39444a) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj2) {
                        return obj2;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                Object obj3 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vsg0 vsg0VarV2 = ydx.V(null, new s82(f3dVar, (byte) 7));
                    gmq gmqVarW2 = i120.W(aoq.c(ydx.V(null, new f7f0(l7m0Var, (byte) 19)), new v82(null, qno0Var, (byte) 1)));
                    t82 t82Var2 = new t82(3, null, (byte) 5);
                    u82 u82Var2 = new u82(f3dVar, (byte) 1);
                    this.j = true;
                    Object objG2 = tdc.G(this, u82Var2, new kh1((Object) t82Var2, (yje) null, (byte) 9), pul.j, new gmq[]{vsg0VarV2, gmqVarW2});
                    if (objG2 != wne.f39444a) {
                        objG2 = Unit.f46060a;
                    }
                    if (objG2 == obj3) {
                        return obj3;
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
    }
}
