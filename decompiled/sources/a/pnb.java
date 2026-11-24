package a;

import android.app.Dialog;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/pnb;", "La/u0i;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pnb extends u0i {
    public final phf0 f2 = new phf0("REQUEST_KEY");
    public final phf0 g2 = new phf0("BALANCE_REQUEST_KEY");
    public final yzn0 h2 = new yzn0("DIALOG_BALANCE");
    public static final /* synthetic */ iiy[] j2 = {new ez40(pnb.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(pnb.class, "balanceRequestKey", "getBalanceRequestKey()Ljava/lang/String;", 0), new ez40(pnb.class, "balance", "getBalance()Lorg/xplatform/balance/model/BalanceModel;", 0)};
    public static final kl5 i2 = new kl5();

    @Override // a.u0i, a.sik
    public final Dialog C0(Bundle bundle) {
        Dialog dialogC0 = super.C0(bundle);
        String strH = H(R.string.change_balance_warning);
        strH.getClass();
        Q0(strH);
        return dialogC0;
    }

    @Override // a.u0i
    public final void M0() {
        vcc.f0(i120.V(new Pair("NEGATIVE_CLICK_REQUEST_KEY", Boolean.TRUE)), this, this.f2.n(this, j2[0]));
        y0();
    }

    @Override // a.u0i
    public final void O0() {
        iiy[] iiyVarArr = j2;
        boolean z = false;
        iiy iiyVar = iiyVarArr[0];
        phf0 phf0Var = this.f2;
        String strN = phf0Var.n(this, iiyVar);
        String strN2 = phf0Var.n(this, iiyVarArr[0]);
        DsCheckbox dsCheckboxJ0 = J0();
        if (dsCheckboxJ0 != null && dsCheckboxJ0.isChecked()) {
            z = true;
        }
        vcc.f0(i120.V(new Pair(strN2, Boolean.valueOf(!z)), new Pair(this.g2.n(this, iiyVarArr[1]), (ql5) this.h2.n(this, iiyVarArr[2]))), this, strN);
        y0();
    }
}
