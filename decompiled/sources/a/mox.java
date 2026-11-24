package a;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class mox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f22151a;
    public final krs0 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final qgx e;
    public final qgx f;
    public final ieu g;
    public final Object h;

    public mox(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f22151a = workDatabase_Impl;
        krs0 krs0Var = new krs0(workDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, workDatabase_Impl.k, new n5w(1, this, mox.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 28));
        this.b = krs0Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new qgx(this, (byte) 6);
        this.f = new qgx(this, (byte) 7);
        this.g = new ieu(workDatabase_Impl);
        this.h = new Object();
        krs0Var.k = new y2x(this, (byte) 9);
    }

    public final Object a(bnn0 bnn0Var) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.f22151a;
        if (workDatabase_Impl.k() && !workDatabase_Impl.n()) {
            return Unit.f46060a;
        }
        Object objI = this.b.i(bnn0Var);
        return objI == wne.f39444a ? objI : Unit.f46060a;
    }
}
