package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vd30 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ zd30 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd30(zd30 zd30Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zd30Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zd30 zd30Var = this.k;
        switch (b) {
            case 0:
                return new vd30(zd30Var, yjeVar, (byte) 0);
            case 1:
                return new vd30(zd30Var, yjeVar, (byte) 1);
            case 2:
                vd30 vd30Var = new vd30(zd30Var, yjeVar, (byte) 2);
                vd30Var.j = ((Boolean) obj).booleanValue();
                return vd30Var;
            default:
                return new vd30(zd30Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vd30) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vd30) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((vd30) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vd30) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = true;
        zd30 zd30Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jwu jwuVar = zd30Var.A;
                    String str = zd30Var.q;
                    this.j = true;
                    if (jwuVar.b(str, this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    jwu jwuVar2 = zd30Var.A;
                    String str2 = zd30Var.q;
                    this.j = true;
                    if (jwuVar2.b(str2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z5 = !z4 && ((hd30) zd30Var.D()).d;
                if (!z4 || (!((hd30) zd30Var.D()).f && !((hd30) zd30Var.D()).g)) {
                    z = false;
                }
                if (z5 || z) {
                    int i = zd30.H;
                    zd30Var.N();
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bby bbyVar = zd30Var.D;
                    if (bbyVar != null) {
                        this.j = true;
                        if (zvw.H(bbyVar, this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                zd30Var.D = null;
                return Unit.f46060a;
        }
    }
}
