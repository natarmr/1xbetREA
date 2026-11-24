package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class cdj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ odj0 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cdj0(odj0 odj0Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = odj0Var;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.l;
        odj0 odj0Var = this.k;
        switch (b) {
            case 0:
                return new cdj0(odj0Var, z, yjeVar, (byte) 0);
            default:
                return new cdj0(odj0Var, z, yjeVar, (byte) 1);
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
        return ((cdj0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object value;
        Object objN;
        byte b = 1;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                odj0 odj0Var = this.k;
                if (!z) {
                    z1x.P(obj);
                    nhf0 nhf0Var = odj0Var.C0;
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
                    int i = odj0.V0;
                    odj0Var.H(new cxi0((byte) 9, true));
                    if (z3) {
                        odj0Var.z.d(new t13((Object) odj0Var, (Object) str, z2, (Object) str2, (byte) 22));
                    }
                } else {
                    if (z3 && ((tcj0) odj0Var.D()).T) {
                        odj0Var.V();
                        odj0Var.H(new r3j0((byte) 27));
                    }
                    if (!((tcj0) odj0Var.D()).T) {
                        p7m0 p7m0Var = odj0Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, tcj0.a((tcj0) value, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, true, 0, -1, 1966079)));
                    }
                    odj0Var.H(new cxi0((byte) 9, false));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                odj0 odj0Var2 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    ieu ieuVar = odj0Var2.u;
                    boolean z5 = !((tcj0) odj0Var2.D()).B;
                    this.j = true;
                    objN = ieu.n(ieuVar, z5, this);
                    if (objN == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN = obj;
                }
                long j = ((ql5) objN).f28916a;
                int i2 = odj0.V0;
                sac.V(jiu0.a(odj0Var2), new vcj0(odj0Var2, b), null, odj0Var2.F.b, new zcj0(odj0Var2, j, this.l, null), 10);
                return Unit.f46060a;
        }
    }
}
