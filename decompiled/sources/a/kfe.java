package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kfe implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18191a;
    public final /* synthetic */ ehm0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ kfe(ehm0 ehm0Var, boolean z, Function1 function1, byte b) {
        this.f18191a = b;
        this.b = ehm0Var;
        this.c = z;
        this.d = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        k6z k6zVar;
        byte b = this.f18191a;
        wam0 wam0Var = wam0.f38836a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.d;
        ehm0 ehm0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((zdz) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    Function1 function2 = this.d;
                    q0x.u(function2, function2, this.b, this.c, mm40VarN, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zdz) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    wzb.z(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), this.b, this.c, this.d, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zdz) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    wzb.z(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), this.b, this.c, this.d, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((zdz) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    ibc.w(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), this.b, this.c, this.d, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((zdz) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    Function1 function3 = this.d;
                    q0x.u(function3, function3, this.b, this.c, mm40VarN2, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((zdz) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zcl zclVar6 = qmk.f28987a;
                    azw.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), jam0.e, this.b, this.c, this.d, fetVar6, 48);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((zdz) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    azw.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), jam0.g, this.b, this.c, this.d, fetVar7, 48);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    jam0 jam0Var = jam0.e;
                    zcl zclVar8 = qmk.f28987a;
                    azw.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), jam0Var, this.b, this.c, this.d, fetVar8, 48);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((zdz) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    zcl zclVar9 = qmk.f28987a;
                    azw.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), jam0.f, this.b, this.c, this.d, fetVar9, 48);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    jam0 jam0Var2 = jam0.g;
                    zcl zclVar10 = qmk.f28987a;
                    azw.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), jam0Var2, this.b, this.c, this.d, fetVar10, 48);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((zdz) obj).getClass();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    zcl zclVar11 = qmk.f28987a;
                    ibc.w(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), this.b, this.c, this.d, fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    jam0 jam0Var3 = jam0.f;
                    zcl zclVar12 = qmk.f28987a;
                    azw.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), jam0Var3, this.b, this.c, this.d, fetVar12, 48);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                ufx ufxVar = ehm0Var.d;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (!fetVar13.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    fetVar13.X();
                } else if (ufxVar instanceof vam0) {
                    fetVar13.e0(1852105434);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar13 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD, 180.0f);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar13.T);
                    bh90 bh90VarM = fetVar13.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar13, mm40VarE);
                    mkd.c0.getClass();
                    fetVar13.i0();
                    if (fetVar13.S) {
                        fetVar13.l(pcyVar);
                    } else {
                        fetVar13.r0();
                    }
                    jpm0.o(fetVar13, tj30VarC, gqw0.x);
                    jpm0.o(fetVar13, bh90VarM, gqw0.w);
                    jpm0.o(fetVar13, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar13);
                    jpm0.o(fetVar13, mm40VarC0, gqw0.v);
                    mdm mdmVar = ((vam0) ufxVar).f37097a;
                    boolean zG = fetVar13.g(function1);
                    Object objP = fetVar13.P();
                    if (zG || objP == cl5Var) {
                        objP = new z9q(function1, (byte) 8);
                        fetVar13.o0(objP);
                    }
                    jcb.l(null, mdmVar, true, (Function0) objP, fetVar13, 384, 1);
                    fetVar13.r(true);
                    fetVar13.r(false);
                } else if (Intrinsics.d(ufxVar, wam0Var)) {
                    fetVar13.e0(1852975542);
                    lmc.d(0, 1, fetVar13, null);
                    fetVar13.r(false);
                } else {
                    if (!(ufxVar instanceof xam0)) {
                        throw b1j.f(-494445400, fetVar13, false);
                    }
                    fetVar13.e0(1853125179);
                    if (this.c) {
                        fetVar13.e0(-494409543);
                        k6zVar = (k6z) fetVar13.k(bmd.n);
                        fetVar13.r(false);
                    } else {
                        fetVar13.e0(-494408619);
                        fetVar13.r(false);
                        k6zVar = k6z.f17794a;
                    }
                    obc.d(bmd.n.a(k6zVar), u1c.M(-1645109966, new gup(ehm0Var, function1, (byte) 7), fetVar13), fetVar13, 56);
                    fetVar13.r(false);
                }
                return Unit.f46060a;
            case 13:
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    ufx ufxVar2 = ehm0Var.d;
                    if (ufxVar2 instanceof vam0) {
                        fetVar14.e0(-1211404892);
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar14 = qmk.f28987a;
                        mm40 mm40VarE2 = o7k0.e(mm40VarD2, 180.0f);
                        tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                        int iHashCode2 = Long.hashCode(fetVar14.T);
                        bh90 bh90VarM2 = fetVar14.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar14, mm40VarE2);
                        mkd.c0.getClass();
                        fetVar14.i0();
                        if (fetVar14.S) {
                            fetVar14.l(pcyVar);
                        } else {
                            fetVar14.r0();
                        }
                        jpm0.o(fetVar14, tj30VarC2, gqw0.x);
                        jpm0.o(fetVar14, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar14, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar14);
                        jpm0.o(fetVar14, mm40VarC1, gqw0.v);
                        mdm mdmVar2 = ((vam0) ufxVar2).f37097a;
                        boolean zG2 = fetVar14.g(function1);
                        Object objP2 = fetVar14.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new hcr(function1, (byte) 8);
                            fetVar14.o0(objP2);
                        }
                        jcb.l(null, mdmVar2, true, (Function0) objP2, fetVar14, 384, 1);
                        fetVar14.r(true);
                        fetVar14.r(false);
                    } else if (Intrinsics.d(ufxVar2, wam0Var)) {
                        fetVar14.e0(-870334534);
                        lmc.d(0, 1, fetVar14, null);
                        fetVar14.r(false);
                    } else {
                        if (!(ufxVar2 instanceof xam0)) {
                            throw b1j.f(-870362864, fetVar14, false);
                        }
                        fetVar14.e0(-1210448883);
                        a4x a4xVar = ((was) ((xam0) ufxVar2).f40564a).f38845a;
                        Object objP3 = fetVar14.P();
                        if (objP3 == cl5Var) {
                            objP3 = new hcr(function1, (byte) 9);
                            fetVar14.o0(objP3);
                        }
                        Function0 function0 = (Function0) objP3;
                        Object objP4 = fetVar14.P();
                        if (objP4 == cl5Var) {
                            objP4 = new baq(function1, (byte) 11);
                            fetVar14.o0(objP4);
                        }
                        wzb.H(3456, fetVar14, a4xVar, function0, (Function1) objP4, this.c);
                        fetVar14.r(false);
                    }
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    zcl zclVar15 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    Function1 function4 = this.d;
                    q0x.u(function4, function4, this.b, this.c, mm40VarN3, fetVar15, 0);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kfe(Function1 function1, ehm0 ehm0Var, boolean z, byte b) {
        this.f18191a = b;
        this.d = function1;
        this.b = ehm0Var;
        this.c = z;
    }
}
