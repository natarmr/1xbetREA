package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tt7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f34496a = new LinkedHashMap();

    public static eai a(String str, Function0 function0) {
        LinkedHashMap linkedHashMap = f34496a;
        eai eaiVar = (eai) linkedHashMap.get(str);
        if (eaiVar != null) {
            return eaiVar;
        }
        ComponentCallbacks2 componentCallbacks2 = (Application) function0.invoke();
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vt7.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof vt7)) {
                ze3Var = null;
            }
            vt7 vt7Var = (vt7) ze3Var;
            if (vt7Var != null) {
                mne mneVar = vt7Var.f37990a;
                gii0 gii0Var = vt7Var.b;
                gst0 gst0Var = vt7Var.c;
                knf0 knf0Var = vt7Var.d;
                xyt xytVar = vt7Var.e;
                us3 us3Var = vt7Var.f;
                gii0Var.getClass();
                gst0Var.getClass();
                knf0Var.getClass();
                us3Var.getClass();
                eai eaiVar2 = new eai(mneVar, gii0Var, knf0Var, xytVar, us3Var);
                linkedHashMap.put(str, eaiVar2);
                return eaiVar2;
            }
        }
        jf4.n(b1j.i(vt7.class, "Cannot create dependency "));
        return null;
    }
}
