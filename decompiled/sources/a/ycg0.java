package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ycg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;
    public final /* synthetic */ l7m0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ycg0(l7m0 l7m0Var, xcz xczVar, float f, float f2, float f3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = l7m0Var;
        this.k = xczVar;
        this.l = f;
        this.m = f2;
        this.n = f3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ycg0((pz40) this.o, this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            default:
                return new ycg0(this.o, this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
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
        return ((ycg0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        l7m0 l7m0Var = this.o;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, new rip((pz40) l7m0Var, (byte) 23)));
                    xcg0 xcg0Var = new xcg0(this.k, this.l, this.m, this.n, null, (byte) 0);
                    this.j = true;
                    if (slb.O(gmqVarW, xcg0Var, this) == wneVar) {
                        return wneVar;
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVarW2 = i120.W(ydx.V(null, new g7o0(l7m0Var, (byte) 23)));
                    xcg0 xcg0Var2 = new xcg0(this.k, this.l, this.m, this.n, null, (byte) 1);
                    this.j = true;
                    if (slb.O(gmqVarW2, xcg0Var2, this) == wneVar2) {
                        return wneVar2;
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
