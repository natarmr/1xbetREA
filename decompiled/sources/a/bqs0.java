package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bqs0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ diu0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqs0(diu0 diu0Var, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
        this.k = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        int i = this.k;
        diu0 diu0Var = this.l;
        switch (b) {
            case 0:
                return new bqs0((cqs0) diu0Var, i, yjeVar, (byte) 0);
            default:
                return new bqs0((j9v0) diu0Var, i, yjeVar, (byte) 1);
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
        return ((bqs0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        long j;
        Object value;
        byte b = this.i;
        diu0 diu0Var = this.l;
        switch (b) {
            case 0:
                cqs0 cqs0Var = (cqs0) diu0Var;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kd30 kd30Var = cqs0Var.g;
                    this.j = true;
                    h0q0 h0q0Var = (h0q0) kd30Var.f18086a;
                    int iOrdinal = ((s470) kd30Var.b).ordinal();
                    if (iOrdinal == 2) {
                        j = 40;
                    } else {
                        if (iOrdinal != 3) {
                            jf4.n("Illegal game type");
                            return null;
                        }
                        j = 41;
                    }
                    obj = h0q0Var.z(j, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = this.k;
                cqs0Var.n = i;
                p7m0 p7m0Var = cqs0Var.l;
                xps0 xps0Var = new xps0(i, ((qx90) obj).d);
                p7m0Var.getClass();
                p7m0Var.o(null, xps0Var);
                return Unit.f46060a;
            default:
                j9v0 j9v0Var = (j9v0) diu0Var;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                int i2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    gsb gsbVar = j9v0Var.r;
                    this.j = true;
                    Object objA = gsbVar.f11822a.a(i2, this);
                    if (objA != wneVar2) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = j9v0.v;
                p7m0 p7m0Var2 = j9v0Var.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, e9v0.a((e9v0) value, false, false, null, i2, 7)));
                return Unit.f46060a;
        }
    }
}
