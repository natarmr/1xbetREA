package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class pvd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ svd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pvd(svd svdVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = svdVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        svd svdVar = this.k;
        switch (b) {
            case 0:
                return new pvd(svdVar, yjeVar, (byte) 0);
            case 1:
                return new pvd(svdVar, yjeVar, (byte) 1);
            case 2:
                return new pvd(svdVar, yjeVar, (byte) 2);
            default:
                pvd pvdVar = new pvd(svdVar, yjeVar, (byte) 3);
                pvdVar.j = ((Boolean) obj).booleanValue();
                return pvdVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pvd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((pvd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((pvd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pvd) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        bby bbyVar;
        byte b = this.i;
        svd svdVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hse0 hse0Var = svdVar.j;
                    this.j = true;
                    if (hse0.a(hse0Var, null, true, this, 5) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                svdVar.D();
                p7m0 p7m0Var = svdVar.A;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, fvd.a((fvd) value, false, false, false, false, false, null, 191)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = svdVar.A;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, fvd.a((fvd) value2, true, false, false, false, false, null, 252)));
                    suk sukVar = svdVar.k;
                    this.j = true;
                    if (sukVar.a() == wneVar2) {
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
                    svdVar.H = false;
                    qgd qgdVar = svdVar.t;
                    ckk0 ckk0Var = ckk0.g;
                    qgdVar.getClass();
                    vsg0 vsg0Var = new vsg0(new zm70((Object) qgdVar, (Object) ckk0Var, yjeVar, (byte) 8));
                    jtb jtbVar = new jtb(svdVar, yjeVar, (byte) 13);
                    this.j = true;
                    Object objC = vsg0Var.c(new vnq(h660.f12515a, jtbVar, (byte) 2), this);
                    if (objC != wneVar3) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar3) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar3) {
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
                svdVar.F = z4;
                p7m0 p7m0Var3 = svdVar.A;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, fvd.a((fvd) value3, false, false, !StringsKt.W(((fvd) p7m0Var3.getValue()).h) && z4, z4, false, null, 243)));
                if (!svdVar.H && z4 && (bbyVar = svdVar.C) != null && !bbyVar.isActive()) {
                    svdVar.D();
                }
                return Unit.f46060a;
        }
    }
}
