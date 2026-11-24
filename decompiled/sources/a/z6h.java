package a;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class z6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f43866a;
    public final e720 b;
    public final vq c;
    public final ii d;
    public final ouu e;
    public final v88 f;
    public final wdk0 g;
    public final lgn0 h;

    public z6h(Fragment fragment, e720 e720Var, vq vqVar, wsz wszVar, ii iiVar, ouu ouuVar, v88 v88Var, wdk0 wdk0Var, lgn0 lgn0Var) {
        iiVar.getClass();
        wdk0Var.getClass();
        this.f43866a = fragment;
        this.b = e720Var;
        this.c = vqVar;
        this.d = iiVar;
        this.e = ouuVar;
        this.f = v88Var;
        this.g = wdk0Var;
        this.h = lgn0Var;
    }

    public final void a(Function1 function1) {
        lq2 lq2Var = new lq2();
        gn gnVar = new gn(function1, (byte) 16);
        vq vqVar = this.c;
        Fragment fragment = this.f43866a;
        vqVar.e(fragment, lq2Var, gnVar);
        vqVar.f(fragment, new lq2(), new afd(function1, (byte) 20));
        ccq0.V(fragment, "REQUEST_CODE_SHOW_COUPON_HAS_SAME_EVENT_BS", new afd(function1, (byte) 21));
        ccq0.V(fragment, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG_BS", new afd(function1, (byte) 22));
        ccq0.V(fragment, "REQUEST_CODE_BET_EXIST_ERROR_BS", new afd(function1, (byte) 23));
        ccq0.V(fragment, "REQUEST_CODE_NOT_ENOUGH_MONEY_ERROR_BS", new afd(function1, (byte) 24));
    }

    public final void b(String str, String str2) {
        Fragment fragment = this.f43866a;
        String strH = fragment.H(R.string.ok);
        strH.getClass();
        ua80.r(fragment, this.d, new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528));
    }

    public final void c(String str) {
        wdk0.k(this.g, new xdk0(rek0.b, str, null, null, null, null, 124), this.f43866a, null, null, false, null, 1020);
    }
}
