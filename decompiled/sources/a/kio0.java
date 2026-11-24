package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class kio0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rio0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kio0(rio0 rio0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rio0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new kio0(this.k, yjeVar, (byte) 0);
            default:
                return new kio0(this.k, yjeVar, (byte) 1);
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
        return ((kio0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vh0 vh0Var;
        byte b = this.i;
        rio0 rio0Var = this.k;
        Object obj2 = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    obj = rio0Var.h0.r(new z7b[0], this);
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
                for (Object obj3 : ((a3b) obj).b) {
                    long j = ((vh0) obj3).g;
                    if (j == 68090 || j == 52358) {
                        obj2 = obj3;
                        vh0Var = (vh0) obj2;
                        if (vh0Var != null) {
                            rio0Var.z.d(new itn0(rio0Var, vh0Var, (byte) 15));
                        }
                        return Unit.f46060a;
                    }
                }
                vh0Var = (vh0) obj2;
                if (vh0Var != null) {
                    rio0Var.z.d(new itn0(rio0Var, vh0Var, (byte) 15));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    u8u u8uVar = rio0Var.g0;
                    this.j = true;
                    obj = u8uVar.v(this);
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
                rio0Var.z.d(new itn0(rio0Var, (gx10) obj, (byte) 16));
                return Unit.f46060a;
        }
    }
}
