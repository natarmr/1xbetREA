package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class p2d extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ float k;
    public final /* synthetic */ nyq0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2d(nyq0 nyq0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = nyq0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        nyq0 nyq0Var = this.l;
        float fFloatValue = ((Number) obj2).floatValue();
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                p2d p2dVar = new p2d(nyq0Var, yjeVar, (byte) 0);
                p2dVar.k = fFloatValue;
                return p2dVar.invokeSuspend(Unit.f46060a);
            default:
                p2d p2dVar2 = new p2d((zyn) nyq0Var, yjeVar, (byte) 1);
                p2dVar2.k = fFloatValue;
                return p2dVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        nyq0 nyq0Var = this.l;
        switch (b) {
            case 0:
                float f = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    oyq0 state = nyq0Var.getState();
                    sjj sjjVarB = nyq0Var.b();
                    j73 j73VarC = nyq0Var.c();
                    this.k = f;
                    this.j = true;
                    if (qzb.U0(state, f, sjjVarB, j73VarC, this) == wneVar) {
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
                zyn zynVar = (zyn) nyq0Var;
                float f2 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    oyq0 oyq0Var = zynVar.f45214a;
                    sjj sjjVar = zynVar.c;
                    nul0 nul0Var = zynVar.b;
                    this.k = f2;
                    this.j = true;
                    if (y0x0.K(oyq0Var, f2, sjjVar, nul0Var, this) == wneVar2) {
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
