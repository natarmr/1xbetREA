package a;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kqh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18724a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kqh0(Object obj, Object obj2, byte b) {
        this.f18724a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0467  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Object value;
        byte b = this.f18724a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj2).booleanValue();
                ((Function1) obj4).invoke((gqh0) obj3);
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                k9x.u((eqh0) obj4, (mm40) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                zvw.t((mm40) obj4, (jzh0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                cww.l((mm40) obj4, (uzh0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                e8i0 e8i0Var = (e8i0) obj4;
                Throwable th = (Throwable) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                String strA = e8i0Var.p.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0));
                if (th instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th;
                    if (CollectionsKt.L(f8i0.f9106a, zhi0Var.c) || zhi0Var.f44396a == i2o.Forbidden.getErrorCode()) {
                        String message = th.getMessage();
                        str = message != null ? message : "";
                        if (!StringsKt.W(str)) {
                            strA = str;
                        }
                    }
                }
                e8i0Var.G(new z7i0(strA));
                return Unit.f46060a;
            case 5:
                rzg0 rzg0Var = (rzg0) obj3;
                obj2.getClass();
                rzg0Var.getClass();
                lun.f20680a.getClass();
                Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
                new uzg0(bundleV, rzg0Var).C((v950) obj4, obj2);
                return bundleV;
            case 6:
                wli0 wli0Var = (wli0) obj4;
                Throwable th2 = (Throwable) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = wli0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wli0Var.f.getClass();
                } while (!p7m0Var.m(value, sli0.a((sli0) value, false, false, false, false, null, 0, 0, 253)));
                String strA2 = wli0Var.p.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0));
                if (th2 instanceof zhi0) {
                    zhi0 zhi0Var2 = (zhi0) th2;
                    if (CollectionsKt.L(xli0.f41075a, zhi0Var2.c) || zhi0Var2.f44396a == i2o.Forbidden.getErrorCode()) {
                        String message2 = th2.getMessage();
                        str = message2 != null ? message2 : "";
                        if (!StringsKt.W(str)) {
                            strA2 = str;
                        }
                        wli0Var.G(new qli0(strA2));
                    } else {
                        wli0Var.G(new pli0(strA2));
                    }
                } else {
                    wli0Var.G(new pli0(strA2));
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                vbw0.u((mm40) obj4, (oui0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                vbw0.g((mm40) obj4, (uf5) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                l7x.m((mm40) obj4, (jvi0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                l7x.l((mm40) obj4, (kvi0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                l7x.g((mm40) obj4, (gvi0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                l7x.f((mm40) obj4, (fvi0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                l7x.r((mm40) obj4, (mvi0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                dwi0.A((qfj0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                r7x.l((Function1) obj4, (hzi0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                b8k0.p((pzi0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                ucx.I((z8j0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                xdx.r((zdj0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                zdx.p((ehj0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                tfx.m((xhj0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                k3t0 k3t0Var = (k3t0) obj4;
                l7m0 l7m0Var = (l7m0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
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
                    zfn zfnVar = zaq0.b;
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(xsm0.s(R.string.share_app_title, fetVar), ha50.TWO_LINES, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), false, null);
                    boolean zI = fetVar.i(k3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new dbh(k3t0Var, (byte) 21);
                        fetVar.o0(objP);
                    }
                    hlm.c(jm40Var2, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 805306374, 54, 500);
                    if (((wlj0) l7m0Var.getValue()).b) {
                        fetVar.e0(-1061751094);
                        mm40 mm40VarQ = i120.Q(jm40Var2, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarK = s5x0.K(mm40VarQ, xfn.a(fetVar).d, 8.0f);
                        a4x a4xVar = ((wlj0) l7m0Var.getValue()).d;
                        dxh0 dxh0Var = ((wlj0) l7m0Var.getValue()).c;
                        boolean zG = fetVar.g(l7m0Var);
                        Object objP2 = fetVar.P();
                        if (zG || objP2 == cl5Var) {
                            objP2 = new f7f0(l7m0Var, (byte) 11);
                            fetVar.o0(objP2);
                        }
                        Function0 function0 = (Function0) objP2;
                        boolean zG2 = fetVar.g(l7m0Var) | fetVar.i(k3t0Var);
                        Object objP3 = fetVar.P();
                        if (zG2 || objP3 == cl5Var) {
                            objP3 = new dj60(l7m0Var, k3t0Var, b2);
                            fetVar.o0(objP3);
                        }
                        ibc.n(mm40VarK, a4xVar, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP3, fetVar, 384, 16);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1060853923);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                pzw.q((mm40) obj4, (e900) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                n6x.f((mm40) obj4, (qrj0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                d7x.n((mm40) obj4, (rrj0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                g7x.o((mm40) obj4, (srj0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                k7x.t((mm40) obj4, (trj0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                q8x.s((zvj0) obj3, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                h5a0 h5a0Var = (h5a0) obj4;
                w6n w6nVar = (w6n) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    u6n u6nVarB = m2x.B(h5a0Var.a(), w6nVar, fetVar2);
                    mm40 mm40VarK0 = mrv.k0(jm40Var, "LOGO");
                    boolean zG3 = fetVar2.g(u6nVarB);
                    Object objP4 = fetVar2.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new m2m(u6nVarB, (byte) 1);
                        fetVar2.o0(objP4);
                    }
                    kkb.p(0, fetVar2, mm40VarK0, (Function0) objP4);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                i5a0 i5a0Var = (i5a0) obj4;
                w6n w6nVar2 = (w6n) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    u6n u6nVarJ = n2x.J(i5a0Var.a(), w6nVar2, fetVar3);
                    mm40 mm40VarK1 = mrv.k0(jm40Var, "LOGO");
                    boolean zG4 = fetVar3.g(u6nVarJ);
                    Object objP5 = fetVar3.P();
                    if (zG4 || objP5 == cl5Var) {
                        objP5 = new m2m(u6nVarJ, (byte) 1);
                        fetVar3.o0(objP5);
                    }
                    kkb.p(0, fetVar3, mm40VarK1, (Function0) objP5);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kqh0(Object obj, Object obj2, int i, byte b) {
        this.f18724a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ kqh0(Object obj, Function1 function1, int i, byte b) {
        this.f18724a = b;
        this.c = obj;
        this.b = function1;
    }
}
