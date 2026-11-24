package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class yxd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ kyd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxd(kyd kydVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kydVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kyd kydVar = this.k;
        switch (b) {
            case 0:
                return new yxd(kydVar, yjeVar, (byte) 0);
            case 1:
                return new yxd(kydVar, yjeVar, (byte) 1);
            case 2:
                return new yxd(kydVar, yjeVar, (byte) 2);
            default:
                yxd yxdVar = new yxd(kydVar, yjeVar, (byte) 3);
                yxdVar.j = ((Boolean) obj).booleanValue();
                return yxdVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yxd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((yxd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((yxd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yxd) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        bby bbyVar;
        byte b = this.i;
        kyd kydVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    tvd tvdVar = kydVar.u;
                    String str = ((wxd) kydVar.B.getValue()).b;
                    this.j = true;
                    if (tvdVar.a(str, this) == wneVar) {
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
                    hse0 hse0Var = kydVar.d;
                    this.j = true;
                    if (hse0.a(hse0Var, null, true, this, 5) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                kydVar.H();
                p7m0 p7m0Var = kydVar.B;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, wxd.a((wxd) value, false, null, false, false, false, 239)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = kydVar.B;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, wxd.a((wxd) value2, true, null, false, false, false, 222)));
                    suk sukVar = kydVar.o;
                    this.j = true;
                    if (sukVar.a() == wneVar3) {
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
            default:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                kydVar.J = z4;
                if (!kydVar.K && z4 && (bbyVar = kydVar.F) != null && !bbyVar.isActive()) {
                    kydVar.H();
                }
                return Unit.f46060a;
        }
    }
}
