package a;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class deg0 extends wh00 {
    public final WorkDatabase_Impl l;
    public final ieu m;
    public final boolean n;
    public final heg0 o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final CoroutineContext s;
    public final m8s0 t;

    public deg0(WorkDatabase_Impl workDatabase_Impl, ieu ieuVar, String[] strArr, m8s0 m8s0Var) {
        CoroutineContext coroutineContext;
        ieuVar.getClass();
        this.l = workDatabase_Impl;
        this.m = ieuVar;
        this.n = true;
        this.o = new heg0(strArr, this);
        this.p = new AtomicBoolean(true);
        this.q = new AtomicBoolean(false);
        this.r = new AtomicBoolean(false);
        if (workDatabase_Impl.k()) {
            coroutineContext = workDatabase_Impl.b;
            if (coroutineContext == null) {
                Intrinsics.h("transactionContext");
                throw null;
            }
        } else {
            coroutineContext = kotlin.coroutines.g.f46065a;
        }
        this.s = coroutineContext;
        this.t = m8s0Var;
    }

    @Override // a.wh00
    public final void g() {
        ieu ieuVar = this.m;
        ieuVar.getClass();
        ((Set) ieuVar.c).add(this);
        qjj.W(this.l.f(), this.s, null, new geg0(this, null, (byte) 1), 2);
    }

    @Override // a.wh00
    public final void h() {
        ieu ieuVar = this.m;
        ieuVar.getClass();
        ((Set) ieuVar.c).remove(this);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba A[Catch: all -> 0x002e, Exception -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0031, blocks: (B:12:0x0029, B:44:0x00ba), top: B:65:0x0029, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[LOOP:0: B:42:0x00b2->B:47:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x0029, B:42:0x00b2, B:44:0x00ba, B:51:0x00d9, B:48:0x00cf, B:49:0x00d6), top: B:64:0x0021, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.deg0] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4, types: [a.deg0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.deg0] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [a.deg0] */
    /* JADX WARN: Type inference failed for: r2v18, types: [a.deg0, a.wh00] */
    /* JADX WARN: Type inference failed for: r2v19, types: [a.deg0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b0 -> B:42:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e8 -> B:56:0x00e9). Please report as a decompilation issue!!! */
    public final Object m(zje zjeVar) {
        ieg0 ieg0Var;
        ?? r2;
        boolean z;
        ?? r3;
        if (zjeVar instanceof ieg0) {
            ieg0Var = (ieg0) zjeVar;
            int i = ieg0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ieg0Var.m = i - Integer.MIN_VALUE;
            } else {
                ieg0Var = new ieg0(this, zjeVar);
            }
        } else {
            ieg0Var = new ieg0(this, zjeVar);
        }
        Object objI0 = ieg0Var.k;
        wne wneVar = wne.f39444a;
        ?? r4 = ieg0Var.m;
        yje yjeVar = null;
        byte b = 0;
        try {
            if (r4 == 0) {
                z1x.P(objI0);
                if (this.r.compareAndSet(false, true)) {
                    mox moxVarG = this.l.g();
                    heg0 heg0Var = this.o;
                    heg0Var.getClass();
                    f1v0 f1v0Var = new f1v0(moxVarG, heg0Var);
                    LinkedHashMap linkedHashMap = moxVarG.c;
                    krs0 krs0Var = moxVarG.b;
                    Pair pairK = krs0Var.k(f1v0Var.f15136a);
                    String[] strArr = (String[]) pairK.f46059a;
                    int[] iArr = (int[]) pairK.b;
                    he60 he60Var = new he60(f1v0Var, iArr, strArr);
                    ReentrantLock reentrantLock = moxVarG.d;
                    reentrantLock.lock();
                    try {
                        he60 he60Var2 = linkedHashMap.containsKey(f1v0Var) ? (he60) xp20.d(linkedHashMap, f1v0Var) : (he60) linkedHashMap.put(f1v0Var, he60Var);
                        reentrantLock.unlock();
                        if (he60Var2 == null && ((o24) krs0Var.h).i(iArr)) {
                            yyw.Y(new jox(moxVarG, yjeVar, b));
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                r2 = this;
                if (this.q.compareAndSet(false, true)) {
                    objI0 = null;
                    z = false;
                    r4 = r2;
                    while (r4.p.compareAndSet(true, false)) {
                        ieg0Var.i = r4;
                        ieg0Var.j = true;
                        ieg0Var.m = 1;
                        objI0 = kpb.i0(r4.l, true, r4.n, r4.t, ieg0Var);
                        if (objI0 == wneVar) {
                            return wneVar;
                        }
                        z = true;
                    }
                    if (z) {
                        r4.i(objI0);
                    }
                    r4.q.set(false);
                    r3 = r4;
                } else {
                    z = false;
                    r3 = r2;
                }
                if (z) {
                }
                return Unit.f46060a;
            }
            if (r4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ieg0Var.j;
            r4 = ieg0Var.i;
            try {
                z1x.P(objI0);
                r4 = r4;
                while (r4.p.compareAndSet(true, false)) {
                    ieg0Var.i = r4;
                    ieg0Var.j = true;
                    ieg0Var.m = 1;
                    objI0 = kpb.i0(r4.l, true, r4.n, r4.t, ieg0Var);
                    if (objI0 == wneVar) {
                        return wneVar;
                    }
                    z = true;
                }
                if (z) {
                    r4.i(objI0);
                }
                r4.q.set(false);
                r3 = r4;
                if (z || !r3.p.get()) {
                    return Unit.f46060a;
                }
                this = r3;
                r2 = this;
                if (this.q.compareAndSet(false, true)) {
                    objI0 = null;
                    z = false;
                    r4 = r2;
                    while (r4.p.compareAndSet(true, false)) {
                        ieg0Var.i = r4;
                        ieg0Var.j = true;
                        ieg0Var.m = 1;
                        objI0 = kpb.i0(r4.l, true, r4.n, r4.t, ieg0Var);
                        if (objI0 == wneVar) {
                            return wneVar;
                        }
                        z = true;
                    }
                    if (z) {
                        r4.i(objI0);
                    }
                    r4.q.set(false);
                    r3 = r4;
                } else {
                    z = false;
                    r3 = r2;
                }
                if (z) {
                }
                return Unit.f46060a;
            } catch (Exception e) {
                throw new RuntimeException("Exception while computing database live data.", e);
            }
        } catch (Throwable th2) {
            r4.q.set(false);
            throw th2;
        }
    }
}
