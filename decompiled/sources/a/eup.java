package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eup implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8432a;
    public final /* synthetic */ a4x b;

    public /* synthetic */ eup(a4x a4xVar) {
        this.f8432a = (byte) 0;
        this.b = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8432a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        byte b2 = 1;
        a4x<e0x> a4xVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(16.0f, 0.0f, 16.0f, 24.0f, 2);
                    boolean zG = fetVar.g(a4xVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new oea(a4xVar, (byte) 11);
                        fetVar.o0(objP);
                    }
                    b8k0.e(n0qVar, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    n0q n0qVar2 = o7k0.c;
                    boolean zG2 = fetVar2.g(a4xVar);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new oea(a4xVar, (byte) 27);
                        fetVar2.o0(objP2);
                    }
                    b8k0.e(n0qVar2, null, null, null, null, null, false, null, (Function1) objP2, fetVar2, 6, 510);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                y0x0.i(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                gkb.I(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                o9m.a(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                o9m.a(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                o9m.b(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                o9m.b(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    for (e0x e0xVar : a4xVar) {
                        Object objP3 = fetVar3.P();
                        if (objP3 == cl5Var) {
                            objP3 = new aim(b2);
                            fetVar3.o0(objP3);
                        }
                        bkb.w(null, e0xVar, false, (Function1) objP3, fetVar3, 3072, 5);
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 9:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar4, 0);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, jm40Var);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    Iterator itO = h97.o(fetVar4, mm40VarC0, gqw0.v, -2040254618, a4xVar);
                    int i = 0;
                    while (itO.hasNext()) {
                        Object next = itO.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        int iIntValue5 = ((Number) next).intValue();
                        fetVar4.b0(1942517191, Integer.valueOf(i));
                        pm80 pm80VarF = a8k0.F(iIntValue5, 0, fetVar4);
                        zcl zclVar3 = qmk.f28987a;
                        j0x.b(pm80VarF, null, o7k0.p(jm40Var, 30.0f, 40.0f), null, null, 0.0f, null, fetVar4, 56, 120);
                        fetVar4.r(false);
                        i = i2;
                    }
                    fetVar4.r(false);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 10:
                fet fetVar5 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zcl zclVar4 = qmk.f28987a;
                    thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar5, 0);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar5);
                    Iterator itO2 = h97.o(fetVar5, mm40VarC1, gqw0.v, 611763940, a4xVar);
                    int i3 = 0;
                    while (itO2.hasNext()) {
                        Object next2 = itO2.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            q3d.p();
                            throw null;
                        }
                        int iIntValue7 = ((Number) next2).intValue();
                        fetVar5.b0(-1478877351, Integer.valueOf(i3));
                        pm80 pm80VarF2 = a8k0.F(iIntValue7, 0, fetVar5);
                        zcl zclVar5 = qmk.f28987a;
                        j0x.b(pm80VarF2, null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar5, 56, 120);
                        fetVar5.r(false);
                        i3 = i4;
                    }
                    fetVar5.r(false);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 11:
                fet fetVar6 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    zcl zclVar6 = qmk.f28987a;
                    thg0 thg0VarA3 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar6, 0);
                    int iHashCode3 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM3 = fetVar6.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar6, jm40Var);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar6);
                    Iterator itO3 = h97.o(fetVar6, mm40VarC2, gqw0.v, 640393099, a4xVar);
                    int i5 = 0;
                    while (itO3.hasNext()) {
                        Object next3 = itO3.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            q3d.p();
                            throw null;
                        }
                        int iIntValue9 = ((Number) next3).intValue();
                        fetVar6.b0(-1450248068, Integer.valueOf(i5));
                        pm80 pm80VarF3 = a8k0.F(iIntValue9, 0, fetVar6);
                        zcl zclVar7 = qmk.f28987a;
                        j0x.b(pm80VarF3, null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar6, 56, 120);
                        fetVar6.r(false);
                        i5 = i6;
                    }
                    fetVar6.r(false);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 12:
                fet fetVar7 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zcl zclVar8 = qmk.f28987a;
                    thg0 thg0VarA4 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar7, 0);
                    int iHashCode4 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM4 = fetVar7.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar7, jm40Var);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, thg0VarA4, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar7);
                    Iterator itO4 = h97.o(fetVar7, mm40VarC3, gqw0.v, 669022250, a4xVar);
                    int i7 = 0;
                    while (itO4.hasNext()) {
                        Object next4 = itO4.next();
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            q3d.p();
                            throw null;
                        }
                        int iIntValue11 = ((Number) next4).intValue();
                        fetVar7.b0(-1421618917, Integer.valueOf(i7));
                        pm80 pm80VarF4 = a8k0.F(iIntValue11, 0, fetVar7);
                        zcl zclVar9 = qmk.f28987a;
                        j0x.b(pm80VarF4, null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar7, 56, 120);
                        fetVar7.r(false);
                        i7 = i8;
                    }
                    fetVar7.r(false);
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 13:
                fet fetVar8 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    zcl zclVar10 = qmk.f28987a;
                    thg0 thg0VarA5 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar8, 0);
                    int iHashCode5 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM5 = fetVar8.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar8, jm40Var);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, thg0VarA5, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar8);
                    Iterator itO5 = h97.o(fetVar8, mm40VarC4, gqw0.v, 697651401, a4xVar);
                    int i9 = 0;
                    while (itO5.hasNext()) {
                        Object next5 = itO5.next();
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            q3d.p();
                            throw null;
                        }
                        int iIntValue13 = ((Number) next5).intValue();
                        fetVar8.b0(-1392989766, Integer.valueOf(i9));
                        pm80 pm80VarF5 = a8k0.F(iIntValue13, 0, fetVar8);
                        zcl zclVar11 = qmk.f28987a;
                        j0x.b(pm80VarF5, null, o7k0.p(jm40Var, 24.0f, 32.0f), null, null, 0.0f, null, fetVar8, 56, 120);
                        fetVar8.r(false);
                        i9 = i10;
                    }
                    fetVar8.r(false);
                    fetVar8.r(true);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                acb.C(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                hew0.o(a4xVar, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                bdx.f(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                x8f.l(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                wdx.t(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                xdx.j(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                cjx.D(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                fet fetVar9 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar12 = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(mm40VarD, 12.0f, 4.0f, 12.0f, 16.0f);
                    xx7 xx7Var = gqw0.n;
                    qw3 qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
                    boolean zG3 = fetVar9.g(a4xVar);
                    Object objP4 = fetVar9.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new oea(a4xVar, (byte) 24);
                        fetVar9.o0(objP4);
                    }
                    b8k0.e(mm40VarM, null, null, qw3Var, xx7Var, null, false, null, (Function1) objP4, fetVar9, 196608, 462);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                wdx.c(a4xVar, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                hhm0.e(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                aem0.c(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                aem0.d(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                n8n0.a(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                n8n0.b(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                afn0.a(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                j2e.A(a4xVar, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ eup(a4x a4xVar, byte b) {
        this.f8432a = b;
        this.b = a4xVar;
    }

    public /* synthetic */ eup(a4x a4xVar, int i, byte b) {
        this.f8432a = b;
        this.b = a4xVar;
    }
}
