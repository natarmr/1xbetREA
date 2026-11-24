package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fq7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hq7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq7(hq7 hq7Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hq7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hq7 hq7Var = this.k;
        switch (b) {
            case 0:
                return new fq7(hq7Var, yjeVar, (byte) 0);
            default:
                fq7 fq7Var = new fq7(hq7Var, yjeVar, (byte) 1);
                fq7Var.j = ((Boolean) obj).booleanValue();
                return fq7Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fq7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fq7) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        hq7 hq7Var = this.k;
        switch (b) {
            case 0:
                oyg0 oyg0Var = hq7Var.f;
                ocj ocjVar = hq7Var.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = hq7.z;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, zp7.a((zp7) value, null, true, false, false, 1017)));
                    xp7 xp7Var = hq7Var.s;
                    int i2 = hq7Var.t.b;
                    this.j = true;
                    obj = xp7Var.a(i2, this);
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
                List list = (List) obj;
                int i3 = hq7.z;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, zp7.a((zp7) value2, list, false, false, false, 1016)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!hq7Var.y && z2) {
                    hq7Var.M();
                }
                hq7Var.y = z2;
                return Unit.f46060a;
        }
    }
}
