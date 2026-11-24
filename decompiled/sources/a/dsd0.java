package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class dsd0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ esd0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsd0(esd0 esd0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = esd0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        esd0 esd0Var = this.k;
        switch (b) {
            case 0:
                dsd0 dsd0Var = new dsd0(esd0Var, yjeVar, (byte) 0);
                dsd0Var.j = ((Boolean) obj).booleanValue();
                return dsd0Var;
            default:
                return new dsd0(esd0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((dsd0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dsd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        byte b = this.i;
        esd0 esd0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z2 = !z && ((yrd0) esd0Var.D()).f43117a;
                boolean z3 = z && ((yrd0) esd0Var.D()).b;
                if (z2 || z3) {
                    int i = esd0.v;
                    esd0Var.M();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    b8u b8uVar = esd0Var.t;
                    String str = esd0Var.r;
                    this.j = true;
                    obj = ((zn00) b8uVar.f2175a).I0(str, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                zsd0 zsd0Var = (zsd0) obj;
                int i2 = esd0.v;
                p7m0 p7m0Var = esd0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, yrd0.a((yrd0) value, false, false, zsd0Var, 0L, 8)));
                return Unit.f46060a;
        }
    }
}
