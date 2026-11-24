package a;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class nhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f23528a = new SparseArray();
    public int b = 0;
    public final Set c = Collections.newSetFromMap(new IdentityHashMap());

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f23528a;
            if (i >= sparseArray.size()) {
                return;
            }
            mhe0 mhe0Var = (mhe0) sparseArray.valueAt(i);
            Iterator it = mhe0Var.f21789a.iterator();
            while (it.hasNext()) {
                b8k0.y(((xhe0) it.next()).f40887a);
            }
            mhe0Var.f21789a.clear();
            i++;
        }
    }

    public final mhe0 b(int i) {
        SparseArray sparseArray = this.f23528a;
        mhe0 mhe0Var = (mhe0) sparseArray.get(i);
        if (mhe0Var != null) {
            return mhe0Var;
        }
        mhe0 mhe0Var2 = new mhe0();
        sparseArray.put(i, mhe0Var2);
        return mhe0Var2;
    }
}
