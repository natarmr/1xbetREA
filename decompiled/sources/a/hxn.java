package a;

import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final class hxn extends v46 {
    public final nq8 u;
    public final Function0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxn(nq8 nq8Var, gi5 gi5Var) {
        super((DsButton) nq8Var.b);
        gi5Var.getClass();
        this.u = nq8Var;
        this.v = gi5Var;
    }

    @Override // a.v46
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void t(gxn gxnVar) {
        gxnVar.getClass();
        nq8 nq8Var = this.u;
        DsButton dsButton = (DsButton) nq8Var.c;
        dsButton.setLoading(false);
        CharSequence text = ((DsButton) nq8Var.b).getContext().getText(R.string.load_archive);
        text.getClass();
        dsButton.l(text);
        dyb.O(dsButton, new yhn((Object) this, (byte) 6));
    }
}
