package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ahd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f869a;

    public /* synthetic */ ahd(byte b) {
        this.f869a = b;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x026d  */
    /* JADX WARN: Code duplicated, block: B:68:0x02a9  */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        long jE;
        my30 my30Var;
        long jE2;
        long jE3;
        switch (this.f869a) {
            case 0:
                y5d y5dVar = (y5d) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    nkb.h(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), new ijm(), kjm.b, null, null, null, fetVar, 384, 56);
                    mm40 mm40VarN = s5x0.N(y5dVar.b(jm40Var, true).e(o7k0.c), 0.0f, 0.0f, 0.0f, 24.0f, 7);
                    zcl zclVar2 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), vbc.d0(null, fetVar, 0, 1)));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                boolean z = false;
                mz3 mz3Var = (mz3) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mz3Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(mz3Var) ? 4 : 2;
                }
                if ((iIntValue2 & 19) != 18) {
                    z = true;
                }
                if (fetVar2.U(iIntValue2 & 1, z)) {
                    j0x.b(mz3Var, null, o2e.e0(o7k0.c, "ASYNC_IMAGE"), null, gqw0.h1, 0.0f, null, fetVar2, (iIntValue2 & 14) | 25008, 104);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                boolean z2 = false;
                mz3 mz3Var2 = (mz3) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mz3Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(mz3Var2) ? 4 : 2;
                }
                if ((iIntValue3 & 19) != 18) {
                    z2 = true;
                }
                if (fetVar3.U(iIntValue3 & 1, z2)) {
                    j0x.b(mz3Var2, null, o2e.e0(o7k0.c, "ASYNC_IMAGE"), null, gqw0.h1, 0.0f, new m78(((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundLight60(), 9), fetVar3, (iIntValue3 & 14) | 25008, 40);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                boolean z3 = false;
                mz3 mz3Var3 = (mz3) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                mz3Var3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(mz3Var3) ? 4 : 2;
                }
                if ((iIntValue4 & 19) != 18) {
                    z3 = true;
                }
                if (fetVar4.U(iIntValue4 & 1, z3)) {
                    j0x.b(mz3Var3, null, o7k0.c, null, gqw0.h1, 0.0f, null, fetVar4, (iIntValue4 & 14) | 25008, 104);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                boolean z4 = false;
                mz3 mz3Var4 = (mz3) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                mz3Var4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(mz3Var4) ? 4 : 2;
                }
                if ((iIntValue5 & 19) != 18) {
                    z4 = true;
                }
                if (fetVar5.U(iIntValue5 & 1, z4)) {
                    j0x.b(mz3Var4, null, o2e.e0(o7k0.c, "GAME_COLLECTION_CARD_BOX_IMAGE"), null, gqw0.A, 0.0f, null, fetVar5, (iIntValue5 & 14) | 25008, 104);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                boolean z5 = false;
                mz3 mz3Var5 = (mz3) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mz3Var5.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(mz3Var5) ? 4 : 2;
                }
                if ((iIntValue6 & 19) != 18) {
                    z5 = true;
                }
                if (fetVar6.U(iIntValue6 & 1, z5)) {
                    j0x.b(mz3Var5, null, o7k0.c, null, gqw0.A, 0.0f, null, fetVar6, (iIntValue6 & 14) | 25008, 104);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                boolean z6 = false;
                mz3 mz3Var6 = (mz3) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                mz3Var6.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(mz3Var6) ? 4 : 2;
                }
                if ((iIntValue7 & 19) != 18) {
                    z6 = true;
                }
                if (fetVar7.U(iIntValue7 & 1, z6)) {
                    j0x.b(mz3Var6, null, o2e.e0(o7k0.c, "GAME_IMAGE_TAG"), null, gqw0.A, 0.0f, null, fetVar7, (iIntValue7 & 14) | 25008, 104);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                boolean z7 = false;
                mz3 mz3Var7 = (mz3) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                mz3Var7.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(mz3Var7) ? 4 : 2;
                }
                if ((iIntValue8 & 19) != 18) {
                    z7 = true;
                }
                if (fetVar8.U(iIntValue8 & 1, z7)) {
                    j0x.b(mz3Var7, null, o2e.e0(o7k0.c, "GAME_IMAGE_TAG"), null, gqw0.A, 0.0f, null, fetVar8, (iIntValue8 & 14) | 25008, 104);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                boolean z8 = false;
                mz3 mz3Var8 = (mz3) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                mz3Var8.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.g(mz3Var8) ? 4 : 2;
                }
                if ((iIntValue9 & 19) != 18) {
                    z8 = true;
                }
                if (fetVar9.U(iIntValue9 & 1, z8)) {
                    j0x.b(mz3Var8, null, o7k0.c, null, gqw0.A, 0.0f, null, fetVar9, (iIntValue9 & 14) | 25008, 104);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                boolean z9 = false;
                mz3 mz3Var9 = (mz3) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                mz3Var9.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(mz3Var9) ? 4 : 2;
                }
                if ((iIntValue10 & 19) != 18) {
                    z9 = true;
                }
                if (fetVar10.U(iIntValue10 & 1, z9)) {
                    j0x.b(mz3Var9, null, o7k0.c, null, gqw0.A, 0.0f, null, fetVar10, (iIntValue10 & 14) | 25008, 104);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                boolean z10 = false;
                mz3 mz3Var10 = (mz3) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                mz3Var10.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(mz3Var10) ? 4 : 2;
                }
                if ((iIntValue11 & 19) != 18) {
                    z10 = true;
                }
                if (fetVar11.U(iIntValue11 & 1, z10)) {
                    j0x.b(mz3Var10, null, o7k0.c, null, gqw0.A, 0.0f, null, fetVar11, (iIntValue11 & 14) | 25008, 104);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                mz3 mz3Var11 = (mz3) obj;
                boolean z11 = false;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                mz3Var11.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(mz3Var11) ? 4 : 2;
                }
                if ((iIntValue12 & 19) != 18) {
                    z11 = true;
                }
                if (fetVar12.U(iIntValue12 & 1, z11)) {
                    j0x.b(mz3Var11, null, o7k0.c, null, gqw0.A, 0.0f, null, fetVar12, (iIntValue12 & 14) | 25008, 104);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                hh80 hh80Var = (hh80) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar13.g(hh80Var) ? 4 : 2;
                }
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    mm40 mm40VarQ = i120.Q(s5x0.I(o7k0.c, hh80Var), ((ThemeColors) fetVar13.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar13, 48);
                    int iHashCode = Long.hashCode(fetVar13.T);
                    bh90 bh90VarM = fetVar13.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar13, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar13.i0();
                    if (fetVar13.S) {
                        fetVar13.l(e7z.u1);
                    } else {
                        fetVar13.r0();
                    }
                    jpm0.o(fetVar13, x5dVarA, gqw0.x);
                    jpm0.o(fetVar13, bh90VarM, gqw0.w);
                    jpm0.o(fetVar13, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar13);
                    jpm0.o(fetVar13, mm40VarC0, gqw0.v);
                    pm80 pm80VarF = a8k0.F(R.drawable.end_session_light, 0, fetVar13);
                    pge pgeVar = gqw0.B;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    j0x.b(pm80VarF, null, s5x0.N(mm40VarD, 0.0f, 80.0f, 0.0f, 0.0f, 13), null, pgeVar, 0.0f, null, fetVar13, 24632, 104);
                    v8q0.a(xsm0.s(R.string.end_session_title, fetVar13), s5x0.N(jm40Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, null, qmk.v, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.t(g1t0.j(), fetVar13), fetVar13, 0, 0, 130028);
                    v8q0.a(xsm0.s(R.string.end_session_description, fetVar13), s5x0.J(jm40Var2, 16.0f), 0L, null, qmk.s, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.n(g1t0.n(), fetVar13), fetVar13, 0, 0, 130028);
                    fetVar13.r(true);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                y5dVar2.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    zcl zclVar4 = qmk.f28987a;
                    jm40 jm40Var3 = jm40.b;
                    nkb.h(s5x0.N(jm40Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13), new ijm(), kjm.b, null, null, null, fetVar14, 384, 56);
                    mm40 mm40VarN2 = s5x0.N(y5dVar2.b(jm40Var3, true).e(o7k0.c), 0.0f, 0.0f, 0.0f, 24.0f, 7);
                    zcl zclVar5 = qmk.i;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    zq8.a(0, fetVar14, xbc.c0(h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarN2), vbc.d0(null, fetVar14, 0, 1)));
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                vj30 vj30Var = (vj30) obj;
                int iT = vj30Var.T(10.0f);
                int i = iT * 2;
                pu90 pu90VarS = ((pj30) obj2).S(r4e.i(i, 0, ((p4e) obj3).f26347a));
                return vj30.x(vj30Var, pu90VarS.f27604a - i, pu90VarS.b, new n7(pu90VarS, iT, (byte) 1));
            case 15:
                vj30 vj30Var2 = (vj30) obj;
                int iT2 = vj30Var2.T(10.0f);
                int i2 = iT2 * 2;
                pu90 pu90VarS2 = ((pj30) obj2).S(r4e.i(0, i2, ((p4e) obj3).f26347a));
                return vj30.x(vj30Var2, pu90VarS2.f27604a, pu90VarS2.b - i2, new n7(pu90VarS2, iT2, (byte) 0));
            case 16:
                ((Integer) obj2).getClass();
                p6t0 p6t0Var = (p6t0) obj3;
                ((x8z) obj).getClass();
                p6t0Var.getClass();
                if ((p6t0Var instanceof pqv) || (p6t0Var instanceof ly30)) {
                    jE = q8x.e(2);
                } else {
                    my30Var = p6t0Var instanceof my30 ? (my30) p6t0Var : null;
                    if (my30Var == null || !my30Var.y0()) {
                        jE = q8x.e(1);
                    } else {
                        jE = q8x.e(2);
                    }
                }
                return new pgv(jE);
            case 17:
                ((Integer) obj2).getClass();
                p6t0 p6t0Var2 = (p6t0) obj3;
                ((x8z) obj).getClass();
                p6t0Var2.getClass();
                if ((p6t0Var2 instanceof pqv) || (p6t0Var2 instanceof ly30)) {
                    jE2 = q8x.e(2);
                } else {
                    my30Var = p6t0Var2 instanceof my30 ? (my30) p6t0Var2 : null;
                    if (my30Var == null || !my30Var.y0()) {
                        jE2 = q8x.e(1);
                    } else {
                        jE2 = q8x.e(2);
                    }
                }
                return new pgv(jE2);
            case 18:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                vj30 vj30Var3 = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var3.getClass();
                pj30Var.getClass();
                int iT3 = vj30Var3.T(52.0f) + ((int) (p4e.i(p4eVar.f26347a) / 1.6666666f));
                pu90 pu90VarS3 = pj30Var.S(p4e.b(p4eVar.f26347a, 0, 0, iT3, iT3, 3));
                return vj30.x(vj30Var3, pu90VarS3.f27604a, pu90VarS3.b, new y1(pu90VarS3, (byte) 1));
            case 20:
                vj30 vj30Var4 = (vj30) obj;
                pj30 pj30Var2 = (pj30) obj2;
                p4e p4eVar2 = (p4e) obj3;
                vj30Var4.getClass();
                pj30Var2.getClass();
                int iT4 = vj30Var4.T(48.0f) + ((int) (p4e.i(p4eVar2.f26347a) / 1.6666666f));
                pu90 pu90VarS4 = pj30Var2.S(p4e.b(p4eVar2.f26347a, 0, 0, iT4, iT4, 3));
                return vj30.x(vj30Var4, pu90VarS4.f27604a, pu90VarS4.b, new y1(pu90VarS4, (byte) 2));
            case 21:
                ((Integer) obj2).intValue();
                p6t0 p6t0Var3 = (p6t0) obj3;
                ((x8z) obj).getClass();
                p6t0Var3.getClass();
                if ((p6t0Var3 instanceof xfe0) || (p6t0Var3 instanceof hsv)) {
                    jE3 = q8x.e(2);
                } else if (p6t0Var3 instanceof bws) {
                    jE3 = q8x.e(((bws) p6t0Var3).c ? 1 : 2);
                } else {
                    jE3 = q8x.e(1);
                }
                return new pgv(jE3);
            case 22:
                vj30 vj30Var5 = (vj30) obj;
                pj30 pj30Var3 = (pj30) obj2;
                p4e p4eVar3 = (p4e) obj3;
                vj30Var5.getClass();
                pj30Var3.getClass();
                int iP = pj30Var3.P(p4e.h(p4eVar3.f26347a));
                zcl zclVar6 = qmk.f28987a;
                int iT5 = vj30Var5.T(2.0f) + iP;
                long j = p4eVar3.f26347a;
                int iD = l1e0.d(iT5, p4e.k(j), p4e.i(j));
                pu90 pu90VarS5 = pj30Var3.S(p4e.b(p4eVar3.f26347a, iD, iD, 0, 0, 12));
                return vj30.x(vj30Var5, pu90VarS5.f27604a, pu90VarS5.b, new y1(pu90VarS5, (byte) 6));
            case 23:
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                a4x a4xVar = (a4x) obj3;
                a4xVar.getClass();
                return new gfm(jLongValue, jLongValue2, a4xVar);
            case 24:
                long jLongValue3 = ((Long) obj).longValue();
                long jLongValue4 = ((Long) obj2).longValue();
                a4x a4xVar2 = (a4x) obj3;
                a4xVar2.getClass();
                return new dfm(jLongValue3, jLongValue4, a4xVar2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                long jLongValue5 = ((Long) obj).longValue();
                long jLongValue6 = ((Long) obj2).longValue();
                a4x a4xVar3 = (a4x) obj3;
                a4xVar3.getClass();
                return new efm(jLongValue5, jLongValue6, a4xVar3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                long jLongValue7 = ((Long) obj).longValue();
                long jLongValue8 = ((Long) obj2).longValue();
                a4x a4xVar4 = (a4x) obj3;
                a4xVar4.getClass();
                return new ffm(jLongValue7, jLongValue8, a4xVar4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                long jLongValue9 = ((Long) obj).longValue();
                long jLongValue10 = ((Long) obj2).longValue();
                a4x a4xVar5 = (a4x) obj3;
                a4xVar5.getClass();
                return new gfm(jLongValue9, jLongValue10, a4xVar5);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                vj30 vj30Var6 = (vj30) obj;
                pj30 pj30Var4 = (pj30) obj2;
                p4e p4eVar4 = (p4e) obj3;
                vj30Var6.getClass();
                pj30Var4.getClass();
                zcl zclVar7 = qmk.f28987a;
                int iT6 = vj30Var6.T(36.5f);
                long j2 = p4eVar4.f26347a;
                int iH = p4e.h(j2) + iT6;
                long j3 = p4eVar4.f26347a;
                pu90 pu90VarS6 = pj30Var4.S(p4e.b(j2, 0, 0, iH, p4e.h(j3) + iT6, 3));
                return vj30.x(vj30Var6, pu90VarS6.f27604a, p4e.h(j3), new n7(pu90VarS6, iT6, (byte) 4));
            default:
                int iIntValue15 = ((Integer) obj2).intValue();
                int iIntValue16 = ((Integer) obj3).intValue();
                ((tcz) obj).getClass();
                return Integer.valueOf(l1e0.d(iIntValue16, iIntValue15 - 1, iIntValue15 + 1));
        }
    }
}
