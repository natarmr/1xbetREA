package a;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lme0 f45252a = new lme0((byte) 12);
    public static final gne0 b = new gne0((byte) 12);
    public static final cge0 c = new cge0((byte) 13);

    public static final vzg0 a(by40 by40Var) {
        vzg0 vzg0Var;
        LinkedHashMap linkedHashMap = by40Var.f38875a;
        i0h0 i0h0Var = (i0h0) linkedHashMap.get(f45252a);
        Bundle bundle = null;
        if (i0h0Var == null) {
            jf4.o("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        riu0 riu0Var = (riu0) linkedHashMap.get(b);
        if (riu0Var == null) {
            jf4.o("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(oiu0.f25329a);
        if (str == null) {
            jf4.o("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        g0h0 g0h0VarL = i0h0Var.h().L("androidx.lifecycle.internal.SavedStateHandlesProvider");
        a0h0 a0h0Var = g0h0VarL instanceof a0h0 ? (a0h0) g0h0VarL : null;
        if (a0h0Var == null) {
            jf4.n("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = c(riu0Var).b;
        vzg0 vzg0Var2 = (vzg0) linkedHashMap2.get(str);
        if (vzg0Var2 != null) {
            return vzg0Var2;
        }
        a0h0Var.b();
        Bundle bundle3 = a0h0Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                lun.f20680a.getClass();
                bundle4 = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                a0h0Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            vzg0Var = new vzg0();
        } else {
            ClassLoader classLoader = vzg0.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            vzg0Var = new vzg0(b8k0.a0(bundle2));
        }
        linkedHashMap2.put(str, vzg0Var);
        return vzg0Var;
    }

    public static final void b(i0h0 i0h0Var) {
        lkz lkzVar = i0h0Var.x().i;
        if (lkzVar != lkz.b && lkzVar != lkz.c) {
            itt0.m("Failed to enable `SavedStateHandle` for `", i0h0Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", lkzVar, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (i0h0Var.h().L("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            a0h0 a0h0Var = new a0h0(i0h0Var.h(), (riu0) i0h0Var);
            i0h0Var.h().S("androidx.lifecycle.internal.SavedStateHandlesProvider", a0h0Var);
            i0h0Var.x().a(new ige0(a0h0Var, (byte) 5));
        }
    }

    public static final b0h0 c(riu0 riu0Var) {
        yzg0 yzg0Var = new yzg0();
        wbf wbfVarO = u4n0.o(riu0Var);
        wbfVarO.getClass();
        piu0 piu0VarG = riu0Var.g();
        piu0VarG.getClass();
        return (b0h0) new h0q0(piu0VarG, yzg0Var, wbfVarO).t(sre0.f32672a.b(b0h0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
