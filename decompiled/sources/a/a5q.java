package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a5q implements g93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g93 f283a;
    public final pnk0 b;

    public a5q(g93 g93Var, pnk0 pnk0Var) {
        this.f283a = g93Var;
        this.b = pnk0Var;
    }

    @Override // a.g93
    public final t83 O0(swq swqVar) {
        swqVar.getClass();
        if (((Boolean) this.b.invoke(swqVar)).booleanValue()) {
            return this.f283a.O0(swqVar);
        }
        return null;
    }

    @Override // a.g93
    public final boolean isEmpty() {
        g93 g93Var = this.f283a;
        if ((g93Var instanceof Collection) && ((Collection) g93Var).isEmpty()) {
            return false;
        }
        Iterator it = g93Var.iterator();
        while (it.hasNext()) {
            swq swqVarD = ((t83) it.next()).d();
            if (swqVarD != null && ((Boolean) this.b.invoke(swqVarD)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f283a) {
            swq swqVarD = ((t83) obj).d();
            if (swqVarD != null && ((Boolean) this.b.invoke(swqVarD)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // a.g93
    public final boolean z0(swq swqVar) {
        swqVar.getClass();
        if (((Boolean) this.b.invoke(swqVar)).booleanValue()) {
            return this.f283a.z0(swqVar);
        }
        return false;
    }
}
