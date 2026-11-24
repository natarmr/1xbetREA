package a;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class hmu0 extends ibm0 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;

    public void H(View view, Matrix matrix) {
        if (d) {
            try {
                emu0.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void I(View view, int i, int i2, int i3, int i4) {
        if (g) {
            try {
                fmu0.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    public void J(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (h) {
                try {
                    gmu0.a(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    h = false;
                    return;
                }
            }
            return;
        }
        if (!ibm0.c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                ibm0.b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            ibm0.c = true;
        }
        Field field = ibm0.b;
        if (field != null) {
            try {
                ibm0.b.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void K(View view, Matrix matrix) {
        if (e) {
            try {
                emu0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }

    public void L(ViewGroup viewGroup, Matrix matrix) {
        if (f) {
            try {
                emu0.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
