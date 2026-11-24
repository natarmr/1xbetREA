package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class kuu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nok0 f18930a;

    public kuu(nok0 nok0Var) {
        nok0Var.getClass();
        this.f18930a = nok0Var;
    }

    public final lok0 a(int i) {
        Object next;
        Iterator it = this.f18930a.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((lok0) next).f20396a != i);
        lok0 lok0Var = (lok0) next;
        if (lok0Var != null) {
            return lok0Var;
        }
        iun iunVar = iun.f15405a;
        return new lok0(0, "", 0L, 0L, oho.g, 0L, 0L, false, false, iunVar, iunVar, iunVar, iunVar, false, false, false, 0, false, iunVar, iunVar, "");
    }
}
