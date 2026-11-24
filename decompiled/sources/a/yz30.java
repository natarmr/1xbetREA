package a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class yz30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43499a;
    public final ox30 b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public b040 i;
    public wz30 j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final xz30 l = new xz30(this);

    public yz30(int i, int i2, ox30 ox30Var, Context context, View view, boolean z) {
        this.f43499a = context;
        this.b = ox30Var;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final wz30 a() {
        wz30 h4m0Var;
        wz30 wz30Var = this.j;
        if (wz30Var != null) {
            return wz30Var;
        }
        Context context = this.f43499a;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int iMin = Math.min(point.x, point.y);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
        Context context2 = this.f43499a;
        if (iMin >= dimensionPixelSize) {
            h4m0Var = new wva(context2, this.f, this.d, this.e, this.c);
        } else {
            View view = this.f;
            h4m0Var = new h4m0(this.d, this.e, this.b, context2, view, this.c);
        }
        h4m0Var.j(this.b);
        h4m0Var.p(this.l);
        h4m0Var.l(this.f);
        h4m0Var.d(this.i);
        h4m0Var.m(this.h);
        h4m0Var.n(this.g);
        this.j = h4m0Var;
        return h4m0Var;
    }

    public final boolean b() {
        wz30 wz30Var = this.j;
        return wz30Var != null && wz30Var.f();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        wz30 wz30VarA = a();
        wz30VarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            wz30VarA.o(i);
            wz30VarA.t(i2);
            int i3 = (int) ((this.f43499a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            wz30VarA.f40003a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        wz30VarA.q();
    }
}
