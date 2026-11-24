package a;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d0q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f5279a = new LinkedHashMap();

    public static String a(String str, cb50 cb50Var) {
        str.getClass();
        cb50Var.getClass();
        return str.concat(cb50Var.f4046a);
    }

    public static xwi b(String str, Fragment fragment, String str2, i1w0 i1w0Var) {
        str2.getClass();
        i1w0Var.getClass();
        LinkedHashMap linkedHashMap = f5279a;
        xwi xwiVar = (xwi) linkedHashMap.get(str);
        if (xwiVar != null) {
            return xwiVar;
        }
        ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
        af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(c0q0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof c0q0)) {
                ze3Var = null;
            }
            c0q0 c0q0Var = (c0q0) ze3Var;
            if (c0q0Var != null) {
                cad cadVar = c0q0Var.f3536a;
                duj dujVar = c0q0Var.b;
                gii0 gii0Var = c0q0Var.c;
                m1e m1eVar = c0q0Var.d;
                wyu wyuVar = c0q0Var.e;
                ocl oclVar = c0q0Var.f;
                ctf0 ctf0Var = c0q0Var.g;
                knf0 knf0Var = c0q0Var.h;
                ii iiVar = c0q0Var.i;
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                iiVar.getClass();
                xwi xwiVar2 = new xwi(cadVar, str2, str, i1w0Var, dujVar, gii0Var, m1eVar, oclVar, ctf0Var, knf0Var, iiVar);
                linkedHashMap.put(str, xwiVar2);
                return xwiVar2;
            }
        }
        jf4.n(b1j.i(c0q0.class, "Cannot create dependency "));
        return null;
    }
}
