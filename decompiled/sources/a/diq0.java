package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/diq0;", "La/sik;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class diq0 extends sik {
    public fiu0 Y1;
    public final phf0 Z1 = new phf0("MESSAGE_EXTRA");
    public final a8z a2 = xbc.b0(this, sre0.f32672a.b(fiq0.class), new ciq0(this, (byte) 0));
    public static final /* synthetic */ iiy[] c2 = {new ez40(diq0.class, CrashHianalyticsData.MESSAGE, "getMessage()Ljava/lang/String;", 0)};
    public static final g9m0 b2 = new g9m0();

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(biq0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            biq0 biq0Var = (biq0) (ze3Var instanceof biq0 ? ze3Var : null);
            if (biq0Var != null) {
                String strN = this.Z1.n(this, c2[0]);
                strN.getClass();
                mne mneVar = biq0Var.c;
                duj dujVar = biq0Var.d;
                nr nrVar = biq0Var.f2669a;
                rqj0 rqj0Var = biq0Var.b;
                zsr zsrVar = biq0Var.e;
                pv00 pv00Var = biq0Var.f;
                zsrVar.getClass();
                this.Y1 = new fiu0(Collections.singletonMap(fiq0.class, (xvi) new rrd(mneVar, pv00Var, strN, nrVar, dujVar, rqj0Var, zsrVar).i));
                F0(0, R.style.AppTheme_Dialog_FullScreen);
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(biq0.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        b1j.t(composeView, new ugd(961790306, true, new l7p0(this, (byte) 23)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        Window window = D0().getWindow();
        if (window != null) {
            ofm0.z(window, o0(), R.attr.uikitBackground, android.R.attr.statusBarColor, 8);
        }
        this.j1 = true;
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        ((k3t0) this.a2.getValue()).x(yhq0.f42651a);
    }
}
