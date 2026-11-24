package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pyc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qyc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pyc0(qyc0 qyc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qyc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qyc0 qyc0Var = this.k;
        switch (b) {
            case 0:
                return new pyc0(qyc0Var, yjeVar, (byte) 0);
            case 1:
                pyc0 pyc0Var = new pyc0(qyc0Var, yjeVar, (byte) 1);
                pyc0Var.j = ((Boolean) obj).booleanValue();
                return pyc0Var;
            default:
                return new pyc0(qyc0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pyc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pyc0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pyc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        qyc0 qyc0Var = this.k;
        switch (b) {
            case 0:
                p7m0 p7m0Var = qyc0Var.x;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (qyc0Var.t.k) {
                        p7m0Var.getClass();
                        p7m0Var.o(null, dfe.f5996a);
                        wou wouVar = qyc0Var.f;
                        this.j = true;
                        obj = wouVar.a(this);
                        if (obj == wneVar) {
                            return wneVar;
                        }
                    } else {
                        p7m0Var.getClass();
                        p7m0Var.o(null, yee.f42482a);
                    }
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                afe afeVar = new afe(x0x.f0((etc0) obj));
                p7m0Var.getClass();
                p7m0Var.o(null, afeVar);
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!qyc0Var.s && z2) {
                    qyc0Var.y();
                }
                qyc0Var.s = z2;
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    wou wouVar2 = qyc0Var.f;
                    this.j = true;
                    obj = wouVar2.a(this);
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
                p7m0 p7m0Var2 = qyc0Var.x;
                afe afeVar2 = new afe(x0x.f0((etc0) obj));
                p7m0Var2.getClass();
                p7m0Var2.o(null, afeVar2);
                return Unit.f46060a;
        }
    }
}
