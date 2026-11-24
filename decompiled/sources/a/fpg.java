package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fpg implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9927a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ a4x c;

    public /* synthetic */ fpg(ugd ugdVar, a4x a4xVar, byte b) {
        this.f9927a = b;
        this.b = ugdVar;
        this.c = a4xVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f9927a;
        a4x a4xVar = this.c;
        ugd ugdVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((k8z) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    ugdVar.j(a4xVar.get(iIntValue), a4xVar, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int iIntValue3 = ((Integer) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    ugdVar.F(a4xVar.get(iIntValue3), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                int iIntValue5 = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((k8z) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    ugdVar.F(a4xVar.get(kbc.d0(iIntValue5, a4xVar.size())), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                int iIntValue7 = ((Integer) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    ugdVar.F(a4xVar.get(kbc.d0(iIntValue7, a4xVar.size())), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
