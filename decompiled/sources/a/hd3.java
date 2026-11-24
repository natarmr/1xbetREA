package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class hd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gd3 f12850a = new gd3(new haw0(1));
    public static final int b = -100;
    public static ss00 c = null;
    public static ss00 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final lx3 g = new lx3(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static void b(hd3 hd3Var) {
        synchronized (h) {
            x(hd3Var);
            g.add(new WeakReference(hd3Var));
        }
    }

    public static boolean o(Context context) {
        if (e == null) {
            try {
                int i2 = of3.f25146a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) of3.class), 640).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void x(hd3 hd3Var) {
        synchronized (h) {
            try {
                lx3 lx3Var = g;
                lx3Var.getClass();
                bx3 bx3Var = new bx3(lx3Var);
                while (bx3Var.hasNext()) {
                    hd3 hd3Var2 = (hd3) ((WeakReference) bx3Var.next()).get();
                    if (hd3Var2 == hd3Var || hd3Var2 == null) {
                        bx3Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void A(View view);

    public abstract void B(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void C(int i2);

    public abstract void D(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract Context e(Context context);

    public abstract View g(View view, String str, Context context, AttributeSet attributeSet);

    public abstract View h(int i2);

    public abstract Context i();

    public abstract int j();

    public abstract MenuInflater k();

    public abstract qhv0 l();

    public abstract void m();

    public abstract void n();

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return g(view, str, context, attributeSet);
    }

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void v();

    public abstract void w();

    public abstract boolean y(int i2);

    public abstract void z(int i2);

    public void d(Context context) {
    }

    public void u(Bundle bundle) {
    }
}
