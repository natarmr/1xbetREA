package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a0p0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ b0p0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0p0(b0p0 b0p0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b0p0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b0p0 b0p0Var = this.k;
        switch (b) {
            case 0:
                a0p0 a0p0Var = new a0p0(b0p0Var, yjeVar, (byte) 0);
                a0p0Var.j = ((Boolean) obj).booleanValue();
                return a0p0Var;
            default:
                return new a0p0(b0p0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((a0p0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a0p0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.i) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                b0p0 b0p0Var = this.k;
                if (z) {
                    int i = b0p0.I;
                    b0p0Var.M(false);
                    e3c.n(b0p0Var.H);
                    b0p0Var.H = i3t0.F(b0p0Var, b0p0Var.s, null, null, new ofo0((byte) 15), 119);
                } else {
                    szo0 szo0Var = (szo0) b0p0Var.D();
                    if (CollectionsKt.q0(q3d.k(szo0Var.f33080a), szo0Var.b).isEmpty()) {
                        p7m0 p7m0Var = b0p0Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, szo0.a((szo0) value, null, null, izo0.b, null, false, 43)));
                    } else {
                        e3c.n(b0p0Var.F);
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                b0p0 b0p0Var2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    znt zntVar = b0p0Var2.z;
                    this.j = true;
                    obj = zntVar.f44690a.D(this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((Number) obj).longValue() > 0) {
                    int i2 = b0p0.I;
                    b0p0Var2.G(uzo0.f36546a);
                } else {
                    int i3 = b0p0.I;
                    b0p0Var2.A.d(new zzo0(b0p0Var2, (byte) 1));
                }
                return Unit.f46060a;
        }
    }
}
