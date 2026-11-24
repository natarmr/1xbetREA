package a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class jvt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final twz f17220a;

    public jvt(twz twzVar) {
        twzVar.getClass();
        this.f17220a = twzVar;
    }

    public final Object a(xrz xrzVar) {
        Object next;
        xrzVar.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            Iterator it = this.f17220a.c.f19026a.f20926a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((qcq) next).b.equals(xrzVar));
            qcq qcqVar = (qcq) next;
            if (qcqVar != null) {
                return qcqVar;
            }
            throw new NoSuchElementException();
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            return new g0g0(th);
        }
    }
}
