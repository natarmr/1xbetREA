package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zs70 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44894a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ zs70(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f44894a = b;
        this.c = l7m0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44894a;
        cl5 cl5Var = ukd.f35823a;
        boolean z = false;
        Function1 function1 = this.b;
        l7m0 l7m0Var = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n7x.a(((iu70) l7m0Var.getValue()).f, u1c.M(1493875375, new dqz(l7m0Var, function1, (byte) 6), fetVar), fetVar);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40.b, 48.0f);
                    boolean zG = fetVar2.g(function1);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new ma70(function1, (byte) 7);
                        fetVar2.o0(objP);
                    }
                    q5x.p(mm40VarN, null, null, (Function0) objP, ((iu70) l7m0Var.getValue()).t, ((iu70) l7m0Var.getValue()).b, fetVar2, 0, 38);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objP2 = fetVar3.P();
                    if (objP2 == cl5Var) {
                        objP2 = dw9.j(fetVar3);
                    }
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarI = hp4.I(o7k0.d(s5x0.N(jm40.b, 0.0f, 28.0f, 0.0f, 0.0f, 13), 1.0f), (gy40) objP2, false);
                    String str = ((iu70) l7m0Var.getValue()).o;
                    if (((iu70) l7m0Var.getValue()).k && !((iu70) l7m0Var.getValue()).m) {
                        z = true;
                    }
                    boolean zG2 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new i160(function1, (byte) 17);
                        fetVar3.o0(objP3);
                    }
                    efx.b(mm40VarI, str, z, (Function1) objP3, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tc50 tc50Var = (tc50) l7m0Var.getValue();
                    boolean zG3 = fetVar4.g(function1);
                    Object objP4 = fetVar4.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new i160(function1, (byte) 26);
                        fetVar4.o0(objP4);
                    }
                    vtb.v(null, (Function1) objP4, tc50Var, fetVar4, 0, 9);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                kc5.s0(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                kc5.i0(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                m8x.r(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                o2e.H(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                x8f.H(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                saj.F(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                qjj.F(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                eeq.A(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                eeq.B(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                eeq.p(l7m0Var, function1, (fet) obj, x8x.L(7));
                break;
            case 14:
                ((Integer) obj2).getClass();
                vdx.q(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                cjx.z(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                knx.E(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ahy.H(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 18:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fpb0 fpb0Var = (fpb0) ((l7m0) l7m0Var.getValue()).getValue();
                    if (fpb0Var instanceof epb0) {
                        fetVar5.e0(1996635205);
                        mtl mtlVar = new mtl(((epb0) fpb0Var).f8178a);
                        boolean zG4 = fetVar5.g(function1);
                        Object objP5 = fetVar5.P();
                        if (zG4 || objP5 == cl5Var) {
                            objP5 = new rpa0(function1, (byte) 14);
                            fetVar5.o0(objP5);
                        }
                        bkb.f(null, mtlVar, null, false, null, (Function1) objP5, fetVar5, 0, 29);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(2004087786);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(1575268006, new zs70(function1, l7m0Var, (byte) 18), fetVar6), fetVar6, 56);
                } else {
                    fetVar6.X();
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                e1c0.e(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                e1c0.d(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                f1t0.C(l7m0Var, function1, (fet) obj, x8x.L(7));
                break;
            case 23:
                ((Integer) obj2).getClass();
                phu0.w(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                i4w0.F(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                vbw0.G(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                hmw0.P(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                cfx0.s(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                aad.x(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                dwi0.v(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zs70(l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f44894a = b;
        this.c = l7m0Var;
        this.b = function1;
    }

    public /* synthetic */ zs70(Function1 function1, l7m0 l7m0Var, byte b) {
        this.f44894a = b;
        this.b = function1;
        this.c = l7m0Var;
    }
}
