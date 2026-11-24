package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qpk implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29123a;
    public final /* synthetic */ qsk b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ qpk(qsk qskVar, float f, float f2, float f3, Function1 function1, byte b) {
        this.f29123a = b;
        this.b = qskVar;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = function1;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        byte b = this.f29123a;
        cl5 cl5Var = ukd.f35823a;
        switch (b) {
            case 0:
                l7m0 l7m0Var = (l7m0) obj;
                ycl yclVar = (ycl) obj3;
                fet fetVar = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                l7m0Var.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue & 6) == 0) {
                    i = (fetVar.g(l7m0Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 384) == 0) {
                    i |= fetVar.d(yclVar.f42389a) ? 256 : 128;
                }
                if (fetVar.U(i & 1, (i & 1155) != 1154)) {
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar.o0(objP);
                    }
                    qcc.e(this.b, l7m0Var, (pz40) objP, this.c, this.d, this.e, yclVar.f42389a, this.f, fetVar, ((i << 3) & 112) | 384 | (3670016 & (i << 12)));
                } else {
                    fetVar.X();
                }
                break;
            default:
                l7m0 l7m0Var2 = (l7m0) obj;
                ycl yclVar2 = (ycl) obj3;
                fet fetVar2 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                l7m0Var2.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (fetVar2.g(l7m0Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= fetVar2.d(yclVar2.f42389a) ? 256 : 128;
                }
                if (fetVar2.U(i2 & 1, (i2 & 1155) != 1154)) {
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar2.o0(objP2);
                    }
                    qcc.e(this.b, l7m0Var2, (pz40) objP2, this.c, this.d, this.e, yclVar2.f42389a, this.f, fetVar2, ((i2 << 3) & 112) | 384 | ((i2 << 12) & 3670016));
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
