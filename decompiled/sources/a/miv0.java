package a;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class miv0 extends uiv0 {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public pfx[] d;
    public pfx e;
    public xiv0 f;
    public pfx g;
    public int h;
    public awk i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public miv0(xiv0 xiv0Var, WindowInsets windowInsets) {
        super(xiv0Var);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private awk D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f35752a.f40966a.t()) {
            return awk.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        tgg0 tgg0VarJ = lmc.J(display, 0);
        tgg0 tgg0VarJ2 = lmc.J(display, 1);
        tgg0 tgg0VarJ3 = lmc.J(display, 2);
        tgg0 tgg0VarJ4 = lmc.J(display, 3);
        return awk.a(point.x, point.y, false, tgg0VarJ != null ? tgg0VarJ.b : 0, tgg0VarJ2 != null ? tgg0VarJ2.b : 0, tgg0VarJ3 != null ? tgg0VarJ3.b : 0, tgg0VarJ4 != null ? tgg0VarJ4.b : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[xcm0.k(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(pfx pfxVar) {
        ArrayList arrayList = new ArrayList();
        int i = pfxVar.f26926a;
        int i2 = pfxVar.d;
        int i3 = pfxVar.c;
        int i4 = pfxVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, pfxVar.f26926a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private pfx G(int i, boolean z) {
        pfx pfxVarA = pfx.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                pfxVarA = pfx.a(pfxVarA, H(i2, z));
            }
        }
        return pfxVarA;
    }

    private pfx I() {
        xiv0 xiv0Var = this.f;
        return xiv0Var != null ? xiv0Var.f40966a.l() : pfx.e;
    }

    private pfx J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            v4i0.p("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = o;
        if (method != null && p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(objInvoke));
                if (rect != null) {
                    return pfx.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // a.uiv0
    public void A(int i) {
        this.h = i;
    }

    @Override // a.uiv0
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // a.uiv0
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public pfx H(int i, boolean z) {
        pfx pfxVarL;
        int i2;
        pfx pfxVar = pfx.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    pfx[] pfxVarArr = this.d;
                    pfxVarL = pfxVarArr != null ? pfxVarArr[xcm0.k(8)] : null;
                    if (pfxVarL != null) {
                        return pfxVarL;
                    }
                    pfx pfxVarN = n();
                    pfx pfxVarI = I();
                    int i3 = pfxVarN.d;
                    if (i3 > pfxVarI.d) {
                        return pfx.c(0, 0, 0, i3);
                    }
                    pfx pfxVar2 = this.g;
                    if (pfxVar2 != null && !pfxVar2.equals(pfxVar) && (i2 = this.g.d) > pfxVarI.d) {
                        return pfx.c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        xiv0 xiv0Var = this.f;
                        vvk vvkVarH = xiv0Var != null ? xiv0Var.f40966a.h() : h();
                        if (vvkVarH != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return pfx.c(i4 >= 28 ? ia3.u(vvkVarH.f38104a) : 0, i4 >= 28 ? ia3.w(vvkVarH.f38104a) : 0, i4 >= 28 ? ia3.v(vvkVarH.f38104a) : 0, i4 >= 28 ? ia3.t(vvkVarH.f38104a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    pfx pfxVarI2 = I();
                    pfx pfxVarL2 = l();
                    return pfx.c(Math.max(pfxVarI2.f26926a, pfxVarL2.f26926a), 0, Math.max(pfxVarI2.c, pfxVarL2.c), Math.max(pfxVarI2.d, pfxVarL2.d));
                }
                if ((this.h & 2) == 0) {
                    pfx pfxVarN2 = n();
                    xiv0 xiv0Var2 = this.f;
                    pfxVarL = xiv0Var2 != null ? xiv0Var2.f40966a.l() : null;
                    int iMin = pfxVarN2.d;
                    if (pfxVarL != null) {
                        iMin = Math.min(iMin, pfxVarL.d);
                    }
                    return pfx.c(pfxVarN2.f26926a, 0, pfxVarN2.c, iMin);
                }
            }
        } else {
            if (z) {
                return pfx.c(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return pfx.c(0, n().b, 0, 0);
            }
        }
        return pfxVar;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(pfx.e);
    }

    @Override // a.uiv0
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        pfx pfxVarJ = J(view);
        if (pfxVarJ == null) {
            pfxVarJ = pfx.e;
        }
        x(pfxVarJ);
    }

    @Override // a.uiv0
    public void e(xiv0 xiv0Var) {
        xiv0Var.f40966a.y(this.f);
        pfx pfxVar = this.g;
        uiv0 uiv0Var = xiv0Var.f40966a;
        uiv0Var.x(pfxVar);
        uiv0Var.A(this.h);
        uiv0Var.v(this.i);
        uiv0Var.B(this.l);
        uiv0Var.C(this.m);
    }

    @Override // a.uiv0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        miv0 miv0Var = (miv0) obj;
        return Objects.equals(this.g, miv0Var.g) && M(this.h, miv0Var.h);
    }

    @Override // a.uiv0
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // a.uiv0
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // a.uiv0
    public pfx i(int i) {
        return G(i, false);
    }

    @Override // a.uiv0
    public pfx j(int i) {
        return G(i, true);
    }

    @Override // a.uiv0
    public final pfx n() {
        pfx pfxVar = this.e;
        if (pfxVar != null) {
            return pfxVar;
        }
        WindowInsets windowInsets = this.c;
        pfx pfxVarC = pfx.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = pfxVarC;
        return pfxVarC;
    }

    @Override // a.uiv0
    public void p(View view) {
        this.i = D(view);
    }

    @Override // a.uiv0
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iK = xcm0.k(i);
            this.l[iK] = F(i(i));
            if (i != 8) {
                this.m[iK] = F(j(i));
            }
        }
    }

    @Override // a.uiv0
    public xiv0 r(int i, int i2, int i3, int i4) {
        liv0 fiv0Var;
        xiv0 xiv0VarH = xiv0.h(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            fiv0Var = new kiv0(xiv0VarH);
        } else if (i5 >= 35) {
            fiv0Var = new jiv0(xiv0VarH);
        } else if (i5 >= 34) {
            fiv0Var = new iiv0(xiv0VarH);
        } else if (i5 >= 31) {
            fiv0Var = new hiv0(xiv0VarH);
        } else if (i5 >= 30) {
            fiv0Var = new giv0(xiv0VarH);
        } else {
            fiv0Var = i5 >= 29 ? new fiv0(xiv0VarH) : new eiv0(xiv0VarH);
        }
        fiv0Var.h(xiv0.e(n(), i, i2, i3, i4));
        fiv0Var.f(xiv0.e(l(), i, i2, i3, i4));
        return fiv0Var.b();
    }

    @Override // a.uiv0
    public boolean t() {
        return this.c.isRound();
    }

    @Override // a.uiv0
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // a.uiv0
    public void v(awk awkVar) {
        this.i = awkVar;
    }

    @Override // a.uiv0
    public void w(pfx[] pfxVarArr) {
        this.d = pfxVarArr;
    }

    @Override // a.uiv0
    public void x(pfx pfxVar) {
        this.g = pfxVar;
    }

    @Override // a.uiv0
    public void y(xiv0 xiv0Var) {
        this.f = xiv0Var;
    }

    public miv0(xiv0 xiv0Var, miv0 miv0Var) {
        this(xiv0Var, new WindowInsets(miv0Var.c));
    }
}
