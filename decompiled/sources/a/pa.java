package a;

import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.alerts_pipe_api.presentation.AlertsPipeType;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class pa extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(boolean z, nyq0 nyq0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        this.j = z;
        this.k = nyq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new pa(obj2, yjeVar, (byte) 0);
            case 1:
                pa paVar = new pa(obj2, yjeVar, (byte) 1);
                paVar.j = ((Boolean) obj).booleanValue();
                return paVar;
            case 2:
                pa paVar2 = new pa(obj2, yjeVar, (byte) 2);
                paVar2.j = ((Boolean) obj).booleanValue();
                return paVar2;
            case 3:
                return new pa(obj2, yjeVar, (byte) 3);
            case 4:
                pa paVar3 = new pa(obj2, yjeVar, (byte) 4);
                paVar3.j = ((Boolean) obj).booleanValue();
                return paVar3;
            case 5:
                pa paVar4 = new pa(obj2, yjeVar, (byte) 5);
                paVar4.j = ((Boolean) obj).booleanValue();
                return paVar4;
            case 6:
                pa paVar5 = new pa(obj2, yjeVar, (byte) 6);
                paVar5.j = ((Boolean) obj).booleanValue();
                return paVar5;
            case 7:
                pa paVar6 = new pa(obj2, yjeVar, (byte) 7);
                paVar6.j = ((Boolean) obj).booleanValue();
                return paVar6;
            case 8:
                pa paVar7 = new pa(obj2, yjeVar, (byte) 8);
                paVar7.j = ((Boolean) obj).booleanValue();
                return paVar7;
            case 9:
                return new pa(obj2, yjeVar, (byte) 9);
            case 10:
                return new pa(obj2, yjeVar, (byte) 10);
            case 11:
                return new pa(this.j, (nyq0) obj2, yjeVar);
            case 12:
                pa paVar8 = new pa(obj2, yjeVar, (byte) 12);
                paVar8.j = ((Boolean) obj).booleanValue();
                return paVar8;
            case 13:
                return new pa(obj2, yjeVar, (byte) 13);
            case 14:
                return new pa(obj2, yjeVar, (byte) 14);
            case 15:
                pa paVar9 = new pa(obj2, yjeVar, (byte) 15);
                paVar9.j = ((Boolean) obj).booleanValue();
                return paVar9;
            case 16:
                pa paVar10 = new pa(obj2, yjeVar, (byte) 16);
                paVar10.j = ((Boolean) obj).booleanValue();
                return paVar10;
            case 17:
                pa paVar11 = new pa(obj2, yjeVar, (byte) 17);
                paVar11.j = ((Boolean) obj).booleanValue();
                return paVar11;
            case 18:
                pa paVar12 = new pa(obj2, yjeVar, (byte) 18);
                paVar12.j = ((Boolean) obj).booleanValue();
                return paVar12;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new pa(obj2, yjeVar, (byte) 19);
            case 20:
                return new pa(obj2, yjeVar, (byte) 20);
            case 21:
                pa paVar13 = new pa(obj2, yjeVar, (byte) 21);
                paVar13.j = ((Boolean) obj).booleanValue();
                return paVar13;
            case 22:
                pa paVar14 = new pa(obj2, yjeVar, (byte) 22);
                paVar14.j = ((Boolean) obj).booleanValue();
                return paVar14;
            case 23:
                pa paVar15 = new pa(obj2, yjeVar, (byte) 23);
                paVar15.j = ((Boolean) obj).booleanValue();
                return paVar15;
            case 24:
                pa paVar16 = new pa(obj2, yjeVar, (byte) 24);
                paVar16.j = ((Boolean) obj).booleanValue();
                return paVar16;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                pa paVar17 = new pa(obj2, yjeVar, (byte) 25);
                paVar17.j = ((Boolean) obj).booleanValue();
                return paVar17;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                pa paVar18 = new pa(obj2, yjeVar, (byte) 26);
                paVar18.j = ((Boolean) obj).booleanValue();
                return paVar18;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                pa paVar19 = new pa(obj2, yjeVar, (byte) 27);
                paVar19.j = ((Boolean) obj).booleanValue();
                return paVar19;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                pa paVar20 = new pa(obj2, yjeVar, (byte) 28);
                paVar20.j = ((Boolean) obj).booleanValue();
                return paVar20;
            default:
                pa paVar21 = new pa(obj2, yjeVar, (byte) 29);
                paVar21.j = ((Boolean) obj).booleanValue();
                return paVar21;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pa) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((pa) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((pa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((pa) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((pa) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((pa) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((pa) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((pa) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((pa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((pa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((pa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((pa) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((pa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((pa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((pa) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((pa) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((pa) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((pa) create(bool12, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((pa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((pa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                return ((pa) create(bool13, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                Boolean bool14 = (Boolean) obj;
                bool14.booleanValue();
                return ((pa) create(bool14, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                Boolean bool15 = (Boolean) obj;
                bool15.booleanValue();
                return ((pa) create(bool15, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                Boolean bool16 = (Boolean) obj;
                bool16.booleanValue();
                return ((pa) create(bool16, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool17 = (Boolean) obj;
                bool17.booleanValue();
                return ((pa) create(bool17, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Boolean bool18 = (Boolean) obj;
                bool18.booleanValue();
                return ((pa) create(bool18, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool19 = (Boolean) obj;
                bool19.booleanValue();
                return ((pa) create(bool19, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Boolean bool20 = (Boolean) obj;
                bool20.booleanValue();
                return ((pa) create(bool20, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool21 = (Boolean) obj;
                bool21.booleanValue();
                return ((pa) create(bool21, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Object value;
        Object value2;
        Object objN;
        Object objE;
        Object value3;
        Object objE2;
        Object value4;
        List<Fragment> listP;
        Object value5;
        Object value6;
        bby bbyVar;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        Object value12;
        Object value13;
        Object value14;
        byte b = this.i;
        byte b2 = 8;
        byte b3 = 0;
        byte b4 = 2;
        yje yjeVar = null;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                ab abVar = (ab) obj2;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    u8u u8uVar = abVar.W;
                    this.j = true;
                    objV = u8uVar.v(this);
                    if (objV == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objV = obj;
                }
                abVar.y.d(new k1(abVar, (gx10) objV, b2));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jdk0 jdk0Var = nd.S1;
                ((nd) obj2).G0().b.setFirstButtonEnabled(z2);
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ((qd) obj2).l = z3;
                return Unit.f46060a;
            case 3:
                rl rlVar = (rl) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    p7m0 p7m0Var = rlVar.f30673a.u;
                    pd pdVar = new pd(b4, yjeVar, b4);
                    this.j = true;
                    if (ntb.L(p7m0Var, pdVar, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                rlVar.d.d();
                return Unit.f46060a;
            case 4:
                qn qnVar = (qn) obj2;
                boolean z5 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (z5) {
                    int i = qn.w;
                    e3c.n(qnVar.v);
                    qnVar.v = i3t0.K(qnVar, null, null, new pn(qnVar, yjeVar, b3), 3);
                }
                int i2 = qn.w;
                p7m0 p7m0Var2 = qnVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, ln.a((ln) value, z5, null, false, null, 14)));
                return Unit.f46060a;
            case 5:
                boolean z6 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = ((pv) obj2).o;
                do {
                    value2 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value2, jv.a((jv) value2, false, null, null, false, z6, null, 47)));
                return Unit.f46060a;
            case 6:
                boolean z7 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                jdk0 jdk0Var2 = mz.V1;
                ((mz) obj2).G0().c.setFirstButtonEnabled(z7);
                return Unit.f46060a;
            case 7:
                boolean z8 = this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                ((g00) obj2).D = z8;
                return Unit.f46060a;
            case 8:
                f20 f20Var = (f20) obj2;
                boolean z9 = this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (z9 && !f20Var.C) {
                    f20Var.A();
                } else if (!z9 && (f20Var.A.getValue() instanceof z10)) {
                    f20Var.y(f20Var.E);
                }
                f20Var.C = z9;
                return Unit.f46060a;
            case 9:
                yb0 yb0Var = (yb0) obj2;
                p7m0 p7m0Var4 = yb0Var.h;
                ol60 ol60Var = yb0Var.g;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    tzi tziVar = yb0Var.d;
                    this.j = true;
                    objN = tziVar.n(this);
                    if (objN == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN = obj;
                }
                qb0 qb0Var = (qb0) objN;
                yb0Var.e.l(bm5.e, qb0Var.f28422a);
                int iOrdinal = qb0Var.b.ordinal();
                if (iOrdinal == 0) {
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, wb0.f38852a);
                } else if (iOrdinal == 1) {
                    yb0Var.f.a(true);
                    ol60Var.f(sb0.f31907a);
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, vb0.f37115a);
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    ol60Var.f(tb0.f33637a);
                }
                return Unit.f46060a;
            case 10:
                oe0 oe0Var = (oe0) obj2;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    ouu ouuVar = oe0Var.o;
                    this.j = true;
                    objE = ouuVar.E(this);
                    if (objE == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                boolean zBooleanValue = ((Boolean) objE).booleanValue();
                int i3 = oe0.I;
                p7m0 p7m0Var5 = oe0Var.i.f25029a;
                do {
                    value3 = p7m0Var5.getValue();
                    value3.getClass();
                } while (!p7m0Var5.m(value3, wd0.a((wd0) value3, new sd0(zBooleanValue), null, null, 14)));
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                if (this.j) {
                    ((nyq0) obj2).getState().c(0.0f);
                }
                return Unit.f46060a;
            case 12:
                gs0 gs0Var = (gs0) obj2;
                boolean z12 = this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                if (z12 && (((ur0) gs0Var.D()).b instanceof t5q)) {
                    gs0Var.N(true);
                }
                if (z12 && (((ur0) gs0Var.D()).c instanceof plk0)) {
                    gs0Var.P(true);
                }
                if (z12 && (((ur0) gs0Var.D()).d instanceof w5d0)) {
                    gs0Var.O(true);
                }
                return Unit.f46060a;
            case 13:
                tw0 tw0Var = (tw0) obj2;
                wne wneVar14 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    int i4 = tw0.x;
                    e3c.n(tw0Var.u);
                    tw0Var.u = sac.f0(jiu0.a(tw0Var), 2000L, TimeUnit.MILLISECONDS, null, sw0.f32896a, new qw0(tw0Var, yjeVar, b4), 36);
                    hcp0 hcp0Var = tw0Var.s;
                    this.j = true;
                    if (hcp0Var.q(this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                e3c.n(tw0Var.u);
                return Unit.f46060a;
            case 14:
                a01 a01Var = (a01) obj2;
                wne wneVar15 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    ouu ouuVar2 = a01Var.p;
                    this.j = true;
                    objE2 = ouuVar2.E(this);
                    if (objE2 == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE2 = obj;
                }
                boolean zBooleanValue2 = ((Boolean) objE2).booleanValue();
                int i5 = a01.M;
                p7m0 p7m0Var6 = a01Var.i.f25029a;
                do {
                    value4 = p7m0Var6.getValue();
                    value4.getClass();
                } while (!p7m0Var6.m(value4, hz0.a((hz0) value4, null, new k8h0(zBooleanValue2), null, null, false, 0, null, 1021)));
                return Unit.f46060a;
            case 15:
                boolean z15 = this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                qek0 qek0Var = v51.a2;
                ((v51) obj2).G0().b.setVisibility(z15 ? (byte) 0 : (byte) 8);
                return Unit.f46060a;
            case 16:
                nj1 nj1Var = (nj1) obj2;
                boolean z16 = this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                if (z16 && (((bj1) nj1Var.D()).f2682a instanceof jhe)) {
                    nj1Var.N();
                }
                return Unit.f46060a;
            case 17:
                bk1 bk1Var = (bk1) obj2;
                boolean z17 = this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                if (z17 && (((j8d0) bk1Var.D()).h instanceof c8d0)) {
                    bk1Var.O();
                }
                return Unit.f46060a;
            case 18:
                wk1 wk1Var = (wk1) obj2;
                boolean z18 = this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                if (z18 && ((ok1) wk1Var.D()).c) {
                    wk1Var.M();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                s12 s12Var = (s12) obj2;
                ArrayList arrayList = s12Var.c;
                wne wneVar20 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(1000L, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (arrayList.size() > 1) {
                    v3d.t(new s7f((byte) 11), arrayList);
                }
                q12 q12Var = (q12) CollectionsKt.firstOrNull(arrayList);
                arrayList.clear();
                if (q12Var != null) {
                    String str = q12Var.c;
                    AlertsPipeType alertsPipeType = q12Var.f27930a;
                    AlertsPipeType alertsPipeType2 = s12Var.f;
                    if (alertsPipeType2 == null || org.xplatform.alerts_pipe_api.presentation.e.a(alertsPipeType) < org.xplatform.alerts_pipe_api.presentation.e.a(alertsPipeType2)) {
                        androidx.fragment.app.e eVar = s12Var.g;
                        if (eVar != null && (listP = eVar.c.p()) != null) {
                            for (Fragment fragment : listP) {
                                if (fragment instanceof sik) {
                                    ((sik) fragment).y0();
                                }
                            }
                        }
                        s12Var.f = null;
                        ii iiVar = s12Var.f31434a;
                        ctf0 ctf0Var = s12Var.b;
                        androidx.fragment.app.e eVar2 = q12Var.b;
                        s12Var.g = eVar2;
                        if (alertsPipeType instanceof AlertsPipeType.UserAgreementDocumentsDialog) {
                            eVar2.getClass();
                        } else if (alertsPipeType.equals(AlertsPipeType.IdentificationAlertKzAlert.f46312a)) {
                            mi70 mi70Var = nwb0.h2;
                            DialogFields dialogFields = new DialogFields((CharSequence) ctf0Var.f(R.string.kz_identification_dialog_bonus_title_2, new Object[0]), (CharSequence) ctf0Var.f(R.string.kz_identification_dialog_bonus_body_new_2, new Object[0]), (CharSequence) ctf0Var.f(R.string.pass_identification, new Object[0]), ctf0Var.f(R.string.later, new Object[0]), (String) null, str, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                            mi70Var.getClass();
                            nwb0 nwb0Var = new nwb0();
                            nwb0Var.R0(dialogFields);
                            nwb0Var.f2.J(nwb0Var, nwb0.i2[0], alertsPipeType);
                            iiVar.c(nwb0Var, eVar2);
                        } else if (alertsPipeType.equals(AlertsPipeType.KzFirstDepositBottom.f46313a)) {
                            jty.f2.getClass();
                            eVar2.getClass();
                            if (eVar2.J("KZ_FIRST_DEPOSIT_BOTTOM_SHEET") == null) {
                                new jty().H0(eVar2, "KZ_FIRST_DEPOSIT_BOTTOM_SHEET");
                            }
                        } else {
                            if (!(alertsPipeType instanceof AlertsPipeType.NotIdentifiedKzAlert)) {
                                t9f.b();
                                return null;
                            }
                            int i6 = fj50.i2;
                            String strF = ctf0Var.f(R.string.pass_identification_title, new Object[0]);
                            String str2 = ((AlertsPipeType.NotIdentifiedKzAlert) alertsPipeType).f46314a;
                            if (str2 == null) {
                                str2 = "";
                            }
                            DialogFields dialogFields2 = new DialogFields((CharSequence) strF, (CharSequence) str2, (CharSequence) ctf0Var.f(R.string.pass_identification, new Object[0]), ctf0Var.f(R.string.later, new Object[0]), (String) null, str, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                            fj50 fj50Var = new fj50();
                            fj50Var.R0(dialogFields2);
                            iiVar.c(fj50Var, eVar2);
                        }
                    }
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    n92 n92Var = (n92) obj2;
                    i6m0 i6m0Var = n92Var.O;
                    long j = ((d92) n92Var.D()).h;
                    this.j = true;
                    Object objA = i6m0Var.f14248a.f5514a.a(j, this);
                    if (objA != wneVar21) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar21) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                boolean z21 = this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                zb2 zb2Var = (zb2) obj2;
                int i7 = zb2.A;
                ocj ocjVar = zb2Var.i;
                p7m0 p7m0Var7 = ocjVar.f25029a;
                do {
                    value5 = p7m0Var7.getValue();
                    value5.getClass();
                } while (!p7m0Var7.m(value5, dc2.a((dc2) value5, null, null, false, false, false, false, z21, null, null, 7935)));
                if (z21 && (((dc2) zb2Var.D()).f5830a.isEmpty() || (bbyVar = zb2Var.z) == null || !bbyVar.isActive())) {
                    zb2Var.O();
                } else if (!z21 && ((dc2) zb2Var.D()).f5830a.isEmpty()) {
                    p7m0 p7m0Var8 = ocjVar.f25029a;
                    do {
                        value6 = p7m0Var8.getValue();
                        value6.getClass();
                    } while (!p7m0Var8.m(value6, dc2.a((dc2) value6, null, null, false, false, false, true, false, null, null, 8143)));
                }
                return Unit.f46060a;
            case 22:
                boolean z22 = this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                hd2 hd2Var = (hd2) obj2;
                int i8 = hd2.z;
                ocj ocjVar2 = hd2Var.i;
                p7m0 p7m0Var9 = ocjVar2.f25029a;
                while (true) {
                    Object value15 = p7m0Var9.getValue();
                    value15.getClass();
                    boolean z23 = z22;
                    if (p7m0Var9.m(value15, ad2.a((ad2) value15, null, null, false, false, false, z23, null, 3839))) {
                        if (z23) {
                            hd2Var.M();
                        } else if (!z23 && ((ad2) hd2Var.D()).f657a.isEmpty()) {
                            p7m0 p7m0Var10 = ocjVar2.f25029a;
                            do {
                                value7 = p7m0Var10.getValue();
                                value7.getClass();
                            } while (!p7m0Var10.m(value7, ad2.a((ad2) value7, null, null, false, false, true, false, null, 4055)));
                        }
                        return Unit.f46060a;
                    }
                    z22 = z23;
                }
                break;
            case 23:
                boolean z24 = this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                hh2 hh2Var = (hh2) obj2;
                int i9 = hh2.O;
                ocj ocjVar3 = hh2Var.i;
                p7m0 p7m0Var11 = ocjVar3.f25029a;
                while (true) {
                    Object value16 = p7m0Var11.getValue();
                    value16.getClass();
                    hh2 hh2Var2 = hh2Var;
                    if (p7m0Var11.m(value16, ug2.a((ug2) value16, null, z24, null, false, false, false, false, null, null, null, false, 2045))) {
                        if (z24) {
                            hh2Var2.R();
                        } else if (((ug2) hh2Var2.D()).c instanceof fat) {
                            p7m0 p7m0Var12 = ocjVar3.f25029a;
                            do {
                                value8 = p7m0Var12.getValue();
                                value8.getClass();
                            } while (!p7m0Var12.m(value8, ug2.a((ug2) value8, null, false, new dat(new UnknownHostException()), false, false, false, false, null, null, null, false, 2043)));
                        }
                        return Unit.f46060a;
                    }
                    hh2Var = hh2Var2;
                }
                break;
            case 24:
                boolean z25 = this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                qi2 qi2Var = (qi2) obj2;
                int i10 = qi2.D;
                ocj ocjVar4 = qi2Var.i;
                p7m0 p7m0Var13 = ocjVar4.f25029a;
                do {
                    value9 = p7m0Var13.getValue();
                    value9.getClass();
                } while (!p7m0Var13.m(value9, ei2.a((ei2) value9, null, z25, null, false, false, null, 125)));
                if (z25) {
                    qi2Var.M();
                } else if (((ei2) qi2Var.D()).c instanceof dqp0) {
                    p7m0 p7m0Var14 = ocjVar4.f25029a;
                    do {
                        value10 = p7m0Var14.getValue();
                        value10.getClass();
                    } while (!p7m0Var14.m(value10, ei2.a((ei2) value10, null, false, new bqp0(new UnknownHostException()), false, false, null, 123)));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                boolean z26 = this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                fk2 fk2Var = (fk2) obj2;
                int i11 = fk2.K;
                ocj ocjVar5 = fk2Var.i;
                p7m0 p7m0Var15 = ocjVar5.f25029a;
                do {
                    value11 = p7m0Var15.getValue();
                    value11.getClass();
                } while (!p7m0Var15.m(value11, pj2.a((pj2) value11, null, z26, null, false, false, false, false, 253)));
                if (z26) {
                    fk2Var.M();
                } else if (((pj2) fk2Var.D()).c instanceof lj2) {
                    p7m0 p7m0Var16 = ocjVar5.f25029a;
                    do {
                        value12 = p7m0Var16.getValue();
                        value12.getClass();
                    } while (!p7m0Var16.m(value12, pj2.a((pj2) value12, null, false, new jj2(new UnknownHostException()), false, false, false, false, 251)));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                boolean z27 = this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                ul2 ul2Var = (ul2) obj2;
                int i12 = ul2.S;
                ocj ocjVar6 = ul2Var.i;
                p7m0 p7m0Var17 = ocjVar6.f25029a;
                do {
                    value13 = p7m0Var17.getValue();
                    value13.getClass();
                } while (!p7m0Var17.m(value13, nl2.a((nl2) value13, null, z27, false, null, false, false, false, null, null, 509)));
                if (z27) {
                    ul2Var.M();
                } else if (((nl2) ul2Var.D()).d instanceof dds0) {
                    p7m0 p7m0Var18 = ocjVar6.f25029a;
                    do {
                        value14 = p7m0Var18.getValue();
                        value14.getClass();
                    } while (!p7m0Var18.m(value14, nl2.a((nl2) value14, null, false, false, new cds0(new UnknownHostException()), false, false, false, null, null, Response.SERVICE_UNAVAILABLE)));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                boolean z28 = this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                ((tp2) obj2).g(z28);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                boolean z29 = this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                if (z29) {
                    hfk0 hfk0Var = vg3.R1;
                    org.xplatform.ui_core.viewcomponents.smart_background.e eVar3 = (org.xplatform.ui_core.viewcomponents.smart_background.e) ((vg3) obj2).G0().b.findViewById(R.id.smart_background_video);
                    if (eVar3 != null) {
                        eVar3.d();
                    }
                }
                return Unit.f46060a;
            default:
                boolean z30 = this.j;
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                if (z30) {
                    qek0 qek0Var2 = dm3.U1;
                    org.xplatform.ui_core.viewcomponents.smart_background.e eVar4 = (org.xplatform.ui_core.viewcomponents.smart_background.e) ((dm3) obj2).H0().c.findViewById(R.id.smart_background_video);
                    if (eVar4 != null) {
                        eVar4.d();
                    }
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
