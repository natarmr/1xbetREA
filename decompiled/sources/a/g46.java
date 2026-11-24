package a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.xbet.client1.R;
import org.xplatform.uikit.components.snackbar.DsSnackBarView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g46 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10649a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final f46 i;
    public final DsSnackBarView j;
    public int k;
    public final b46 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public ArrayList s;
    public final AccessibilityManager t;
    public final d46 u;
    public static final f0p v = n73.b;
    public static final LinearInterpolator w = n73.f23021a;
    public static final f0p x = n73.d;
    public static final int[] z = {R.attr.snackbarStyle};
    public static final String A = g46.class.getSimpleName();
    public static final Handler y = new Handler(Looper.getMainLooper(), new sz3(1));

    public g46(ViewGroup viewGroup, DsSnackBarView dsSnackBarView, DsSnackBarView dsSnackBarView2) {
        Context context = viewGroup.getContext();
        byte b = 0;
        this.l = new b46(this, b);
        this.u = new d46(this);
        this.g = viewGroup;
        this.j = dsSnackBarView2;
        this.h = context;
        mrv.e0(context, mrv.k, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(z);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        f46 f46Var = (f46) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = f46Var;
        f46Var.setBaseTransientBottomBar(this);
        f46Var.addView(dsSnackBarView);
        f46Var.setAccessibilityLiveRegion(1);
        f46Var.setImportantForAccessibility(1);
        f46Var.setFitsSystemWindows(true);
        ok50 ok50Var = new ok50(this);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(f46Var, ok50Var);
        rgu0.o(f46Var, new c46(this, b));
        this.t = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = n6x.T(context, R.attr.motionDurationLong2, 250);
        this.f10649a = n6x.T(context, R.attr.motionDurationLong2, 150);
        this.b = n6x.T(context, R.attr.motionDurationMedium1, 75);
        this.d = g7x.W(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.f = g7x.W(context, R.attr.motionEasingEmphasizedInterpolator, x);
        this.e = g7x.W(context, R.attr.motionEasingEmphasizedInterpolator, v);
    }

    public final void a(int i) {
        n660 n660VarQ = n660.q();
        d46 d46Var = this.u;
        synchronized (n660VarQ.f22981a) {
            try {
                if (n660VarQ.B(d46Var)) {
                    n660VarQ.c((sdk0) n660VarQ.c, i);
                } else {
                    sdk0 sdk0Var = (sdk0) n660VarQ.d;
                    if ((sdk0Var == null || d46Var == null || sdk0Var.f32039a.get() != d46Var) ? false : true) {
                        n660VarQ.c((sdk0) n660VarQ.d, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z2;
        n660 n660VarQ = n660.q();
        d46 d46Var = this.u;
        synchronized (n660VarQ.f22981a) {
            z2 = true;
            if (!n660VarQ.B(d46Var)) {
                sdk0 sdk0Var = (sdk0) n660VarQ.d;
                if (!((sdk0Var == null || d46Var == null || sdk0Var.f32039a.get() != d46Var) ? false : true)) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    public final void c(int i) {
        n660 n660VarQ = n660.q();
        d46 d46Var = this.u;
        synchronized (n660VarQ.f22981a) {
            try {
                if (n660VarQ.B(d46Var)) {
                    n660VarQ.c = null;
                    if (((sdk0) n660VarQ.d) != null) {
                        n660VarQ.J();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                wq wqVar = (wq) this.s.get(size);
                switch (wqVar.f39567a) {
                    case 0:
                        wqVar.b.invoke();
                        break;
                    default:
                        ((zbg0) wqVar.b).invoke();
                        break;
                }
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        n660 n660VarQ = n660.q();
        d46 d46Var = this.u;
        synchronized (n660VarQ.f22981a) {
            try {
                if (n660VarQ.B(d46Var)) {
                    n660VarQ.G((sdk0) n660VarQ.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((wq) this.s.get(size)).getClass();
            }
        }
    }

    public final void e() {
        n660 n660VarQ = n660.q();
        int i = this.k;
        d46 d46Var = this.u;
        synchronized (n660VarQ.f22981a) {
            try {
                if (n660VarQ.B(d46Var)) {
                    sdk0 sdk0Var = (sdk0) n660VarQ.c;
                    sdk0Var.b = i;
                    ((Handler) n660VarQ.b).removeCallbacksAndMessages(sdk0Var);
                    n660VarQ.G((sdk0) n660VarQ.c);
                    return;
                }
                sdk0 sdk0Var2 = (sdk0) n660VarQ.d;
                if ((sdk0Var2 == null || d46Var == null || sdk0Var2.f32039a.get() != d46Var) ? false : true) {
                    ((sdk0) n660VarQ.d).b = i;
                } else {
                    n660VarQ.d = new sdk0(i, d46Var);
                }
                sdk0 sdk0Var3 = (sdk0) n660VarQ.c;
                if (sdk0Var3 == null || !n660VarQ.c(sdk0Var3, 4)) {
                    n660VarQ.c = null;
                    n660VarQ.J();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.t;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        f46 f46Var = this.i;
        if (z2) {
            f46Var.post(new b46(this, (byte) 2));
            return;
        }
        if (f46Var.getParent() != null) {
            f46Var.setVisibility(0);
        }
        d();
    }

    public final void g() {
        f46 f46Var = this.i;
        ViewGroup.LayoutParams layoutParams = f46Var.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = A;
        if (!z2) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (f46Var.j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (f46Var.getParent() == null) {
            return;
        }
        int i = this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = f46Var.j;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.n;
        int i4 = rect.right + this.o;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            f46Var.requestLayout();
        }
        if ((z3 || this.q != this.p) && Build.VERSION.SDK_INT >= 29 && this.p > 0) {
            ViewGroup.LayoutParams layoutParams2 = f46Var.getLayoutParams();
            if ((layoutParams2 instanceof ble) && (((ble) layoutParams2).f2790a instanceof SwipeDismissBehavior)) {
                b46 b46Var = this.l;
                f46Var.removeCallbacks(b46Var);
                f46Var.post(b46Var);
            }
        }
    }
}
