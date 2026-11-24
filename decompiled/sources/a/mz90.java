package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class mz90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ nz90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz90(nz90 nz90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nz90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nz90 nz90Var = this.k;
        switch (b) {
            case 0:
                mz90 mz90Var = new mz90(nz90Var, yjeVar, (byte) 0);
                mz90Var.j = ((Boolean) obj).booleanValue();
                return mz90Var;
            default:
                return new mz90(nz90Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mz90) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mz90) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        int size;
        Object value2;
        Object value3;
        byte b = this.i;
        nz90 nz90Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((x48) nz90Var.D()).f40252a || (z && (((x48) nz90Var.D()).b || ((x48) nz90Var.D()).c))) {
                    nz90Var.M();
                }
                return Unit.f46060a;
            default:
                oyg0 oyg0Var = nz90Var.f;
                ocj ocjVar = nz90Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                yje yjeVar = null;
                if (!z2) {
                    z1x.P(obj);
                    int i = nz90.v;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, x48.a((x48) value, true, false, false, 0, 56)));
                    svu svuVar = nz90Var.p;
                    String str = nz90Var.q;
                    this.j = true;
                    kz90 kz90Var = (kz90) svuVar.f32888a;
                    obj = qjj.d0(kz90Var.d.b, new oed(kz90Var, str, yjeVar, (byte) 10), this);
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
                gz90 gz90Var = (gz90) obj;
                ArrayList arrayList = gz90Var.f12171a;
                if (arrayList.isEmpty()) {
                    int i2 = nz90.v;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, x48.a((x48) value3, false, false, true, 0, 56)));
                } else {
                    ArrayList arrayList2 = gz90Var.b;
                    if (arrayList2.isEmpty()) {
                        size = 0;
                    } else {
                        int i3 = nz90.v;
                        size = 1073741823 - (1073741823 % arrayList2.size());
                        Integer num = (Integer) nz90Var.o.a("KEY_CURRENT_PHOTO");
                        if (num != null) {
                            size = num.intValue();
                        }
                    }
                    int i4 = size;
                    int i5 = nz90.v;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                    } while (!p7m0Var3.m(value2, new x48(false, false, false, arrayList2, arrayList, i4)));
                    nz90Var.N();
                }
                return Unit.f46060a;
        }
    }
}
