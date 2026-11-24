package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ihd implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14774a;

    public /* synthetic */ ihd(byte b) {
        this.f14774a = b;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        pm80 pm80Var = (pm80) obj;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        pm80Var.getClass();
        ((o0x) obj2).getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? fetVar.g(pm80Var) : fetVar.i(pm80Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 131) != 130)) {
            j0x.b(pm80Var, null, o7k0.d(jm40.b, 1.0f), null, gqw0.A, 0.0f, null, fetVar, 25016 | (iIntValue & 14), 104);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((ir8) obj).getClass();
        mm40Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
            pz40 pz40Var = s6t0.f31722a;
            thb.f(mm40Var, new kf5(new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())), fetVar, (iIntValue >> 3) & 14, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((ir8) obj).getClass();
        mm40Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
            pz40 pz40Var = s6t0.f31722a;
            thb.f(mm40Var, new kf5(new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())), fetVar, (iIntValue >> 3) & 14, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
            piz.i(0, fetVar);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Integer) obj2).getClass();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.o(xmh0.f41124a, jm40.b), xmh0.c), vbc.d0(vqm.f37862a, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long secondary;
        long jM127getWhite300d7_KjU;
        byte b = this.f14774a;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj;
                rs20 rs20Var = (rs20) obj2;
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                mm40Var.getClass();
                rs20Var.getClass();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (fetVar.g(mm40Var) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? fetVar.g(rs20Var) : fetVar.i(rs20Var) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40Var, 6.0f, 0.0f, 2);
                    pz40 pz40Var = s6t0.f31722a;
                    cww.k(mm40Var, e9x.M(StaticColors.INSTANCE.m123getWhite0d7_KjU(), s6t0.b().f33626a.getPrimary(), rs20Var, mm40VarL), q7x.y(rs20Var, s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getTextPrimary(), g1t0.n(), g1t0.n()), null, fetVar, i & 14, 8);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                l7m0 l7m0Var = (l7m0) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                l7m0Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i2 = iIntValue3 | (fetVar2.e(iIntValue2) ? 4 : 2);
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i2 |= fetVar2.g(l7m0Var) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    i6x i6xVar = i6x.f14263a;
                    zcl zclVar2 = qmk.f28987a;
                    int i12 = i2 << 6;
                    zq8.a(0, fetVar2, n6x.w0(new g6x(), iIntValue2, l7m0Var, fetVar2, (i12 & 7168) | (i12 & 896) | 6));
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                mm40 mm40Var2 = (mm40) obj;
                rwm0 rwm0Var = (rwm0) obj2;
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                mm40Var2.getClass();
                rwm0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i3 = iIntValue4 | (fetVar3.g(mm40Var2) ? 4 : 2);
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i3 |= (iIntValue4 & 64) == 0 ? fetVar3.g(rwm0Var) : fetVar3.i(rwm0Var) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    cww.k(mm40Var2, null, r7x.z(rwm0Var, s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSecondary(), g1t0.d(), g1t0.g()), ckb.R(rwm0Var), fetVar3, i3 & 14, 2);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                int iIntValue5 = ((Integer) obj).intValue();
                l7m0 l7m0Var2 = (l7m0) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                l7m0Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i4 = iIntValue6 | (fetVar4.e(iIntValue5) ? 4 : 2);
                } else {
                    i4 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i4 |= fetVar4.g(l7m0Var2) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    zcl zclVar3 = qmk.f28987a;
                    int i13 = y3d.h;
                    pz40 pz40Var3 = s6t0.f31722a;
                    int i14 = i4 << 6;
                    zq8.a(0, fetVar4, n6x.p(new e6x(s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getBackground()), iIntValue5, l7m0Var2, fetVar4, (i14 & 7168) | (i14 & 896) | 6));
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                mm40 mm40Var3 = (mm40) obj;
                rs20 rs20Var2 = (rs20) obj2;
                fet fetVar5 = (fet) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                mm40Var3.getClass();
                rs20Var2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    i5 = iIntValue7 | (fetVar5.g(mm40Var3) ? 4 : 2);
                } else {
                    i5 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i5 |= (iIntValue7 & 64) == 0 ? fetVar5.g(rs20Var2) : fetVar5.i(rs20Var2) ? 32 : 16;
                }
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 6.0f, 0.0f, 4.0f, 0.0f, 10);
                    pz40 pz40Var4 = s6t0.f31722a;
                    cww.k(mm40Var3, e9x.M(s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getPrimary(), rs20Var2, mm40VarN), q7x.y(rs20Var2, s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getTextPrimary(), g1t0.n(), g1t0.n()), null, fetVar5, i5 & 14, 8);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                int iIntValue8 = ((Integer) obj).intValue();
                l7m0 l7m0Var3 = (l7m0) obj2;
                fet fetVar6 = (fet) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                l7m0Var3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i6 = iIntValue9 | (fetVar6.e(iIntValue8) ? 4 : 2);
                } else {
                    i6 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i6 |= fetVar6.g(l7m0Var3) ? 32 : 16;
                }
                if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                    i6x i6xVar2 = i6x.f14263a;
                    zcl zclVar5 = qmk.f28987a;
                    int i15 = i6 << 6;
                    zq8.a(0, fetVar6, n6x.w0(new g6x(), iIntValue8, l7m0Var3, fetVar6, (i15 & 7168) | (i15 & 896) | 6));
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                mm40 mm40Var4 = (mm40) obj;
                rwm0 rwm0Var2 = (rwm0) obj2;
                fet fetVar7 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                mm40Var4.getClass();
                rwm0Var2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i7 = iIntValue10 | (fetVar7.g(mm40Var4) ? 4 : 2);
                } else {
                    i7 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i7 |= (iIntValue10 & 64) == 0 ? fetVar7.g(rwm0Var2) : fetVar7.i(rwm0Var2) ? 32 : 16;
                }
                if (fetVar7.U(i7 & 1, (i7 & 147) != 146)) {
                    pz40 pz40Var5 = s6t0.f31722a;
                    cww.k(mm40Var4, null, r7x.z(rwm0Var2, s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSecondary(), g1t0.d(), g1t0.g()), ckb.R(rwm0Var2), fetVar7, i7 & 14, 2);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                int iIntValue11 = ((Integer) obj).intValue();
                l7m0 l7m0Var4 = (l7m0) obj2;
                fet fetVar8 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                l7m0Var4.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i8 = iIntValue12 | (fetVar8.e(iIntValue11) ? 4 : 2);
                } else {
                    i8 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i8 |= fetVar8.g(l7m0Var4) ? 32 : 16;
                }
                if (fetVar8.U(i8 & 1, (i8 & 147) != 146)) {
                    zcl zclVar6 = qmk.f28987a;
                    int i16 = y3d.h;
                    pz40 pz40Var6 = s6t0.f31722a;
                    int i17 = i8 << 6;
                    zq8.a(0, fetVar8, n6x.p(new e6x(s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getBackground()), iIntValue11, l7m0Var4, fetVar8, (i17 & 7168) | (i17 & 896) | 6));
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                mm40 mm40Var5 = (mm40) obj;
                rs20 rs20Var3 = (rs20) obj2;
                fet fetVar9 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                mm40Var5.getClass();
                rs20Var3.getClass();
                if ((iIntValue13 & 6) == 0) {
                    i9 = iIntValue13 | (fetVar9.g(mm40Var5) ? 4 : 2);
                } else {
                    i9 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i9 |= (iIntValue13 & 64) == 0 ? fetVar9.g(rs20Var3) : fetVar9.i(rs20Var3) ? 32 : 16;
                }
                if (fetVar9.U(i9 & 1, (i9 & 147) != 146)) {
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(jm40.b, 6.0f, 0.0f, 4.0f, 0.0f, 10);
                    pz40 pz40Var7 = s6t0.f31722a;
                    cww.k(mm40Var5, e9x.M(s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getPrimary(), rs20Var3, mm40VarN2), q7x.y(rs20Var3, s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getTextPrimary(), g1t0.n(), g1t0.n()), null, fetVar9, i9 & 14, 8);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                int iIntValue14 = ((Integer) obj).intValue();
                l7m0 l7m0Var5 = (l7m0) obj2;
                fet fetVar10 = (fet) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                l7m0Var5.getClass();
                if ((iIntValue15 & 6) == 0) {
                    i10 = iIntValue15 | (fetVar10.e(iIntValue14) ? 4 : 2);
                } else {
                    i10 = iIntValue15;
                }
                if ((iIntValue15 & 48) == 0) {
                    i10 |= fetVar10.g(l7m0Var5) ? 32 : 16;
                }
                if (fetVar10.U(i10 & 1, (i10 & 147) != 146)) {
                    i6x i6xVar3 = i6x.f14263a;
                    zcl zclVar8 = qmk.f28987a;
                    int i18 = i10 << 6;
                    zq8.a(0, fetVar10, n6x.w0(new g6x(), iIntValue14, l7m0Var5, fetVar10, (i18 & 7168) | (i18 & 896) | 6));
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                mm40 mm40Var6 = (mm40) obj;
                rwm0 rwm0Var3 = (rwm0) obj2;
                fet fetVar11 = (fet) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                mm40Var6.getClass();
                rwm0Var3.getClass();
                if ((iIntValue16 & 6) == 0) {
                    i11 = iIntValue16 | (fetVar11.g(mm40Var6) ? 4 : 2);
                } else {
                    i11 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i11 |= (iIntValue16 & 64) == 0 ? fetVar11.g(rwm0Var3) : fetVar11.i(rwm0Var3) ? 32 : 16;
                }
                if (fetVar11.U(i11 & 1, (i11 & 147) != 146)) {
                    pz40 pz40Var8 = s6t0.f31722a;
                    cww.k(mm40Var6, null, r7x.z(rwm0Var3, s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSecondary(), g1t0.d(), g1t0.g()), ckb.R(rwm0Var3), fetVar11, i11 & 14, 2);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                fet fetVar12 = (fet) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar12.U(iIntValue17 & 1, (iIntValue17 & 129) != 128)) {
                    jd8.O(0, fetVar12, null);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                fet fetVar13 = (fet) obj3;
                int iIntValue18 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar13.U(iIntValue18 & 1, (iIntValue18 & 129) != 128)) {
                    dj8.L(0, fetVar13, null);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                fet fetVar14 = (fet) obj3;
                int iIntValue19 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar14.U(iIntValue19 & 1, (iIntValue19 & 129) != 128)) {
                    rq8.z(0, fetVar14, null);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue20 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue20 & 1, (iIntValue20 & 129) != 128)) {
                    q8a.B(0, fetVar15);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                fet fetVar16 = (fet) obj3;
                int iIntValue21 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar16.U(iIntValue21 & 1, (iIntValue21 & 129) != 128)) {
                    lv00.o(0, fetVar16, null);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                fet fetVar17 = (fet) obj3;
                int iIntValue22 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar17.U(iIntValue22 & 1, (iIntValue22 & 129) != 128)) {
                    i120.i(0, fetVar17, null);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                fet fetVar18 = (fet) obj3;
                int iIntValue23 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar18.U(iIntValue23 & 1, (iIntValue23 & 129) != 128)) {
                    y860.u(0, fetVar18, null);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 18:
                nc90 nc90Var = (nc90) obj2;
                fet fetVar19 = (fet) obj3;
                int iIntValue24 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                nc90Var.getClass();
                if ((iIntValue24 & 48) == 0) {
                    iIntValue24 |= fetVar19.g(nc90Var) ? 32 : 16;
                }
                if (!fetVar19.U(iIntValue24 & 1, (iIntValue24 & 145) != 144)) {
                    fetVar19.X();
                } else if (nc90Var instanceof dc90) {
                    fetVar19.e0(-1636598022);
                    zcl zclVar9 = qmk.f28987a;
                    mm40 mm40VarN3 = o7k0.n(jm40Var, 18.0f);
                    boolean z = (iIntValue24 & 112) == 32;
                    Object objP = fetVar19.P();
                    if (z || objP == ukd.f35823a) {
                        objP = new lya(nc90Var, (byte) 28);
                        fetVar19.o0(objP);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarN3, (Function1) objP);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar19.T);
                    bh90 bh90VarM = fetVar19.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar19, mm40VarK);
                    mkd.c0.getClass();
                    fetVar19.i0();
                    if (fetVar19.S) {
                        fetVar19.l(e7z.u1);
                    } else {
                        fetVar19.r0();
                    }
                    jpm0.o(fetVar19, tj30VarC, gqw0.x);
                    jpm0.o(fetVar19, bh90VarM, gqw0.w);
                    jpm0.o(fetVar19, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar19);
                    jpm0.o(fetVar19, mm40VarC0, gqw0.v);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    dc90 dc90Var = (dc90) nc90Var;
                    String strA = dc90Var.a();
                    pz40 pz40Var9 = s6t0.f31722a;
                    y9q0 y9q0Var = new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109);
                    if (dc90Var instanceof wb90) {
                        secondary = s6t0.b().f33626a.getTextPrimary();
                    } else {
                        if (!(dc90Var instanceof yb90)) {
                            t9f.b();
                            return null;
                        }
                        secondary = s6t0.b().f33626a.getSecondary();
                    }
                    v8q0.a(strA, mm40VarD, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var, fetVar19, 48, 0, 130040);
                    fetVar19.r(true);
                    fetVar19.r(false);
                } else {
                    if (!(nc90Var instanceof ic90)) {
                        throw b1j.f(639941411, fetVar19, false);
                    }
                    fetVar19.e0(-1635351326);
                    zcl zclVar10 = qmk.f28987a;
                    j0x.b(iom0.r(jpm0.t(((ic90) nc90Var).f14525a, 6, fetVar19), fetVar19), null, o7k0.n(jm40Var, 18.0f), null, null, 0.0f, null, fetVar19, 56, 120);
                    fetVar19.r(false);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                mc90 mc90Var = (mc90) obj2;
                fet fetVar20 = (fet) obj3;
                int iIntValue25 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                mc90Var.getClass();
                if ((iIntValue25 & 48) == 0) {
                    iIntValue25 |= fetVar20.g(mc90Var) ? 32 : 16;
                }
                if (!fetVar20.U(iIntValue25 & 1, (iIntValue25 & 145) != 144)) {
                    fetVar20.X();
                } else if (mc90Var instanceof cc90) {
                    fetVar20.e0(-1864626556);
                    zcl zclVar11 = qmk.f28987a;
                    mm40 mm40VarN4 = o7k0.n(jm40Var, 20.0f);
                    boolean z2 = (iIntValue25 & 112) == 32;
                    Object objP2 = fetVar20.P();
                    if (z2 || objP2 == ukd.f35823a) {
                        objP2 = new lya(mc90Var, (byte) 29);
                        fetVar20.o0(objP2);
                    }
                    mm40 mm40VarK2 = rq8.K(mm40VarN4, (Function1) objP2);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar20.T);
                    bh90 bh90VarM2 = fetVar20.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar20, mm40VarK2);
                    mkd.c0.getClass();
                    fetVar20.i0();
                    if (fetVar20.S) {
                        fetVar20.l(e7z.u1);
                    } else {
                        fetVar20.r0();
                    }
                    jpm0.o(fetVar20, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar20, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar20, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar20);
                    jpm0.o(fetVar20, mm40VarC1, gqw0.v);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    cc90 cc90Var = (cc90) mc90Var;
                    String strA2 = cc90Var.a();
                    pz40 pz40Var10 = s6t0.f31722a;
                    y9q0 y9q0Var2 = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                    if (cc90Var instanceof xb90) {
                        jM127getWhite300d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                    } else {
                        if (!(cc90Var instanceof zb90)) {
                            t9f.b();
                            return null;
                        }
                        jM127getWhite300d7_KjU = StaticColors.INSTANCE.m127getWhite300d7_KjU();
                    }
                    v8q0.a(strA2, mm40VarD2, jM127getWhite300d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var2, fetVar20, 48, 0, 130040);
                    fetVar20.r(true);
                    fetVar20.r(false);
                } else {
                    if (!(mc90Var instanceof hc90)) {
                        throw b1j.f(1879511641, fetVar20, false);
                    }
                    fetVar20.e0(-1863226100);
                    zcl zclVar12 = qmk.f28987a;
                    j0x.b(iom0.r(jpm0.t(((hc90) mc90Var).f12810a, 6, fetVar20), fetVar20), null, o7k0.n(jm40Var, 20.0f), null, null, 0.0f, null, fetVar20, 56, 120);
                    fetVar20.r(false);
                }
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                fet fetVar21 = (fet) obj3;
                int iIntValue26 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar21.U(iIntValue26 & 1, (iIntValue26 & 129) != 128)) {
                    zcl zclVar13 = qmk.f28987a;
                    tdc.k(o7k0.s(jm40Var, 324.0f), k0l0.f17474a, fetVar21, 48);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                fet fetVar22 = (fet) obj3;
                int iIntValue27 = ((Integer) obj4).intValue();
                ((k8z) obj).getClass();
                if (fetVar22.U(iIntValue27 & 1, (iIntValue27 & 129) != 128)) {
                    zcl zclVar14 = qmk.f28987a;
                    zq8.a(0, fetVar22, xbc.c0(lgb.J(o7k0.e(o7k0.s(jm40Var, 324.0f), 64.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar22, 0, 1)));
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).intValue();
                fet fetVar23 = (fet) obj3;
                int iIntValue28 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar23.U(iIntValue28 & 1, (iIntValue28 & 129) != 128)) {
                    i4w0.A(0, fetVar23);
                } else {
                    fetVar23.X();
                }
                return Unit.f46060a;
            case 23:
                return a(obj, obj2, obj3, obj4);
            case 24:
                ((Integer) obj2).getClass();
                fet fetVar24 = (fet) obj3;
                int iIntValue29 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar24.U(iIntValue29 & 1, (iIntValue29 & 129) != 128)) {
                    p8a.E(0, fetVar24, null);
                } else {
                    fetVar24.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return b(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return c(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return g(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return h(obj, obj2, obj3, obj4);
            default:
                ((Integer) obj2).getClass();
                fet fetVar25 = (fet) obj3;
                int iIntValue30 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar25.U(iIntValue30 & 1, (iIntValue30 & 129) != 128)) {
                    zcl zclVar15 = qmk.f28987a;
                    zq8.a(0, fetVar25, xbc.c0(lgb.J(o7k0.p(jm40Var, 64.0f, 32.0f), vgg0.a(14.0f)), vbc.d0(null, fetVar25, 0, 1)));
                } else {
                    fetVar25.X();
                }
                return Unit.f46060a;
        }
    }
}
