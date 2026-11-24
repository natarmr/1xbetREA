package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class cvq extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ivq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvq(ivq ivqVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ivqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ivq ivqVar = this.k;
        switch (b) {
            case 0:
                return new cvq(ivqVar, yjeVar, (byte) 0);
            case 1:
                return new cvq(ivqVar, yjeVar, (byte) 1);
            case 2:
                return new cvq(ivqVar, yjeVar, (byte) 2);
            case 3:
                cvq cvqVar = new cvq(ivqVar, yjeVar, (byte) 3);
                cvqVar.j = ((Boolean) obj).booleanValue();
                return cvqVar;
            default:
                return new cvq(ivqVar, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cvq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((cvq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((cvq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((cvq) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cvq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objG;
        byte b = this.i;
        ivq ivqVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = ivq.B;
                    p7m0 p7m0Var = ivqVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, suq.a((suq) value, false, false, true, false, null, null, null, null, false, 496)));
                    x4u x4uVar = ivqVar.o;
                    String str = ivqVar.p;
                    this.j = true;
                    objG = ((wti) x4uVar.f40284a).g(this, str, true);
                    if (objG == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG = obj;
                }
                f5o f5oVar = new f5o((vuq) objG, (byte) 28);
                int i2 = ivq.B;
                ivqVar.H(f5oVar);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jwu jwuVar = ivqVar.v;
                    String str2 = ivqVar.p;
                    this.j = true;
                    if (jwuVar.b(str2, this) == wneVar2) {
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
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    jwu jwuVar2 = ivqVar.v;
                    String str3 = ivqVar.p;
                    this.j = true;
                    if (jwuVar2.b(str3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (z4 && !((suq) ivqVar.D()).d && !((suq) ivqVar.D()).c) {
                    ivqVar.M();
                    ivqVar.N();
                }
                if (!z4) {
                    bby bbyVar = ivqVar.z;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    ivqVar.z = null;
                }
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bby bbyVar2 = ivqVar.z;
                    if (bbyVar2 != null) {
                        this.j = true;
                        if (zvw.H(bbyVar2, this) == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
