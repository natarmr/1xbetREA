package a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class u1r implements s1r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.e f34912a;

    public u1r(androidx.fragment.app.e eVar) {
        this.f34912a = eVar;
    }

    @Override // a.s1r
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zI0;
        androidx.fragment.app.e eVar = this.f34912a;
        ArrayList arrayList5 = eVar.o;
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + eVar.f45379a);
        }
        if (eVar.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zI0 = false;
        } else {
            zb5 zb5Var = (zb5) dw9.l(1, eVar.d);
            eVar.h = zb5Var;
            Iterator it = zb5Var.f44098a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((h6r) it.next()).b;
                if (fragment != null) {
                    fragment.n = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zI0 = eVar.i0(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            ((Boolean) arrayList4.get(arrayList3.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(androidx.fragment.app.e.N((zb5) it2.next()));
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    hny.b();
                    return false;
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zI0;
    }
}
