package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class hoo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vno f13403a;
    public final n530 b;
    public final zr20 c;

    public hoo(vno vnoVar, n530 n530Var, zr20 zr20Var) {
        vnoVar.getClass();
        n530Var.getClass();
        zr20Var.getClass();
        this.f13403a = vnoVar;
        this.b = n530Var;
        this.c = zr20Var;
    }

    public static boolean a(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
    
        if (r13.f13403a.b(r8, r10, r12) == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.zje r14) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hoo.b(a.zje):java.lang.Object");
    }
}
