package a;

import a.yfu0;
import android.R;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La/by5;", "La/yfu0;", TokenNames.V, "La/sik;", "<init>", "()V", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class by5<V extends yfu0> extends sik {
    public Toolbar Y1;
    public wjk Z1;
    public final int a2 = R.attr.statusBarColor;

    public abstract yfu0 I0();

    /* JADX INFO: renamed from: J0, reason: from getter */
    public int getI2() {
        return this.a2;
    }

    public void M0() {
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        Object parent = q0().getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            wsf0 wsf0Var = new wsf0(this, (byte) 11);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(view, wsf0Var);
        }
    }

    public int N0() {
        return 0;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 0;
    }

    public View.OnClickListener Q0() {
        return new q10(this, (byte) 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        if (context instanceof wjk) {
            this.Z1 = (wjk) context;
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        L0();
        F0(0, org.xbet.client1.R.style.AppTheme_Dialog_FullScreen);
        super.W(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View root = I0().getRoot();
        root.getClass();
        return root;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        wjk wjkVar = this.Z1;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
        this.Z1 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void e0() {
        byte b = 1;
        this.j1 = true;
        Window window = D0().getWindow();
        if (window != null) {
            ofm0.z(window, o0(), getI2(), R.attr.statusBarColor, 8);
        }
        View view = this.l1;
        if (view != null) {
            if (!view.isAttachedToWindow()) {
                view.addOnAttachStateChangeListener(new j14(view, this, b));
                return;
            }
            i0h0 i0h0VarB = B();
            jkf0 jkf0Var = i0h0VarB instanceof jkf0 ? (jkf0) i0h0VarB : null;
            if (jkf0Var != null) {
                ApplicationActivity applicationActivity = (ApplicationActivity) jkf0Var;
                if (applicationActivity.A1 != null) {
                    applicationActivity.A();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(View view, Bundle bundle) {
        Toolbar toolbar;
        view.getClass();
        Log.i("onCreateDialog", "Current screen: ".concat(getClass().getName()));
        M0();
        Toolbar toolbar2 = (Toolbar) view.findViewById(O0());
        this.Y1 = toolbar2;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(Q0());
        }
        Toolbar toolbar3 = this.Y1;
        if (toolbar3 != null) {
            toolbar3.setNavigationIcon(P0());
        }
        if (N0() != 0 && (toolbar = this.Y1) != null) {
            toolbar.setTitle(H(N0()));
        }
        K0();
    }

    public void K0() {
    }

    public void L0() {
    }
}
