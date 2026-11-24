package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s000 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31388a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ s000(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f31388a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31388a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        l7m0 l7m0Var = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                fre0.t(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                unh0.J(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 2:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    mm40 mm40VarW = o050.W(jm40Var);
                    zfn zfnVar = zaq0.b;
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(xsm0.s(R.string.limits, fetVar), ha50.TWO_LINES, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new yqz(function1, (byte) 26);
                        fetVar.o0(objP);
                    }
                    hlm.c(mm40VarW, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 805306368, 54, 500);
                    if (((h100) l7m0Var.getValue()).g.size() > 1) {
                        fetVar.e0(2089772242);
                        mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarK = s5x0.K(mm40VarQ, xfn.a(fetVar).d, 8.0f);
                        i4 i4Var = ((h100) l7m0Var.getValue()).g;
                        boolean zG2 = fetVar.g(l7m0Var);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new x000(l7m0Var, (byte) 0);
                            fetVar.o0(objP2);
                        }
                        Function0 function0 = (Function0) objP2;
                        boolean zG3 = fetVar.g(l7m0Var) | fetVar.g(function1);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new ys4(l7m0Var, function1, (byte) 17);
                            fetVar.o0(objP3);
                        }
                        ibc.o(mm40VarK, i4Var, gxh0.f12078a, false, function0, (Function1) objP3, fetVar, 384, 8);
                        mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(2090696724);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                unh0.p(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ccq0.A(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 5:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
                    jpm0.o(fetVar2, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    mm40 mm40VarW2 = o050.W(jm40Var);
                    imm immVar2 = ((r400) l7m0Var.getValue()).j;
                    boolean zG4 = fetVar2.g(function1);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new yqz(function1, (byte) 29);
                        fetVar2.o0(objP4);
                    }
                    hlm.c(mm40VarW2, immVar2, null, (Function0) objP4, null, null, null, null, null, null, null, null, fetVar2, 805306368, 54, 500);
                    if (((r400) l7m0Var.getValue()).g.size() <= 1 || ((r400) l7m0Var.getValue()).d) {
                        fetVar2.e0(-233006116);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-233811434);
                        mm40 mm40VarQ2 = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarK2 = s5x0.K(mm40VarQ2, xfn.a(fetVar2).d, 8.0f);
                        i4 i4Var2 = ((r400) l7m0Var.getValue()).g;
                        boolean zG5 = fetVar2.g(l7m0Var);
                        Object objP5 = fetVar2.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new x000(l7m0Var, (byte) 3);
                            fetVar2.o0(objP5);
                        }
                        Function0 function2 = (Function0) objP5;
                        boolean zG6 = fetVar2.g(l7m0Var) | fetVar2.g(function1);
                        Object objP6 = fetVar2.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new ys4(l7m0Var, function1, (byte) 18);
                            fetVar2.o0(objP6);
                        }
                        ibc.o(mm40VarK2, i4Var2, gxh0.f12078a, false, function2, (Function1) objP6, fetVar2, 384, 8);
                        mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ccq0.m(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                idx.c(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                cwr0.u(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                cwr0.v(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                nnw0.q(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                m0x0.y(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                m0x0.y(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                km10.f(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                aad.s(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                aad.r(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                azw.j(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                azw.i(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                q5x.j(l7m0Var, function1, (fet) obj, x8x.L(7));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                zgc.z(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                zgc.D(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                d7x.d(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                tke.E(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                q5x.n(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                xia0.L(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                ohq0.J(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                jiq0.N(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                    imm immVar3 = ((vx60) l7m0Var.getValue()).a().f4145a;
                    boolean zG7 = fetVar3.g(function1);
                    Object objP7 = fetVar3.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new ju60(function1, (byte) 7);
                        fetVar3.o0(objP7);
                    }
                    hlm.c(mm40VarY, immVar3, null, (Function0) objP7, null, null, null, null, null, null, null, null, fetVar3, 6, 0, 4084);
                } else {
                    fetVar3.X();
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                k7x.k(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            default:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 48.0f);
                    boolean zG8 = fetVar4.g(function1);
                    Object objP8 = fetVar4.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new ma70(function1, (byte) 6);
                        fetVar4.o0(objP8);
                    }
                    q5x.p(mm40VarN, null, null, (Function0) objP8, ((iu70) l7m0Var.getValue()).s, ((iu70) l7m0Var.getValue()).f15383a, fetVar4, 196608, 6);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ s000(l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f31388a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    public /* synthetic */ s000(Function1 function1, l7m0 l7m0Var, byte b) {
        this.f31388a = b;
        this.c = function1;
        this.b = l7m0Var;
    }
}
