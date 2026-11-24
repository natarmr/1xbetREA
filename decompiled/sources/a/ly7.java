package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ly7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly7(t33 t33Var, float f, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t33Var;
        this.l = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ly7(this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new ly7(this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new ly7(this.k, this.l, yjeVar, (byte) 2);
            default:
                return new ly7(this.k, this.l, yjeVar, (byte) 3);
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
        }
        return ((ly7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        float f = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    Float f2 = new Float(f);
                    j73 j73Var = (j73) ry7.b.getValue();
                    this.j = true;
                    if (t33.a(this.k, f2, j73Var, null, null, this, 12) == wneVar) {
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
                    Float f3 = new Float(f);
                    uts0 uts0VarM0 = ro4.m0(0, 0, null, 6);
                    this.j = true;
                    if (t33.a(this.k, f3, uts0VarM0, null, null, this, 12) == wneVar2) {
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
                    Float f4 = new Float(f);
                    uts0 uts0VarM1 = ro4.m0(300, 0, ihn.f14788a, 2);
                    this.j = true;
                    if (t33.a(this.k, f4, uts0VarM1, null, null, this, 12) == wneVar3) {
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
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    Float f5 = new Float(f);
                    uts0 uts0VarM2 = ro4.m0(300, 0, ihn.f14788a, 2);
                    this.j = true;
                    if (t33.a(this.k, f5, uts0VarM2, null, null, this, 12) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
