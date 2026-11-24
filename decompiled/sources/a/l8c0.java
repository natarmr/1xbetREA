package a;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l8c0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19597a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8c0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f19597a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        bec0 bec0Var;
        Object value2;
        Object value3;
        byte b = 21;
        switch (this.f19597a) {
            case 0:
                u4s u4sVar = (u4s) obj;
                u4sVar.getClass();
                hyc0 hyc0Var = (hyc0) this.receiver;
                hyc0Var.getClass();
                if (u4sVar.b != v4s.c) {
                    hyc0Var.c.z(u4sVar);
                }
                return Unit.f46060a;
            case 1:
                o4c0 o4c0Var = (o4c0) obj;
                o4c0Var.getClass();
                hyc0 hyc0Var2 = (hyc0) this.receiver;
                hyc0Var2.getClass();
                hyc0Var2.c.A(o4c0Var);
                return Unit.f46060a;
            case 2:
                ptc0 ptc0Var = (ptc0) obj;
                ptc0Var.getClass();
                qyc0 qyc0Var = (qyc0) this.receiver;
                qyc0Var.getClass();
                tac0 tac0Var = qyc0Var.c;
                tac0Var.getClass();
                tac0Var.v(ptc0Var.b);
                return Unit.f46060a;
            case 3:
                u4s u4sVar2 = (u4s) obj;
                u4sVar2.getClass();
                qyc0 qyc0Var2 = (qyc0) this.receiver;
                qyc0Var2.getClass();
                qyc0Var2.c.z(u4sVar2);
                return Unit.f46060a;
            case 4:
                o4c0 o4c0Var2 = (o4c0) obj;
                o4c0Var2.getClass();
                qyc0 qyc0Var3 = (qyc0) this.receiver;
                qyc0Var3.getClass();
                qyc0Var3.c.A(o4c0Var2);
                return Unit.f46060a;
            case 5:
                hac0 hac0Var = (hac0) obj;
                hac0Var.getClass();
                n9c0 n9c0Var = (n9c0) this.receiver;
                fl70 fl70Var = n9c0.S1;
                n9c0Var.getClass();
                if (hac0Var instanceof eac0) {
                    wdk0 wdk0Var = n9c0Var.L1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(pek0.f26859a, ((eac0) hac0Var).f7458a, null, null, null, null, 124), n9c0Var, null, null, false, null, 1020);
                } else {
                    if (!(hac0Var instanceof dac0)) {
                        t9f.b();
                        return null;
                    }
                    q5j q5jVar = n9c0Var.M1;
                    if (q5jVar == null) {
                        Intrinsics.h("dailyTasksScreenFactory");
                        throw null;
                    }
                    q5jVar.a(n9c0Var.F());
                }
                ((k3t0) n9c0Var.R1.getValue()).x(z8c0.f43961a);
                return Unit.f46060a;
            case 6:
                k9c0 k9c0Var = (k9c0) obj;
                k9c0Var.getClass();
                ((k3t0) this.receiver).x(k9c0Var);
                return Unit.f46060a;
            case 7:
                Throwable th = (Throwable) obj;
                th.getClass();
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.receiver;
                int i = org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.Q;
                bVar.P(th);
                return Unit.f46060a;
            case 8:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.receiver).P(th2);
                return Unit.f46060a;
            case 9:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.receiver).P(th3);
                return Unit.f46060a;
            case 10:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar2 = (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.receiver;
                int i2 = org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.Q;
                bVar2.P(th4);
                return Unit.f46060a;
            case 11:
                gac0 gac0Var = (gac0) obj;
                gac0Var.getClass();
                x9c0 x9c0Var = (x9c0) this.receiver;
                rl70 rl70Var = x9c0.Q1;
                x9c0Var.getClass();
                if (gac0Var instanceof fac0) {
                    fac0 fac0Var = (fac0) gac0Var;
                    wdk0 wdk0Var2 = x9c0Var.M1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, fac0Var.f9202a, null, null, null, null, 124), x9c0Var, null, null, false, null, 1020);
                } else {
                    if (!(gac0Var instanceof cac0)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(x9c0Var);
                }
                x9c0Var.H0().x(y8c0.f42189a);
                return Unit.f46060a;
            case 12:
                j9c0 j9c0Var = (j9c0) obj;
                j9c0Var.getClass();
                ((k3t0) this.receiver).x(j9c0Var);
                return Unit.f46060a;
            case 13:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                tac0 tac0Var2 = (tac0) this.receiver;
                tac0Var2.e.b(th5, new lma0(tac0Var2, b));
                return Unit.f46060a;
            case 14:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                sec0 sec0Var = (sec0) this.receiver;
                sec0Var.getClass();
                oyg0 oyg0Var = sec0Var.f;
                ocj ocjVar = sec0Var.i;
                if ((th6 instanceof SocketTimeoutException) || (th6 instanceof UnknownHostException)) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        bec0Var = (bec0) value;
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value, bec0.a(bec0Var, null, null, null, false, bec0Var.h, false, false, false, null, false, null, 65415)));
                } else {
                    boolean z = false;
                    if ((th6 instanceof zhi0) && ((zhi0) th6).c == i2o.y2) {
                        String message = th6.getMessage();
                        if (message != null) {
                            sec0Var.G(new gec0(sec0Var.v.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), message));
                        }
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var2.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var2.m(value3, bec0.a((bec0) value3, null, null, null, false, true, false, false, false, null, false, null, 65479)));
                    } else {
                        sec0Var.u.b(th6, new xh20((Object) sec0Var, z, (byte) 14));
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var3.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var3.m(value2, bec0.a((bec0) value2, null, null, null, false, true, false, false, false, null, false, null, 65479)));
                    }
                }
                return Unit.f46060a;
            case 15:
                String str = (String) obj;
                str.getClass();
                jhc0 jhc0Var = (jhc0) this.receiver;
                jhc0Var.getClass();
                sac.V(jiu0.a(jhc0Var), fhc0.f9534a, null, jhc0Var.d.b, new ghc0(jhc0Var, str, null), 10);
                return Unit.f46060a;
            case 16:
                wdc0 wdc0Var = (wdc0) obj;
                wdc0Var.getClass();
                ((k3t0) this.receiver).x(wdc0Var);
                return Unit.f46060a;
            case 17:
                cpc0 cpc0Var = (cpc0) obj;
                cpc0Var.getClass();
                ((k3t0) this.receiver).x(cpc0Var);
                return Unit.f46060a;
            case 18:
                ugc0 ugc0Var = (ugc0) obj;
                ugc0Var.getClass();
                igc0 igc0Var = (igc0) this.receiver;
                fl70 fl70Var2 = igc0.V1;
                igc0Var.getClass();
                if (!ugc0Var.equals(ugc0.f35618a)) {
                    t9f.b();
                    return null;
                }
                ii iiVar = igc0Var.N1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = igc0Var.H(R.string.attention);
                String strH2 = igc0Var.H(R.string.unacceptable_account_for_section);
                String strH3 = igc0Var.H(R.string.ok);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                androidx.fragment.app.e eVarC = igc0Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                ((k3t0) igc0Var.S1.getValue()).x(ogc0.f25212a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                tgc0 tgc0Var = (tgc0) obj;
                tgc0Var.getClass();
                ((k3t0) this.receiver).x(tgc0Var);
                return Unit.f46060a;
            case 20:
                ptc0 ptc0Var2 = (ptc0) obj;
                ptc0Var2.getClass();
                tac0 tac0Var3 = ((hyc0) this.receiver).c;
                tac0Var3.getClass();
                tac0Var3.v(ptc0Var2.b);
                return Unit.f46060a;
            case 21:
                euc0 euc0Var = (euc0) obj;
                euc0Var.getClass();
                ((hyc0) this.receiver).C(euc0Var);
                return Unit.f46060a;
            case 22:
                u4s u4sVar3 = (u4s) obj;
                u4sVar3.getClass();
                hyc0 hyc0Var3 = (hyc0) this.receiver;
                hyc0Var3.getClass();
                if (u4sVar3.b != v4s.c) {
                    hyc0Var3.c.z(u4sVar3);
                }
                return Unit.f46060a;
            case 23:
                ptc0 ptc0Var3 = (ptc0) obj;
                ptc0Var3.getClass();
                hyc0 hyc0Var4 = (hyc0) this.receiver;
                hyc0Var4.getClass();
                tac0 tac0Var4 = hyc0Var4.c;
                tac0Var4.getClass();
                tac0Var4.v(ptc0Var3.b);
                return Unit.f46060a;
            case 24:
                dmc0 dmc0Var = (dmc0) obj;
                dmc0Var.getClass();
                ((k3t0) this.receiver).x(dmc0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ptc0 ptc0Var4 = (ptc0) obj;
                ptc0Var4.getClass();
                doc0 doc0Var = (doc0) this.receiver;
                doc0Var.getClass();
                tac0 tac0Var5 = doc0Var.c;
                tac0Var5.getClass();
                tac0Var5.v(ptc0Var4.b);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                tac0 tac0Var6 = (tac0) this.receiver;
                tac0Var6.e.b(th7, new lma0(tac0Var6, b));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                kpc0 kpc0Var = (kpc0) obj;
                kpc0Var.getClass();
                ((k3t0) this.receiver).x(kpc0Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                yqc0 yqc0Var = (yqc0) obj;
                yqc0Var.getClass();
                pqc0 pqc0Var = (pqc0) this.receiver;
                mi70 mi70Var = pqc0.Q1;
                pqc0Var.getClass();
                if (yqc0Var instanceof tqc0) {
                    DialogFields dialogFields2 = ((tqc0) yqc0Var).f34375a;
                    ii iiVarG0 = pqc0Var.G0();
                    androidx.fragment.app.e eVarC2 = pqc0Var.C();
                    eVarC2.getClass();
                    iiVarG0.d(dialogFields2, eVarC2);
                } else if (yqc0Var instanceof xqc0) {
                    xqc0 xqc0Var = (xqc0) yqc0Var;
                    String str2 = xqc0Var.c;
                    String str3 = xqc0Var.f41311a;
                    String str4 = xqc0Var.b;
                    String str5 = xqc0Var.d;
                    ii iiVarG1 = pqc0Var.G0();
                    str2.getClass();
                    str4.getClass();
                    str5.getClass();
                    Object systemService = pqc0Var.o0().getSystemService("clipboard");
                    ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                    ClipData clipDataNewPlainText = ClipData.newPlainText("PROMO_CLIPBOARD_LABEL", str3);
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(clipDataNewPlainText);
                    }
                    DialogFields dialogFields3 = new DialogFields((CharSequence) str2, (CharSequence) str4, (CharSequence) str5, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1528);
                    androidx.fragment.app.e eVarC3 = pqc0Var.C();
                    eVarC3.getClass();
                    iiVarG1.d(dialogFields3, eVarC3);
                } else if (yqc0Var instanceof uqc0) {
                    DialogFields dialogFields4 = ((uqc0) yqc0Var).f36112a;
                    ii iiVarG2 = pqc0Var.G0();
                    androidx.fragment.app.e eVarC4 = pqc0Var.C();
                    eVarC4.getClass();
                    iiVarG2.d(dialogFields4, eVarC4);
                } else if (yqc0Var instanceof vqc0) {
                    DialogFields dialogFields5 = ((vqc0) yqc0Var).f37851a;
                    String str6 = dialogFields5.f;
                    if (str6 == null) {
                        str6 = "";
                    }
                    ccq0.T(pqc0Var, str6, new nqc0(pqc0Var, (byte) 1));
                    ii iiVarG3 = pqc0Var.G0();
                    androidx.fragment.app.e eVarC5 = pqc0Var.C();
                    eVarC5.getClass();
                    iiVarG3.d(dialogFields5, eVarC5);
                } else {
                    if (!(yqc0Var instanceof wqc0)) {
                        t9f.b();
                        return null;
                    }
                    DialogFields dialogFields6 = ((wqc0) yqc0Var).f39584a;
                    ii iiVarG4 = pqc0Var.G0();
                    androidx.fragment.app.e eVarC6 = pqc0Var.C();
                    eVarC6.getClass();
                    iiVarG4.d(dialogFields6, eVarC6);
                }
                ((k3t0) pqc0Var.N1.getValue()).x(hqc0.f13479a);
                return Unit.f46060a;
            default:
                mqc0 mqc0Var = (mqc0) obj;
                mqc0Var.getClass();
                ((k3t0) this.receiver).x(mqc0Var);
                return Unit.f46060a;
        }
    }
}
