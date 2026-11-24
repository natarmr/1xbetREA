package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class uk70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ yk70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk70(yk70 yk70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yk70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yk70 yk70Var = this.k;
        switch (b) {
            case 0:
                return new uk70(yk70Var, yjeVar, (byte) 0);
            case 1:
                return new uk70(yk70Var, yjeVar, (byte) 1);
            default:
                return new uk70(yk70Var, yjeVar, (byte) 2);
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
        return ((uk70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.i;
        yk70 yk70Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    fq fqVar = yk70Var.g;
                    this.j = true;
                    if (fqVar.f(ry5.f31296a, this) == wneVar) {
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
                    i5m0 i5m0Var = yk70Var.n;
                    this.j = true;
                    if (i5m0Var.b(this) == wneVar2) {
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
                wsf0 wsf0Var = yk70Var.d;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    khf0 khf0VarG = ((g45) wsf0Var.b).G();
                    bm5 bm5Var = bm5.d;
                    this.j = true;
                    obj = khf0VarG.A(bm5Var, tl5.c, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ql5 ql5Var = (ql5) obj;
                wsf0Var.s().l(bm5.d, ql5Var);
                yk70Var.c.a(yk70Var.b, true, ql5Var.f28916a);
                return Unit.f46060a;
        }
    }
}
