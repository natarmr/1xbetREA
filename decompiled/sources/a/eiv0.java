package a;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class eiv0 extends liv0 {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public pfx f;

    public eiv0() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // a.liv0
    public xiv0 b() {
        a();
        xiv0 xiv0VarH = xiv0.h(this.e, null);
        pfx[] pfxVarArr = this.b;
        uiv0 uiv0Var = xiv0VarH.f40966a;
        uiv0Var.w(pfxVarArr);
        uiv0Var.z(this.f);
        uiv0Var.v(null);
        uiv0Var.B(this.c);
        uiv0Var.C(this.d);
        return xiv0VarH;
    }

    @Override // a.liv0
    public void f(pfx pfxVar) {
        this.f = pfxVar;
    }

    @Override // a.liv0
    public void h(pfx pfxVar) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(pfxVar.f26926a, pfxVar.b, pfxVar.c, pfxVar.d);
        }
    }

    public eiv0(xiv0 xiv0Var) {
        super(xiv0Var);
        this.e = xiv0Var.g();
    }
}
