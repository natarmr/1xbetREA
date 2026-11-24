package a;

import android.gov.nist.core.Separators;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.successbetalert.model.TmpBetDoneUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class lgn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f20017a;
    public final r9u b;
    public final wdk0 c;
    public final ctf0 d;
    public final ywu e;

    public lgn0(pru pruVar, r9u r9uVar, wdk0 wdk0Var, ctf0 ctf0Var, ywu ywuVar) {
        r9uVar.getClass();
        wdk0Var.getClass();
        ctf0Var.getClass();
        this.f20017a = pruVar;
        this.b = r9uVar;
        this.c = wdk0Var;
        this.d = ctf0Var;
        this.e = ywuVar;
    }

    public static Fragment a(v1r v1rVar) {
        Object next;
        List listP = v1rVar.c.p();
        listP.getClass();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((Fragment) next) instanceof tgn0) {
                return (Fragment) next;
            }
        }
        next = null;
        return (Fragment) next;
    }

    public final boolean b(bu6 bu6Var) {
        int iOrdinal = bu6Var.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        r9u r9uVar = this.b;
        if (iOrdinal == 1) {
            ygp ygpVar = ygp.v1;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            return j1q0Var.f15748a.d(ygpVar);
        }
        if (iOrdinal == 2) {
            ygp ygpVar2 = ygp.u1;
            r9uVar.getClass();
            j1q0 j1q0Var2 = r9uVar.f30104a;
            j1q0Var2.getClass();
            return j1q0Var2.f15748a.d(ygpVar2);
        }
        if (iOrdinal == 3) {
            ygp ygpVar3 = ygp.x1;
            r9uVar.getClass();
            j1q0 j1q0Var3 = r9uVar.f30104a;
            j1q0Var3.getClass();
            return j1q0Var3.f15748a.d(ygpVar3);
        }
        if (iOrdinal != 4) {
            t9f.b();
            return false;
        }
        ygp ygpVar4 = ygp.z1;
        r9uVar.getClass();
        j1q0 j1q0Var4 = r9uVar.f30104a;
        j1q0Var4.getClass();
        return j1q0Var4.f15748a.d(ygpVar4);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0184  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:95:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0212 A[SYNTHETIC] */
    public final void c(SuccessBetStringModel successBetStringModel, SuccessBetAlertModel successBetAlertModel, Fragment fragment) {
        StringBuilder sb;
        Object string;
        String str;
        SuccessBetInfoItem.Simple simple;
        String str2;
        String strA;
        String str3 = successBetAlertModel.b;
        fragment.getClass();
        pmi0.i(((o3c) ((fvt0) this.e.d).f10231a).w());
        v1r v1rVarR = fragment.n0().r();
        mum0 mum0Var = this.f20017a.a().g;
        bu6 bu6Var = mum0Var.c;
        au6 au6Var = mum0Var.d;
        int iOrdinal = bu6Var.ordinal();
        ctf0 ctf0Var = this.d;
        if (iOrdinal == 0) {
            String str4 = successBetStringModel.b;
            if (str4 == null) {
                sb = new StringBuilder();
                sb.append(successBetStringModel.f46423a);
                if (str3 != null && (!StringsKt.W(str3))) {
                    String strA2 = ctf0Var.b.a(R.string.snackbar_coupon_number, Arrays.copyOf(new Object[]{str3}, 1));
                    sb.append(Separators.RETURN);
                    sb.append(strA2);
                }
                for (SuccessBetInfoItem successBetInfoItem : successBetAlertModel.f) {
                    if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                        simple = (SuccessBetInfoItem.Simple) successBetInfoItem;
                        str2 = simple.b;
                        if (str2.length() > 0) {
                            pn40 pn40Var = pn40.f27267a;
                            strA = ctf0Var.b.a(R.string.sp_coef, Arrays.copyOf(new Object[0], 0));
                            if (Intrinsics.d(str2, "0")) {
                                str2 = strA;
                            }
                            p3u0 p3u0Var = p3u0.e;
                            str2.getClass();
                            String strA3 = ctf0Var.b.a(R.string.description_dots, Arrays.copyOf(new Object[]{simple.f46421a, pn40.r(str2, p3u0Var)}, 2));
                            sb.append(Separators.RETURN);
                            sb.append(strA3);
                        }
                    }
                    if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                        SuccessBetInfoItem.WithCurrency withCurrency = (SuccessBetInfoItem.WithCurrency) successBetInfoItem;
                        str = withCurrency.b;
                        if (str.length() <= 0 && !str.equals("0.0") && withCurrency.e) {
                            Double dI = kotlin.text.b.i(str);
                            double dDoubleValue = dI != null ? dI.doubleValue() : 0.0d;
                            pn40 pn40Var2 = pn40.f27267a;
                            String strA4 = ctf0Var.b.a(R.string.sum_bet_with_amount_v2, Arrays.copyOf(new Object[]{BidiFormatter.getInstance().unicodeWrap(pn40.d(dDoubleValue, withCurrency.d, p3u0.c), TextDirectionHeuristics.LTR)}, 1));
                            sb.append(Separators.RETURN);
                            sb.append(strA4);
                        }
                    }
                }
                string = sb.toString();
            } else {
                string = str4.length() > 0 ? str4 : null;
                if (string == null) {
                    sb = new StringBuilder();
                    sb.append(successBetStringModel.f46423a);
                    if (str3 != null) {
                        String strA5 = ctf0Var.b.a(R.string.snackbar_coupon_number, Arrays.copyOf(new Object[]{str3}, 1));
                        sb.append(Separators.RETURN);
                        sb.append(strA5);
                    }
                    while (r0.hasNext()) {
                        if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                            simple = (SuccessBetInfoItem.Simple) successBetInfoItem;
                            str2 = simple.b;
                            if (str2.length() > 0) {
                                pn40 pn40Var3 = pn40.f27267a;
                                strA = ctf0Var.b.a(R.string.sp_coef, Arrays.copyOf(new Object[0], 0));
                                if (Intrinsics.d(str2, "0")) {
                                    str2 = strA;
                                }
                                p3u0 p3u0Var2 = p3u0.e;
                                str2.getClass();
                                String strA6 = ctf0Var.b.a(R.string.description_dots, Arrays.copyOf(new Object[]{simple.f46421a, pn40.r(str2, p3u0Var2)}, 2));
                                sb.append(Separators.RETURN);
                                sb.append(strA6);
                            }
                        }
                        if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                            SuccessBetInfoItem.WithCurrency withCurrency2 = (SuccessBetInfoItem.WithCurrency) successBetInfoItem;
                            str = withCurrency2.b;
                            if (str.length() <= 0) {
                            }
                        }
                    }
                    string = sb.toString();
                }
            }
            Object obj = string;
            Fragment fragmentA = a(v1rVarR);
            if (fragmentA == null) {
                return;
            }
            fragmentA.n0().getWindow().getDecorView().post(new kjn(fragmentA, this, obj, v1rVarR, successBetAlertModel, (byte) 3));
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            if (b(bu6Var)) {
                androidx.fragment.app.e eVarC = fragment.C();
                eVarC.getClass();
                if (eVarC.a0()) {
                    return;
                }
                bgn0.q2.getClass();
                String str5 = bgn0.s2;
                if (eVarC.J(str5) != null) {
                    return;
                }
                bgn0 bgn0Var = new bgn0();
                iiy[] iiyVarArr = bgn0.r2;
                bgn0Var.k2.J(bgn0Var, iiyVarArr[0], successBetStringModel);
                bgn0Var.l2.J(bgn0Var, iiyVarArr[1], successBetAlertModel);
                bgn0Var.m2.u(bgn0Var, iiyVarArr[2], au6Var);
                bgn0Var.n2.u(bgn0Var, iiyVarArr[3], bu6Var);
                bgn0Var.H0(eVarC, str5);
                return;
            }
            if (v1rVarR.a0()) {
                return;
            }
            m6m0 m6m0Var = hgn0.k2;
            org.xplatform.uikit.components.successbetalert.model.SuccessBetStringModel successBetStringModelB = mgn0.b(successBetStringModel, ctf0Var);
            org.xplatform.uikit.components.successbetalert.model.SuccessBetAlertModel successBetAlertModelA = mgn0.a(successBetAlertModel);
            TmpBetDoneUiModel tmpBetDoneUiModelC = mgn0.c(bu6Var, au6Var);
            m6m0Var.getClass();
            hgn0 hgn0Var = new hgn0();
            iiy[] iiyVarArr2 = hgn0.l2;
            hgn0Var.g2.v(hgn0Var, iiyVarArr2[0], successBetStringModelB);
            hgn0Var.h2.v(hgn0Var, iiyVarArr2[1], successBetAlertModelA);
            hgn0Var.i2.v(hgn0Var, iiyVarArr2[2], tmpBetDoneUiModelC);
            String simpleName = hgn0.class.getSimpleName();
            Fragment fragmentJ = v1rVarR.J(simpleName);
            if ((fragmentJ instanceof hgn0 ? (hgn0) fragmentJ : null) == null) {
                hgn0Var.H0(v1rVarR, simpleName);
                return;
            }
            return;
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            t9f.b();
            return;
        }
        if (b(bu6Var)) {
            androidx.fragment.app.e eVarC2 = fragment.C();
            eVarC2.getClass();
            if (eVarC2.a0()) {
                return;
            }
            wfn0.e2.getClass();
            String str6 = wfn0.g2;
            if (eVarC2.J(str6) != null) {
                return;
            }
            wfn0 wfn0Var = new wfn0();
            iiy[] iiyVarArr3 = wfn0.f2;
            wfn0Var.Y1.J(wfn0Var, iiyVarArr3[0], successBetStringModel);
            wfn0Var.Z1.J(wfn0Var, iiyVarArr3[1], successBetAlertModel);
            wfn0Var.a2.u(wfn0Var, iiyVarArr3[2], au6Var);
            wfn0Var.b2.u(wfn0Var, iiyVarArr3[3], bu6Var);
            wfn0Var.H0(eVarC2, str6);
            return;
        }
        if (v1rVarR.a0()) {
            return;
        }
        y2m0 y2m0Var = yfn0.c2;
        org.xplatform.uikit.components.successbetalert.model.SuccessBetStringModel successBetStringModelB2 = mgn0.b(successBetStringModel, ctf0Var);
        org.xplatform.uikit.components.successbetalert.model.SuccessBetAlertModel successBetAlertModelA2 = mgn0.a(successBetAlertModel);
        TmpBetDoneUiModel tmpBetDoneUiModelC2 = mgn0.c(bu6Var, au6Var);
        y2m0Var.getClass();
        yfn0 yfn0Var = new yfn0();
        iiy[] iiyVarArr4 = yfn0.d2;
        yfn0Var.Y1.v(yfn0Var, iiyVarArr4[0], successBetStringModelB2);
        yfn0Var.Z1.v(yfn0Var, iiyVarArr4[1], successBetAlertModelA2);
        yfn0Var.a2.v(yfn0Var, iiyVarArr4[2], tmpBetDoneUiModelC2);
        String simpleName2 = yfn0.class.getSimpleName();
        Fragment fragmentJ2 = v1rVarR.J(simpleName2);
        if ((fragmentJ2 instanceof yfn0 ? (yfn0) fragmentJ2 : null) == null) {
            yfn0Var.H0(v1rVarR, simpleName2);
        }
    }
}
