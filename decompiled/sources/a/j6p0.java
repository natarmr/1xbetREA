package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class j6p0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ o6p0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6p0(o6p0 o6p0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = o6p0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        o6p0 o6p0Var = this.k;
        switch (b) {
            case 0:
                return new j6p0(o6p0Var, yjeVar, (byte) 0);
            case 1:
                return new j6p0(o6p0Var, yjeVar, (byte) 1);
            case 2:
                j6p0 j6p0Var = new j6p0(o6p0Var, yjeVar, (byte) 2);
                j6p0Var.j = ((Boolean) obj).booleanValue();
                return j6p0Var;
            default:
                return new j6p0(o6p0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((j6p0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((j6p0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((j6p0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((j6p0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = true;
        o6p0 o6p0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jwu jwuVar = o6p0Var.u;
                    String str = o6p0Var.p;
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
                    jwu jwuVar2 = o6p0Var.u;
                    String str2 = o6p0Var.p;
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
                boolean z5 = !z4 && ((z5p0) o6p0Var.D()).d;
                if (!z4 || (!((z5p0) o6p0Var.D()).e && !((z5p0) o6p0Var.D()).f)) {
                    z = false;
                }
                if (z5 || z) {
                    int i = o6p0.E;
                    o6p0Var.N();
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bby bbyVar = o6p0Var.A;
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
                o6p0Var.A = null;
                return Unit.f46060a;
        }
    }
}
