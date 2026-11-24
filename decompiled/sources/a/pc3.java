package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class pc3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qc3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc3(qc3 qc3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qc3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qc3 qc3Var = this.k;
        switch (b) {
            case 0:
                return new pc3(qc3Var, yjeVar, (byte) 0);
            default:
                return new pc3(qc3Var, yjeVar, (byte) 1);
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
        return ((pc3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        byte b = this.i;
        qc3 qc3Var = this.k;
        switch (b) {
            case 0:
                p7m0 p7m0Var = qc3Var.f;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    boolean z3 = !((mc3) p7m0Var.getValue()).f21532a;
                    do {
                        value = p7m0Var.getValue();
                        mc3 mc3Var = (mc3) value;
                        z = mc3Var.b;
                        mc3Var.getClass();
                    } while (!p7m0Var.m(value, new mc3(z3, z)));
                    fxu fxuVar = qc3Var.d;
                    this.j = true;
                    if (fxuVar.a(z3, this) == wneVar) {
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
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    fxu fxuVar2 = qc3Var.d;
                    boolean z5 = ((mc3) qc3Var.f.getValue()).f21532a;
                    this.j = true;
                    if (fxuVar2.a(z5, this) == wneVar2) {
                        return wneVar2;
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
