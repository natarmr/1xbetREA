package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ige0 implements zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14732a;
    public final Object b;

    public /* synthetic */ ige0(Object obj, byte b) {
        this.f14732a = b;
        this.b = obj;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        View view;
        byte b = this.f14732a;
        Object obj = this.b;
        switch (b) {
            case 0:
                i0h0 i0h0Var = (i0h0) obj;
                if (kkzVar != kkz.ON_CREATE) {
                    c99.l("Next event must be ON_CREATE");
                    return;
                }
                clzVar.x().f(this);
                Bundle bundleH = i0h0Var.h().H("androidx.savedstate.Restarter");
                if (bundleH == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleH.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    jf4.n("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, ige0.class.getClassLoader()).asSubclass(f0h0.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(i0h0Var instanceof riu0)) {
                                    hny.t(i0h0Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                piu0 piu0VarG = ((riu0) i0h0Var).g();
                                kd30 kd30VarH = i0h0Var.h();
                                LinkedHashMap linkedHashMap = piu0VarG.f27059a;
                                LinkedHashMap linkedHashMap2 = piu0VarG.f27059a;
                                Iterator it = CollectionsKt.P0(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    diu0 diu0Var = (diu0) linkedHashMap2.get(it.next());
                                    if (diu0Var != null) {
                                        azw.A(diu0Var, kd30VarH, i0h0Var.x());
                                    }
                                }
                                if (!CollectionsKt.P0(linkedHashMap2.keySet()).isEmpty()) {
                                    kd30VarH.V();
                                }
                            } catch (Exception e) {
                                e9d0.m(kng0.k("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        e9d0.m(kng0.l("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                agd agdVar = (agd) obj;
                if (agdVar.e == null) {
                    wfd wfdVar = (wfd) agdVar.getLastNonConfigurationInstance();
                    if (wfdVar != null) {
                        agdVar.e = wfdVar.f39066a;
                    }
                    if (agdVar.e == null) {
                        agdVar.e = new piu0();
                    }
                }
                agdVar.f44297a.f(this);
                return;
            case 2:
                new HashMap();
                uit[] uitVarArr = (uit[]) obj;
                if (uitVarArr.length > 0) {
                    uit uitVar = uitVarArr[0];
                    throw null;
                }
                if (uitVarArr.length <= 0) {
                    return;
                }
                uit uitVar2 = uitVarArr[0];
                throw null;
            case 3:
                if (kkzVar != kkz.ON_STOP || (view = ((Fragment) obj).l1) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 4:
                ((lrd) obj).b(false);
                return;
            case 5:
                if (kkzVar != kkz.ON_CREATE) {
                    hny.t(kkzVar, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    clzVar.x().f(this);
                    ((a0h0) obj).b();
                    return;
                }
            default:
                if (kkzVar == kkz.ON_DESTROY) {
                    ((piu0) ((zn00) obj).b).a();
                    return;
                }
                return;
        }
    }
}
