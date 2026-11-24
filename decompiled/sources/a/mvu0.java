package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.RadialProgressView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mvu0;", "La/sik;", "<init>", "()V", "a/gnm0", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mvu0 extends sik {
    public static final /* synthetic */ int Y1 = 0;

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        Context contextO0 = o0();
        Dialog dialog = new Dialog(contextO0, R.style.ThemeOverlay_AppTheme_MaterialAlertDialog_Transparent);
        dialog.setContentView(new RadialProgressView(contextO0, null, 6));
        dialog.setCancelable(false);
        E0(false);
        return dialog;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        Dialog dialog;
        j5r j5rVar = k5r.f17734a;
        sru sruVar = new sru(this, "Attempting to get retain instance for fragment " + this);
        k5r.c(sruVar);
        j5r j5rVarA = k5r.a(this);
        if (j5rVarA.f15946a.contains(i5r.f) && k5r.e(j5rVarA, mvu0.class, sru.class)) {
            k5r.b(j5rVarA, sruVar);
        }
        if (this.f1 && (dialog = this.S1) != null) {
            dialog.setDismissMessage(null);
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        this.j1 = true;
        Dialog dialog = this.S1;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }
}
