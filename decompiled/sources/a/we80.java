package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class we80 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ze80 f39007a;
    public final Object b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public final ArrayList i;
    public final LinkedHashMap j;

    public we80(ze80 ze80Var) {
        ze80Var.getClass();
        this.f39007a = ze80Var;
        this.b = new Object();
        this.d = 1L;
        this.e = Long.MIN_VALUE;
        this.f = Long.MIN_VALUE;
        this.g = Long.MIN_VALUE;
        this.h = Long.MIN_VALUE;
        this.i = new ArrayList();
        this.j = new LinkedHashMap();
    }

    public final void a(long j) {
        synchronized (this.b) {
            try {
                if (this.c) {
                    return;
                }
                this.g = j;
                Iterator it = this.i.iterator();
                ve80 ve80Var = null;
                boolean z = false;
                Object obj = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (z) {
                            break;
                        }
                    } else {
                        Object next = it.next();
                        if (((ve80) next).b == j) {
                            if (!z) {
                                obj = next;
                                z = true;
                            }
                        }
                    }
                    obj = null;
                    break;
                }
                ve80 ve80Var2 = (ve80) obj;
                if (ve80Var2 != null) {
                    this.h = ve80Var2.e;
                    this.i.remove(ve80Var2);
                    ve80Var = ve80Var2;
                }
                if (ve80Var != null) {
                    ve80Var.a(new df80(10), -1L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj, long j) {
        Object bf80Var;
        ArrayList<ve80> arrayList;
        Object next;
        synchronized (this.b) {
            try {
                if (this.c || this.f39007a.a(this.h, j)) {
                    bf80Var = new bf80(obj);
                } else {
                    Iterator it = this.i.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!this.f39007a.a(((ve80) next).e, j));
                    ve80 ve80Var = (ve80) next;
                    if (ve80Var != null) {
                        ArrayList arrayListE = e(ve80Var.d, ve80Var.f37271a, ve80Var.e);
                        ve80Var.a(obj, j);
                        this.i.remove(ve80Var);
                        arrayList = arrayListE;
                        bf80Var = null;
                    } else {
                        this.j.put(Long.valueOf(j), new bf80(obj));
                        if (this.j.size() > 3) {
                            bf80Var = this.j.remove(Long.valueOf(((Number) CollectionsKt.T(this.j.keySet())).longValue()));
                        } else {
                            bf80Var = null;
                            arrayList = null;
                        }
                    }
                }
                arrayList = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        bf80 bf80Var2 = (bf80) bf80Var;
        if (bf80Var2 != null) {
            Object obj2 = bf80Var2.f2490a;
            if ((obj2 instanceof df80) || obj2 != null) {
            }
        }
        if (arrayList != null) {
            for (ve80 ve80Var2 : arrayList) {
                ve80Var2.getClass();
                ve80Var2.a(new df80(12), -1L);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            this.c = true;
            ArrayList arrayListN0 = CollectionsKt.N0(this.j.values());
            this.j.clear();
            ArrayList<ve80> arrayList = new ArrayList(this.i);
            this.i.clear();
            Iterator it = arrayListN0.iterator();
            while (it.hasNext()) {
                Object obj = ((bf80) it.next()).f2490a;
            }
            for (ve80 ve80Var : arrayList) {
                ve80Var.getClass();
                ve80Var.a(new df80(11), -1L);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:78:0x016f A[LOOP:2: B:76:0x0169->B:78:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x018b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:87:0x0198 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x019a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ab  */
    public final void d(long j, long j2, long j3, ue80 ue80Var) {
        Object next;
        Object next2;
        mie0 mie0Var;
        ArrayList<ve80> arrayListE;
        Object objRemove;
        boolean z;
        bf80 bf80Var;
        bf80 bf80Var2;
        Object df80Var;
        Object obj;
        long j4;
        Object obj2;
        long j5 = j3;
        ue80Var.getClass();
        mie0 mie0Var2 = new mie0();
        synchronized (this.b) {
            try {
                Iterator it = this.i.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((ve80) next).b == j));
                ve80 ve80Var = (ve80) next;
                if (ve80Var != null) {
                    Log.w("CXCP", "onOutputStarted was invoked multiple times with a previously started output!onOutputStarted with " + ((Object) f7r.a(j)) + ", " + ((Object) ("CameraTimestamp(value=" + j2 + ')')) + ", " + j5 + ". Previously started output: " + ve80Var + ". Ignoring.");
                    return;
                }
                boolean z2 = this.c;
                long j6 = this.d;
                this.d = j6 + 1;
                if (!z2 && this.g != j && this.h != j5) {
                    boolean z3 = j < this.f;
                    if (!z3) {
                        this.f = j;
                    }
                    boolean z4 = j5 < this.e;
                    if (!z4) {
                        this.e = j5;
                    }
                    boolean z5 = z3 || z4;
                    Iterator it2 = this.j.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            j4 = j5;
                            obj2 = null;
                            break;
                        }
                        Object next3 = it2.next();
                        obj2 = next3;
                        j4 = j3;
                        if (this.f39007a.a(j4, ((Number) next3).longValue())) {
                            break;
                        } else {
                            j5 = j4;
                        }
                    }
                    Long l = (Long) obj2;
                    if (l != null) {
                        objRemove = this.j.remove(l);
                        arrayListE = e(j6, z5, j4);
                        mie0Var = mie0Var2;
                    } else {
                        this.i.add(new ve80(z5, j, j2, j6, j3, ue80Var));
                        mie0Var = mie0Var2;
                        arrayListE = null;
                        objRemove = null;
                        z = false;
                    }
                    if (arrayListE != null) {
                        for (ve80 ve80Var2 : arrayListE) {
                            ve80Var2.getClass();
                            ve80Var2.a(new df80(12), -1L);
                        }
                    }
                    bf80Var = (bf80) mie0Var.f21842a;
                    if (bf80Var != null) {
                        obj = bf80Var.f2490a;
                        if (!(obj instanceof df80) || obj != null) {
                        }
                    }
                    if (z) {
                        if (z2) {
                            df80Var = new df80(11);
                        } else {
                            bf80Var2 = (bf80) objRemove;
                            if (bf80Var2 != null) {
                                df80Var = bf80Var2.f2490a;
                            } else {
                                df80Var = new df80(10);
                            }
                        }
                        ue80Var.b(df80Var);
                    }
                }
                Iterator it3 = this.j.keySet().iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!this.f39007a.a(j5, ((Number) next2).longValue()));
                Long l2 = (Long) next2;
                mie0Var = mie0Var2;
                mie0Var.f21842a = l2 != null ? (bf80) this.j.remove(l2) : null;
                arrayListE = null;
                objRemove = null;
                z = true;
                if (arrayListE != null) {
                    while (r0.hasNext()) {
                        ve80Var2.getClass();
                        ve80Var2.a(new df80(12), -1L);
                    }
                }
                bf80Var = (bf80) mie0Var.f21842a;
                if (bf80Var != null) {
                    obj = bf80Var.f2490a;
                    if (!(obj instanceof df80)) {
                    }
                }
                if (z) {
                    if (z2) {
                        df80Var = new df80(11);
                    } else {
                        bf80Var2 = (bf80) objRemove;
                        if (bf80Var2 != null) {
                            df80Var = bf80Var2.f2490a;
                        } else {
                            df80Var = new df80(10);
                        }
                    }
                    ue80Var.b(df80Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList e(long j, boolean z, long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.i;
        for (Object obj : arrayList2) {
            ve80 ve80Var = (ve80) obj;
            if (ve80Var.f37271a == z && ve80Var.d < j && ve80Var.e < j2) {
                arrayList.add(obj);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }
}
