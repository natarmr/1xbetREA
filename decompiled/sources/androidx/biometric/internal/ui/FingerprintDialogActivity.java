package androidx.biometric.internal.ui;

import a.aeq;
import a.agd;
import a.c4m0;
import a.d58;
import a.deq;
import a.fxb;
import a.gkb;
import a.glz;
import a.gx5;
import a.hmw0;
import a.hny;
import a.ieq;
import a.iun;
import a.kiu0;
import a.l5a;
import a.lo4;
import a.po4;
import a.qjj;
import a.rcb;
import a.rek0;
import a.s88;
import a.sre0;
import a.t5a;
import a.tre0;
import a.uo4;
import a.v9q;
import a.wdq;
import a.x0x;
import a.x5;
import a.xdq;
import a.yip;
import a.yje;
import a.yzc0;
import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class FingerprintDialogActivity extends agd {
    public static final /* synthetic */ int Z = 0;
    public int A;
    public final kiu0 B;
    public final kiu0 Y;
    public AlertDialog v;
    public c4m0 w;
    public ImageView x;
    public TextView y;
    public int z;

    public FingerprintDialogActivity() {
        yip yipVar = new yip(this, (byte) 10);
        tre0 tre0Var = sre0.f32672a;
        this.B = new kiu0(tre0Var.b(deq.class), new xdq(this, (byte) 0), yipVar, new xdq(this, (byte) 1));
        this.Y = new kiu0(tre0Var.b(uo4.class), new xdq(this, (byte) 2), new v9q((byte) 14), new xdq(this, (byte) 3));
    }

    @Override // a.agd, a.zfd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        this.z = Build.VERSION.SDK_INT >= 26 ? rcb.w0(this, R.attr.colorError) : getColor(R.color.biometric_error_color);
        this.A = rcb.w0(this, android.R.attr.textColorSecondary);
        String str = Build.MODEL;
        boolean zX = gkb.X(this);
        byte b = 2;
        byte b2 = 0;
        byte b3 = 3;
        glz glzVar = this.f44297a;
        yje yjeVar = null;
        if (!zX) {
            qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, (byte) 11), 3);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            s().b.getClass();
            builder.setTitle((CharSequence) null);
            View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
            if (textView != null) {
                s().b.getClass();
                if (TextUtils.isEmpty(null)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
            if (textView2 != null) {
                s().b.getClass();
                if (TextUtils.isEmpty(null)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText((CharSequence) null);
                }
            }
            this.x = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
            this.y = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
            s().b.getClass();
            if (hmw0.Z(0)) {
                string = getString(R.string.confirm_device_credential_password);
            } else {
                ((yzc0) s().b).getClass();
                if (CollectionsKt.x0(iun.f15405a) != null) {
                    hny.b();
                    return;
                }
                string = null;
            }
            builder.setNegativeButton(string, new x5(this, (byte) 2));
            builder.setView(viewInflate);
            AlertDialog alertDialogCreate = builder.create();
            this.v = alertDialogCreate;
            if (alertDialogCreate != null) {
                alertDialogCreate.setCanceledOnTouchOutside(false);
                alertDialogCreate.setOnCancelListener(new gx5(this, (byte) 2));
                alertDialogCreate.show();
            }
            deq deqVarT = t();
            String string2 = getString(R.string.fingerprint_dialog_touch_sensor);
            string2.getClass();
            deqVarT.f = aeq.f741a;
            deqVarT.w(aeq.b, string2);
        }
        qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, b2), 3);
        qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, b), 3);
        qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, b3), 3);
        qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, (byte) 4), 3);
        qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, (byte) 5), 3);
        qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, (byte) 6), 3);
        qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, (byte) 7), 3);
        qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, (byte) 9), 3);
        qjj.W(x0x.Q(glzVar), null, null, new wdq(this, yjeVar, (byte) 10), 3);
        if (bundle == null) {
            ieq ieqVar = new ieq(getApplicationContext());
            int iIntValue = ((Number) t().b.invoke(ieqVar)).intValue();
            if (iIntValue != 0) {
                s().w(new d58(iIntValue, fxb.C(iIntValue, getApplicationContext())));
                return;
            }
            t().c = true;
            getApplicationContext().getClass();
            s().b.getClass();
            t5a t5aVar = (t5a) ((po4) s().c).b.getValue();
            s88 s88Var = t5aVar.b;
            if (s88Var == null) {
                s88Var = new s88((byte) 3, false);
                t5aVar.b = s88Var;
            }
            try {
                lo4 lo4Var = (lo4) s().d.getValue();
                if (lo4Var.b == null) {
                    lo4Var.b = new rek0((byte) 27);
                }
                ieqVar.a(null, s88Var);
            } catch (NullPointerException e) {
                Log.e("FingerprintDialogController", "Got NPE while authenticating with fingerprint.", e);
                s().w(new d58(1, getString(R.string.fingerprint_error_hw_not_available)));
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.v;
        if (alertDialog != null) {
            try {
                try {
                    alertDialog.dismiss();
                } catch (Exception e) {
                    Log.e("FingerprintDialogController", "Error dismissing fingerprint dialog", e);
                }
                this.v = null;
            } catch (Throwable th) {
                this.v = null;
                throw th;
            }
        }
        t().c = true;
        if (isChangingConfigurations()) {
            return;
        }
        r(l5a.f19443a);
    }

    public final void r(l5a l5aVar) {
        if (l5aVar == l5a.b) {
            s().w(new d58(10, fxb.C(10, this)));
        }
        ((t5a) ((po4) s().c).b.getValue()).a();
    }

    public final uo4 s() {
        return (uo4) this.Y.getValue();
    }

    public final deq t() {
        return (deq) this.B.getValue();
    }

    public final void u(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
            charSequence.getClass();
        }
        t().w(aeq.c, charSequence);
    }
}
