package a;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class k5r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j5r f17734a = j5r.c;

    public static j5r a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.N()) {
                fragment.F();
            }
            fragment = fragment.y;
        }
        return f17734a;
    }

    public static void b(j5r j5rVar, wmu0 wmu0Var) {
        Fragment fragment = wmu0Var.f39420a;
        String name = fragment.getClass().getName();
        Set set = j5rVar.f15946a;
        if (set.contains(i5r.f14206a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), wmu0Var);
        }
        if (set.contains(i5r.b)) {
            llo lloVar = new llo(name, wmu0Var, (byte) 3);
            if (!fragment.N()) {
                lloVar.run();
                throw null;
            }
            Handler handler = fragment.F().x.c;
            if (Intrinsics.d(handler.getLooper(), Looper.myLooper())) {
                lloVar.run();
                throw null;
            }
            handler.post(lloVar);
        }
    }

    public static void c(wmu0 wmu0Var) {
        if (androidx.fragment.app.e.V(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(wmu0Var.f39420a.getClass().getName()), wmu0Var);
        }
    }

    public static final void d(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        l4r l4rVar = new l4r(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        c(l4rVar);
        j5r j5rVarA = a(fragment);
        if (j5rVarA.f15946a.contains(i5r.c) && e(j5rVarA, fragment.getClass(), l4r.class)) {
            b(j5rVarA, l4rVar);
        }
    }

    public static boolean e(j5r j5rVar, Class cls, Class cls2) {
        Set set = (Set) j5rVar.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.d(cls2.getSuperclass(), wmu0.class) || !CollectionsKt.L(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
