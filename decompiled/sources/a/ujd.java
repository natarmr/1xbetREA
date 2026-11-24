package a;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class ujd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdk0 f35772a;
    public final dpi0 b;
    public final e720 c;
    public final ii d;

    public ujd(wdk0 wdk0Var, dpi0 dpi0Var, e720 e720Var, ii iiVar) {
        wdk0Var.getClass();
        iiVar.getClass();
        this.f35772a = wdk0Var;
        this.b = dpi0Var;
        this.c = e720Var;
        this.d = iiVar;
    }

    public static void a(Fragment fragment) {
        fragment.getClass();
        androidx.fragment.app.e eVarC = fragment.C();
        eVarC.g("REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG");
        eVarC.g("REQUEST_REPLACE_COUPON_KEY");
        eVarC.g("REQUEST_ALREADY_COUPON_DIALOG_KEY");
        eVarC.g("REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEYFIRST");
        eVarC.g("REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEYSECOND");
    }

    public final void b(Fragment fragment, sjd sjdVar) {
        vq vqVar = (vq) this.b.f6468a;
        fragment.getClass();
        sjdVar.getClass();
        if (sjdVar instanceof pjd) {
            j120.P(fragment, new kk0(this, fragment, (pjd) sjdVar, (byte) 18));
            return;
        }
        boolean z = sjdVar instanceof kjd;
        ii iiVar = this.d;
        if (z) {
            String strH = fragment.H(R.string.attention);
            String strH2 = fragment.H(R.string.coupon_max_items_limit_exceed);
            String strH3 = fragment.H(R.string.ok);
            strH3.getClass();
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528));
            return;
        }
        if (sjdVar instanceof mjd) {
            mjd mjdVar = (mjd) sjdVar;
            String strH4 = fragment.H(R.string.attention);
            String strI = fragment.I(R.string.coupon_type_max_items_limit_exceed_v2, mjdVar.f21892a, Integer.valueOf(mjdVar.b));
            String strH5 = fragment.H(R.string.yes);
            strH5.getClass();
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) strH4, (CharSequence) strI, (CharSequence) strH5, fragment.H(R.string.no), (String) null, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
            return;
        }
        if (sjdVar instanceof jjd) {
            String strH6 = fragment.H(R.string.attention);
            String strH7 = fragment.H(R.string.dependent_events);
            String strH8 = fragment.H(R.string.ok);
            strH8.getClass();
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, fragment.H(R.string.cancel), (String) null, "REQUEST_REPLACE_COUPON_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
            return;
        }
        if (sjdVar instanceof ljd) {
            String strH9 = fragment.H(R.string.attention);
            String strH10 = fragment.H(R.string.coupon_record_already_exists);
            String strH11 = fragment.H(R.string.ok);
            strH11.getClass();
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528));
            return;
        }
        if (sjdVar.equals(ijd.f14869a)) {
            vqVar.b(fragment, null, null);
            return;
        }
        if (sjdVar instanceof njd) {
            njd njdVar = (njd) sjdVar;
            aud audVar = njdVar.f23629a;
            ctc ctcVar = njdVar.b;
            ms2 ms2Var = njdVar.c;
            audVar.getClass();
            ctcVar.getClass();
            ms2Var.getClass();
            vqVar.a(fragment, audVar, null, null, null, ctcVar, true, ms2Var, -1L, "");
            return;
        }
        if (sjdVar.equals(qjd.f28832a)) {
            qek0 qek0Var = qek0.f28589a;
            String strH12 = fragment.H(R.string.favorites_subscribe_snackbar);
            strH12.getClass();
            wdk0.k(this.f35772a, new xdk0(qek0Var, strH12, null, null, null, Integer.valueOf(R.drawable.ic_glyph_favourite_active), 92), fragment, null, null, false, null, 1020);
            return;
        }
        if (!(sjdVar instanceof rjd)) {
            if (sjdVar.equals(ojd.f25352a)) {
                j120.Y(fragment);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        rek0 rek0Var = rek0.b;
        String strH13 = fragment.H(((rjd) sjdVar).f30586a);
        strH13.getClass();
        wdk0.k(this.f35772a, new xdk0(rek0Var, strH13, null, null, null, null, 124), fragment, null, null, false, null, 1020);
    }

    public final void c(Fragment fragment, ms2 ms2Var, Function1 function1) {
        fragment.getClass();
        ms2Var.getClass();
        function1.getClass();
        vq vqVar = (vq) this.b.f6468a;
        vqVar.e(fragment, ms2Var, new nc40(function1, (byte) 21));
        vqVar.f(fragment, ms2Var, new nas0(function1, (byte) 15));
        ccq0.V(fragment, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG", new afd(function1, (byte) 1));
        ccq0.V(fragment, "REQUEST_REPLACE_COUPON_KEY", new afd(function1, (byte) 2));
    }
}
