package a;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class dcv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e720 f5864a;
    public final vq b;
    public final ii c;

    public dcv0(e720 e720Var, vq vqVar, ii iiVar) {
        iiVar.getClass();
        this.f5864a = e720Var;
        this.b = vqVar;
        this.c = iiVar;
    }

    public final void a(Fragment fragment, ubv0 ubv0Var) {
        boolean z = ubv0Var instanceof obv0;
        ii iiVar = this.c;
        if (z) {
            String string = fragment.o0().getString(R.string.coupon);
            String string2 = fragment.o0().getString(R.string.dependent_events);
            String string3 = fragment.o0().getString(R.string.ok);
            string3.getClass();
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, fragment.o0().getString(R.string.cancel), (String) null, "WHO_WIN_REQUEST_REPLACE_COUPON_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
            return;
        }
        boolean zEquals = ubv0Var.equals(nbv0.f23261a);
        vq vqVar = this.b;
        if (zEquals) {
            vqVar.b(fragment, null, null);
            return;
        }
        if (ubv0Var.equals(pbv0.f26729a)) {
            String string4 = fragment.o0().getString(R.string.attention);
            String string5 = fragment.o0().getString(R.string.coupon_max_items_limit_exceed);
            String string6 = fragment.o0().getString(R.string.ok);
            string6.getClass();
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) string4, (CharSequence) string5, (CharSequence) string6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528));
            return;
        }
        if (ubv0Var.equals(qbv0.f28458a)) {
            String string7 = fragment.o0().getString(R.string.attention);
            String string8 = fragment.o0().getString(R.string.coupon_record_already_exists);
            String string9 = fragment.o0().getString(R.string.ok);
            string9.getClass();
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) string7, (CharSequence) string8, (CharSequence) string9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528));
            return;
        }
        if (ubv0Var instanceof rbv0) {
            rbv0 rbv0Var = (rbv0) ubv0Var;
            String string10 = fragment.o0().getString(R.string.attention);
            String string11 = fragment.o0().getString(R.string.coupon_type_max_items_limit_exceed_v2, rbv0Var.f30209a, Integer.valueOf(rbv0Var.b));
            String string12 = fragment.o0().getString(R.string.yes);
            string12.getClass();
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) string10, (CharSequence) string11, (CharSequence) string12, fragment.o0().getString(R.string.no), (String) null, "WHO_WIN_REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
            return;
        }
        if (ubv0Var instanceof sbv0) {
            sbv0 sbv0Var = (sbv0) ubv0Var;
            vqVar.a(fragment, sbv0Var.f31956a, null, null, null, sbv0Var.b, true, sbv0Var.c, -1L, "");
        } else {
            if (!(ubv0Var instanceof tbv0)) {
                t9f.b();
                return;
            }
            tbv0 tbv0Var = (tbv0) ubv0Var;
            androidx.fragment.app.e eVarC = fragment.C();
            eVarC.getClass();
            this.f5864a.b(eVarC, tbv0Var.b, tbv0Var.f33688a, tbv0Var.c);
        }
    }

    public final void b(Fragment fragment, ms2 ms2Var, Function1 function1) {
        ms2Var.getClass();
        nc40 nc40Var = new nc40(function1, (byte) 26);
        vq vqVar = this.b;
        vqVar.e(fragment, ms2Var, nc40Var);
        ccq0.V(fragment, "WHO_WIN_REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG", new ntu0(function1, (byte) 8));
        ccq0.V(fragment, "WHO_WIN_REQUEST_REPLACE_COUPON_KEY", new ntu0(function1, (byte) 9));
        vqVar.f(fragment, ms2Var, new ntu0(function1, (byte) 10));
    }
}
