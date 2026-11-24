package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i5b implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14185a;

    public /* synthetic */ i5b(byte b) {
        this.f14185a = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        float f;
        byte b = this.f14185a;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var.getClass();
                pj30Var.getClass();
                zcl zclVar = qmk.f28987a;
                int iT = vj30Var.T(36.0f) + 1;
                long j = p4eVar.f26347a;
                int iH = p4e.h(j) + iT;
                long j2 = p4eVar.f26347a;
                pu90 pu90VarS = pj30Var.S(p4e.b(j, 0, 0, iH, p4e.h(j2) + iT, 3));
                return vj30.x(vj30Var, pu90VarS.f27604a, p4e.h(j2), new n7(pu90VarS, iT, (byte) 5));
            case 1:
                vj30 vj30Var2 = (vj30) obj;
                pj30 pj30Var2 = (pj30) obj2;
                p4e p4eVar2 = (p4e) obj3;
                vj30Var2.getClass();
                pj30Var2.getClass();
                int iH2 = p4e.h(p4eVar2.f26347a);
                int i = (int) (iH2 * 0.75f);
                long j3 = p4eVar2.f26347a;
                int i2 = p4e.i(j3);
                if (i > i2) {
                    i = i2;
                }
                pu90 pu90VarS2 = pj30Var2.S(r4e.e(p4e.a(i, i, iH2, iH2), j3));
                return vj30.x(vj30Var2, pu90VarS2.f27604a, pu90VarS2.b, new y1(pu90VarS2, (byte) 11));
            case 2:
                vj30 vj30Var3 = (vj30) obj;
                pj30 pj30Var3 = (pj30) obj2;
                vj30Var3.getClass();
                pj30Var3.getClass();
                int i3 = p4e.i(((p4e) obj3).f26347a);
                if (i3 > f7k.M(431)) {
                    zcl zclVar2 = qmk.f28987a;
                    f = 360.0f;
                } else if (i3 > f7k.M(360)) {
                    zcl zclVar3 = qmk.f28987a;
                    f = 280.0f;
                } else {
                    zcl zclVar4 = qmk.f28987a;
                    f = 216.0f;
                }
                int iT2 = vj30Var3.T(f);
                int i4 = (int) (iT2 / 2.0f);
                if (!((iT2 >= 0) & (i4 >= 0))) {
                    zcx.a("width and height must be >= 0");
                }
                pu90 pu90VarS3 = pj30Var3.S(r4e.h(iT2, iT2, i4, i4));
                return vj30.x(vj30Var3, pu90VarS3.f27604a, pu90VarS3.b, new y1(pu90VarS3, (byte) 12));
            case 3:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((iao0) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    oja0.K(0, fetVar);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    qxw.o(fetVar2, o7k0.e(jm40Var, 8.0f));
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar6 = qmk.f28987a;
                    wwb.i(s5x0.N(jm40.b, 0.0f, 28.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.security_exit_sessions_title, 0, fetVar3), 0L, 0, 0L, fetVar3, 0, 28);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    wwb.i(s5x0.N(jm40.b, 0.0f, 28.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.security_end_selected_session_title, 0, fetVar4), 0L, 0, 0L, fetVar4, 0, 28);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    pm80 pm80VarF = a8k0.F(R.drawable.data_copy_icon, 0, fetVar5);
                    zcl zclVar8 = qmk.f28987a;
                    dww.c(pm80VarF, null, o7k0.n(jm40Var, 18.0f), 0L, fetVar5, 56, 8);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar6), null, null, 0L, fetVar6, 56, 12);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 9:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    zcl zclVar9 = qmk.f28987a;
                    qxw.o(fetVar7, o7k0.e(jm40Var, 12.0f));
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 10:
                Function2 function2 = (Function2) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.i(function2) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    function2.invoke(fetVar8, Integer.valueOf(iIntValue8 & 14));
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 11:
                Function2 function3 = (Function2) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.i(function3) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    function3.invoke(fetVar9, Integer.valueOf(iIntValue9 & 14));
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 12:
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    m7x.g(0, fetVar10);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 13:
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    zcl zclVar10 = qmk.f28987a;
                    mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 0.0f, 8.0f, 1), false, fetVar11, 6, 4);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 14:
                y5d y5dVar = (y5d) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(y5dVar) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar11 = qmk.f28987a;
                    wwb.i(o2e.e0(s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 0.0f, 13), "BONUSES_INFO_BOTTOM_SHEET"), rsm0.w(R.string.bonuses_info_name, 0, fetVar12), 0L, 0, 0L, fetVar12, 0, 28);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 15:
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if (!fetVar13.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 16:
                mm40 mm40Var = (mm40) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.g(mm40Var) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    p3c0.a(mm40Var, ((ThemeColors) fetVar14.k(zaq0.b)).getPrimary(), 0.0f, 0L, 0, 0.0f, fetVar14, iIntValue14 & 14, 60);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 17:
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                mm40Var2.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar15.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    p3c0.a(mm40Var2, ((ThemeColors) fetVar15.k(zaq0.b)).getPrimary(), 0.0f, 0L, 0, 0.0f, fetVar15, iIntValue15 & 14, 60);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 18:
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar12 = qmk.f28987a;
                    v8q0.a(rsm0.w(R.string.players_duel_build_your_teams_title, 0, fetVar16), s5x0.L(mm40VarD, 0.0f, 16.0f, 1), ((ThemeColors) fetVar16.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar16, 0, 24960, 110584);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    zcl zclVar13 = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 32.0f), 84.0f);
                    zcl zclVar14 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar17, xbc.c0(h97.e(zclVar14, zclVar14, zclVar14, zclVar14, mm40VarS), vbc.d0(vqm.b, fetVar17, 6, 0)));
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 20:
                x5b x5bVar = (x5b) obj;
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                x5bVar.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= fetVar18.g(x5bVar) ? 4 : 2;
                }
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    zcl zclVar15 = qmk.f28987a;
                    phu0.h(s5x0.L(jm40Var, 8.0f, 0.0f, 2), x5bVar, eeq.f7685a, eeq.b, fetVar18, ((iIntValue18 << 3) & 112) | 3456);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 21:
                x5b x5bVar2 = (x5b) obj;
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                x5bVar2.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= fetVar19.g(x5bVar2) ? 4 : 2;
                }
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    zcl zclVar16 = qmk.f28987a;
                    phu0.h(s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), x5bVar2, cjx.c, cjx.d, fetVar19, ((iIntValue19 << 3) & 112) | 3456);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case 22:
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    kjm kjmVar = kjm.b;
                    ijm ijmVar = new ijm();
                    jm40 jm40Var2 = jm40.b;
                    nkb.h(jm40Var2, ijmVar, kjmVar, null, null, null, fetVar20, 390, 56);
                    for (int i5 = 0; i5 < 24; i5++) {
                        mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                        zcl zclVar17 = qmk.f28987a;
                        mm40 mm40VarE = o7k0.e(mm40VarD2, 48.0f);
                        zcl zclVar18 = qmk.i;
                        ugg0 ugg0Var2 = vgg0.f37379a;
                        zq8.a(0, fetVar20, xbc.c0(h97.e(zclVar18, zclVar18, zclVar18, zclVar18, mm40VarE), vbc.d0(null, fetVar20, 0, 1)));
                        qxw.o(fetVar20, o7k0.e(jm40Var2, 6.0f));
                    }
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case 23:
                fet fetVar21 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar21.U(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    zcl zclVar19 = qmk.f28987a;
                    jm40 jm40Var3 = jm40.b;
                    nkb.h(s5x0.N(jm40Var3, 0.0f, 6.0f, 0.0f, 8.0f, 5), new ijm(), kjm.b, null, null, null, fetVar21, 384, 56);
                    int iB = 0;
                    while (iB < 24) {
                        zcl zclVar20 = qmk.f28987a;
                        mm40 mm40VarE2 = o7k0.e(o7k0.d(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), 24.0f);
                        zcl zclVar21 = qmk.e;
                        ugg0 ugg0Var3 = vgg0.f37379a;
                        iB = h97.b(h97.e(zclVar21, zclVar21, zclVar21, zclVar21, mm40VarE2), vbc.d0(null, fetVar21, 0, 1), fetVar21, 0, iB, 1);
                    }
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case 24:
                fet fetVar22 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar22.U(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar22 = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(mm40VarD3, 16.0f, 8.0f, 16.0f, 8.0f);
                    String strS = xsm0.s(R.string.limits_bottom_sheet_description, fetVar22);
                    ((g1t0) fetVar22.k(j1t0.e)).getClass();
                    v8q0.a(strS, mm40VarM, ((ThemeColors) fetVar22.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.k(), fetVar22, 0, 0, 131064);
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fet fetVar23 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar23.U(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar23 = qmk.f28987a;
                    mm40 mm40VarM2 = s5x0.M(mm40VarD4, 16.0f, 8.0f, 16.0f, 8.0f);
                    String strS2 = xsm0.s(R.string.fixed_sum, fetVar23);
                    ((g1t0) fetVar23.k(j1t0.e)).getClass();
                    v8q0.a(strS2, mm40VarM2, ((ThemeColors) fetVar23.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.k(), fetVar23, 0, 0, 131064);
                } else {
                    fetVar23.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fet fetVar24 = (fet) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar24.U(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    zcl zclVar24 = qmk.i;
                    ugg0 ugg0Var4 = vgg0.f37379a;
                    jm40 jm40Var4 = jm40.b;
                    mm40 mm40VarN = s5x0.N(s5x0.L(i120.Q(dw9.i(zclVar24, zclVar24, zclVar24, zclVar24, jm40Var4), ((ThemeColors) fetVar24.k(zaq0.b)).getBackgroundContent(), jd8.n), 8.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 2.0f, 5);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar24, 0);
                    int iHashCode = Long.hashCode(fetVar24.T);
                    bh90 bh90VarM = fetVar24.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar24, mm40VarN);
                    mkd.c0.getClass();
                    fetVar24.i0();
                    boolean z = fetVar24.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
                        fetVar24.l(pcyVar);
                    } else {
                        fetVar24.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar24, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar24, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar24, numValueOf, shdVar3);
                    jpm0.n(fetVar24);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar24, mm40VarC0, shdVar4);
                    mm40 mm40VarE3 = o7k0.e(jm40Var4, 30.0f);
                    zx7 zx7Var = gqw0.e;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar24.T);
                    bh90 bh90VarM2 = fetVar24.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar24, mm40VarE3);
                    fetVar24.i0();
                    if (fetVar24.S) {
                        fetVar24.l(pcyVar);
                    } else {
                        fetVar24.r0();
                    }
                    jpm0.o(fetVar24, tj30VarC, shdVar);
                    jpm0.o(fetVar24, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar24, shdVar3, fetVar24);
                    jpm0.o(fetVar24, mm40VarC1, shdVar4);
                    mm40 mm40VarS2 = o7k0.s(o7k0.e(jm40Var4, 14.0f), 128.0f);
                    zcl zclVar25 = qmk.m;
                    dw9.x(h97.e(zclVar25, zclVar25, zclVar25, zclVar25, mm40VarS2), vbc.d0(null, fetVar24, 0, 1), fetVar24, 0, true);
                    mm40 mm40VarN2 = s5x0.N(jm40Var4, 0.0f, 8.0f, 0.0f, 6.0f, 5);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar24.T);
                    bh90 bh90VarM3 = fetVar24.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar24, mm40VarN2);
                    fetVar24.i0();
                    if (fetVar24.S) {
                        fetVar24.l(pcyVar);
                    } else {
                        fetVar24.r0();
                    }
                    jpm0.o(fetVar24, tj30VarC2, shdVar);
                    jpm0.o(fetVar24, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar24, shdVar3, fetVar24);
                    jpm0.o(fetVar24, mm40VarC2, shdVar4);
                    agc.t(null, f4n.f8923a, ((Boolean) fetVar24.k(kr00.f18743a)).booleanValue(), null, null, fetVar24, 48, 25);
                    fetVar24.r(true);
                    fetVar24.r(true);
                } else {
                    fetVar24.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar25 = (fet) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                y5dVar2.getClass();
                if ((iIntValue25 & 6) == 0) {
                    iIntValue25 |= fetVar25.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar25.U(iIntValue25 & 1, (iIntValue25 & 19) != 18)) {
                    mm40 mm40VarA2 = y5dVar2.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar26 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA2, 0.0f, 28.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.clear, 0, fetVar25), 0L, 0, 0L, fetVar25, 0, 28);
                } else {
                    fetVar25.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar26 = (fet) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                mm40Var3.getClass();
                if ((iIntValue26 & 6) == 0) {
                    iIntValue26 |= fetVar26.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar26.U(iIntValue26 & 1, (iIntValue26 & 19) != 18)) {
                    dww.c(a8k0.F(R.drawable.ic_glyph_arrow_left, 0, fetVar26), null, mm40Var3, 0L, fetVar26, 56 | ((iIntValue26 << 6) & 896), 8);
                } else {
                    fetVar26.X();
                }
                return Unit.f46060a;
            default:
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar27 = (fet) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                mm40Var4.getClass();
                if ((iIntValue27 & 6) == 0) {
                    iIntValue27 |= fetVar27.g(mm40Var4) ? 4 : 2;
                }
                if (fetVar27.U(iIntValue27 & 1, (iIntValue27 & 19) != 18)) {
                    dww.c(a8k0.F(R.drawable.ic_glyph_search, 0, fetVar27), null, mm40Var4, 0L, fetVar27, 56 | ((iIntValue27 << 6) & 896), 8);
                } else {
                    fetVar27.X();
                }
                return Unit.f46060a;
        }
    }
}
