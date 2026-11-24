package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class klw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ klw(byte b, t33 t33Var, yje yjeVar, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.k = t33Var;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new klw((byte) 0, this.k, yjeVar, this.l);
            default:
                return new klw((byte) 1, this.k, yjeVar, this.l);
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
        return ((klw) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    Float f = new Float(z ? 1.0f : 0.0f);
                    uts0 uts0VarM0 = ro4.m0(500, 0, null, 6);
                    this.j = true;
                    if (t33.a(this.k, f, uts0VarM0, null, null, this, 12) == wneVar) {
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    Float f2 = new Float(z ? 1.0f : 0.0f);
                    uts0 uts0VarM1 = ro4.m0(500, 0, null, 6);
                    this.j = true;
                    if (t33.a(this.k, f2, uts0VarM1, null, null, this, 12) == wneVar2) {
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
        }
    }
}
