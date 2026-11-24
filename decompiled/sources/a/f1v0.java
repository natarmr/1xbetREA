package a;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class f1v0 extends iox {
    public final mox b;
    public final WeakReference c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1v0(mox moxVar, heg0 heg0Var) {
        super(heg0Var.f15136a);
        heg0Var.getClass();
        this.b = moxVar;
        this.c = new WeakReference(heg0Var);
    }

    @Override // a.iox
    public final void a(Set set) {
        set.getClass();
        iox ioxVar = (iox) this.c.get();
        if (ioxVar != null) {
            ioxVar.a(set);
            return;
        }
        mox moxVar = this.b;
        ReentrantLock reentrantLock = moxVar.d;
        reentrantLock.lock();
        try {
            he60 he60Var = (he60) moxVar.c.remove(this);
            reentrantLock.unlock();
            if (he60Var != null) {
                krs0 krs0Var = moxVar.b;
                int[] iArr = he60Var.b;
                krs0Var.getClass();
                iArr.getClass();
                if (((o24) krs0Var.h).j(iArr)) {
                    yyw.Y(new jox(moxVar, null, (byte) 1));
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
