package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.presentation.dialog.bet_summary.BetsSummaryInfoUiModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t87 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33500a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t87(Object obj, Object obj2, byte b) {
        this.f33500a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        fet fetVar;
        fet fetVar2;
        byte b = this.f33500a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Unit unit = null;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ql5 ql5Var = (ql5) obj4;
                return i77.a((i77) obj2, true, false, false, ql5Var, ql5Var.k, null, null, false, null, null, false, false, false, null, iun.f15405a, null, null, false, null, true, false, false, null, null, new HashMap(), (i4) obj3, null, -17301586, 2041);
            case 1:
                ((Integer) obj2).getClass();
                j47.O((mm40) obj4, (tc7) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                j47.X((mm40) obj4, (gln) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 3:
                de7 de7Var = (de7) obj4;
                ao6 ao6Var = (ao6) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarF = androidx.compose.runtime.e.f(de7Var.m, fetVar3);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    gil0 gil0Var = new gil0(0, null, null, new zgl0(), 7);
                    boolean zG = fetVar3.g(de7Var) | fetVar3.g(ao6Var);
                    Object objP = fetVar3.P();
                    if (zG || objP == cl5Var) {
                        objP = new qo5(de7Var, ao6Var, (byte) 28);
                        fetVar3.o0(objP);
                    }
                    vfc.q(mm40VarD, pz40VarF, gil0Var, (Function1) objP, null, fetVar3, 6, 16);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                xj7 xj7Var = (xj7) obj4;
                tj7 tj7Var = (tj7) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                gl5 gl5Var = tj7.t2;
                if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(((wj7) xj7Var).f), true, false, false);
                    boolean zI = fetVar4.i(tj7Var);
                    Object objP2 = fetVar4.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new qj7(tj7Var, (byte) 1);
                        fetVar4.o0(objP2);
                    }
                    qzb.n(mm40VarD2, wulVar, (Function0) objP2, fetVar4, 6, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ntr.l((mm40) obj4, (ik7) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                tn8 tn8Var = (tn8) obj4;
                mm40 mm40Var = (mm40) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                yk5 yk5Var = au7.U1;
                if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (tn8Var.a()) {
                        fetVar5.e0(-855426288);
                        ntb.e(0, 0, fetVar5, mm40Var);
                    } else {
                        fetVar5.e0(-855425148);
                        ntb.e(0, 1, fetVar5, null);
                    }
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 7:
                au7 au7Var = (au7) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                yk5 yk5Var2 = au7.U1;
                if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    xi70 xi70Var = au7Var.P1;
                    if (xi70Var == null) {
                        Intrinsics.h("playerMarketsFactory");
                        throw null;
                    }
                    xi70Var.a(au7Var, function1, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ccq0.c((mm40) obj4, (BetsSummaryInfoUiModel) obj3, (fet) obj, x8x.L(71));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                bsr0.f((a4x) obj4, (a4x) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                unh0.g((c58) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                m2o m2oVar = (m2o) obj4;
                cb8 cb8Var = (cb8) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dj8.k(m2oVar.c, m2oVar.d, cb8Var, m2oVar.k, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                ohq0.l((id8) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                jiq0.e((id8) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                y9a.i((mm40) obj4, (bh8) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                lf8 lf8Var = (lf8) obj4;
                Throwable th = (Throwable) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                if ((th2 instanceof SocketTimeoutException) || (th2 instanceof ConnectException) || (th2 instanceof UnknownHostException) || (th2 instanceof zhi0) || (th2 instanceof vub0)) {
                    lf8Var.Q();
                } else if (th2 instanceof sq60) {
                    p7m0 p7m0Var = lf8Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        lf8Var.f.getClass();
                    } while (!p7m0Var.m(value, df8.a((df8) value, false, false, true, null, null, null, 114)));
                    lf8Var.S();
                } else {
                    th.printStackTrace();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                mrv.q((mm40) obj4, (eh8) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                dyb.Q(new vk8((Function1) obj4, ((Integer) obj).intValue(), (jh8) obj3, (String) obj2, (byte) 0));
                return Unit.f46060a;
            case 18:
                mm40 mm40Var2 = (mm40) obj4;
                ao8 ao8Var = (ao8) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    mm40 mm40VarD3 = o7k0.d(mm40Var2, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD3, 32.0f);
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar8, 48);
                    int iHashCode = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM = fetVar8.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar8, mm40VarE);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar8, thg0VarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar8, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar8, numValueOf, shdVar3);
                    jpm0.n(fetVar8);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar8, mm40VarC0, shdVar4);
                    zx7 zx7Var = gqw0.e;
                    mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM2 = fetVar8.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar8, mm40VarC);
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, tj30VarC, shdVar);
                    jpm0.o(fetVar8, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar8, shdVar3, fetVar8);
                    jpm0.o(fetVar8, mm40VarC1, shdVar4);
                    j83 j83Var = ao8Var.f1190a;
                    if (j83Var == null) {
                        fetVar8.e0(-1756099699);
                        fetVar8.r(false);
                        fetVar = fetVar8;
                    } else {
                        fetVar8.e0(-1756099698);
                        mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                        ((g1t0) fetVar8.k(j1t0.e)).getClass();
                        v8q0.b(j83Var, mm40VarY, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, g1t0.g(), fetVar8, 48, 0, 261112);
                        fetVar = fetVar8;
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    v8q0.a(ao8Var.b, new x7z(1.0f, true), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110584);
                    ohq0.m(0, fetVar, null, ao8Var.c);
                    fetVar.r(true);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                mm40 mm40Var3 = (mm40) obj4;
                bo8 bo8Var = (bo8) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mm40 mm40VarD4 = o7k0.d(mm40Var3, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40VarD4, 32.0f);
                    thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar9, 48);
                    int iHashCode3 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM3 = fetVar9.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar9, mm40VarE2);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(pcyVar);
                    } else {
                        fetVar9.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar9, thg0VarA2, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar9, bh90VarM3, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar9, numValueOf2, shdVar7);
                    jpm0.n(fetVar9);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar9, mm40VarC2, shdVar8);
                    zx7 zx7Var2 = gqw0.e;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarC3 = o7k0.c(jm40Var2, 1.0f);
                    tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                    int iHashCode4 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM4 = fetVar9.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar9, mm40VarC3);
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(pcyVar);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, tj30VarC2, shdVar5);
                    jpm0.o(fetVar9, bh90VarM4, shdVar6);
                    vqd.u(iHashCode4, fetVar9, shdVar7, fetVar9);
                    jpm0.o(fetVar9, mm40VarC4, shdVar8);
                    j83 j83Var2 = bo8Var.f2920a;
                    if (j83Var2 == null) {
                        fetVar9.e0(1323329562);
                        fetVar9.r(false);
                        fetVar2 = fetVar9;
                    } else {
                        fetVar9.e0(1323329563);
                        mm40 mm40VarY2 = o7k0.y(jm40Var2, null, 3);
                        ((g1t0) fetVar9.k(j1t0.e)).getClass();
                        v8q0.b(j83Var2, mm40VarY2, StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, g1t0.g(), fetVar9, 48, 0, 261112);
                        fetVar2 = fetVar9;
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    x7z x7zVar = new x7z(1.0f, true);
                    String str = bo8Var.b;
                    y9q0 y9q0VarG = g1t0.g();
                    zfn zfnVar = m8m0.f21378a;
                    v8q0.a(str, x7zVar, ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarG, fetVar2, 0, 24960, 110584);
                    qal0 qal0Var = bo8Var.c;
                    if (qal0Var == null) {
                        fetVar2.e0(1752258318);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1752258319);
                        thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                        int iHashCode5 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM5 = fetVar2.m();
                        mm40 mm40VarC5 = kbc.c0(fetVar2, jm40Var2);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA3, shdVar5);
                        jpm0.o(fetVar2, bh90VarM5, shdVar6);
                        vqd.u(iHashCode5, fetVar2, shdVar7, fetVar2);
                        jpm0.o(fetVar2, mm40VarC5, shdVar8);
                        v8q0.a(ohs0.n(qal0Var.f28401a, Separators.SP), null, ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar2, 0, 0, 131066);
                        String str2 = qal0Var.b;
                        if (str2 == null) {
                            fetVar2.e0(-914978881);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-914978880);
                            v8q0.a(str2.concat(Separators.COLON), null, ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar2, 0, 0, 131066);
                            fetVar2.r(false);
                        }
                        String str3 = qal0Var.c;
                        if (str3 == null) {
                            fetVar2.e0(-914662309);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-914662308);
                            v8q0.a(str3.concat(Separators.COLON), null, ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar2, 0, 0, 131066);
                            fetVar2.r(false);
                        }
                        String str4 = qal0Var.d;
                        if (str4 == null) {
                            fetVar2.e0(-914342203);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-914342202);
                            v8q0.a(str4, null, ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar2, 0, 0, 131066);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        fetVar2.r(false);
                        unit = Unit.f46060a;
                    }
                    if (unit == null) {
                        fetVar2.e0(1753486291);
                        v8q0.a(bo8Var.d, jm40Var2, ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar2, 48, 0, 131064);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1303450259);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                epv0.f((mm40) obj4, (bln) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                i4w0.i((mm40) obj4, (cln) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                return ((tj30) obj4).b(c5n0Var, c5n0Var.k(Unit.f46060a, new ugd(-431986394, true, new t87((ugd) obj3, new lr8(c5n0Var, p4eVar.f26347a), (byte) 23))), p4eVar.f26347a);
            case 23:
                ugd ugdVar = (ugd) obj4;
                lr8 lr8Var = (lr8) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ugdVar.F(lr8Var, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                j2e.k((mm40) obj4, (i4) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                ay3.n((fxf) obj4, (Function1) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                phu0.g((mm40) obj4, (rr9) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                x8f.W((mm40) obj4, (taa) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                j47.P((mm40) obj4, (lda) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ro4.m((mm40) obj4, (uh90) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ t87(Object obj, Object obj2, int i, byte b) {
        this.f33500a = b;
        this.b = obj;
        this.c = obj2;
    }
}
