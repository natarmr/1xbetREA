package a;

import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.referral.api.presentation.ReferralNetworkParams;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes5.dex */
public final class xne0 extends w46 {
    public final ReferralNetworkParams b;
    public final hnu c;
    public final s5k d;
    public final abu e;
    public final rne0 f;
    public final pzu g;
    public final duj h;
    public final zpu i;
    public final p7m0 j = q7m0.a(pne0.f27282a);
    public final qoj0 k = ckb.F();

    public xne0(ReferralNetworkParams referralNetworkParams, hnu hnuVar, s5k s5kVar, abu abuVar, rne0 rne0Var, pzu pzuVar, duj dujVar, zpu zpuVar) {
        this.b = referralNetworkParams;
        this.c = hnuVar;
        this.d = s5kVar;
        this.e = abuVar;
        this.f = rne0Var;
        this.g = pzuVar;
        this.h = dujVar;
        this.i = zpuVar;
        x(false);
    }

    public final Object w(int i, bnn0 bnn0Var) {
        qoj0 qoj0Var = this.k;
        if (i == 4) {
            Object objA = qoj0Var.a(new yme0(new UiText.ByRes(R.string.error, new CharSequence[0]), new UiText.ByRes(R.string.user_not_found, new CharSequence[0]), new UiText.ByRes(R.string.ok_new, new CharSequence[0])), bnn0Var);
            return objA == wne.f39444a ? objA : Unit.f46060a;
        }
        if (i != 5) {
            return Unit.f46060a;
        }
        Object objA2 = qoj0Var.a(new yme0(new UiText.ByRes(R.string.error, new CharSequence[0]), new UiText.ByRes(R.string.not_enough_money, new CharSequence[0]), new UiText.ByRes(R.string.ok_new, new CharSequence[0])), bnn0Var);
        return objA2 == wne.f39444a ? objA2 : Unit.f46060a;
    }

    public final void x(boolean z) {
        sac.V(jiu0.a(this), new d8e0(1, this.h, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, null, new lv((Object) this, z, (yje) null, (byte) 13), 14);
    }
}
