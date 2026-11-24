package a;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final class z430 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f43750a;
    public final vq b;
    public final ii c;
    public final e720 d;
    public final lgn0 e;
    public final wdk0 f;
    public final qta0 g;

    public z430(Fragment fragment, vq vqVar, ii iiVar, e720 e720Var, lgn0 lgn0Var, wdk0 wdk0Var, qta0 qta0Var) {
        vqVar.getClass();
        iiVar.getClass();
        e720Var.getClass();
        lgn0Var.getClass();
        wdk0Var.getClass();
        qta0Var.getClass();
        this.f43750a = fragment;
        this.b = vqVar;
        this.c = iiVar;
        this.d = e720Var;
        this.e = lgn0Var;
        this.f = wdk0Var;
        this.g = qta0Var;
    }

    public final void a(y130 y130Var, long j, String str) {
        String str2;
        y130Var.getClass();
        str.getClass();
        boolean z = y130Var instanceof i130;
        Fragment fragment = this.f43750a;
        if (z) {
            i130 i130Var = (i130) y130Var;
            this.b.a(fragment, i130Var.f13977a, null, null, null, i130Var.b, true, i130Var.c, j, str);
            return;
        }
        if (y130Var.equals(n130.f22729a)) {
            this.b.b(fragment, null, null);
            return;
        }
        boolean z2 = y130Var instanceof j130;
        ii iiVar = this.c;
        if (z2) {
            j130 j130Var = (j130) y130Var;
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) j130Var.f15713a, (CharSequence) j130Var.b, (CharSequence) j130Var.c, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528));
            return;
        }
        if (y130Var instanceof k130) {
            k130 k130Var = (k130) y130Var;
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) k130Var.f17499a, (CharSequence) k130Var.b, (CharSequence) k130Var.c, k130Var.d, (String) null, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
            return;
        }
        if (y130Var.equals(l130.f19229a)) {
            gnm0.i(fragment.F());
            return;
        }
        if (y130Var instanceof m130) {
            m130 m130Var = (m130) y130Var;
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) m130Var.f20985a, (CharSequence) m130Var.b, (CharSequence) m130Var.c, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528));
            return;
        }
        if (y130Var instanceof o130) {
            o130 o130Var = (o130) y130Var;
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) o130Var.f24459a, (CharSequence) o130Var.b, (CharSequence) o130Var.c, o130Var.d, (String) null, "REQUEST_CODE_SHOW_COUPON_HAS_SAME_EVENT", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
            return;
        }
        if (y130Var instanceof p130) {
            p130 p130Var = (p130) y130Var;
            androidx.fragment.app.e eVarC = fragment.C();
            eVarC.getClass();
            this.d.b(eVarC, p130Var.f26180a, p130Var.b, p130Var.c);
            return;
        }
        if (y130Var instanceof s130) {
            s130 s130Var = (s130) y130Var;
            gnm0.i(fragment.F());
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) s130Var.f31436a, (CharSequence) s130Var.b, (CharSequence) s130Var.c, s130Var.d, (String) null, "REQUEST_CODE_BET_EXIST_ERROR", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
            return;
        }
        if (y130Var instanceof t130) {
            t130 t130Var = (t130) y130Var;
            gnm0.i(fragment.F());
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) t130Var.f33150a, (CharSequence) t130Var.b, (CharSequence) t130Var.c, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528));
            return;
        }
        if (y130Var instanceof u130) {
            u130 u130Var = (u130) y130Var;
            gnm0.i(fragment.F());
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) u130Var.f34884a, (CharSequence) u130Var.b, (CharSequence) u130Var.c, u130Var.d, (String) null, "REQUEST_CODE_NOT_ENOUGH_MONEY_ERROR", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
            return;
        }
        if (y130Var.equals(v130.f36610a)) {
            gnm0.s(fragment.F());
            return;
        }
        if (y130Var instanceof w130) {
            w130 w130Var = (w130) y130Var;
            zh7 zh7Var = w130Var.f38380a;
            gnm0.i(fragment.F());
            pn40 pn40Var = pn40.f27267a;
            String strC = pn40.c(zh7Var.e, p3u0.c);
            SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(w130Var.f, null, w130Var.m, null);
            String str3 = w130Var.g;
            String str4 = zh7Var.b;
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(new SuccessBetInfoItem.Simple(w130Var.h, zh7Var.d));
            String str5 = w130Var.k;
            if (str5 != null && (str2 = w130Var.l) != null) {
                lc00VarB.add(new SuccessBetInfoItem.Simple(str5, str2));
            }
            lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, fragment.o0()), w130Var.j, strC, w130Var.b, true));
            if (!w130Var.e) {
                lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, fragment.o0()), w130Var.i, w130Var.c, w130Var.b, false));
            }
            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
            long j2 = w130Var.d;
            hg7 hg7Var = hg7.f13004a;
            this.e.c(successBetStringModel, new SuccessBetAlertModel(str3, str4, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(j2), "SIMPLE", lc00VarA), fragment);
            return;
        }
        if (y130Var instanceof x130) {
            gnm0.i(fragment.F());
            wdk0.k(this.f, new xdk0(rek0.b, ((x130) y130Var).f40101a, null, null, null, null, 124), fragment, null, null, false, null, 1020);
            return;
        }
        if (y130Var.equals(r130.f29658a)) {
            androidx.fragment.app.e eVarC2 = fragment.C();
            eVarC2.getClass();
            this.g.getClass();
            int i = nta0.m2;
            if (eVarC2.J("PolybetRulesBottomSheetDialog") != null) {
                return;
            }
            new nta0().H0(eVarC2, "PolybetRulesBottomSheetDialog");
            return;
        }
        if (!(y130Var instanceof q130)) {
            t9f.b();
            return;
        }
        xuz xuzVar = vv20.m2;
        androidx.fragment.app.e eVarC3 = fragment.C();
        eVarC3.getClass();
        q130 q130Var = (q130) y130Var;
        String str6 = q130Var.f27931a;
        String str7 = q130Var.b;
        xuzVar.getClass();
        xuz.c(eVarC3, str6, str7);
    }

    public final void b(ms2 ms2Var, Function1 function1) {
        pd10 pd10Var = new pd10(function1, (byte) 25);
        Fragment fragment = this.f43750a;
        ccq0.V(fragment, "REQUEST_CODE_NOT_ENOUGH_MONEY_ERROR", pd10Var);
        ccq0.V(fragment, "REQUEST_CODE_BET_EXIST_ERROR", new pd10(function1, (byte) 26));
        ccq0.V(fragment, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG", new pd10(function1, (byte) 27));
        ccq0.V(fragment, "REQUEST_CODE_SHOW_COUPON_HAS_SAME_EVENT", new pd10(function1, (byte) 28));
        gn gnVar = new gn(function1, (byte) 29);
        vq vqVar = this.b;
        vqVar.e(fragment, ms2Var, gnVar);
        vqVar.f(fragment, ms2Var, new pd10(function1, (byte) 29));
    }
}
