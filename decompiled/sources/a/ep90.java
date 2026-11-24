package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerDialogParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ep90;", "La/of80;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ep90 extends of80 {
    public tni Y1;
    public final s0r Z1;
    public final a8z a2;
    public final khf0 b2;
    public static final /* synthetic */ iiy[] d2 = {new j0d0(ep90.class, "viewBinding", "getViewBinding()Lorg/xplatform/picker/impl/databinding/DialogFragmentPickerBinding;", 0), new ez40(ep90.class, "pickerParams", "getPickerParams()Lorg/xplatform/picker/api/presentation/PickerDialogParams;", 0)};
    public static final jh70 c2 = new jh70();
    public static final String e2 = ep90.class.getName();

    public ep90() {
        super(R.layout.dialog_fragment_picker);
        this.Z1 = ltt0.o(this, dp90.f6454a);
        this.a2 = xbc.a0(this, sre0.f32672a.b(kp90.class), null, new bp90(this, (byte) 0), 14);
        this.b2 = new khf0("KEY_PARAMS");
    }

    public final k3t0 K0() {
        return (k3t0) this.a2.getValue();
    }

    @Override // a.of80, a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fp90.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fp90 fp90Var = (fp90) (ze3Var instanceof fp90 ? ze3Var : null);
            if (fp90Var != null) {
                PickerDialogParams pickerDialogParams = (PickerDialogParams) this.b2.n(this, d2[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                String str = e2;
                str.getClass();
                i1w0VarF.getClass();
                cad cadVar = fp90Var.c;
                ctf0 ctf0Var = fp90Var.b;
                pru pruVar = fp90Var.d;
                duj dujVar = fp90Var.e;
                yp90 yp90Var = fp90Var.f;
                imb imbVar = fp90Var.g;
                bot botVar = fp90Var.f9918a;
                je jeVar = fp90Var.h;
                kt2 kt2Var = fp90Var.i;
                AnalyticsEntryPoint analyticsEntryPoint = pickerDialogParams.b;
                bzt bztVar = fp90Var.j;
                ctf0Var.getClass();
                yp90Var.getClass();
                kt2Var.getClass();
                analyticsEntryPoint.getClass();
                this.Y1 = (tni) ((n5d0) new v7i(cadVar, pickerDialogParams, ctf0Var, pruVar, dujVar, yp90Var, imbVar, botVar, jeVar, kt2Var, i1w0VarF, str, analyticsEntryPoint, bztVar).o).get();
                return;
            }
        }
        jf4.n(b1j.i(fp90.class, "Cannot create dependency "));
    }

    @Override // a.of80, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F0(2, R.style.AppTheme_Overlay_Dialog);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        Window window;
        Dialog dialog = this.S1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        super.Z();
    }

    @Override // a.of80, androidx.fragment.app.Fragment
    public final void e0() {
        Window window;
        Window window2;
        super.e0();
        kxq kxqVarB = B();
        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null || (window2 = D0().getWindow()) == null) {
            return;
        }
        hfm0.u(window2, window);
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        Window window;
        view.getClass();
        Dialog dialog = this.S1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            bcm0.x(window, false);
            window.setSoftInputMode(48);
        }
        Object objN = this.Z1.n(d2[0], this);
        objN.getClass();
        pkd.h(((uik) objN).f35734a, qek0.h, null, new ugd(-1533689782, true, new ds60(this, (byte) 27)));
    }
}
