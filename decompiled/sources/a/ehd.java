package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ehd implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7801a;

    public /* synthetic */ ehd(byte b) {
        this.f7801a = b;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        pz40 pz40Var = s6t0.f31722a;
        mm40 mm40Var = (mm40) obj;
        ym6 ym6Var = (ym6) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        mm40Var.getClass();
        ym6Var.getClass();
        String str = ym6Var.d;
        boolean z = ym6Var.e;
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? fetVar.g(ym6Var) : fetVar.i(ym6Var) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.u(mm40Var, 36.0f, 0.0f, 2), 36.0f);
            long primary20 = z ? s6t0.b().f33626a.getPrimary20() : s6t0.b().f33626a.getBackground();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE, primary20, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 4.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(ym6Var.c, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, z ? g1t0.d() : g1t0.g(), fetVar, 0, 0, 131066);
            fet fetVar2 = fetVar;
            if (str.length() > 0) {
                fetVar2.e0(-1080642347);
                v8q0.a(str, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.h(), fetVar2, 0, 24576, 114682);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1080400578);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        pz40 pz40Var = s6t0.f31722a;
        mm40 mm40Var = (mm40) obj;
        ym6 ym6Var = (ym6) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        mm40Var.getClass();
        ym6Var.getClass();
        String str = ym6Var.d;
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? fetVar.g(ym6Var) : fetVar.i(ym6Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.u(mm40Var, 36.0f, 0.0f, 2), 36.0f);
            boolean z = (i & 112) == 32 || ((i & 64) != 0 && fetVar.i(ym6Var));
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ghd(ym6Var, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarL = rq8.L(mm40VarE, (Function1) objP);
            long primary20 = ym6Var.e ? s6t0.b().f33626a.getPrimary20() : StaticColors.INSTANCE.m121getTransparent0d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarL, primary20, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 4.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(ym6Var.c, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131066);
            fet fetVar2 = fetVar;
            if (str.length() > 0) {
                fetVar2.e0(-2082208231);
                v8q0.a(str, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.h(), fetVar2, 0, 24576, 114682);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2081966462);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        pz40 pz40Var = s6t0.f31722a;
        mm40 mm40Var = (mm40) obj;
        ym6 ym6Var = (ym6) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        mm40Var.getClass();
        ym6Var.getClass();
        String str = ym6Var.d;
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? fetVar.g(ym6Var) : fetVar.i(ym6Var) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.u(mm40Var, 36.0f, 0.0f, 2), 36.0f);
            boolean z = ym6Var.e;
            long primary20 = z ? s6t0.b().f33626a.getPrimary20() : s6t0.b().f33626a.getBackground();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE, primary20, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 4.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(ym6Var.c, null, z ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, z ? g1t0.d() : g1t0.g(), fetVar, 0, 0, 131066);
            fet fetVar2 = fetVar;
            if (str.length() > 0) {
                fetVar2.e0(514958687);
                v8q0.a(str, null, z ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.h(), fetVar2, 0, 24576, 114682);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(515248506);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mm40 mm40Var = (mm40) obj;
        rs20 rs20Var = (rs20) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        mm40Var.getClass();
        rs20Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? fetVar.g(rs20Var) : fetVar.i(rs20Var) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 6.0f, 0.0f, 2);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            cww.k(mm40Var, e9x.M(staticColors.m62getBlack0d7_KjU(), staticColors.m123getWhite0d7_KjU(), rs20Var, mm40VarL), q7x.y(rs20Var, staticColors.m62getBlack0d7_KjU(), staticColors.m123getWhite0d7_KjU(), g1t0.m(), g1t0.n()), null, fetVar, i & 14, 8);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int iIntValue = ((Integer) obj).intValue();
        l7m0 l7m0Var = (l7m0) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        l7m0Var.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.e(iIntValue) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            i6x i6xVar = i6x.f14263a;
            zcl zclVar = qmk.f28987a;
            int i2 = i << 6;
            zq8.a(0, fetVar, n6x.w0(new g6x(), iIntValue, l7m0Var, fetVar, (i2 & 7168) | (i2 & 896) | 6));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mm40 mm40Var = (mm40) obj;
        rwm0 rwm0Var = (rwm0) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        mm40Var.getClass();
        rwm0Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? fetVar.g(rwm0Var) : fetVar.i(rwm0Var) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            cww.k(mm40Var, null, r7x.z(rwm0Var, staticColors.m123getWhite0d7_KjU(), staticColors.m130getWhite600d7_KjU(), g1t0.d(), g1t0.g()), ckb.R(rwm0Var), fetVar, i & 14, 2);
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
        byte b = this.f7801a;
        Function0 function0 = e7z.u1;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    aac.m(0, fetVar);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    zcl zclVar = qmk.f28987a;
                    jcb.e(o7k0.s(jm40Var, 160.0f), n9n.f23149a, null, null, null, fetVar2, 48, 28);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 128.0f), 188.0f);
                    zcl zclVar3 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar3, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), vbc.d0(null, fetVar3, 0, 1)));
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                String str = (String) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                str.getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar4.g(str) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    zcl zclVar4 = qmk.f28987a;
                    v8q0.a(str, s5x0.L(jm40Var, 0.0f, 8.0f, 1), ((ThemeColors) fetVar4.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar4, (iIntValue4 >> 3) & 14, 24960, 109560);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                String str2 = (String) obj2;
                fet fetVar5 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                str2.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= fetVar5.g(str2) ? 32 : 16;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 8.0f, 1);
                    y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                    pz40 pz40Var = s6t0.f31722a;
                    v8q0.a(str2, mm40VarL, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar5, (iIntValue5 >> 3) & 14, 24960, 109560);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 129) != 128)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40VarD, 66.0f);
                    zcl zclVar7 = qmk.i;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    qxw.o(fetVar6, xbc.c0(h97.e(zclVar7, zclVar7, zclVar7, zclVar7, mm40VarE2), vbc.d0(null, fetVar6, 0, 1)));
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                mm40 mm40Var = (mm40) obj;
                xcz xczVar = (xcz) obj2;
                fet fetVar7 = (fet) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                mm40Var.getClass();
                xczVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    i = iIntValue7 | (fetVar7.g(mm40Var) ? 4 : 2);
                } else {
                    i = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i |= fetVar7.g(xczVar) ? 32 : 16;
                }
                if (fetVar7.U(i & 1, (i & 147) != 146)) {
                    o050.i(mm40Var, xczVar, fetVar7, i & 126);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar8 = (fet) obj3;
                int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                if ((iD & 48) == 0) {
                    iD |= fetVar8.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar8.U(iD & 1, (iD & 145) != 144)) {
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    zx7 zx7Var = gqw0.e;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM = fetVar8.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar8, mm40VarN);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(function0);
                    } else {
                        fetVar8.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar8, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar8, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar8, numValueOf, shdVar3);
                    jpm0.n(fetVar8);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar8, mm40VarC0, shdVar4);
                    mm40 mm40VarE3 = o7k0.e(o7k0.s(jm40Var, 148.0f), 12.0f);
                    zcl zclVar9 = qmk.m;
                    ugg0 ugg0Var3 = vgg0.f37379a;
                    dw9.x(h97.e(zclVar9, zclVar9, zclVar9, zclVar9, mm40VarE3), vbc.d0(null, fetVar8, 0, 1), fetVar8, 0, true);
                    mm40 mm40VarN2 = s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM2 = fetVar8.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar8, mm40VarN2);
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(function0);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, tj30VarC2, shdVar);
                    jpm0.o(fetVar8, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar8, shdVar3, fetVar8);
                    jpm0.o(fetVar8, mm40VarC1, shdVar4);
                    dw9.x(h97.e(zclVar9, zclVar9, zclVar9, zclVar9, o7k0.e(o7k0.s(jm40Var, 120.0f), 12.0f)), vbc.d0(null, fetVar8, 0, 1), fetVar8, 0, true);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar9 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, (y5d) obj, mm40Var3);
                if ((iD2 & 48) == 0) {
                    iD2 |= fetVar9.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar9.U(iD2 & 1, (iD2 & 145) != 144)) {
                    zcl zclVar10 = qmk.f28987a;
                    mm40 mm40VarL2 = s5x0.L(mm40Var3, 0.0f, 8.0f, 1);
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar9, 48);
                    int iHashCode3 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM3 = fetVar9.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar9, mm40VarL2);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(function0);
                    } else {
                        fetVar9.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar9, thg0VarA, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar9, bh90VarM3, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar9, numValueOf2, shdVar7);
                    jpm0.n(fetVar9);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar9, mm40VarC2, shdVar8);
                    zhg0 zhg0Var = zhg0.f44392a;
                    uzb.L(0, fetVar9, zhg0Var.a(1.0f, jm40Var, true));
                    mm40 mm40VarE4 = o7k0.e(o7k0.s(zhg0Var.b(gqw0.j, jm40Var), 80.0f), 48.0f);
                    tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                    int iHashCode4 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM4 = fetVar9.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar9, mm40VarE4);
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(function0);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, tj30VarC3, shdVar5);
                    jpm0.o(fetVar9, bh90VarM4, shdVar6);
                    vqd.u(iHashCode4, fetVar9, shdVar7, fetVar9);
                    jpm0.o(fetVar9, mm40VarC3, shdVar8);
                    mm40 mm40VarE5 = o7k0.e(o7k0.s(jm40Var, 40.0f), 12.0f);
                    zcl zclVar11 = qmk.m;
                    ugg0 ugg0Var4 = vgg0.f37379a;
                    dw9.x(h97.e(zclVar11, zclVar11, zclVar11, zclVar11, mm40VarE5), vbc.d0(null, fetVar9, 0, 1), fetVar9, 0, true);
                    uzb.L(0, fetVar9, zhg0Var.a(1.0f, jm40Var, true));
                    fetVar9.r(true);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                mm40 mm40Var4 = (mm40) obj2;
                fet fetVar10 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, (y5d) obj, mm40Var4);
                if ((iD3 & 48) == 0) {
                    iD3 |= fetVar10.g(mm40Var4) ? 32 : 16;
                }
                if (fetVar10.U(iD3 & 1, (iD3 & 145) != 144)) {
                    zcl zclVar12 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    tj30 tj30VarC4 = zq8.c(gqw0.e, false);
                    int iHashCode5 = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM5 = fetVar10.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar10, mm40VarN3);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(function0);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, tj30VarC4, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC4, gqw0.v);
                    mm40 mm40VarE6 = o7k0.e(o7k0.s(jm40Var, 180.0f), 12.0f);
                    zcl zclVar13 = qmk.m;
                    ugg0 ugg0Var5 = vgg0.f37379a;
                    dw9.x(h97.e(zclVar13, zclVar13, zclVar13, zclVar13, mm40VarE6), vbc.d0(null, fetVar10, 0, 1), fetVar10, 0, true);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                mm40 mm40Var5 = (mm40) obj;
                xdr xdrVar = (xdr) obj2;
                fet fetVar11 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                mm40Var5.getClass();
                xdrVar.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i2 = iIntValue8 | (fetVar11.g(mm40Var5) ? 4 : 2);
                } else {
                    i2 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i2 |= fetVar11.i(xdrVar) ? 32 : 16;
                }
                if (fetVar11.U(i2 & 1, (i2 & 147) != 146)) {
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar11, 48);
                    int iHashCode6 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM6 = fetVar11.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar11, mm40Var5);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(function0);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar11);
                    w6x.v(i2 & 112, xdrVar, o7k0.w(ohs0.i(fetVar11, mm40VarC5, gqw0.v, 1.0f, true), null, false, 3), fetVar11, true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                mm40 mm40Var6 = (mm40) obj;
                xdr xdrVar2 = (xdr) obj2;
                fet fetVar12 = (fet) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                mm40Var6.getClass();
                xdrVar2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i3 = iIntValue9 | (fetVar12.g(mm40Var6) ? 4 : 2);
                } else {
                    i3 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i3 |= fetVar12.i(xdrVar2) ? 32 : 16;
                }
                if (fetVar12.U(i3 & 1, (i3 & 147) != 146)) {
                    zcl zclVar14 = qmk.f28987a;
                    mm40 mm40VarE7 = o7k0.e(mm40Var6, 100.0f);
                    thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.k, fetVar12, 48);
                    int iHashCode7 = Long.hashCode(fetVar12.T);
                    bh90 bh90VarM7 = fetVar12.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar12, mm40VarE7);
                    mkd.c0.getClass();
                    fetVar12.i0();
                    if (fetVar12.S) {
                        fetVar12.l(function0);
                    } else {
                        fetVar12.r0();
                    }
                    jpm0.o(fetVar12, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar12, bh90VarM7, gqw0.w);
                    jpm0.o(fetVar12, Integer.valueOf(iHashCode7), gqw0.y);
                    jpm0.n(fetVar12);
                    xdrVar2.F(ohs0.i(fetVar12, mm40VarC6, gqw0.v, 1.0f, true), fetVar12, Integer.valueOf(i3 & 112));
                    fetVar12.r(true);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                nqr nqrVar = (nqr) obj2;
                fet fetVar13 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= (iIntValue10 & 64) == 0 ? fetVar13.g(nqrVar) : fetVar13.i(nqrVar) ? 32 : 16;
                }
                if (!fetVar13.U(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    fetVar13.X();
                } else if (nqrVar == null) {
                    fetVar13.e0(49475374);
                    fetVar13.r(false);
                } else {
                    fetVar13.e0(49475375);
                    kr00.a(u1c.M(345384785, new gup((Object) nqrVar, o7k0.d(jm40Var, 1.0f), (byte) 19), fetVar13), fetVar13, 6);
                    fetVar13.r(false);
                }
                return Unit.f46060a;
            case 13:
                mm40 mm40Var7 = (mm40) obj;
                xcz xczVar2 = (xcz) obj2;
                fet fetVar14 = (fet) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                mm40Var7.getClass();
                xczVar2.getClass();
                if ((iIntValue11 & 6) == 0) {
                    i4 = iIntValue11 | (fetVar14.g(mm40Var7) ? 4 : 2);
                } else {
                    i4 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i4 |= fetVar14.g(xczVar2) ? 32 : 16;
                }
                if (fetVar14.U(i4 & 1, (i4 & 147) != 146)) {
                    j120.k(mm40Var7, xczVar2, fetVar14, i4 & 126);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                mm40 mm40Var8 = (mm40) obj;
                xcz xczVar3 = (xcz) obj2;
                fet fetVar15 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                mm40Var8.getClass();
                xczVar3.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i5 = iIntValue12 | (fetVar15.g(mm40Var8) ? 4 : 2);
                } else {
                    i5 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i5 |= fetVar15.g(xczVar3) ? 32 : 16;
                }
                if (fetVar15.U(i5 & 1, (i5 & 147) != 146)) {
                    j120.k(mm40Var8, xczVar3, fetVar15, i5 & 126);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 15:
                mm40 mm40Var9 = (mm40) obj2;
                fet fetVar16 = (fet) obj3;
                int iD4 = dw9.d((Integer) obj4, (y5d) obj, mm40Var9);
                if ((iD4 & 48) == 0) {
                    iD4 |= fetVar16.g(mm40Var9) ? 32 : 16;
                }
                if (fetVar16.U(iD4 & 1, (iD4 & 145) != 144)) {
                    zcl zclVar15 = qmk.f28987a;
                    zq8.a(0, fetVar16, o7k0.e(mm40Var9, 8.0f));
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 16:
                fet fetVar17 = (fet) obj3;
                int iD5 = dw9.d((Integer) obj4, (y5d) obj, (mm40) obj2);
                if (!fetVar17.U(iD5 & 1, (iD5 & 129) != 128)) {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                fet fetVar18 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar18.U(iIntValue13 & 1, (iIntValue13 & 129) != 128)) {
                    tke.H(0, fetVar18, null);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                fet fetVar19 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar19.U(iIntValue14 & 1, (iIntValue14 & 129) != 128)) {
                    x8f.M(0, fetVar19, null);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                fet fetVar20 = (fet) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar20.U(iIntValue15 & 1, (iIntValue15 & 129) != 128)) {
                    saj.J(0, fetVar20, null);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                fet fetVar21 = (fet) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar21.U(iIntValue16 & 1, (iIntValue16 & 129) != 128)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar16 = qmk.f28987a;
                    mm40 mm40VarE8 = o7k0.e(mm40VarD2, 76.0f);
                    zcl zclVar17 = qmk.g;
                    ugg0 ugg0Var6 = vgg0.f37379a;
                    zq8.a(0, fetVar21, xbc.c0(h97.e(zclVar17, zclVar17, zclVar17, zclVar17, mm40VarE8), vbc.d0(null, fetVar21, 0, 1)));
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case 21:
                pz40 pz40Var2 = s6t0.f31722a;
                mm40 mm40Var10 = (mm40) obj;
                ym6 ym6Var = (ym6) obj2;
                fet fetVar22 = (fet) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                mm40Var10.getClass();
                ym6Var.getClass();
                String str3 = ym6Var.d;
                boolean z = ym6Var.e;
                if ((iIntValue17 & 6) == 0) {
                    i6 = iIntValue17 | (fetVar22.g(mm40Var10) ? 4 : 2);
                } else {
                    i6 = iIntValue17;
                }
                if ((iIntValue17 & 48) == 0) {
                    i6 |= (iIntValue17 & 64) == 0 ? fetVar22.g(ym6Var) : fetVar22.i(ym6Var) ? 32 : 16;
                }
                if (fetVar22.U(i6 & 1, (i6 & 147) != 146)) {
                    zcl zclVar18 = qmk.f28987a;
                    mm40 mm40VarE9 = o7k0.e(o7k0.u(mm40Var10, 36.0f, 0.0f, 2), 36.0f);
                    long primary20 = z ? s6t0.b().f33626a.getPrimary20() : s6t0.b().f33626a.getBackground();
                    zcl zclVar19 = qmk.g;
                    ugg0 ugg0Var7 = vgg0.f37379a;
                    mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE9, primary20, new ugg0(zclVar19, zclVar19, zclVar19, zclVar19)), 8.0f, 4.0f);
                    x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar22, 48);
                    int iHashCode8 = Long.hashCode(fetVar22.T);
                    bh90 bh90VarM8 = fetVar22.m();
                    mm40 mm40VarC7 = kbc.c0(fetVar22, mm40VarK);
                    mkd.c0.getClass();
                    fetVar22.i0();
                    if (fetVar22.S) {
                        fetVar22.l(function0);
                    } else {
                        fetVar22.r0();
                    }
                    jpm0.o(fetVar22, x5dVarA, gqw0.x);
                    jpm0.o(fetVar22, bh90VarM8, gqw0.w);
                    jpm0.o(fetVar22, Integer.valueOf(iHashCode8), gqw0.y);
                    jpm0.n(fetVar22);
                    jpm0.o(fetVar22, mm40VarC7, gqw0.v);
                    v8q0.a(ym6Var.c, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, z ? g1t0.d() : g1t0.g(), fetVar22, 0, 0, 131066);
                    if (str3.length() > 0) {
                        fetVar22.e0(-2085425615);
                        v8q0.a(str3, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.h(), fetVar22, 0, 24576, 114682);
                        fetVar22.r(false);
                    } else {
                        fetVar22.e0(-2085183846);
                        fetVar22.r(false);
                    }
                    fetVar22.r(true);
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
            case 22:
                return a(obj, obj2, obj3, obj4);
            case 23:
                return b(obj, obj2, obj3, obj4);
            case 24:
                return c(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue18 = ((Integer) obj).intValue();
                l7m0 l7m0Var = (l7m0) obj2;
                fet fetVar23 = (fet) obj3;
                int iIntValue19 = ((Integer) obj4).intValue();
                l7m0Var.getClass();
                if ((iIntValue19 & 6) == 0) {
                    i7 = iIntValue19 | (fetVar23.e(iIntValue18) ? 4 : 2);
                } else {
                    i7 = iIntValue19;
                }
                if ((iIntValue19 & 48) == 0) {
                    i7 |= fetVar23.g(l7m0Var) ? 32 : 16;
                }
                if (fetVar23.U(i7 & 1, (i7 & 147) != 146)) {
                    zcl zclVar20 = qmk.f28987a;
                    int i9 = y3d.h;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    int i10 = i7 << 6;
                    zq8.a(0, fetVar23, n6x.p(new e6x(staticColors.m123getWhite0d7_KjU(), staticColors.m126getWhite200d7_KjU()), iIntValue18, l7m0Var, fetVar23, (i10 & 7168) | (i10 & 896) | 6));
                } else {
                    fetVar23.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return g(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return h(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return i(obj, obj2, obj3, obj4);
            default:
                int iIntValue20 = ((Integer) obj).intValue();
                l7m0 l7m0Var2 = (l7m0) obj2;
                fet fetVar24 = (fet) obj3;
                int iIntValue21 = ((Integer) obj4).intValue();
                l7m0Var2.getClass();
                if ((iIntValue21 & 6) == 0) {
                    i8 = iIntValue21 | (fetVar24.e(iIntValue20) ? 4 : 2);
                } else {
                    i8 = iIntValue21;
                }
                if ((iIntValue21 & 48) == 0) {
                    i8 |= fetVar24.g(l7m0Var2) ? 32 : 16;
                }
                if (fetVar24.U(i8 & 1, (i8 & 147) != 146)) {
                    zcl zclVar21 = qmk.f28987a;
                    int i11 = y3d.h;
                    pz40 pz40Var3 = s6t0.f31722a;
                    int i12 = i8 << 6;
                    zq8.a(0, fetVar24, n6x.p(new e6x(s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getBackground()), iIntValue20, l7m0Var2, fetVar24, (i12 & 7168) | (i12 & 896) | 6));
                } else {
                    fetVar24.X();
                }
                return Unit.f46060a;
        }
    }
}
