package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class wo8 extends rd3 {
    public BottomSheetBehavior g;
    public FrameLayout h;
    public CoordinatorLayout i;
    public FrameLayout j;
    public boolean k;
    public boolean l;
    public boolean m;
    public vo8 n;
    public final boolean o;
    public yuu p;
    public final gw5 q;

    public wo8(Context context, int i) {
        byte b = 1;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.k = true;
        this.l = true;
        this.q = new gw5(this, b);
        e().y(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.o = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.g == null) {
            g();
        }
        super.cancel();
    }

    public final void g() {
        if (this.h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.h = frameLayout;
            this.i = (CoordinatorLayout) this.h.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(R.id.design_bottom_sheet);
            this.j = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorE = BottomSheetBehavior.E(frameLayout2);
            this.g = bottomSheetBehaviorE;
            bottomSheetBehaviorE.y(this.q);
            this.g.L(this.k);
            this.p = new yuu(this.g, this.j);
        }
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.o) {
            FrameLayout frameLayout = this.h;
            yk50 yk50Var = new yk50(this, (byte) 15);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(frameLayout, yk50Var);
        }
        this.j.removeAllViews();
        FrameLayout frameLayout2 = this.j;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new wh(this, (byte) 2));
        rgu0.o(this.j, new c46(this, (byte) 1));
        this.j.setOnTouchListener(new e46((byte) 1));
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.o) {
                if (Color.alpha(Build.VERSION.SDK_INT < 35 ? window.getNavigationBarColor() : 0) < 255) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            bcm0.x(window, !z);
            vo8 vo8Var = this.n;
            if (vo8Var != null) {
                vo8Var.e(window);
            }
        }
        yuu yuuVar = this.p;
        if (yuuVar == null) {
            return;
        }
        View view = (View) yuuVar.d;
        boolean z2 = this.k;
        qh30 qh30Var = (qh30) yuuVar.b;
        if (z2) {
            if (qh30Var != null) {
                qh30Var.b((ph30) yuuVar.c, view, false);
            }
        } else if (qh30Var != null) {
            qh30Var.c(view);
        }
    }

    @Override // a.rd3, a.hgd, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        qh30 qh30Var;
        vo8 vo8Var = this.n;
        if (vo8Var != null) {
            vo8Var.e(null);
        }
        yuu yuuVar = this.p;
        if (yuuVar == null || (qh30Var = (qh30) yuuVar.b) == null) {
            return;
        }
        qh30Var.c((View) yuuVar.d);
    }

    @Override // a.hgd, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.P != 5) {
            return;
        }
        bottomSheetBehavior.N(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        yuu yuuVar;
        super.setCancelable(z);
        if (this.k != z) {
            this.k = z;
            BottomSheetBehavior bottomSheetBehavior = this.g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.L(z);
            }
            if (getWindow() == null || (yuuVar = this.p) == null) {
                return;
            }
            View view = (View) yuuVar.d;
            boolean z2 = this.k;
            qh30 qh30Var = (qh30) yuuVar.b;
            if (z2) {
                if (qh30Var != null) {
                    qh30Var.b((ph30) yuuVar.c, view, false);
                }
            } else if (qh30Var != null) {
                qh30Var.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override // a.rd3, a.hgd, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // a.rd3, a.hgd, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // a.rd3, a.hgd, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
