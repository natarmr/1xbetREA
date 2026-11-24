package a;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pgk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f26959a;
    public boolean c;
    public jk8 h;
    public ogk0 i;
    public final AtomicReference b = new AtomicReference(null);
    public final edk0 d = new edk0(this, 1);
    public final rai0 e = new rai0(this, 22);
    public final xz40 f = new xz40(new ogk0[16]);
    public final Object g = new Object();
    public long j = -1;

    public pgk0(Function1 function1) {
        this.f26959a = function1;
    }

    public final void a() {
        synchronized (this.g) {
            xz40 xz40Var = this.f;
            Object[] objArr = xz40Var.f41739a;
            int i = xz40Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                ogk0 ogk0Var = (ogk0) objArr[i2];
                ogk0Var.e.a();
                ogk0Var.f.a();
                ogk0Var.l.a();
                ogk0Var.m.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[Catch: all -> 0x008e, LOOP:1: B:14:0x002d->B:26:0x0074, LOOP_END, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:27:0x0078, B:29:0x0080, B:34:0x0090, B:31:0x0085, B:11:0x0021, B:14:0x002d, B:16:0x0041, B:18:0x004f, B:20:0x0059, B:22:0x0069, B:26:0x0074, B:35:0x0094), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:27:0x0078 BREAK  A[LOOP:1: B:14:0x002d->B:26:0x0074], SYNTHETIC] */
    public final void b(Object obj) {
        int i;
        synchronized (this.g) {
            try {
                xz40 xz40Var = this.f;
                int i2 = xz40Var.c;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = xz40Var.f41739a;
                    if (i3 < i2) {
                        ogk0 ogk0Var = (ogk0) objArr[i3];
                        ry40 ry40Var = (ry40) ogk0Var.f.l(obj);
                        if (ry40Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = ry40Var.b;
                            int[] iArr = ry40Var.c;
                            long[] jArr = ry40Var.f31295a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j & 255) < 128) {
                                                int i8 = (i5 << 3) + i7;
                                                Object obj2 = objArr2[i8];
                                                int i9 = iArr[i8];
                                                ogk0Var.c(obj, obj2);
                                            }
                                            j >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    } else if (i5 != length) {
                                        break;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!ogk0Var.f.j()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = xz40Var.f41739a;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i10 = i2 - i4;
                        Arrays.fill(objArr, i10, i2, (Object) null);
                        xz40Var.c = i10;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        ykd.b("Unexpected notification");
                        csj.b();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                xz40 xz40Var = this.f;
                Object[] objArr = xz40Var.f41739a;
                int i = xz40Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((ogk0) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Object obj, Function1 function1, Function0 function0) {
        xz40 xz40Var;
        Object obj2;
        ogk0 ogk0Var;
        boolean z;
        ogk0 ogk0Var2;
        long j;
        long j2;
        ogk0 ogk0Var3;
        rfk0 ios0Var;
        long j3;
        ry40 ry40Var;
        int i;
        long j4;
        ry40 ry40Var2;
        long jV = hfm0.v();
        synchronized (this.g) {
            xz40Var = this.f;
            Object[] objArr = xz40Var.f41739a;
            int i2 = xz40Var.c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((ogk0) obj2).f25224a == function1) {
                    break;
                } else {
                    i3++;
                }
            }
            ogk0Var = (ogk0) obj2;
            z = true;
            if (ogk0Var == null) {
                function1.getClass();
                zys0.e(1, function1);
                ogk0Var = new ogk0(function1);
                xz40Var.b(ogk0Var);
            }
            ogk0Var2 = this.i;
            j = this.j;
        }
        Object obj3 = xz40Var;
        if (j != -1) {
            obj3 = xz40Var;
            if (j != jV) {
                String name = Thread.currentThread().getName();
                StringBuilder sbQ = kng0.q(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
                kng0.z(sbQ, jV, ", name=", name);
                sbQ.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                dsb0.a(sbQ.toString());
                obj3 = sbQ;
            }
        }
        try {
            synchronized (this.g) {
                try {
                    this.i = ogk0Var;
                    this.j = jV;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            rai0 rai0Var = this.e;
            Object obj4 = ogk0Var.b;
            ry40 ry40Var3 = ogk0Var.c;
            int i4 = ogk0Var.d;
            ogk0Var.b = obj;
            ogk0Var.c = (ry40) ogk0Var.f.g(obj);
            if (ogk0Var.d == -1) {
                ogk0Var.d = Long.hashCode(xfk0.h().g());
            }
            eet eetVar = ogk0Var.i;
            xz40 xz40VarA = jgk0.a();
            try {
                xz40VarA.b(eetVar);
                if (rai0Var == null) {
                    function0.invoke();
                    ogk0Var3 = ogk0Var;
                } else {
                    rfk0 rfk0Var = (rfk0) xfk0.b.w();
                    if (rfk0Var instanceof ios0) {
                        ogk0Var3 = ogk0Var;
                        if (((ios0) rfk0Var).t == hfm0.v()) {
                            Function1 function2 = ((ios0) rfk0Var).r;
                            Function1 function3 = ((ios0) rfk0Var).s;
                            try {
                                ((ios0) rfk0Var).r = xfk0.i(rai0Var, function2, true);
                                ((ios0) rfk0Var).s = function3;
                                function0.invoke();
                                ((ios0) rfk0Var).r = function2;
                                ((ios0) rfk0Var).s = function3;
                            } catch (Throwable th2) {
                                ((ios0) rfk0Var).r = function2;
                                ((ios0) rfk0Var).s = function3;
                                throw th2;
                            }
                        }
                    } else {
                        ogk0Var3 = ogk0Var;
                    }
                    if (rfk0Var == null || (rfk0Var instanceof nz40)) {
                        ios0Var = new ios0(rfk0Var instanceof nz40 ? (nz40) rfk0Var : null, rai0Var, null, true, false);
                    } else {
                        ios0Var = rfk0Var.u(rai0Var);
                    }
                    try {
                        rfk0 rfk0VarJ = ios0Var.j();
                        try {
                            function0.invoke();
                            rfk0.q(rfk0VarJ);
                            ios0Var.c();
                        } catch (Throwable th3) {
                            try {
                                rfk0.q(rfk0VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    ios0Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    xz40VarA.k(xz40VarA.c - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                xz40VarA.k(xz40VarA.c - 1);
                ogk0 ogk0Var4 = ogk0Var3;
                Object obj5 = ogk0Var4.b;
                obj5.getClass();
                int i5 = ogk0Var4.d;
                ry40 ry40Var4 = ogk0Var4.c;
                if (ry40Var4 != null) {
                    try {
                        long[] jArr = ry40Var4.f31295a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                ry40 ry40Var5 = ry40Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            ry40Var2 = ry40Var5;
                                            Object obj6 = ry40Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = ry40Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    ogk0Var4.c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    ry40Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = ogk0Var2;
                                                    this.j = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            ry40Var2 = ry40Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        ry40Var5 = ry40Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    ry40Var = ry40Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    ry40Var = ry40Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                ry40Var4 = ry40Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                            this.i = ogk0Var2;
                            this.j = j2;
                            throw th;
                        }
                    }
                } else {
                    j3 = j;
                }
                ogk0Var4.b = obj4;
                ogk0Var4.c = ry40Var3;
                ogk0Var4.d = i4;
                synchronized (this.g) {
                    this.i = ogk0Var2;
                    this.j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void e() {
        edk0 edk0Var = this.d;
        xfk0.b(xfk0.f40794a);
        synchronized (xfk0.c) {
            xfk0.h = CollectionsKt.r0(xfk0.h, edk0Var);
        }
        this.h = new jk8(edk0Var, (byte) 3);
    }
}
