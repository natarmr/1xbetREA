package a;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class wlf0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, kkz kkzVar) {
        activity.getClass();
        kkzVar.getClass();
        if (activity instanceof clz) {
            glz glzVarX = ((clz) activity).x();
            if (glzVarX instanceof glz) {
                glzVarX.d(kkzVar);
            }
        }
    }

    public static void b(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            ylf0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new ylf0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ylf0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
