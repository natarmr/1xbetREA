package a;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes.dex */
public final class j14 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15714a;
    public final Object b;
    public final Object c;

    public j14(ytj0 ytj0Var, Activity activity) {
        this.f15714a = (byte) 4;
        ytj0Var.getClass();
        this.b = ytj0Var;
        this.c = new WeakReference(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        byte b = this.f15714a;
        iBinder = null;
        iBinder = null;
        IBinder iBinder = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                view.getClass();
                ((View) obj2).removeOnAttachStateChangeListener(this);
                k14 k14Var = (k14) obj;
                ViewParent parent = k14Var.f17500a.getParent();
                Object parent2 = parent != null ? parent.getParent() : null;
                k14Var.f(parent2 instanceof View ? (View) parent2 : null, (View) k14Var.h.get());
                break;
            case 1:
                view.getClass();
                ((View) obj2).removeOnAttachStateChangeListener(this);
                kxq kxqVarB = ((by5) obj).B();
                jkf0 jkf0Var = kxqVarB instanceof jkf0 ? (jkf0) kxqVarB : null;
                if (jkf0Var != null) {
                    ApplicationActivity applicationActivity = (ApplicationActivity) jkf0Var;
                    if (applicationActivity.A1 != null) {
                        applicationActivity.A();
                    }
                }
                break;
            case 2:
                androidx.fragment.app.f fVar = (androidx.fragment.app.f) obj2;
                Fragment fragment = fVar.c;
                fVar.k();
                nxj.i((ViewGroup) fragment.l1.getParent(), ((w0r) obj).f38364a).h();
                break;
            case 3:
                view.getClass();
                ((yge0) obj2).v((l5g) obj);
                break;
            case 4:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) obj).get();
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (activity != null && iBinder != null) {
                    ((ytj0) obj2).c(iBinder, activity);
                }
                break;
            case 5:
                ((ViewGroup) obj2).addView((a9o0) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                x1 x1Var = (x1) obj2;
                clz clzVarL = s7n0.l(x1Var);
                if (clzVarL == null) {
                    xcx.c("View tree for " + x1Var + " has no ViewTreeLifecycleOwner");
                    csj.b();
                } else {
                    ((mie0) obj).f21842a = lvm0.l(x1Var, clzVarL.x());
                    x1Var.removeOnAttachStateChangeListener(this);
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.f15714a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                view.getClass();
                break;
            case 1:
                view.getClass();
                break;
            case 2:
                break;
            case 3:
                view.getClass();
                ((yge0) obj2).y((l5g) obj);
                break;
            case 4:
                view.getClass();
                break;
            case 5:
                ((ViewGroup) obj2).addView((a9o0) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                break;
            default:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((fge0) obj).A();
                break;
        }
    }

    public j14(w0r w0rVar, androidx.fragment.app.f fVar) {
        this.f15714a = (byte) 2;
        this.c = w0rVar;
        this.b = fVar;
    }

    public /* synthetic */ j14(Object obj, Object obj2, byte b) {
        this.f15714a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
