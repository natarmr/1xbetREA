package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class bk4 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public hk4 j;
    public boolean k;
    public final /* synthetic */ hk4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk4(hk4 hk4Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = hk4Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        hk4 hk4Var = this.l;
        switch (b) {
            case 0:
                return new bk4(hk4Var, yjeVar, (byte) 0);
            default:
                return new bk4(hk4Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((bk4) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objI;
        Object value;
        tj4 tj4Var;
        Object g0g0Var;
        Object objH;
        byte b = this.i;
        hk4 hk4Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    ieu ieuVar = hk4Var.B;
                    this.j = hk4Var;
                    this.k = true;
                    objI = ieuVar.i(this);
                    if (objI == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hk4Var = this.j;
                    z1x.P(obj);
                    objI = obj;
                }
                long j = ((elt) objI).e;
                int i = hk4.b0;
                hk4Var.getClass();
                p7m0 p7m0Var = hk4Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    tj4Var = (tj4) value;
                    hk4Var.f.getClass();
                } while (!p7m0Var.m(value, tj4.a(tj4Var, false, tj4Var.m.i.contains(Long.valueOf(j)), false, null, null, null, 0, false, null, null, false, 65533)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.k;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        e0g0 e0g0Var = j0g0.b;
                        rpt rptVar = hk4Var.u;
                        int i2 = ((tj4) hk4Var.D()).h;
                        this.j = hk4Var;
                        this.k = true;
                        objH = rptVar.h(i2, this);
                        if (objH == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (!z2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hk4Var = this.j;
                        z1x.P(obj);
                        objH = obj;
                    }
                    g0g0Var = (qkt) objH;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Object obj2 = g0g0Var instanceof g0g0 ? null : g0g0Var;
                int i3 = hk4.b0;
                hk4Var.getClass();
                hk4Var.H(new wb4((qkt) obj2, (byte) 5));
                return Unit.f46060a;
        }
    }
}
