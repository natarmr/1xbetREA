package a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class ovt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j400 f25941a;

    public ovt(j400 j400Var) {
        j400Var.getClass();
        this.f25941a = j400Var;
    }

    public final Object a(xrz xrzVar) {
        Object next;
        xrzVar.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            Iterator it = this.f25941a.c.f7160a.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((niq0) next).b.equals(xrzVar));
            niq0 niq0Var = (niq0) next;
            if (niq0Var != null) {
                return niq0Var;
            }
            throw new NoSuchElementException();
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            return new g0g0(th);
        }
    }
}
