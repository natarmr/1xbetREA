package a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/ix5;", "La/sik;", "<init>", "()V", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class ix5 extends sik {
    public static int c2;
    public final o85 Y1 = new o85((byte) 17);
    public boolean Z1 = true;
    public Button a2;
    public Button b2;

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        Context contextO0 = o0();
        if (c2 <= 0) {
            int dimensionPixelSize = contextO0.getResources().getDimensionPixelSize(R.dimen.popup_width);
            int iMin = Math.min(contextO0.getResources().getDisplayMetrics().heightPixels, contextO0.getResources().getDisplayMetrics().widthPixels);
            c2 = iMin;
            c2 = Math.min(iMin, dimensionPixelSize) - (contextO0.getResources().getDimensionPixelSize(R.dimen.space_8) * 2);
        }
        lh30 lh30Var = new lh30(o0(), L0());
        lh30Var.c();
        if (J0() != null) {
            yfu0 yfu0VarJ0 = J0();
            lh30Var.d(yfu0VarJ0 != null ? yfu0VarJ0.getRoot() : null);
        }
        if (P0() != 0) {
            lh30Var.b(P0());
        }
        if (N0() != 0) {
            lh30Var.a(N0());
        }
        R0(lh30Var);
        k12 k12VarCreate = lh30Var.create();
        k12VarCreate.setCanceledOnTouchOutside(true);
        return k12VarCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public final View J() {
        View root;
        yfu0 yfu0VarJ0 = J0();
        return (yfu0VarJ0 == null || (root = yfu0VarJ0.getRoot()) == null) ? new FrameLayout(o0()) : root;
    }

    public yfu0 J0() {
        return null;
    }

    public final Button K0(int i) {
        Dialog dialog = this.S1;
        if (dialog != null) {
            k12 k12Var = dialog instanceof k12 ? (k12) dialog : null;
            if (k12Var != null) {
                i12 i12Var = k12Var.g;
                if (i == -3) {
                    return i12Var.n;
                }
                if (i == -2) {
                    return i12Var.k;
                }
                if (i == -1) {
                    return i12Var.h;
                }
                i12Var.getClass();
                return null;
            }
        }
        return null;
    }

    public int L0() {
        return R.style.ThemeOverlay_AppTheme_MaterialAlertDialog;
    }

    public int N0() {
        return 0;
    }

    public int P0() {
        return 0;
    }

    public void S0() {
        Window window;
        Dialog dialog = this.S1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(c2, -2);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        Log.i("onCreate", "Current screen: ".concat(getClass().getName()));
        super.W(bundle);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        View root;
        if (J0() != null) {
            yfu0 yfu0VarJ0 = J0();
            ViewParent parent = (yfu0VarJ0 == null || (root = yfu0VarJ0.getRoot()) == null) ? null : root.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                yfu0 yfu0VarJ1 = J0();
                viewGroup.removeView(yfu0VarJ1 != null ? yfu0VarJ1.getRoot() : null);
            }
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        this.a2 = K0(-1);
        this.b2 = K0(-2);
        K0(-3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        final byte b = 0;
        layoutParams.setMargins(G().getDimensionPixelSize(R.dimen.space_8), 0, 0, 0);
        if (P0() != 0) {
            Button button = this.a2;
            if (button != null) {
                button.setLayoutParams(layoutParams);
            }
            Button button2 = this.a2;
            if (button2 != null) {
                dyb.O(button2, new Function1(this) { // from class: a.fx5
                    public final /* synthetic */ ix5 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b2 = b;
                        ix5 ix5Var = this.b;
                        View view = (View) obj;
                        switch (b2) {
                            case 0:
                                view.getClass();
                                ix5Var.Q0();
                                break;
                            default:
                                view.getClass();
                                ix5Var.O0();
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            }
        }
        final byte b2 = 1;
        if (N0() != 0) {
            Button button3 = this.b2;
            if (button3 != null) {
                button3.setLayoutParams(layoutParams);
            }
            Button button4 = this.b2;
            if (button4 != null) {
                dyb.O(button4, new Function1(this) { // from class: a.fx5
                    public final /* synthetic */ ix5 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        ix5 ix5Var = this.b;
                        View view = (View) obj;
                        switch (b3) {
                            case 0:
                                view.getClass();
                                ix5Var.Q0();
                                break;
                            default:
                                view.getClass();
                                ix5Var.O0();
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            }
        }
        M0();
        if (this.Z1) {
            this.Z1 = false;
        }
        Dialog dialog = this.S1;
        if (dialog != null) {
            dialog.setOnCancelListener(new gx5(this, (byte) 0));
        }
        this.j1 = true;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        Window window;
        Window.Callback callback;
        Dialog dialog;
        Window window2;
        super.g0();
        S0();
        Dialog dialog2 = this.S1;
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (callback = window.getCallback()) == null || (dialog = this.S1) == null || (window2 = dialog.getWindow()) == null) {
            return;
        }
        window2.setCallback(new hx5(callback, (byte) 0));
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        this.Y1.getClass();
    }

    public void I0() {
    }

    public void M0() {
    }

    public void O0() {
    }

    public void Q0() {
    }

    public void R0(lh30 lh30Var) {
    }
}
