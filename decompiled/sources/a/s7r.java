package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class s7r {
    public static final b14 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31764a;
    public final long b;
    public final long c;
    public final p7r d;
    public final lc00 e;
    public final c14 f;
    public final z04 g;
    public final CopyOnWriteArrayList h;

    static {
        b14 b14Var = new b14();
        b14Var.f1789a = 0L;
        i = b14Var;
    }

    public s7r(gnf0 gnf0Var, long j, long j2, Set set) {
        Object next;
        gnf0Var.getClass();
        set.getClass();
        this.f31764a = j;
        this.b = j2;
        b14 b14Var = i;
        b14Var.getClass();
        this.c = b14.b.incrementAndGet(b14Var);
        this.d = new p7r(this);
        lc00 lc00VarB = kotlin.collections.a.b();
        Iterator it = gnf0Var.Q().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i2 = ((mrm0) it.next()).f22281a;
            Iterator it2 = set.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((f3a) next).f8851a != i2);
            f3a f3aVar = (f3a) next;
            if (f3aVar != null) {
                ArrayList arrayList = f3aVar.b;
                z04 z04VarY = o2e.Y(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    lc00VarB.add(new q7r(this, i2, ((krm0) arrayList.get(i3)).f18773a, z04VarY));
                }
            }
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        this.e = lc00VarA;
        this.f = o2e.Z(r7r.f29990a);
        ArrayList arrayList2 = new ArrayList(r3d.q(lc00VarA, 10));
        ListIterator listIterator = lc00VarA.listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                this.g = o2e.Y(CollectionsKt.L0(CollectionsKt.O0(arrayList2)).size());
                this.h = new CopyOnWriteArrayList();
                return;
            }
            arrayList2.add(new mrm0(((q7r) pawVar.next()).c));
        }
    }

    public final String toString() {
        return "Frame-" + ((Object) ("FrameId(value=" + this.c + ')')) + '(' + this.f31764a + '@' + this.b + ')';
    }
}
