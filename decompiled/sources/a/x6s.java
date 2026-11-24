package a;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeVideoEvent;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x6s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40379a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ x6s(Function1 function1, int i) {
        this.f40379a = (byte) 15;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40379a;
        pcy pcyVar = e7z.u1;
        fa50 fa50Var = fa50.f9191a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new m6s(((Boolean) obj2).booleanValue(), ((Long) obj).longValue()));
                return Unit.f46060a;
            case 1:
                function1.invoke(new lis(((Boolean) obj2).booleanValue(), ((Long) obj).longValue()));
                return Unit.f46060a;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ch00 ch00Var = (ch00) obj2;
                ch00Var.getClass();
                function1.invoke(new kis(zBooleanValue, ch00Var));
                return Unit.f46060a;
            case 3:
                String str = (String) obj;
                long jLongValue = ((Long) obj2).longValue();
                str.getClass();
                function1.invoke(new ylr(str, jLongValue));
                return Unit.f46060a;
            case 4:
                String str2 = (String) obj;
                long jLongValue2 = ((Long) obj2).longValue();
                str2.getClass();
                function1.invoke(new ylr(str2, jLongValue2));
                return Unit.f46060a;
            case 5:
                Bundle bundle = (Bundle) obj2;
                ((String) obj).getClass();
                bundle.getClass();
                BroadcastingLandscapeVideoEvent broadcastingLandscapeVideoEvent = (BroadcastingLandscapeVideoEvent) (Build.VERSION.SDK_INT <= 33 ? bundle.getParcelable("KEY_LANDSCAPE_VIDEO_REQUEST") : (Parcelable) bundle.getParcelable("KEY_LANDSCAPE_VIDEO_REQUEST", BroadcastingLandscapeVideoEvent.class));
                if (broadcastingLandscapeVideoEvent != null) {
                    function1.invoke(new sss(broadcastingLandscapeVideoEvent));
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                return (pgv) function1.invoke((x8z) obj);
            case 7:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zfn zfnVar = zaq0.b;
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(xsm0.s(R.string.choose_date_period_title, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50Var), fmm.f9790a, qcc.S(R.attr.uikitBackgroundContent, fetVar), true, null);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new xwy(function1, (byte) 20);
                        fetVar.o0(objP);
                    }
                    hlm.c(jm40.b, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 805306374, 54, 500);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarW = o050.W(jm40Var);
                    zfn zfnVar2 = zaq0.b;
                    imm immVar2 = new imm(new ilm(((ThemeColors) fetVar2.k(zfnVar2)).getSecondary()), new plm(xsm0.s(R.string.choose_date_period_title, fetVar2), ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), fa50Var), fmm.f9790a, ((ThemeColors) fetVar2.k(zfnVar2)).getBackgroundContent(), true, null);
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new xwy(function1, (byte) 23);
                        fetVar2.o0(objP2);
                    }
                    hlm.c(mm40VarW, immVar2, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar2, 805306368, 54, 500);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 9:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarW2 = o050.W(jm40Var);
                    zfn zfnVar3 = zaq0.b;
                    imm immVar3 = new imm(new ilm(((ThemeColors) fetVar3.k(zfnVar3)).getSecondary()), new plm(xsm0.s(R.string.choose_date_period_title, fetVar3), ((ThemeColors) fetVar3.k(zfnVar3)).getSecondary(), fa50Var), fmm.f9790a, ((ThemeColors) fetVar3.k(zfnVar3)).getBackgroundContent(), true, null);
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new xwy(function1, (byte) 26);
                        fetVar3.o0(objP3);
                    }
                    hlm.c(mm40VarW2, immVar3, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar3, 805306368, 54, 500);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 10:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zfn zfnVar4 = zaq0.b;
                    imm immVar4 = new imm(new ilm(((ThemeColors) fetVar4.k(zfnVar4)).getSecondary()), new plm(xsm0.s(R.string.limits_chose_reason, fetVar4), ((ThemeColors) fetVar4.k(zfnVar4)).getSecondary(), fa50Var), fmm.f9790a, qcc.S(R.attr.uikitBackgroundContent, fetVar4), true, null);
                    boolean zG4 = fetVar4.g(function1);
                    Object objP4 = fetVar4.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new xwy(function1, (byte) 27);
                        fetVar4.o0(objP4);
                    }
                    hlm.c(jm40.b, immVar4, null, (Function0) objP4, null, null, null, null, null, null, null, null, fetVar4, 805306374, 54, 500);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 11:
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
                    mm40 mm40VarW3 = o050.W(jm40Var);
                    zfn zfnVar5 = zaq0.b;
                    imm immVar5 = new imm(new ilm(((ThemeColors) fetVar5.k(zfnVar5)).getSecondary()), new plm(xsm0.s(R.string.limits, fetVar5), ha50.TWO_LINES, ((ThemeColors) fetVar5.k(zfnVar5)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar5.k(zfnVar5)).getBackgroundContent(), false, null);
                    boolean zG5 = fetVar5.g(function1);
                    Object objP5 = fetVar5.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new yqz(function1, (byte) 3);
                        fetVar5.o0(objP5);
                    }
                    hlm.c(mm40VarW3, immVar5, null, (Function0) objP5, null, null, null, null, null, null, null, null, fetVar5, 805306368, 54, 500);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 12:
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
                    mm40 mm40VarW4 = o050.W(jm40Var);
                    zfn zfnVar6 = zaq0.b;
                    imm immVar6 = new imm(new ilm(((ThemeColors) fetVar6.k(zfnVar6)).getSecondary()), new plm(xsm0.s(R.string.limits, fetVar6), ha50.TWO_LINES, ((ThemeColors) fetVar6.k(zfnVar6)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar6.k(zfnVar6)).getBackgroundContent(), false, null);
                    boolean zG6 = fetVar6.g(function1);
                    Object objP6 = fetVar6.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new yqz(function1, (byte) 13);
                        fetVar6.o0(objP6);
                    }
                    hlm.c(mm40VarW4, immVar6, null, (Function0) objP6, null, null, null, null, null, null, null, null, fetVar6, 805306368, 54, 500);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 13:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mm40 mm40VarW5 = o050.W(jm40Var);
                    imm immVar7 = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, ((ThemeColors) fetVar7.k(zaq0.b)).getBackgroundContent(), false, null);
                    boolean zG7 = fetVar7.g(function1);
                    Object objP7 = fetVar7.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new yqz(function1, (byte) 22);
                        fetVar7.o0(objP7);
                    }
                    hlm.c(mm40VarW5, immVar7, null, (Function0) objP7, null, null, null, null, null, null, null, u1c.M(-1316637692, new x6s(function1, (byte) 16), fetVar7), fetVar7, 805306368, 54, 500);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 14:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    fre0.h(function1, fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                fre0.h(function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zG8 = fetVar9.g(function1);
                    Object objP8 = fetVar9.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new yqz(function1, (byte) 17);
                        fetVar9.o0(objP8);
                    }
                    zvw.d((Function0) objP8, null, false, null, null, s5x0.c, fetVar9, 1572864, 62);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 17:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                function1.invoke(new rh40(str3, str4));
                return Unit.f46060a;
            case 18:
                function1.invoke(new go50(((Integer) obj).intValue(), ((Boolean) obj2).booleanValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new zp50(((Integer) obj).intValue(), (String) obj2));
                return Unit.f46060a;
            case 20:
                function1.invoke(new js50(((Integer) obj).intValue(), ((Boolean) obj2).booleanValue()));
                return Unit.f46060a;
            case 21:
                m9n m9nVar = (m9n) obj;
                m9nVar.getClass();
                function1.invoke(new se8(m9nVar.getId(), (String) obj2));
                return Unit.f46060a;
            case 22:
                m9n m9nVar2 = (m9n) obj;
                m9nVar2.getClass();
                function1.invoke(new lw60(m9nVar2.getId(), (String) obj2));
                return Unit.f46060a;
            case 23:
                m9n m9nVar3 = (m9n) obj;
                m9nVar3.getClass();
                function1.invoke(new gp60(m9nVar3.getId(), (String) obj2));
                return Unit.f46060a;
            case 24:
                r370 r370Var = (r370) obj;
                r370Var.getClass();
                function1.invoke(new txq0(new yv60(r370Var.f, r370Var.f29772a, r370Var.g, (String) obj2)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                r370 r370Var2 = (r370) obj;
                r370Var2.getClass();
                function1.invoke(new txq0(new yv60(r370Var2.f, r370Var2.f29772a, r370Var2.g, (String) obj2)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wim wimVar = (wim) obj;
                wimVar.getClass();
                function1.invoke(new uxq0(new c470(wimVar.f39221a, (String) obj2)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue10 = ((Integer) obj).intValue();
                md80 md80Var = (md80) obj2;
                md80Var.getClass();
                function1.invoke(new ahr0(iIntValue10, md80Var));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new zgr0(((Integer) obj).intValue(), ((Long) obj2).longValue()));
                return Unit.f46060a;
            default:
                function1.invoke(new ar80(((Integer) obj).intValue()));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ x6s(Function1 function1, byte b) {
        this.f40379a = b;
        this.b = function1;
    }
}
