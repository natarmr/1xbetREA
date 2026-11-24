package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a7r implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7r f386a;
    public final Set b;
    public final x04 c;

    public a7r(s7r s7rVar) {
        lc00 lc00Var = s7rVar.e;
        ArrayList arrayList = new ArrayList(r3d.q(lc00Var, 10));
        ListIterator listIterator = lc00Var.listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                break;
            } else {
                arrayList.add(new mrm0(((q7r) pawVar.next()).c));
            }
        }
        Set setP0 = CollectionsKt.P0(arrayList);
        setP0.getClass();
        this.f386a = s7rVar;
        this.b = setP0;
        ArrayList arrayList2 = new ArrayList(r3d.q(lc00Var, 10));
        ListIterator listIterator2 = lc00Var.listIterator(0);
        while (true) {
            paw pawVar2 = (paw) listIterator2;
            if (!pawVar2.hasNext()) {
                CollectionsKt.P0(arrayList2);
                this.c = o2e.X(false);
                return;
            }
            arrayList2.add(new xe80(((q7r) pawVar2.next()).d));
        }
    }

    public final boolean a() {
        if (!this.c.a()) {
            return false;
        }
        s7r s7rVar = this.f386a;
        p7r p7rVar = s7rVar.d;
        lc00 lc00Var = s7rVar.e;
        p7rVar.g();
        int iB = lc00Var.b();
        for (int i = 0; i < iB; i++) {
            q7r q7rVar = (q7r) lc00Var.get(i);
            if (this.b.contains(new mrm0(q7rVar.c))) {
                q7rVar.g();
            }
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a();
    }

    public final void finalize() {
        if (a()) {
            Log.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    public final String toString() {
        return this.f386a.toString();
    }
}
