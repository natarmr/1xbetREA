package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j5q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15945a;
    public final /* synthetic */ m5q b;

    public /* synthetic */ j5q(m5q m5qVar, byte b) {
        this.f15945a = b;
        this.b = m5qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15945a;
        m5q m5qVar = this.b;
        switch (b) {
            case 0:
                nek nekVar = m5q.o2;
                ((n5q) obj).getClass();
                m5qVar.P0();
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                nek nekVar2 = m5q.o2;
                k3t0 k3t0Var = (k3t0) m5qVar.n2.getValue();
                nmy.b.getClass();
                nmy nmyVar = nmy.ALL;
                if (iIntValue != 0) {
                    nmy nmyVar2 = nmy.ONLY_CHANGED;
                    if (iIntValue == 1) {
                        nmyVar = nmyVar2;
                    } else {
                        nmy nmyVar3 = nmy.ONLY_NOT_CHANGED;
                        if (iIntValue == 2) {
                            nmyVar = nmyVar3;
                        }
                    }
                }
                k3t0Var.x(new d5q(nmyVar));
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                nek nekVar3 = m5q.o2;
                k3t0 k3t0Var2 = (k3t0) m5qVar.n2.getValue();
                cny.b.getClass();
                cny cnyVar = cny.A_Z;
                if (iIntValue2 != 0) {
                    cny cnyVar2 = cny.Z_A;
                    if (iIntValue2 == 1) {
                        cnyVar = cnyVar2;
                    } else {
                        cny cnyVar3 = cny.CHANGED_FIRST_A_Z;
                        if (iIntValue2 == 2) {
                            cnyVar = cnyVar3;
                        }
                    }
                }
                k3t0Var2.x(new f5q(cnyVar));
                break;
        }
        return Unit.f46060a;
    }
}
