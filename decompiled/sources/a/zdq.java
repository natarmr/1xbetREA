package a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class zdq extends sik {
    public final Handler Y1 = new Handler(Looper.getMainLooper());
    public final mx2 Z1 = new mx2(this, 11);
    public t58 a2;
    public int b2;
    public int c2;
    public ImageView d2;
    public TextView e2;

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        j12 j12Var = new j12(o0());
        yzn0 yzn0Var = this.a2.d;
        CharSequence charSequenceH = null;
        j12Var.setTitle(yzn0Var != null ? (CharSequence) yzn0Var.f43523a : null);
        View viewInflate = LayoutInflater.from(j12Var.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            yzn0 yzn0Var2 = this.a2.d;
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            yzn0 yzn0Var3 = this.a2.d;
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.d2 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.e2 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (hmw0.Z(this.a2.r)) {
            charSequenceH = H(R.string.confirm_device_credential_password);
        } else {
            t58 t58Var = this.a2;
            String str = t58Var.j;
            if (str != null) {
                charSequenceH = str;
            } else {
                yzn0 yzn0Var4 = t58Var.d;
                if (yzn0Var4 != null && (charSequenceH = (CharSequence) yzn0Var4.b) == null) {
                    charSequenceH = "";
                }
            }
        }
        so4 so4Var = new so4(this);
        f12 f12Var = j12Var.f15710a;
        f12Var.h = charSequenceH;
        f12Var.i = so4Var;
        j12Var.setView(viewInflate);
        k12 k12VarCreate = j12Var.create();
        k12VarCreate.setCanceledOnTouchOutside(false);
        return k12VarCreate;
    }

    public final int I0(int i) {
        Context contextD = D();
        if (contextD == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextD.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = contextD.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        byte b = 1;
        t58 t58VarP = m0x0.P(this, this.g.getBoolean("host_activity", true));
        this.a2 = t58VarP;
        hy40 hy40Var = t58VarP.B;
        if (hy40Var == null) {
            hy40Var = new hy40();
            t58VarP.B = hy40Var;
        }
        hy40Var.e(this, new ydq(this, 0 == true ? 1 : 0));
        t58 t58Var = this.a2;
        hy40 hy40Var2 = t58Var.C;
        if (hy40Var2 == null) {
            hy40Var2 = new hy40();
            t58Var.C = hy40Var2;
        }
        hy40Var2.e(this, new ydq(this, b));
        if (Build.VERSION.SDK_INT >= 26) {
            this.b2 = I0(R.attr.colorError);
        } else {
            Context contextD = D();
            this.b2 = contextD != null ? contextD.getColor(R.color.biometric_error_color) : 0;
        }
        this.c2 = I0(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        this.Y1.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        this.j1 = true;
        t58 t58Var = this.a2;
        t58Var.A = 0;
        t58Var.w(1);
        t58 t58Var2 = this.a2;
        String strH = H(R.string.fingerprint_dialog_touch_sensor);
        hy40 hy40Var = t58Var2.C;
        if (hy40Var == null) {
            hy40Var = new hy40();
            t58Var2.C = hy40Var;
        }
        t58.z(hy40Var, strH);
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        t58 t58Var = this.a2;
        hy40 hy40Var = t58Var.z;
        if (hy40Var == null) {
            hy40Var = new hy40();
            t58Var.z = hy40Var;
        }
        t58.z(hy40Var, Boolean.TRUE);
    }
}
