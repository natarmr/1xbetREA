package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class yic0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hjc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yic0(hjc0 hjc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hjc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hjc0 hjc0Var = this.k;
        switch (b) {
            case 0:
                return new yic0(hjc0Var, yjeVar, (byte) 0);
            case 1:
                return new yic0(hjc0Var, yjeVar, (byte) 1);
            default:
                return new yic0(hjc0Var, yjeVar, (byte) 2);
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
        return ((yic0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        hjc0 hjc0Var = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    lnq lnqVarZ = dtb.z(hjc0Var.l, 1);
                    xic0 xic0Var = new xic0(hjc0Var, b2);
                    this.j = true;
                    if (lnqVarZ.c(xic0Var, this) == wneVar) {
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
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0Var = ((rkc0) hjc0Var.h.f2175a).b.d;
                xic0 xic0Var2 = new xic0(hjc0Var, (byte) 2);
                this.j = true;
                qoj0Var.c(new uap((kmq) xic0Var2, (byte) 12), this);
                return wneVar2;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    y3v y3vVar = hjc0Var.d;
                    this.j = true;
                    if (y3vVar.q() == wneVar3) {
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
        }
    }
}
