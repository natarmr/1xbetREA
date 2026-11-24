package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class itz implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15373a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ itz(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f15373a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:197:0x0451  */
    /* JADX WARN: Code duplicated, block: B:222:0x04da  */
    /* JADX WARN: Code duplicated, block: B:247:0x0563  */
    /* JADX WARN: Code duplicated, block: B:272:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:297:0x0675  */
    /* JADX WARN: Code duplicated, block: B:322:0x06fe  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f15373a;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    snz snzVar = (snz) CollectionsKt.W(iIntValue, ((wtz) l7m0Var.getValue()).f);
                    if (snzVar == null) {
                        fetVar.e0(1395366192);
                        fetVar.r(false);
                    } else if (snzVar instanceof gnz) {
                        fetVar.e0(1569020641);
                        oja0.H(null, ((wtz) l7m0Var.getValue()).f39767a, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (snzVar instanceof mnz) {
                        fetVar.e0(1569027041);
                        oja0.Q(null, ((wtz) l7m0Var.getValue()).b, function1, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1395366192);
                        fetVar.r(false);
                    }
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
                    tnz tnzVar = (tnz) CollectionsKt.W(iIntValue3, ((jvz) l7m0Var.getValue()).f);
                    if (tnzVar == null) {
                        fetVar2.e0(-947524954);
                        fetVar2.r(false);
                    } else if (tnzVar instanceof hnz) {
                        fetVar2.e0(1216353509);
                        ffb0.z(null, ((jvz) l7m0Var.getValue()).f17226a, function1, fetVar2, 0);
                        fetVar2.r(false);
                    } else if (tnzVar instanceof nnz) {
                        fetVar2.e0(1216357541);
                        ffb0.H(null, ((jvz) l7m0Var.getValue()).b, function1, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-947524954);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                int iIntValue5 = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    wnz wnzVar = (wnz) CollectionsKt.W(iIntValue5, ((xwz) l7m0Var.getValue()).f);
                    if (wnzVar == null) {
                        fetVar3.e0(1208237664);
                        fetVar3.r(false);
                    } else if (wnzVar instanceof knz) {
                        fetVar3.e0(1701536523);
                        ro4.M(null, ((xwz) l7m0Var.getValue()).f41633a, function1, fetVar3, 0);
                        fetVar3.r(false);
                    } else if (wnzVar instanceof qnz) {
                        fetVar3.e0(1701540139);
                        ro4.U(null, ((xwz) l7m0Var.getValue()).b, function1, fetVar3, 0);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(1208237664);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                int iIntValue7 = ((Integer) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    unz unzVar = (unz) CollectionsKt.W(iIntValue7, ((uyz) l7m0Var.getValue()).f);
                    if (unzVar == null) {
                        fetVar4.e0(1917278358);
                        fetVar4.r(false);
                    } else if (unzVar instanceof inz) {
                        fetVar4.e0(-907991051);
                        x4d0.P(null, ((uyz) l7m0Var.getValue()).f36512a, function1, fetVar4, 0);
                        fetVar4.r(false);
                    } else if (unzVar instanceof onz) {
                        fetVar4.e0(-907986891);
                        x4d0.V(null, ((uyz) l7m0Var.getValue()).b, function1, fetVar4, 0);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1917278358);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                int iIntValue9 = ((Integer) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    vnz vnzVar = (vnz) CollectionsKt.W(iIntValue9, ((h100) l7m0Var.getValue()).f);
                    if (vnzVar == null) {
                        fetVar5.e0(1947140742);
                        fetVar5.r(false);
                    } else if (vnzVar instanceof jnz) {
                        fetVar5.e0(478442113);
                        unh0.S(null, ((h100) l7m0Var.getValue()).f12258a, function1, fetVar5, 0);
                        fetVar5.r(false);
                    } else if (vnzVar instanceof pnz) {
                        fetVar5.e0(478448063);
                        unh0.e0(null, ((h100) l7m0Var.getValue()).b, function1, fetVar5, 0);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(1947140742);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                int iIntValue11 = ((Integer) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue12 & 48) == 0) {
                    iIntValue12 |= fetVar6.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar6.U(iIntValue12 & 1, (iIntValue12 & 145) != 144)) {
                    rnz rnzVar = (rnz) CollectionsKt.W(iIntValue11, ((r400) l7m0Var.getValue()).f);
                    if (rnzVar == null) {
                        fetVar6.e0(1181284938);
                        fetVar6.r(false);
                    } else if (rnzVar instanceof fnz) {
                        fetVar6.e0(-1763016191);
                        ccq0.z(null, ((r400) l7m0Var.getValue()).f29811a, function1, fetVar6, 0);
                        fetVar6.r(false);
                    } else if (rnzVar instanceof lnz) {
                        fetVar6.e0(-1763012576);
                        ccq0.z(null, ((r400) l7m0Var.getValue()).b, function1, fetVar6, 0);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(1181284938);
                        fetVar6.r(false);
                    }
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                mm40 mm40Var = (mm40) obj2;
                fet fetVar7 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var.getClass();
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= fetVar7.g(mm40Var) ? 32 : 16;
                }
                if (fetVar7.U(iIntValue13 & 1, (iIntValue13 & 145) != 144)) {
                    boolean z = ((b3s) l7m0Var.getValue()).f1924a;
                    boolean zG = fetVar7.g(function1);
                    Object objP = fetVar7.P();
                    if (zG || objP == cl5Var) {
                        objP = new o0q0(function1, (byte) 17);
                        fetVar7.o0(objP);
                    }
                    gfx.g((iIntValue13 >> 3) & 14, fetVar7, mm40Var, (Function0) objP, z);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar8 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var2.getClass();
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= fetVar8.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar8.U(iIntValue14 & 1, (iIntValue14 & 145) != 144)) {
                    boolean z2 = ((s7s) l7m0Var.getValue()).f31765a;
                    boolean zG2 = fetVar8.g(function1);
                    Object objP2 = fetVar8.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new o0q0(function1, (byte) 18);
                        fetVar8.o0(objP2);
                    }
                    tfx.f((iIntValue14 >> 3) & 14, fetVar8, mm40Var2, (Function0) objP2, z2);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar9 = (fet) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var3.getClass();
                if ((iIntValue15 & 48) == 0) {
                    iIntValue15 |= fetVar9.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar9.U(iIntValue15 & 1, (iIntValue15 & 145) != 144)) {
                    boolean z3 = ((ojs) l7m0Var.getValue()).f25375a;
                    boolean zG3 = fetVar9.g(function1);
                    Object objP3 = fetVar9.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new o0q0(function1, (byte) 22);
                        fetVar9.o0(objP3);
                    }
                    ufx.e((iIntValue15 >> 3) & 14, fetVar9, mm40Var3, (Function0) objP3, z3);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                mm40 mm40Var4 = (mm40) obj2;
                fet fetVar10 = (fet) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var4.getClass();
                if ((iIntValue16 & 48) == 0) {
                    iIntValue16 |= fetVar10.g(mm40Var4) ? 32 : 16;
                }
                if (!fetVar10.U(iIntValue16 & 1, (iIntValue16 & 145) != 144)) {
                    fetVar10.X();
                } else if (((snr) l7m0Var.getValue()).b) {
                    fetVar10.e0(1708215592);
                    boolean z4 = ((snr) l7m0Var.getValue()).f32508a;
                    boolean zG4 = fetVar10.g(function1);
                    Object objP4 = fetVar10.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new o0q0(function1, (byte) 21);
                        fetVar10.o0(objP4);
                    }
                    uvw.d((iIntValue16 >> 3) & 14, fetVar10, mm40Var4, (Function0) objP4, z4);
                    fetVar10.r(false);
                } else {
                    fetVar10.e0(1708438978);
                    fetVar10.r(false);
                }
                break;
            case 10:
                mm40 mm40Var5 = (mm40) obj2;
                fet fetVar11 = (fet) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var5.getClass();
                if ((iIntValue17 & 48) == 0) {
                    iIntValue17 |= fetVar11.g(mm40Var5) ? 32 : 16;
                }
                if (!fetVar11.U(iIntValue17 & 1, (iIntValue17 & 145) != 144)) {
                    fetVar11.X();
                } else if (((b3s) l7m0Var.getValue()).b) {
                    fetVar11.e0(-1689928009);
                    boolean z5 = ((b3s) l7m0Var.getValue()).c;
                    boolean z6 = ((b3s) l7m0Var.getValue()).d;
                    boolean zG5 = fetVar11.g(function1);
                    Object objP5 = fetVar11.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new o0q0(function1, (byte) 19);
                        fetVar11.o0(objP5);
                    }
                    zdx.l(mm40Var5, z5, z6, (Function0) objP5, fetVar11, (iIntValue17 >> 3) & 14);
                    fetVar11.r(false);
                } else {
                    fetVar11.e0(-1689613762);
                    fetVar11.r(false);
                }
                break;
            case 11:
                mm40 mm40Var6 = (mm40) obj2;
                fet fetVar12 = (fet) obj3;
                int iIntValue18 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var6.getClass();
                if ((iIntValue18 & 48) == 0) {
                    iIntValue18 |= fetVar12.g(mm40Var6) ? 32 : 16;
                }
                if (!fetVar12.U(iIntValue18 & 1, (iIntValue18 & 145) != 144)) {
                    fetVar12.X();
                } else if (((s7s) l7m0Var.getValue()).b) {
                    fetVar12.e0(1420790923);
                    boolean z7 = ((s7s) l7m0Var.getValue()).c;
                    boolean z8 = ((s7s) l7m0Var.getValue()).d;
                    boolean zG6 = fetVar12.g(function1);
                    Object objP6 = fetVar12.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new o0q0(function1, (byte) 20);
                        fetVar12.o0(objP6);
                    }
                    efx.k(mm40Var6, z7, z8, (Function0) objP6, fetVar12, (iIntValue18 >> 3) & 14);
                    fetVar12.r(false);
                } else {
                    fetVar12.e0(1421149376);
                    fetVar12.r(false);
                }
                break;
            case 12:
                mm40 mm40Var7 = (mm40) obj2;
                fet fetVar13 = (fet) obj3;
                int iIntValue19 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var7.getClass();
                if ((iIntValue19 & 48) == 0) {
                    iIntValue19 |= fetVar13.g(mm40Var7) ? 32 : 16;
                }
                if (!fetVar13.U(iIntValue19 & 1, (iIntValue19 & 145) != 144)) {
                    fetVar13.X();
                } else if (((ojs) l7m0Var.getValue()).b) {
                    fetVar13.e0(895311403);
                    boolean z9 = ((ojs) l7m0Var.getValue()).c;
                    boolean z10 = ((ojs) l7m0Var.getValue()).d;
                    boolean zG7 = fetVar13.g(function1);
                    Object objP7 = fetVar13.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new o0q0(function1, (byte) 24);
                        fetVar13.o0(objP7);
                    }
                    gfx.m(mm40Var7, z9, z10, (Function0) objP7, fetVar13, (iIntValue19 >> 3) & 14);
                    fetVar13.r(false);
                } else {
                    fetVar13.e0(895665051);
                    fetVar13.r(false);
                }
                break;
            default:
                mm40 mm40Var8 = (mm40) obj2;
                fet fetVar14 = (fet) obj3;
                int iIntValue20 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var8.getClass();
                if ((iIntValue20 & 48) == 0) {
                    iIntValue20 |= fetVar14.g(mm40Var8) ? 32 : 16;
                }
                if (!fetVar14.U(iIntValue20 & 1, (iIntValue20 & 145) != 144)) {
                    fetVar14.X();
                } else if (((snr) l7m0Var.getValue()).c) {
                    fetVar14.e0(-1884826225);
                    boolean z11 = ((snr) l7m0Var.getValue()).d;
                    boolean z12 = ((snr) l7m0Var.getValue()).e;
                    boolean zG8 = fetVar14.g(function1);
                    Object objP8 = fetVar14.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new o0q0(function1, (byte) 23);
                        fetVar14.o0(objP8);
                    }
                    tfx.k(mm40Var8, z11, z12, (Function0) objP8, fetVar14, (iIntValue20 >> 3) & 14);
                    fetVar14.r(false);
                } else {
                    fetVar14.e0(-1884468733);
                    fetVar14.r(false);
                }
                break;
        }
        return Unit.f46060a;
    }
}
