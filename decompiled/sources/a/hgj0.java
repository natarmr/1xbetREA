package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hgj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ngj0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgj0(ngj0 ngj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = ngj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ngj0 ngj0Var = this.l;
        switch (b) {
            case 0:
                hgj0 hgj0Var = new hgj0(ngj0Var, yjeVar, (byte) 0);
                hgj0Var.k = obj;
                return hgj0Var;
            default:
                hgj0 hgj0Var2 = new hgj0(ngj0Var, yjeVar, (byte) 1);
                hgj0Var2.k = obj;
                return hgj0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hgj0) create((tm4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hgj0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        ngj0 ngj0Var = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                tm4 tm4Var = (tm4) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    im4 im4Var = ngj0Var.M0;
                    this.k = tm4Var;
                    this.j = true;
                    im4Var.getClass();
                    if (im4Var.a(jl4.f16698a, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (tm4Var != null) {
                    if (tm4Var instanceof sm4) {
                        int i = ngj0.Y0;
                        ngj0Var.G(n1j0.f22752a);
                    } else if (tm4Var instanceof rm4) {
                        rm4 rm4Var = (rm4) tm4Var;
                        Throwable th = rm4Var.f30728a;
                        uu4 uu4Var = rm4Var.b;
                        int i2 = ngj0.Y0;
                        ngj0Var.Q(th, uu4Var);
                    }
                    p7m0 p7m0Var = ngj0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, pfj0.a((pfj0) value, false, false, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -2, 1048575)));
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                e7a e7aVar = (e7a) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (e7aVar instanceof d7a) {
                        rwj rwjVar = tvk.f34603a;
                        vs10 vs10Var = ys10.f43147a;
                        bai0 bai0Var = new bai0(ngj0Var, e7aVar, yjeVar, (byte) 17);
                        this.k = null;
                        this.j = true;
                        if (qjj.d0(vs10Var, bai0Var, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
