package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p7y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26529a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ p7y(Function1 function1, l7m0 l7m0Var) {
        this.f26529a = (byte) 22;
        this.c = function1;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26529a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                y9a.E(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                qjj.y(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                qjj.x(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                eeq.y(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                y860.A(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                y860.P(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                y860.r(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                gq80.A(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 8:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gq80.l(((voz) l7m0Var.getValue()).b, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                gq80.n(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                wha0.u(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 11:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    wha0.i(((ppz) l7m0Var.getValue()).b, function1, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                wha0.j(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                nia0.J(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 14:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nia0.p(((kqz) l7m0Var.getValue()).b, function1, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                nia0.t(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                xia0.D(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 17:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    xia0.l(((frz) l7m0Var.getValue()).b, function1, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                xia0.q(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                oja0.D(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                oja0.r(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ffb0.v(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 22:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, jm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                    mm40 mm40VarW = o050.W(jm40Var);
                    zfn zfnVar = zaq0.b;
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar5.k(zfnVar)).getSecondary()), new plm(xsm0.s(R.string.limits, fetVar5), ha50.TWO_LINES, ((ThemeColors) fetVar5.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar5.k(zfnVar)).getBackgroundContent(), false, null);
                    boolean zG = fetVar5.g(function1);
                    Object objP = fetVar5.P();
                    if (zG || objP == cl5Var) {
                        objP = new yqz(function1, (byte) 9);
                        fetVar5.o0(objP);
                    }
                    hlm.c(mm40VarW, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar5, 805306368, 54, 500);
                    if (((jvz) l7m0Var.getValue()).g.size() > 1) {
                        fetVar5.e0(-804779312);
                        mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar5.k(zfnVar)).getBackgroundContent(), jd8.n);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarK = s5x0.K(mm40VarQ, xfn.a(fetVar5).d, 8.0f);
                        i4 i4Var = ((jvz) l7m0Var.getValue()).g;
                        boolean zG2 = fetVar5.g(l7m0Var);
                        Object objP2 = fetVar5.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new ziw(l7m0Var, (byte) 25);
                            fetVar5.o0(objP2);
                        }
                        Function0 function0 = (Function0) objP2;
                        boolean zG3 = fetVar5.g(l7m0Var) | fetVar5.g(function1);
                        Object objP3 = fetVar5.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new ys4(l7m0Var, function1, (byte) 14);
                            fetVar5.o0(objP3);
                        }
                        ibc.o(mm40VarK, i4Var, gxh0.f12078a, false, function0, (Function1) objP3, fetVar5, 384, 8);
                        mbc.o(zfi0.f44303a, null, false, fetVar5, 6, 6);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-803945164);
                        fetVar5.r(false);
                    }
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                ffb0.n(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ro4.I(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar6, 0);
                    int iHashCode2 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM2 = fetVar6.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar6, jm40Var);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                    mm40 mm40VarW2 = o050.W(jm40Var);
                    imm immVar2 = ((xwz) l7m0Var.getValue()).j;
                    boolean zG4 = fetVar6.g(function1);
                    Object objP4 = fetVar6.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new yqz(function1, (byte) 12);
                        fetVar6.o0(objP4);
                    }
                    hlm.c(mm40VarW2, immVar2, null, (Function0) objP4, null, null, null, null, null, null, null, null, fetVar6, 805306368, 54, 500);
                    if (((xwz) l7m0Var.getValue()).g.size() <= 1 || ((xwz) l7m0Var.getValue()).d) {
                        fetVar6.e0(-206054382);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(-206859700);
                        mm40 mm40VarQ2 = i120.Q(jm40Var, ((ThemeColors) fetVar6.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarK2 = s5x0.K(mm40VarQ2, xfn.a(fetVar6).d, 8.0f);
                        i4 i4Var2 = ((xwz) l7m0Var.getValue()).g;
                        boolean zG5 = fetVar6.g(l7m0Var);
                        Object objP5 = fetVar6.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new ziw(l7m0Var, (byte) 27);
                            fetVar6.o0(objP5);
                        }
                        Function0 function2 = (Function0) objP5;
                        boolean zG6 = fetVar6.g(l7m0Var) | fetVar6.g(function1);
                        Object objP6 = fetVar6.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new ys4(l7m0Var, function1, (byte) 15);
                            fetVar6.o0(objP6);
                        }
                        ibc.o(mm40VarK2, i4Var2, gxh0.f12078a, false, function2, (Function1) objP6, fetVar6, 384, 8);
                        mbc.o(zfi0.f44303a, null, false, fetVar6, 6, 6);
                        fetVar6.r(false);
                    }
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ro4.t(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                x4d0.H(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                x4d0.t(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                fre0.E(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ p7y(l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f26529a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    public /* synthetic */ p7y(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f26529a = b;
        this.b = l7m0Var;
        this.c = function1;
    }
}
