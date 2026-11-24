package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nc40 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23274a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ nc40(Function1 function1, byte b) {
        this.f23274a = b;
        this.b = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f23274a;
        byte b2 = 9;
        byte b3 = 13;
        byte b4 = 5;
        jm40 jm40Var = jm40.b;
        byte b5 = 18;
        byte b6 = 2;
        cl5 cl5Var = ukd.f35823a;
        boolean z = true;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                p6t0 p6t0Var = (p6t0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                p6t0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(p6t0Var) ? 4 : 2;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.X();
                } else if (p6t0Var instanceof ub40) {
                    fetVar.e0(-623539816);
                    ma40 ma40Var = ((ub40) p6t0Var).b;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new rp30(function1, b4);
                        fetVar.o0(objP);
                    }
                    z1x.g(null, ma40Var, (Function1) objP, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-623275231);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 1:
                function1.invoke(new yn50(((Integer) obj).intValue(), ((Integer) obj2).intValue(), (String) obj3));
                return Unit.f46060a;
            case 2:
                function1.invoke(new ko50(((Integer) obj).intValue(), ((Integer) obj2).intValue(), (String) obj3));
                return Unit.f46060a;
            case 3:
                function1.invoke(new lo50(((Integer) obj).intValue(), ((Integer) obj2).intValue(), (String) obj3));
                return Unit.f46060a;
            case 4:
                function1.invoke(new xt50(((Integer) obj).intValue(), ((Integer) obj2).intValue(), (String) obj3));
                return Unit.f46060a;
            case 5:
                function1.invoke(new es50(((Integer) obj).intValue(), ((Integer) obj2).intValue(), (String) obj3));
                return Unit.f46060a;
            case 6:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarE0 = o2e.e0(jm40Var, "FLOATING_ACTION_BUTTON");
                    long primary = ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary();
                    long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new w250(function1, (byte) 25);
                        fetVar2.o0(objP2);
                    }
                    dmq.a((Function0) objP2, mm40VarE0, null, primary, jM123getWhite0d7_KjU, null, ntr.h, fetVar2, 12582960, 100);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 7:
                int iIntValue3 = ((Integer) obj).intValue();
                String str = (String) obj2;
                String str2 = (String) obj3;
                str.getClass();
                str2.getClass();
                function1.invoke(new f490(iIntValue3, str, str2));
                return Unit.f46060a;
            case 8:
                long jLongValue = ((Long) obj).longValue();
                String str3 = (String) obj2;
                ((Boolean) obj3).getClass();
                str3.getClass();
                function1.invoke(new wca0(jLongValue, str3));
                return Unit.f46060a;
            case 9:
                p6t0 p6t0Var2 = (p6t0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                p6t0Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar3.g(p6t0Var2) ? 4 : 2;
                }
                if (!fetVar3.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    fetVar3.X();
                } else if (p6t0Var2 instanceof ths0) {
                    fetVar3.e0(-571655857);
                    jpm0.h(o7k0.d(jm40Var, 1.0f), (ths0) p6t0Var2, fetVar3, ((iIntValue4 << 3) & 112) | 6);
                    fetVar3.r(false);
                } else if (p6t0Var2 instanceof ica0) {
                    fetVar3.e0(-571447847);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    ica0 ica0Var = (ica0) p6t0Var2;
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new nc40(function1, (byte) 8);
                        fetVar3.o0(objP3);
                    }
                    t9x.n(mm40VarD, ica0Var, (xdr) objP3, fetVar3, ((iIntValue4 << 3) & 112) | 6);
                    fetVar3.r(false);
                } else {
                    fetVar3.e0(-571110226);
                    fetVar3.r(false);
                }
                return Unit.f46060a;
            case 10:
                fet fetVar4 = (fet) obj2;
                ((Integer) obj3).getClass();
                fetVar4.e0(374375707);
                Object objP4 = fetVar4.P();
                if (objP4 == cl5Var) {
                    objP4 = new jpa0();
                    fetVar4.o0(objP4);
                }
                jpa0 jpa0Var = (jpa0) objP4;
                jpa0Var.b = function1;
                caz cazVar = jpa0Var.c;
                if (cazVar != null) {
                    cazVar.b = null;
                }
                jpa0Var.c = null;
                fetVar4.r(false);
                return jpa0Var;
            case 11:
                u4s u4sVar = (u4s) obj;
                ((Integer) obj2).getClass();
                u4sVar.getClass();
                function1.invoke(u4sVar);
                return Unit.f46060a;
            case 12:
                p6t0 p6t0Var3 = (p6t0) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                p6t0Var3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(p6t0Var3) ? 4 : 2;
                }
                if (!fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    fetVar5.X();
                } else if (p6t0Var3 instanceof c6e0) {
                    fetVar5.e0(-578781651);
                    ioh iohVar = ((c6e0) p6t0Var3).b;
                    boolean zG4 = fetVar5.g(function1);
                    Object objP5 = fetVar5.P();
                    if (zG4 || objP5 == cl5Var) {
                        objP5 = new dvd0(function1, b3);
                        fetVar5.o0(objP5);
                    }
                    dyb.j(iohVar, (Function1) objP5, null, fetVar5, 9);
                    fetVar5.r(false);
                } else {
                    fetVar5.e0(-578497846);
                    fetVar5.r(false);
                }
                return Unit.f46060a;
            case 13:
                long jLongValue2 = ((Long) obj).longValue();
                String str4 = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                str4.getClass();
                function1.invoke(new b6b(new iv20(str4, jLongValue2, zBooleanValue)));
                return Unit.f46060a;
            case 14:
                function1.invoke(new a6b(new f130(((Double) obj3).doubleValue(), ((Long) obj).longValue(), ((Long) obj2).longValue())));
                return Unit.f46060a;
            case 15:
                long jLongValue3 = ((Long) obj).longValue();
                String str5 = (String) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                str5.getClass();
                function1.invoke(new b6b(new iv20(str5, jLongValue3, zBooleanValue2)));
                return Unit.f46060a;
            case 16:
                long jLongValue4 = ((Long) obj).longValue();
                String str6 = (String) obj2;
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                str6.getClass();
                function1.invoke(new b6b(new jv20(str6, jLongValue4, zBooleanValue3)));
                return Unit.f46060a;
            case 17:
                p6t0 p6t0Var4 = (p6t0) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                p6t0Var4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(p6t0Var4) ? 4 : 2;
                }
                if (!fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    fetVar6.X();
                } else if (p6t0Var4 instanceof f7o0) {
                    fetVar6.e0(679747720);
                    f7o0 f7o0Var = (f7o0) p6t0Var4;
                    boolean zG5 = fetVar6.g(function1);
                    Object objP6 = fetVar6.P();
                    Object obj4 = objP6;
                    if (zG5 || objP6 == cl5Var) {
                        zbm0 zbm0Var = new zbm0(function1, b5);
                        fetVar6.o0(zbm0Var);
                        obj4 = zbm0Var;
                    }
                    Function1 function2 = (Function1) obj4;
                    function2.getClass();
                    x0g0 x0g0Var = f7o0Var.b;
                    boolean z2 = f7o0Var.c;
                    boolean zG6 = fetVar6.g(function2);
                    Object objP7 = fetVar6.P();
                    Object obj5 = objP7;
                    if (zG6 || objP7 == cl5Var) {
                        zbm0 zbm0Var2 = new zbm0(function2, (byte) 17);
                        fetVar6.o0(zbm0Var2);
                        obj5 = zbm0Var2;
                    }
                    plc.m(null, x0g0Var, z2, (Function1) obj5, fetVar6, 0, 1);
                    fetVar6.r(false);
                } else {
                    fetVar6.e0(680023837);
                    fetVar6.r(false);
                }
                return Unit.f46060a;
            case 18:
                long jLongValue5 = ((Long) obj).longValue();
                String str7 = (String) obj2;
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                str7.getClass();
                function1.invoke(new j8p0(str7, jLongValue5, zBooleanValue4));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                long jLongValue6 = ((Long) obj).longValue();
                String str8 = (String) obj2;
                ((Boolean) obj3).getClass();
                str8.getClass();
                function1.invoke(new nis0(jLongValue6, str8));
                return Unit.f46060a;
            case 20:
                p6t0 p6t0Var5 = (p6t0) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                p6t0Var5.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(p6t0Var5) ? 4 : 2;
                }
                if (!fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    fetVar7.X();
                } else if (p6t0Var5 instanceof hhs0) {
                    fetVar7.e0(-1621968959);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    edm edmVar = ((hhs0) p6t0Var5).b;
                    boolean zG7 = fetVar7.g(function1);
                    Object objP8 = fetVar7.P();
                    if (zG7 || objP8 == cl5Var) {
                        objP8 = new nc40(function1, (byte) 19);
                        fetVar7.o0(objP8);
                    }
                    xdr xdrVar = (xdr) objP8;
                    boolean zG8 = fetVar7.g(function1);
                    Object objP9 = fetVar7.P();
                    if (zG8 || objP9 == cl5Var) {
                        objP9 = new xar0(function1, b2);
                        fetVar7.o0(objP9);
                    }
                    agc.q(mm40VarD2, edmVar, xdrVar, (Function1) objP9, fetVar7, 6);
                    fetVar7.r(false);
                } else {
                    fetVar7.e0(-1621486227);
                    fetVar7.r(false);
                }
                return Unit.f46060a;
            case 21:
                hwe hweVar = (hwe) obj;
                zxj0 zxj0Var = (zxj0) obj2;
                m0k0 m0k0Var = (m0k0) obj3;
                hweVar.getClass();
                zxj0Var.getClass();
                m0k0Var.getClass();
                int iOrdinal = hweVar.ordinal();
                if (iOrdinal == 0) {
                    function1.invoke(new hid(zxj0Var, m0k0Var));
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    function1.invoke(new eid(zxj0Var, m0k0Var));
                }
                return Unit.f46060a;
            case 22:
                p6t0 p6t0Var6 = (p6t0) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                p6t0Var6.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(p6t0Var6) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    boolean z3 = p6t0Var6 instanceof bdt0;
                    jm40 jm40Var2 = jm40.b;
                    if (z3) {
                        fetVar8.e0(2076441736);
                        float f = xfn.a(fetVar8).c;
                        float f2 = xfn.a(fetVar8).c;
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40Var2, f, 0.0f, f2, 8.0f, 2);
                        bdt0 bdt0Var = (bdt0) p6t0Var6;
                        boolean zG9 = fetVar8.g(function1);
                        Object objP10 = fetVar8.P();
                        if (zG9 || objP10 == cl5Var) {
                            objP10 = new nas0(function1, (byte) 22);
                            fetVar8.o0(objP10);
                        }
                        wgm0.q(mm40VarN, bdt0Var, (Function0) objP10, fetVar8, (iIntValue8 << 3) & 112);
                        fetVar8.r(false);
                    } else if (p6t0Var6 instanceof bat0) {
                        fetVar8.e0(2076996915);
                        float f3 = xfn.a(fetVar8).c;
                        float f4 = xfn.a(fetVar8).c;
                        zcl zclVar2 = qmk.f28987a;
                        vtb.h(s5x0.N(jm40Var2, f3, 0.0f, f4, 8.0f, 2), ((bat0) p6t0Var6).b, fetVar8, 0);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(2077372015);
                        fetVar8.r(false);
                    }
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 23:
                p6t0 p6t0Var7 = (p6t0) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                p6t0Var7.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.g(p6t0Var7) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    fetVar9.X();
                } else if (p6t0Var7 instanceof hqu0) {
                    fetVar9.e0(-1699057789);
                    hqu0 hqu0Var = (hqu0) p6t0Var7;
                    boolean zG10 = fetVar9.g(function1) | ((iIntValue9 & 14) == 4);
                    Object objP11 = fetVar9.P();
                    if (zG10 != 0 || objP11 == cl5Var) {
                        objP11 = new vwj(function1, p6t0Var7, (byte) 10);
                        fetVar9.o0(objP11);
                    }
                    Function0 function0 = (Function0) objP11;
                    function0.getClass();
                    agc.r(o7k0.d(jm40Var, 1.0f), hqu0Var.c, function0, null, null, null, null, fetVar9, 0, 120);
                    fetVar9.r(false);
                } else if (p6t0Var7 instanceof gqu0) {
                    fetVar9.e0(-1699050055);
                    hfm0.q(6, fetVar9, o7k0.d(jm40Var, 1.0f));
                    fetVar9.r(false);
                } else {
                    fetVar9.e0(-1130883298);
                    fetVar9.r(false);
                }
                return Unit.f46060a;
            case 24:
                p6t0 p6t0Var8 = (p6t0) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                p6t0Var8.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(p6t0Var8) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    fetVar10.X();
                } else if (p6t0Var8 instanceof tru0) {
                    fetVar10.e0(-968179347);
                    tru0 tru0Var = (tru0) p6t0Var8;
                    boolean zG11 = fetVar10.g(function1) | ((iIntValue10 & 14) == 4);
                    Object objP12 = fetVar10.P();
                    if (zG11 != 0 || objP12 == cl5Var) {
                        objP12 = new vwj(function1, p6t0Var8, b3);
                        fetVar10.o0(objP12);
                    }
                    Function0 function3 = (Function0) objP12;
                    function3.getClass();
                    agc.r(o7k0.d(jm40Var, 1.0f), tru0Var.c, function3, null, null, null, null, fetVar10, 0, 120);
                    fetVar10.r(false);
                } else if (p6t0Var8 instanceof sru0) {
                    fetVar10.e0(-968171863);
                    ghm0.l(6, fetVar10, o7k0.d(jm40Var, 1.0f));
                    fetVar10.r(false);
                } else {
                    fetVar10.e0(51503213);
                    fetVar10.r(false);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                p6t0 p6t0Var9 = (p6t0) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                p6t0Var9.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(p6t0Var9) ? 4 : 2;
                }
                if (!fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    fetVar11.X();
                } else if (p6t0Var9 instanceof p7v0) {
                    fetVar11.e0(-1874933816);
                    ioh iohVar2 = ((p7v0) p6t0Var9).b;
                    boolean zG12 = fetVar11.g(function1);
                    Object objP13 = fetVar11.P();
                    if (zG12 || objP13 == cl5Var) {
                        objP13 = new szu0(function1, z ? (byte) 1 : (byte) 0);
                        fetVar11.o0(objP13);
                    }
                    dyb.j(iohVar2, null, (Function1) objP13, fetVar11, 5);
                    fetVar11.r(false);
                } else if (p6t0Var9 instanceof u7v0) {
                    fetVar11.e0(-1874610765);
                    moh mohVar = ((u7v0) p6t0Var9).b;
                    boolean zG13 = fetVar11.g(function1);
                    Object objP14 = fetVar11.P();
                    if (zG13 || objP14 == cl5Var) {
                        objP14 = new szu0(function1, b6);
                        fetVar11.o0(objP14);
                    }
                    qzb.j(null, mohVar, (Function1) objP14, fetVar11, 0);
                    fetVar11.r(false);
                } else {
                    fetVar11.e0(-1874344258);
                    fetVar11.r(false);
                }
                return Unit.f46060a;
            default:
                hwe hweVar2 = (hwe) obj;
                zxj0 zxj0Var2 = (zxj0) obj2;
                m0k0 m0k0Var2 = (m0k0) obj3;
                hweVar2.getClass();
                zxj0Var2.getClass();
                m0k0Var2.getClass();
                int iOrdinal2 = hweVar2.ordinal();
                if (iOrdinal2 == 0) {
                    function1.invoke(new ibv0(zxj0Var2, m0k0Var2));
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    function1.invoke(new gbv0(zxj0Var2, m0k0Var2));
                }
                return Unit.f46060a;
        }
    }
}
