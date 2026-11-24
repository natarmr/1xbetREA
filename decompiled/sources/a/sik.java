package a;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public class sik extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler H1;
    public final mx2 I1;
    public final pik J1;
    public final qik K1;
    public int L1;
    public int M1;
    public boolean N1;
    public boolean O1;
    public int P1;
    public boolean Q1;
    public final ydq R1;
    public Dialog S1;
    public boolean U1;
    public boolean V1;
    public boolean W1;
    public boolean X1;

    public sik() {
        this.I1 = new mx2(this, (byte) 5);
        this.J1 = new pik(this);
        this.K1 = new qik(this);
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = true;
        this.O1 = true;
        this.P1 = -1;
        this.R1 = new ydq(this, (byte) 2);
        this.X1 = false;
    }

    public Dialog A0() {
        return this.S1;
    }

    public int B0() {
        return this.M1;
    }

    public Dialog C0(Bundle bundle) {
        if (androidx.fragment.app.e.V(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new hgd(o0(), B0());
    }

    public final Dialog D0() {
        Dialog dialogA0 = A0();
        if (dialogA0 != null) {
            return dialogA0;
        }
        udk.d(this, " does not have a Dialog.", "DialogFragment ");
        return null;
    }

    public final void E0(boolean z) {
        this.N1 = z;
        Dialog dialog = this.S1;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public final void F0(int i, int i2) {
        if (androidx.fragment.app.e.V(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2);
        }
        this.L1 = i;
        if (i == 2 || i == 3) {
            this.M1 = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.M1 = i2;
        }
    }

    public void G0(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void H0(androidx.fragment.app.e eVar, String str) {
        this.V1 = false;
        this.W1 = true;
        eVar.getClass();
        zb5 zb5Var = new zb5(eVar);
        zb5Var.p = true;
        zb5Var.k(0, this, str, 1);
        zb5Var.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final void T() {
        this.j1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void V(Context context) {
        super.V(context);
        this.x1.f(this.R1);
        if (this.W1) {
            return;
        }
        this.V1 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        super.W(bundle);
        this.H1 = new Handler();
        this.O1 = this.A == 0;
        if (bundle != null) {
            this.L1 = bundle.getInt("android:style", 0);
            this.M1 = bundle.getInt("android:theme", 0);
            this.N1 = bundle.getBoolean("android:cancelable", true);
            this.O1 = bundle.getBoolean("android:showsDialog", this.O1);
            this.P1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Z() {
        this.j1 = true;
        Dialog dialog = this.S1;
        if (dialog != null) {
            this.U1 = true;
            dialog.setOnDismissListener(null);
            this.S1.dismiss();
            if (!this.V1) {
                onDismiss(this.S1);
            }
            this.S1 = null;
            this.X1 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void a0() {
        this.j1 = true;
        if (!this.W1 && !this.V1) {
            this.V1 = true;
        }
        this.x1.j(this.R1);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater b0(Bundle bundle) {
        LayoutInflater layoutInflaterB0 = super.b0(bundle);
        boolean z = this.O1;
        if (z && !this.Q1) {
            if (z && !this.X1) {
                try {
                    this.Q1 = true;
                    Dialog dialogC0 = C0(bundle);
                    this.S1 = dialogC0;
                    if (this.O1) {
                        G0(dialogC0, this.L1);
                        Context contextD = D();
                        if (contextD instanceof Activity) {
                            this.S1.setOwnerActivity((Activity) contextD);
                        }
                        this.S1.setCancelable(this.N1);
                        this.S1.setOnCancelListener(this.J1);
                        this.S1.setOnDismissListener(this.K1);
                        this.X1 = true;
                    } else {
                        this.S1 = null;
                    }
                    this.Q1 = false;
                } catch (Throwable th) {
                    this.Q1 = false;
                    throw th;
                }
            }
            if (androidx.fragment.app.e.V(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.S1;
            if (dialog != null) {
                return layoutInflaterB0.cloneInContext(dialog.getContext());
            }
        } else if (androidx.fragment.app.e.V(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.O1) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterB0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterB0;
    }

    @Override // androidx.fragment.app.Fragment
    public void f0(Bundle bundle) {
        Dialog dialog = this.S1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.L1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.M1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.N1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.O1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.P1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void g0() {
        this.j1 = true;
        Dialog dialog = this.S1;
        if (dialog != null) {
            this.U1 = false;
            dialog.show();
            View decorView = this.S1.getWindow().getDecorView();
            s7n0.x(decorView, this);
            decorView.setTag(org.xbet.client1.R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(org.xbet.client1.R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void h0() {
        this.j1 = true;
        Dialog dialog = this.S1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void j0(Bundle bundle) {
        Bundle bundle2;
        this.j1 = true;
        if (this.S1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.S1.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void k0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.k0(layoutInflater, viewGroup, bundle);
        if (this.l1 != null || this.S1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.S1.onRestoreInstanceState(bundle2);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.U1) {
            return;
        }
        if (androidx.fragment.app.e.V(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        z0(true, true, false);
    }

    public void x0() {
        z0(false, false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final vbc y() {
        return new rik(this, new bxq(this));
    }

    public void y0() {
        z0(true, false, false);
    }

    public final void z0(boolean z, boolean z2, boolean z3) {
        if (this.V1) {
            return;
        }
        this.V1 = true;
        this.W1 = false;
        Dialog dialog = this.S1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.S1.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.H1.getLooper()) {
                    onDismiss(this.S1);
                } else {
                    this.H1.post(this.I1);
                }
            }
        }
        this.U1 = true;
        if (this.P1 >= 0) {
            if (z3) {
                androidx.fragment.app.e eVarF = F();
                int i = this.P1;
                if (i < 0) {
                    jf4.o(twn.m(i, "Bad id: "));
                    return;
                }
                eVarF.h0(i, 1);
            } else {
                F().e0(this.P1, 1, z);
            }
            this.P1 = -1;
            return;
        }
        zb5 zb5Var = new zb5(F());
        zb5Var.p = true;
        zb5Var.n(this);
        if (z3) {
            zb5Var.h();
        } else if (z) {
            zb5Var.g(true, true);
        } else {
            zb5Var.f();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public sik(int i) {
        super(i);
        this.I1 = new mx2(this, (byte) 5);
        this.J1 = new pik(this);
        this.K1 = new qik(this);
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = true;
        this.O1 = true;
        this.P1 = -1;
        this.R1 = new ydq(this, (byte) 2);
        this.X1 = false;
    }
}
