package a;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tnk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cge0 f34240a;
    public static final tnk0 b;
    public static final tnk0 c;
    public static final tnk0 d;
    public static final tnk0 e;
    public static final /* synthetic */ tnk0[] f;

    static {
        tnk0 tnk0Var = new tnk0("REMOVED", 0);
        b = tnk0Var;
        tnk0 tnk0Var2 = new tnk0("VISIBLE", 1);
        c = tnk0Var2;
        tnk0 tnk0Var3 = new tnk0("GONE", 2);
        d = tnk0Var3;
        tnk0 tnk0Var4 = new tnk0("INVISIBLE", 3);
        e = tnk0Var4;
        f = new tnk0[]{tnk0Var, tnk0Var2, tnk0Var3, tnk0Var4};
        f34240a = new cge0((byte) 25);
    }

    public static tnk0 valueOf(String str) {
        return (tnk0) Enum.valueOf(tnk0.class, str);
    }

    public static tnk0[] values() {
        return (tnk0[]) f.clone();
    }

    public final void a(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (androidx.fragment.app.e.V(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (androidx.fragment.app.e.V(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (androidx.fragment.app.e.V(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            if (androidx.fragment.app.e.V(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iOrdinal != 3) {
            t9f.b();
            return;
        }
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
