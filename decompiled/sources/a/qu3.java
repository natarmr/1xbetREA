package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qu3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ zu3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu3(zu3 zu3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zu3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zu3 zu3Var = this.k;
        switch (b) {
            case 0:
                return new qu3(zu3Var, yjeVar, (byte) 0);
            case 1:
                return new qu3(zu3Var, yjeVar, (byte) 1);
            default:
                return new qu3(zu3Var, yjeVar, (byte) 2);
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
        return ((qu3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        zu3 zu3Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ((xrc) zu3Var.w.get()).a();
                    this.j = true;
                    if (zu3Var.z(this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i = zu3.s0;
                    zu3.r0 = System.currentTimeMillis();
                    ((h840) ((xri0) zu3Var.R.get()).f41372a.f27863a).getClass();
                    this.j = true;
                    if (zu3Var.w(this) == wneVar2) {
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
            default:
                Object obj2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    h840 h840Var = (h840) ((stu) zu3Var.Q.get()).f32790a.f27863a;
                    p7m0 p7m0Var = h840Var.f;
                    p7m0 p7m0Var2 = h840Var.g;
                    t82 t82Var = new t82(3, yjeVar, (byte) 4);
                    bm3 bm3Var = new bm3(zu3Var, (byte) 12);
                    this.j = true;
                    Object objG = tdc.G(this, bm3Var, new kh1((Object) t82Var, yjeVar, (byte) 9), pul.j, new gmq[]{p7m0Var, p7m0Var2});
                    if (objG != obj2) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj2) {
                        return obj2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
