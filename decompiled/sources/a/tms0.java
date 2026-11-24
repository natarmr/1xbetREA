package a;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class tms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j15 f34210a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        j15 j15Var = new j15();
        j15Var.j1 = new ArrayList();
        j15Var.k1 = true;
        j15Var.m1 = false;
        j15Var.n1 = 0;
        j15Var.W();
        f34210a = j15Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, ewo ewoVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        gms0 gms0Var = ewoVar;
        if (ewoVar == null) {
            gms0Var = f34210a;
        }
        gms0 gms0VarClone = gms0Var.clone();
        d(frameLayout, gms0VarClone);
        frameLayout.setTag(R.id.transition_current_scene, null);
        c(frameLayout, gms0VarClone);
    }

    public static gx3 b() {
        gx3 gx3Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (gx3Var = (gx3) weakReference.get()) != null) {
            return gx3Var;
        }
        gx3 gx3Var2 = new gx3(0);
        threadLocal.set(new WeakReference(gx3Var2));
        return gx3Var2;
    }

    public static void c(ViewGroup viewGroup, gms0 gms0Var) {
        if (gms0Var != null) {
            sms0 sms0Var = new sms0();
            sms0Var.f32463a = gms0Var;
            sms0Var.b = viewGroup;
            viewGroup.addOnAttachStateChangeListener(sms0Var);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(sms0Var);
        }
    }

    public static void d(ViewGroup viewGroup, gms0 gms0Var) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((gms0) it.next()).G(viewGroup);
            }
        }
        if (gms0Var != null) {
            gms0Var.j(viewGroup, true);
        }
        x1h0 x1h0Var = (x1h0) viewGroup.getTag(R.id.transition_current_scene);
        if (x1h0Var != null) {
        }
    }
}
