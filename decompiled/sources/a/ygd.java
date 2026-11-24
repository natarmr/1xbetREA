package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ygd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42578a;
    public final /* synthetic */ qal0 b;

    public /* synthetic */ ygd(qal0 qal0Var, byte b) {
        this.f42578a = b;
        this.b = qal0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f42578a;
        qal0 qal0Var = this.b;
        switch (b) {
            case 0:
                y5d y5dVar = (y5d) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    xsm0.h(y5dVar, qal0Var.f28401a, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    xsm0.a(yhg0Var, qal0Var.b, fetVar2, iIntValue2 & 14);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(yhg0Var2) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    xsm0.b(yhg0Var2, qal0Var.c, fetVar3, iIntValue3 & 14);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                yhg0 yhg0Var3 = (yhg0) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                yhg0Var3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(yhg0Var3) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    xsm0.c(yhg0Var3, qal0Var.d, fetVar4, iIntValue4 & 14);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                y5dVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    b8k0.q(y5dVar2, qal0Var.f28401a, fetVar5, iIntValue5 & 14);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                yhg0 yhg0Var4 = (yhg0) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                yhg0Var4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(yhg0Var4) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    b8k0.c(yhg0Var4, qal0Var.b, fetVar6, iIntValue6 & 14);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                yhg0 yhg0Var5 = (yhg0) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                yhg0Var5.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(yhg0Var5) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    b8k0.j(yhg0Var5, qal0Var.c, fetVar7, iIntValue7 & 14);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                yhg0 yhg0Var6 = (yhg0) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                yhg0Var6.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(yhg0Var6) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    b8k0.n(yhg0Var6, qal0Var.d, fetVar8, iIntValue8 & 14);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                y5d y5dVar3 = (y5d) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                y5dVar3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.g(y5dVar3) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    b8k0.q(y5dVar3, qal0Var.f28401a, fetVar9, iIntValue9 & 14);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                yhg0 yhg0Var7 = (yhg0) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                yhg0Var7.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(yhg0Var7) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    b8k0.c(yhg0Var7, qal0Var.b, fetVar10, iIntValue10 & 14);
                } else {
                    fetVar10.X();
                }
                break;
            case 10:
                yhg0 yhg0Var8 = (yhg0) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                yhg0Var8.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(yhg0Var8) ? 4 : 2;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    b8k0.j(yhg0Var8, qal0Var.c, fetVar11, iIntValue11 & 14);
                } else {
                    fetVar11.X();
                }
                break;
            case 11:
                yhg0 yhg0Var9 = (yhg0) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                yhg0Var9.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(yhg0Var9) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    b8k0.n(yhg0Var9, qal0Var.d, fetVar12, iIntValue12 & 14);
                } else {
                    fetVar12.X();
                }
                break;
            case 12:
                y5d y5dVar4 = (y5d) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                y5dVar4.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar13.g(y5dVar4) ? 4 : 2;
                }
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    b8k0.q(y5dVar4, qal0Var.f28401a, fetVar13, iIntValue13 & 14);
                } else {
                    fetVar13.X();
                }
                break;
            case 13:
                yhg0 yhg0Var10 = (yhg0) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                yhg0Var10.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.g(yhg0Var10) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    b8k0.c(yhg0Var10, qal0Var.b, fetVar14, iIntValue14 & 14);
                } else {
                    fetVar14.X();
                }
                break;
            case 14:
                yhg0 yhg0Var11 = (yhg0) obj;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                yhg0Var11.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar15.g(yhg0Var11) ? 4 : 2;
                }
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    b8k0.j(yhg0Var11, qal0Var.c, fetVar15, iIntValue15 & 14);
                } else {
                    fetVar15.X();
                }
                break;
            default:
                yhg0 yhg0Var12 = (yhg0) obj;
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                yhg0Var12.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= fetVar16.g(yhg0Var12) ? 4 : 2;
                }
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    b8k0.n(yhg0Var12, qal0Var.d, fetVar16, iIntValue16 & 14);
                } else {
                    fetVar16.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
