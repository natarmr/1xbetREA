package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qu2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ float k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu2(boolean z, bzl bzlVar, float f, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.j = z;
        this.l = bzlVar;
        this.k = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        float f = this.k;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new qu2(obj2, f, yjeVar, (byte) 0);
            case 1:
                return new qu2(obj2, f, yjeVar, (byte) 1);
            case 2:
                return new qu2(this.j, (bzl) obj2, f, yjeVar);
            case 3:
                return new qu2(obj2, f, yjeVar, (byte) 3);
            case 4:
                return new qu2(obj2, f, yjeVar, (byte) 4);
            default:
                return new qu2(obj2, f, yjeVar, (byte) 5);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((qu2) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        uts0 uts0VarM0;
        byte b = this.i;
        float f = this.k;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (((qv2) obj2).y(f, this) == wneVar) {
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
                    t33 t33Var = ((et8) obj2).f8365a;
                    Float f2 = new Float(((Number) t33Var.d()).floatValue() + f);
                    this.j = true;
                    if (t33Var.f(this, f2) == wneVar2) {
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
                z1x.P(obj);
                if (this.j) {
                    oyq0 oyq0Var = ((bzl) obj2).f3474a;
                    if (oyq0Var.f26070a != (-f)) {
                        oyq0Var.f26070a = -f;
                    }
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    int iB = si30.b(f);
                    uts0 uts0VarM1 = ro4.m0(300, 0, ihn.f14788a, 2);
                    this.j = true;
                    if (((rah0) obj2).f(iB, uts0VarM1, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                o2s o2sVar = (o2s) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    t33 t33Var2 = o2sVar.c;
                    pz40 pz40Var = o2sVar.f;
                    eah0 eah0Var = (eah0) pz40Var.getValue();
                    float f3 = 0.0f;
                    if (eah0Var != null && !(eah0Var instanceof y9h0)) {
                        if (!(eah0Var instanceof bah0)) {
                            t9f.b();
                            return null;
                        }
                        f3 = 1.0f;
                    }
                    Float f4 = new Float(f3);
                    eah0 eah0Var2 = (eah0) pz40Var.getValue();
                    if (eah0Var2 == null || (eah0Var2 instanceof y9h0)) {
                        uts0VarM0 = ro4.m0((int) (300.0f * f), 0, null, 6);
                    } else {
                        if (!(eah0Var2 instanceof bah0)) {
                            t9f.b();
                            return null;
                        }
                        uts0VarM0 = ro4.m0((int) ((1.0f - f) * 300.0f), 0, null, 6);
                    }
                    uts0 uts0Var = uts0VarM0;
                    l2s l2sVar = new l2s(o2sVar, (byte) 1);
                    this.j = true;
                    if (t33.a(t33Var2, f4, uts0Var, null, l2sVar, this, 4) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    p7m0 p7m0Var = ((bo10) obj2).B;
                    Float f5 = new Float(f);
                    this.j = true;
                    p7m0Var.getClass();
                    p7m0Var.o(null, f5);
                    if (Unit.f46060a == wneVar6) {
                        return wneVar6;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu2(Object obj, float f, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = f;
    }
}
