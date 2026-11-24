package a;

import android.app.Dialog;
import android.view.View;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qd7 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28521a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qd7(Object obj, byte b) {
        this.f28521a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.f28521a;
        byte b2 = 3;
        yje yjeVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                BetInputView betInputView = (BetInputView) obj;
                if (!z) {
                    int i = BetInputView.v;
                } else if (betInputView.q) {
                    ((DsTextField) betInputView.r.d).setText(null);
                    betInputView.q = false;
                }
                break;
            case 1:
                ssc sscVar = (ssc) obj;
                sscVar.s(sscVar.t());
                break;
            case 2:
                cuk cukVar = (cuk) obj;
                bek bekVar = cuk.l2;
                if (z) {
                    dq00 dq00Var = ((guk) cukVar.g2.getValue()).f;
                    wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                    ((yo4) dq00Var.b).m("medal_table_bottom");
                    ((zr1) dq00Var.c).q("medal_table_bottom");
                }
                break;
            case 3:
                til tilVar = (til) obj;
                tilVar.l = z;
                tilVar.p();
                if (!z) {
                    tilVar.s(false);
                    tilVar.m = false;
                }
                break;
            case 4:
                ymd0 ymd0Var = (ymd0) obj;
                fl70 fl70Var = ymd0.o2;
                if (z) {
                    Dialog dialog = ymd0Var.S1;
                    dialog.getClass();
                    wo8 wo8Var = (wo8) dialog;
                    if (wo8Var.g == null) {
                        wo8Var.g();
                    }
                    wo8Var.g.N(3);
                }
                break;
            default:
                bun0 bun0Var = (bun0) obj;
                s2m0 s2m0Var = bun0.g2;
                if (z) {
                    pun0 pun0VarR0 = bun0Var.R0();
                    sac.V(jiu0.a(pun0VarR0), new ndn0(1, pun0VarR0.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, null, new oun0(pun0VarR0, yjeVar, b2), 14);
                }
                break;
        }
    }
}
