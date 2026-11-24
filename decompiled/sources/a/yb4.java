package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class yb4 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public kc4 j;
    public boolean k;
    public final /* synthetic */ kc4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb4(kc4 kc4Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = kc4Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        kc4 kc4Var = this.l;
        switch (b) {
            case 0:
                return new yb4(kc4Var, yjeVar, (byte) 0);
            default:
                return new yb4(kc4Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((yb4) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        byte b = this.i;
        byte b2 = 0;
        kc4 kc4Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    ieu ieuVar = kc4Var.C;
                    this.j = kc4Var;
                    this.k = true;
                    obj = ieuVar.i(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kc4Var = this.j;
                    z1x.P(obj);
                }
                long j = ((elt) obj).e;
                int i = kc4.Y;
                kc4Var.getClass();
                kc4Var.H(new ub4(kc4Var, j, b2));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.k;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        e0g0 e0g0Var = j0g0.b;
                        rpt rptVar = kc4Var.w;
                        int i2 = ((mb4) kc4Var.D()).h;
                        this.j = kc4Var;
                        this.k = true;
                        obj = rptVar.h(i2, this);
                        if (obj == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (!z2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kc4Var = this.j;
                        z1x.P(obj);
                    }
                    g0g0Var = (qkt) obj;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Object obj2 = g0g0Var instanceof g0g0 ? null : g0g0Var;
                int i3 = kc4.Y;
                kc4Var.getClass();
                kc4Var.H(new wb4((qkt) obj2, b2));
                return Unit.f46060a;
        }
    }
}
