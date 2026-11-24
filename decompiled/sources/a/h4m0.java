package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class h4m0 extends wz30 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;
    public final ox30 c;
    public final mv30 d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final a040 i;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public b040 o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean u;
    public final de3 j = new de3(this, 7);
    public final bc0 k = new bc0(this, 13);
    public int t = 0;

    public h4m0(int i, int i2, ox30 ox30Var, Context context, View view, boolean z) {
        this.b = context;
        this.c = ox30Var;
        this.e = z;
        this.d = new mv30(ox30Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = view;
        this.i = new a040(context, null, i, i2);
        ox30Var.b(this, context);
    }

    @Override // a.c040
    public final boolean b(fzm0 fzm0Var) {
        boolean z;
        if (fzm0Var.hasVisibleItems()) {
            yz30 yz30Var = new yz30(this.g, this.h, fzm0Var, this.b, this.n, this.e);
            b040 b040Var = this.o;
            yz30Var.i = b040Var;
            wz30 wz30Var = yz30Var.j;
            if (wz30Var != null) {
                wz30Var.d(b040Var);
            }
            int size = fzm0Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = fzm0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            yz30Var.h = z;
            wz30 wz30Var2 = yz30Var.j;
            if (wz30Var2 != null) {
                wz30Var2.m(z);
            }
            yz30Var.k = this.l;
            this.l = null;
            this.c.c(false);
            a040 a040Var = this.i;
            int width = a040Var.f;
            int iN = a040Var.n();
            if ((Gravity.getAbsoluteGravity(this.t, this.m.getLayoutDirection()) & 7) == 5) {
                width += this.m.getWidth();
            }
            if (!yz30Var.b()) {
                if (yz30Var.f != null) {
                    yz30Var.d(width, iN, true, true);
                }
            }
            b040 b040Var2 = this.o;
            if (b040Var2 != null) {
                b040Var2.f(fzm0Var);
            }
            return true;
        }
        return false;
    }

    @Override // a.c040
    public final void c(ox30 ox30Var, boolean z) {
        if (ox30Var != this.c) {
            return;
        }
        dismiss();
        b040 b040Var = this.o;
        if (b040Var != null) {
            b040Var.c(ox30Var, z);
        }
    }

    @Override // a.c040
    public final void d(b040 b040Var) {
        this.o = b040Var;
    }

    @Override // a.tsj0
    public final void dismiss() {
        if (f()) {
            this.i.dismiss();
        }
    }

    @Override // a.c040
    public final void e() {
        this.r = false;
        mv30 mv30Var = this.d;
        if (mv30Var != null) {
            mv30Var.notifyDataSetChanged();
        }
    }

    @Override // a.tsj0
    public final boolean f() {
        return !this.q && this.i.z.isShowing();
    }

    @Override // a.c040
    public final boolean i() {
        return false;
    }

    @Override // a.wz30
    public final void l(View view) {
        this.m = view;
    }

    @Override // a.wz30
    public final void m(boolean z) {
        this.d.c = z;
    }

    @Override // a.wz30
    public final void n(int i) {
        this.t = i;
    }

    @Override // a.wz30
    public final void o(int i) {
        this.i.f = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // a.wz30
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // a.tsj0
    public final void q() {
        View view;
        if (f()) {
            return;
        }
        if (this.q || (view = this.m) == null) {
            jf4.n("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.n = view;
        a040 a040Var = this.i;
        xd3 xd3Var = a040Var.z;
        xd3 xd3Var2 = a040Var.z;
        xd3Var.setOnDismissListener(this);
        a040Var.p = this;
        a040Var.y = true;
        xd3Var2.setFocusable(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        a040Var.o = view2;
        a040Var.l = this.t;
        boolean z2 = this.r;
        Context context = this.b;
        mv30 mv30Var = this.d;
        if (!z2) {
            this.s = wz30.k(mv30Var, context, this.f);
            this.r = true;
        }
        a040Var.b(this.s);
        xd3Var2.setInputMethodMode(2);
        Rect rect = this.f40003a;
        a040Var.x = rect != null ? new Rect(rect) : null;
        a040Var.q();
        hil hilVar = a040Var.c;
        hilVar.setOnKeyListener(this);
        if (this.u) {
            ox30 ox30Var = this.c;
            if (ox30Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) hilVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(ox30Var.m);
                }
                frameLayout.setEnabled(false);
                hilVar.addHeaderView(frameLayout, null, false);
            }
        }
        a040Var.o(mv30Var);
        a040Var.q();
    }

    @Override // a.tsj0
    public final hil r() {
        return this.i.c;
    }

    @Override // a.wz30
    public final void s(boolean z) {
        this.u = z;
    }

    @Override // a.wz30
    public final void t(int i) {
        this.i.k(i);
    }
}
