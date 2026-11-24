package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38322a;
    public final /* synthetic */ ugd b;

    public /* synthetic */ w(ugd ugdVar, byte b) {
        this.f38322a = b;
        this.b = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        pu90 pu90VarS;
        int iD0;
        int i2;
        pu90 pu90VarS2;
        byte b = this.f38322a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        byte b2 = 7;
        ugd ugdVar = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ay3.I(ugdVar, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 1:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    twn.v(0, ugdVar, fetVar, true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    twn.v(0, ugdVar, fetVar2, true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ugdVar.F(jr8.f16991a.b(jm40Var, gqw0.c), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ugdVar.invoke(fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ugdVar.invoke(fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 6:
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                int iW0 = (int) c5n0Var.w0(4.0f);
                long j = p4eVar.f26347a;
                int i3 = p4e.i(j);
                int i4 = iW0 / 2;
                int i5 = (i3 / 2) - i4;
                List listK = c5n0Var.k("container_slot", new ugd(1618195416, true, new w(ugdVar, b2)));
                List listK2 = c5n0Var.k("container_clamped_slot", new ugd(-433363786, true, new w(ugdVar, (byte) 8)));
                mie0 mie0Var = new mie0();
                pj30 pj30Var = (pj30) CollectionsKt.W(0, listK);
                mie0Var.f21842a = pj30Var != null ? pj30Var.S(j) : null;
                mie0 mie0Var2 = new mie0();
                pj30 pj30Var2 = (pj30) CollectionsKt.W(1, listK);
                mie0Var2.f21842a = pj30Var2 != null ? pj30Var2.S(j) : null;
                pu90 pu90Var = (pu90) mie0Var.f21842a;
                int iE0 = pu90Var != null ? pu90Var.e0() : 0;
                pu90 pu90Var2 = (pu90) mie0Var2.f21842a;
                int iE1 = pu90Var2 != null ? pu90Var2.e0() : 0;
                pj30 pj30Var3 = (pj30) CollectionsKt.W(0, listK2);
                pj30 pj30Var4 = (pj30) CollectionsKt.W(1, listK2);
                if (iE0 >= i5 && iE1 >= i5) {
                    if (pj30Var3 != null) {
                        i = i5;
                        pu90VarS = pj30Var3.S(p4e.b(p4eVar.f26347a, 0, i, 0, 0, 13));
                    } else {
                        i = i5;
                        pu90VarS = null;
                    }
                    mie0Var.f21842a = pu90VarS;
                    mie0Var2.f21842a = pj30Var4 != null ? pj30Var4.S(p4e.b(p4eVar.f26347a, 0, i, 0, 0, 13)) : null;
                } else if (iE1 + 1 <= i5 && i5 <= iE0) {
                    mie0Var.f21842a = pj30Var3 != null ? pj30Var3.S(p4e.b(p4eVar.f26347a, 0, (i3 - iE1) - i4, 0, 0, 13)) : null;
                } else if (iE0 + 1 <= i5 && i5 <= iE1) {
                    mie0Var2.f21842a = pj30Var4 != null ? pj30Var4.S(p4e.b(p4eVar.f26347a, 0, (i3 - iE0) - i4, 0, 0, 13)) : null;
                }
                pu90 pu90Var3 = (pu90) mie0Var.f21842a;
                int iD1 = pu90Var3 != null ? pu90Var3.d0() : 0;
                pu90 pu90Var4 = (pu90) mie0Var2.f21842a;
                int iD2 = pu90Var4 != null ? pu90Var4.d0() : 0;
                int iMax = Math.max(iD1, iD2);
                return vj30.x(c5n0Var, p4e.i(j), iMax, new fkq(mie0Var, iMax, iD1, mie0Var2, iW0, iD2, (byte) 0));
            case 7:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ugdVar.invoke(fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ugdVar.invoke(fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 9:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ugdVar.F(bpq.f2997a, fetVar8, 6);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 10:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ugdVar.F(jm40Var, fetVar9, 6);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 11:
                c5n0 c5n0Var2 = (c5n0) obj;
                p4e p4eVar2 = (p4e) obj2;
                c5n0Var2.getClass();
                int iW1 = (int) c5n0Var2.w0(6.0f);
                long j2 = p4eVar2.f26347a;
                int i6 = p4e.i(j2);
                int i7 = iW1 / 2;
                int i8 = (i6 / 2) - i7;
                List listK3 = c5n0Var2.k("container_slot", new ugd(-377016771, true, new w(ugdVar, (byte) 12)));
                List listK4 = c5n0Var2.k("container_clamped_slot", new ugd(-652219745, true, new w(ugdVar, (byte) 13)));
                mie0 mie0Var3 = new mie0();
                pj30 pj30Var5 = (pj30) CollectionsKt.W(0, listK3);
                mie0Var3.f21842a = pj30Var5 != null ? pj30Var5.S(j2) : null;
                mie0 mie0Var4 = new mie0();
                pj30 pj30Var6 = (pj30) CollectionsKt.W(1, listK3);
                mie0Var4.f21842a = pj30Var6 != null ? pj30Var6.S(j2) : null;
                pu90 pu90Var5 = (pu90) mie0Var3.f21842a;
                int iE2 = pu90Var5 != null ? pu90Var5.e0() : 0;
                pu90 pu90Var6 = (pu90) mie0Var4.f21842a;
                int iE3 = pu90Var6 != null ? pu90Var6.e0() : 0;
                pj30 pj30Var7 = (pj30) CollectionsKt.W(0, listK4);
                pj30 pj30Var8 = (pj30) CollectionsKt.W(1, listK4);
                if (iE2 >= i8 && iE3 >= i8) {
                    if (pj30Var7 != null) {
                        i2 = i8;
                        pu90VarS2 = pj30Var7.S(p4e.b(p4eVar2.f26347a, 0, i2, 0, 0, 13));
                    } else {
                        i2 = i8;
                        pu90VarS2 = null;
                    }
                    mie0Var3.f21842a = pu90VarS2;
                    mie0Var4.f21842a = pj30Var8 != null ? pj30Var8.S(p4e.b(p4eVar2.f26347a, 0, i2, 0, 0, 13)) : null;
                    iD0 = 0;
                } else if (iE2 < i8 || iE3 >= i8) {
                    iD0 = 0;
                    if (iE2 < i8 && iE3 >= i8) {
                        mie0Var4.f21842a = pj30Var8 != null ? pj30Var8.S(p4e.b(p4eVar2.f26347a, 0, (i6 - iE2) - i7, 0, 0, 13)) : null;
                    }
                } else {
                    iD0 = 0;
                    mie0Var3.f21842a = pj30Var7 != null ? pj30Var7.S(p4e.b(p4eVar2.f26347a, 0, (i6 - iE3) - i7, 0, 0, 13)) : null;
                }
                pu90 pu90Var7 = (pu90) mie0Var3.f21842a;
                if (pu90Var7 != null) {
                    iD0 = pu90Var7.d0();
                }
                pu90 pu90Var8 = (pu90) mie0Var4.f21842a;
                int iD3 = pu90Var8 != null ? pu90Var8.d0() : iD0;
                int iMax2 = Math.max(iD0, iD3);
                return vj30.x(c5n0Var2, p4e.i(j2), iMax2, new fkq(mie0Var3, iMax2, iD0, mie0Var4, iW1, iD3, (byte) 1));
            case 12:
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ugdVar.invoke(fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 13:
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ugdVar.invoke(fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                wdx.j(ugdVar, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 15:
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ugdVar.invoke(fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                kr00.a(ugdVar, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                cww.c(ugdVar, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 18:
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ugdVar.F(udl0.CLASSIC, fetVar13, 6);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ugdVar.F(udl0.ADVANCED, fetVar14, 6);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 20:
                fet fetVar15 = (fet) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ugdVar.F(udl0.DASHBOARD, fetVar15, 6);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 21:
                fet fetVar16 = (fet) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ugdVar.F(udl0.LITE, fetVar16, 6);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                w9x.m(ugdVar, (fet) obj, x8x.L(49));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                jiq0.x(ugdVar, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 24:
                fet fetVar17 = (fet) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ugdVar.invoke(fetVar17, 0);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fet fetVar18 = (fet) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar18, 48);
                    int iHashCode3 = Long.hashCode(fetVar18.T);
                    bh90 bh90VarM3 = fetVar18.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar18, jm40Var);
                    mkd.c0.getClass();
                    fetVar18.i0();
                    if (fetVar18.S) {
                        fetVar18.l(pcyVar);
                    } else {
                        fetVar18.r0();
                    }
                    jpm0.o(fetVar18, thg0VarA, gqw0.x);
                    jpm0.o(fetVar18, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar18, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar18);
                    jpm0.o(fetVar18, mm40VarC2, gqw0.v);
                    h97.p(6, ugdVar, zhg0.f44392a, fetVar18, true);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fet fetVar19 = (fet) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ugdVar.invoke(fetVar19, 0);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                c9x.i(ugdVar, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fet fetVar20 = (fet) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iHashCode4 = Long.hashCode(fetVar20.T);
                    bh90 bh90VarM4 = fetVar20.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar20, jm40Var);
                    mkd.c0.getClass();
                    fetVar20.i0();
                    if (fetVar20.S) {
                        fetVar20.l(pcyVar);
                    } else {
                        fetVar20.r0();
                    }
                    jpm0.o(fetVar20, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar20, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar20, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar20);
                    jpm0.o(fetVar20, mm40VarC3, gqw0.v);
                    twn.v(0, ugdVar, fetVar20, true);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                tpj0.a(ugdVar, (fet) obj, x8x.L(55));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ w(ugd ugdVar, int i, byte b) {
        this.f38322a = b;
        this.b = ugdVar;
    }
}
