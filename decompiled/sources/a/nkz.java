package a;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nkz {
    protected final alz mLifecycleFragment;

    public nkz(alz alzVar) {
        this.mLifecycleFragment = alzVar;
    }

    public static alz getFragment(mkz mkzVar) {
        jbw0 jbw0Var;
        xpw0 xpw0Var;
        Activity activity = mkzVar.f21965a;
        if (!(activity instanceof kxq)) {
            WeakHashMap weakHashMap = jbw0.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (jbw0Var = (jbw0) weakReference.get()) != null) {
                return jbw0Var;
            }
            try {
                jbw0 jbw0Var2 = (jbw0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (jbw0Var2 == null || jbw0Var2.isRemoving()) {
                    jbw0Var2 = new jbw0();
                    activity.getFragmentManager().beginTransaction().add(jbw0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(jbw0Var2));
                return jbw0Var2;
            } catch (ClassCastException e) {
                hny.q("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
                return null;
            }
        }
        kxq kxqVar = (kxq) activity;
        WeakHashMap weakHashMap2 = xpw0.I1;
        v1r v1rVarR = kxqVar.r();
        WeakHashMap weakHashMap3 = xpw0.I1;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(kxqVar);
        if (weakReference2 != null && (xpw0Var = (xpw0) weakReference2.get()) != null) {
            return xpw0Var;
        }
        try {
            xpw0 xpw0Var2 = (xpw0) v1rVarR.J("SLifecycleFragmentImpl");
            if (xpw0Var2 == null || xpw0Var2.m) {
                xpw0Var2 = new xpw0();
                zb5 zb5Var = new zb5(v1rVarR);
                zb5Var.k(0, xpw0Var2, "SLifecycleFragmentImpl", 1);
                zb5Var.g(true, true);
            }
            weakHashMap3.put(kxqVar, new WeakReference(xpw0Var2));
            return xpw0Var2;
        } catch (ClassCastException e2) {
            hny.q("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
            return null;
        }
    }

    public Activity getActivity() {
        Activity activityR = this.mLifecycleFragment.r();
        s0x.H(activityR);
        return activityR;
    }

    public abstract void onStop();

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public static alz getFragment(Activity activity) {
        return getFragment(new mkz(activity));
    }

    public static alz getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
