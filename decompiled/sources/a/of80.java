package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Window;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class of80 extends sik {
    public void J0() {
        Window window;
        Dialog dialog = this.S1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Context context = dialog.getContext();
        context.getClass();
        TypedValue typedValue = j5d.f15927a;
        ofm0.A(window, context, R.color.static_transparent, j5d.a(o0(), R.attr.uikitBackgroundContent, true), false, !qem0.r(B()));
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void V(Context context) {
        super.V(context);
        I0();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        Log.i("onCreate", "Current screen: ".concat(getClass().getName()));
        super.W(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void e0() {
        this.j1 = true;
        J0();
    }

    public void I0() {
    }
}
