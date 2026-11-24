package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class lxi0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xxi0 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxi0(xxi0 xxi0Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xxi0Var;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.l;
        xxi0 xxi0Var = this.k;
        switch (b) {
            case 0:
                return new lxi0(xxi0Var, z, yjeVar, (byte) 0);
            default:
                return new lxi0(xxi0Var, z, yjeVar, (byte) 1);
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
        return ((lxi0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object value;
        Object objB;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                xxi0 xxi0Var = this.k;
                if (!z) {
                    z1x.P(obj);
                    nhf0 nhf0Var = xxi0Var.F0;
                    this.j = true;
                    objF = nhf0Var.f(false, true, this);
                    if (objF == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = obj;
                }
                gm3 gm3Var = (gm3) objF;
                String str = gm3Var.f11523a;
                boolean z2 = gm3Var.b;
                String str2 = gm3Var.c;
                int length = str.length();
                boolean z3 = this.l;
                if (length > 0) {
                    int i = xxi0.Y0;
                    xxi0Var.H(new cxi0((byte) 2, true));
                    if (z3) {
                        xxi0Var.A.d(new t13((Object) xxi0Var, (Object) str, z2, (Object) str2, (byte) 21));
                    }
                } else {
                    if (z3 && ((twi0) xxi0Var.D()).R) {
                        xxi0Var.W();
                        xxi0Var.H(new kui0((byte) 22));
                    }
                    if (!((twi0) xxi0Var.D()).R) {
                        p7m0 p7m0Var = xxi0Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, twi0.a((twi0) value, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, true, 0, -1, 1966079)));
                    }
                    xxi0Var.H(new cxi0((byte) 2, false));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                xxi0 xxi0Var2 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    ahu ahuVar = xxi0Var2.u;
                    this.j = true;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                long j = ((ql5) objB).f28916a;
                int i2 = xxi0.Y0;
                sac.V(jiu0.a(xxi0Var2), new ywi0(xxi0Var2, (byte) 6), null, xxi0Var2.H.b, new hxi0(xxi0Var2, j, this.l, null), 10);
                return Unit.f46060a;
        }
    }
}
