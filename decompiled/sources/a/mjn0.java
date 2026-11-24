package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class mjn0 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ njn0 E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f21904a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public pz30 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public mjn0(njn0 njn0Var, Menu menu) {
        this.E = njn0Var;
        this.f21904a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        njn0 njn0Var = this.E;
        Context context = njn0Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                jf4.n("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objA = njn0Var.d;
            if (objA == null) {
                objA = njn0.a(context);
                njn0Var.d = objA;
            }
            String str = this.y;
            ljn0 ljn0Var = new ljn0();
            ljn0Var.b = objA;
            Class<?> cls = objA.getClass();
            try {
                ljn0Var.c = cls.getMethod(str, ljn0.d);
                menuItem.setOnMenuItemClickListener(ljn0Var);
            } catch (Exception e) {
                StringBuilder sbT = kng0.t("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbT.append(cls.getName());
                InflateException inflateException = new InflateException(sbT.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof hz30) {
                hz30 hz30Var = (hz30) menuItem;
                hz30Var.x = (hz30Var.x & (-5)) | 4;
            } else if (menuItem instanceof sz30) {
                sz30 sz30Var = (sz30) menuItem;
                ojn0 ojn0Var = sz30Var.c;
                try {
                    Method declaredMethod = sz30Var.d;
                    if (declaredMethod == null) {
                        declaredMethod = ojn0Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        sz30Var.d = declaredMethod;
                    }
                    declaredMethod.invoke(ojn0Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, njn0.e, njn0Var.f23645a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        pz30 pz30Var = this.z;
        if (pz30Var != null) {
            if (menuItem instanceof ojn0) {
                ((ojn0) menuItem).a(pz30Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof ojn0;
        if (z2) {
            ((ojn0) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ga3.w(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((ojn0) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ga3.F(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((ojn0) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ga3.s(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((ojn0) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ga3.B(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((ojn0) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                ga3.A(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((ojn0) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                ga3.z(menuItem, colorStateList);
            }
        }
    }
}
