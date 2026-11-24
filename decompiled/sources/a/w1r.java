package a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w1r extends diu0 {
    public static final dzj h = new dzj(2);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public w1r(boolean z) {
        this.e = z;
    }

    public final void A(Fragment fragment) {
        if (this.g) {
            if (androidx.fragment.app.e.V(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(fragment.f) == null || !androidx.fragment.app.e.V(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w1r.class != obj.getClass()) {
            return false;
        }
        w1r w1rVar = (w1r) obj;
        return this.b.equals(w1rVar.b) && this.c.equals(w1rVar.c) && this.d.equals(w1rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // a.diu0
    public final void v() {
        if (androidx.fragment.app.e.V(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void w(Fragment fragment) {
        if (this.g) {
            if (androidx.fragment.app.e.V(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.f;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.f, fragment);
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void x(Fragment fragment, boolean z) {
        if (androidx.fragment.app.e.V(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        z(fragment.f, z);
    }

    public final void y(String str, boolean z) {
        if (androidx.fragment.app.e.V(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        z(str, z);
    }

    public final void z(String str, boolean z) {
        HashMap map = this.c;
        w1r w1rVar = (w1r) map.get(str);
        if (w1rVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(w1rVar.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w1rVar.y((String) it.next(), true);
                }
            }
            w1rVar.v();
            map.remove(str);
        }
        HashMap map2 = this.d;
        piu0 piu0Var = (piu0) map2.get(str);
        if (piu0Var != null) {
            piu0Var.a();
            map2.remove(str);
        }
    }
}
