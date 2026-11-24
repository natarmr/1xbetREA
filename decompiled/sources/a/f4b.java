package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f4b implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8905a;
    public final /* synthetic */ ugd b;

    public /* synthetic */ f4b(ugd ugdVar, byte b) {
        this.f8905a = b;
        this.b = ugdVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f8905a;
        ugd ugdVar = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                l7m0 l7m0Var = (l7m0) obj2;
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                l7m0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.e(iIntValue) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.g(l7m0Var) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    ugdVar.j(num, l7m0Var, fetVar, Integer.valueOf(i & 126));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                k8z k8zVar = (k8z) obj;
                ((Integer) obj2).getClass();
                fet fetVar2 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar2.g(k8zVar) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 131) != 130)) {
                    ugdVar.F(k8zVar, fetVar2, Integer.valueOf(iIntValue3 & 14));
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                zdz zdzVar = (zdz) obj;
                ((Integer) obj2).getClass();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar3.g(zdzVar) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue4 & 1, (iIntValue4 & 131) != 130)) {
                    ugdVar.F(zdzVar, fetVar3, Integer.valueOf(iIntValue4 & 14));
                } else {
                    fetVar3.X();
                }
                break;
            default:
                Integer num2 = (Integer) obj;
                int iIntValue5 = num2.intValue();
                l7m0 l7m0Var2 = (l7m0) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                l7m0Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i2 = iIntValue6 | (fetVar4.e(iIntValue5) ? 4 : 2);
                } else {
                    i2 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i2 |= fetVar4.g(l7m0Var2) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    ugdVar.j(num2, l7m0Var2, fetVar4, Integer.valueOf(i2 & 126));
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
