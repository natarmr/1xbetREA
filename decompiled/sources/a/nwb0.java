package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.alerts_pipe_api.presentation.AlertsPipeType;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nwb0;", "La/u0i;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nwb0 extends u0i {
    public final khf0 f2 = new khf0("TYPE_KEY");
    public r12 g2;
    public static final /* synthetic */ iiy[] i2 = {new ez40(nwb0.class, "alertsPipeType", "getAlertsPipeType()Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;", 0)};
    public static final mi70 h2 = new mi70();

    @Override // a.u0i, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(gty.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            gty gtyVar = (gty) (ze3Var instanceof gty ? ze3Var : null);
            if (gtyVar != null) {
                r12 r12Var = (r12) ((p12) gtyVar.f11903a.b).b;
                x1x.x(r12Var);
                this.g2 = r12Var;
                androidx.fragment.app.e eVarF = F();
                AlertsPipeType alertsPipeType = (AlertsPipeType) this.f2.n(this, i2[0]);
                s12 s12Var = (s12) r12Var;
                s12Var.g = eVarF;
                s12Var.f = alertsPipeType;
                return;
            }
        }
        jf4.n(b1j.i(gty.class, "Cannot create dependency "));
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        r12 r12Var = this.g2;
        if (r12Var == null) {
            Intrinsics.h("alertsPipeReceiver");
            throw null;
        }
        ((s12) r12Var).b();
        super.onDismiss(dialogInterface);
    }
}
