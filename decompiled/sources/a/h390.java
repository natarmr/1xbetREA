package a;

import android.gov.nist.core.Separators;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h390 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tld f12373a;
    public final nld b;
    public final fet c;
    public final Function2 d;
    public final boolean e;
    public final v0 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(j390.c);
    public long i = hfm0.v();
    public iz40 j;
    public final pwi k;
    public final ouu l;

    public h390(tld tldVar, nld nldVar, fet fetVar, lz40 lz40Var, Function2 function2, boolean z, v0 v0Var, Object obj) {
        this.f12373a = tldVar;
        this.b = nldVar;
        this.c = fetVar;
        this.d = function2;
        this.e = z;
        this.f = v0Var;
        this.g = obj;
        iz40 iz40Var = v1h0.f36630a;
        iz40Var.getClass();
        this.j = iz40Var;
        pwi pwiVar = new pwi((byte) 11);
        pwiVar.t(lz40Var, fetVar.C());
        this.k = pwiVar;
        this.l = new ouu(v0Var.c);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((j390) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    j390 j390Var = j390.f;
                    j390 j390Var2 = j390.g;
                    while (!atomicReference.compareAndSet(j390Var, j390Var2)) {
                        if (atomicReference.get() != j390Var) {
                            dsb0.b("Unexpected state change from: " + j390Var + " to: " + j390Var2 + Separators.DOT);
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new m460();
            }
        } catch (Exception e) {
            atomicReference.set(j390.f15820a);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.L(this.f, this.k);
                    this.k.e();
                    this.k.f();
                    this.k.d();
                    this.f12373a.q = null;
                } catch (Throwable th) {
                    this.k.d();
                    this.f12373a.q = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((j390) this.h.get()).compareTo(j390.f) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        j390 j390Var = j390.d;
        j390 j390Var2 = j390.f;
        do {
            atomicReference = this.h;
            if (atomicReference.compareAndSet(j390Var, j390Var2)) {
                return;
            }
        } while (atomicReference.get() == j390Var);
        dsb0.b("Unexpected state change from: " + j390Var + " to: " + j390Var2 + Separators.DOT);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:23:0x0069, B:25:0x0079, B:26:0x007f, B:32:0x00a7, B:34:0x00af, B:29:0x0086, B:31:0x008c, B:36:0x00b5, B:37:0x00bb, B:39:0x00c1, B:42:0x00c8, B:43:0x00e3, B:20:0x0048, B:22:0x004e, B:46:0x00eb, B:49:0x00fa, B:51:0x00fe, B:55:0x0108, B:54:0x0103, B:56:0x010d, B:57:0x0111, B:63:0x0139, B:65:0x0141, B:60:0x0118, B:62:0x011e, B:69:0x014a, B:70:0x014b, B:71:0x0152, B:72:0x0153, B:73:0x015a, B:24:0x006b, B:47:0x00f0), top: B:76:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00af A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:23:0x0069, B:25:0x0079, B:26:0x007f, B:32:0x00a7, B:34:0x00af, B:29:0x0086, B:31:0x008c, B:36:0x00b5, B:37:0x00bb, B:39:0x00c1, B:42:0x00c8, B:43:0x00e3, B:20:0x0048, B:22:0x004e, B:46:0x00eb, B:49:0x00fa, B:51:0x00fe, B:55:0x0108, B:54:0x0103, B:56:0x010d, B:57:0x0111, B:63:0x0139, B:65:0x0141, B:60:0x0118, B:62:0x011e, B:69:0x014a, B:70:0x014b, B:71:0x0152, B:72:0x0153, B:73:0x015a, B:24:0x006b, B:47:0x00f0), top: B:76:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0141 A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:23:0x0069, B:25:0x0079, B:26:0x007f, B:32:0x00a7, B:34:0x00af, B:29:0x0086, B:31:0x008c, B:36:0x00b5, B:37:0x00bb, B:39:0x00c1, B:42:0x00c8, B:43:0x00e3, B:20:0x0048, B:22:0x004e, B:46:0x00eb, B:49:0x00fa, B:51:0x00fe, B:55:0x0108, B:54:0x0103, B:56:0x010d, B:57:0x0111, B:63:0x0139, B:65:0x0141, B:60:0x0118, B:62:0x011e, B:69:0x014a, B:70:0x014b, B:71:0x0152, B:72:0x0153, B:73:0x015a, B:24:0x006b, B:47:0x00f0), top: B:76:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[LOOP:1: B:26:0x007f->B:86:?, LOOP_END, SYNTHETIC] */
    public final boolean e(isj0 isj0Var) throws Exception {
        long j;
        j390 j390Var;
        j390 j390Var2;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((j390) atomicReference.get()).ordinal();
            tld tldVar = this.f12373a;
            nld nldVar = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    fet fetVar = this.c;
                    boolean z = this.e;
                    if (z) {
                        fetVar.z = 0;
                        fetVar.y = true;
                    }
                    this.j = nldVar.b(tldVar, isj0Var, this.d);
                    if (z) {
                        if (fetVar.F || fetVar.z != 0) {
                            dsb0.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        fetVar.z = -1;
                        fetVar.y = false;
                    }
                    j390 j390Var3 = j390.c;
                    j390 j390Var4 = j390.d;
                    while (!atomicReference.compareAndSet(j390Var3, j390Var4)) {
                        if (atomicReference.get() != j390Var3) {
                            dsb0.b("Unexpected state change from: " + j390Var3 + " to: " + j390Var4 + Separators.DOT);
                            if (this.j.g()) {
                                d();
                            }
                            return c();
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case 3:
                    j390 j390Var5 = j390.d;
                    j390 j390Var6 = j390.e;
                    try {
                        while (!atomicReference.compareAndSet(j390Var5, j390Var6)) {
                            if (atomicReference.get() != j390Var5) {
                                dsb0.b("Unexpected state change from: " + j390Var5 + " to: " + j390Var6 + Separators.DOT);
                                j = this.i;
                                this.i = hfm0.v();
                                this.j = nldVar.q(tldVar, isj0Var, this.j);
                                this.i = j;
                                j390Var = j390.e;
                                j390Var2 = j390.d;
                                while (!atomicReference.compareAndSet(j390Var, j390Var2)) {
                                    if (atomicReference.get() != j390Var) {
                                        dsb0.b("Unexpected state change from: " + j390Var + " to: " + j390Var2 + Separators.DOT);
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = hfm0.v();
                        this.j = nldVar.q(tldVar, isj0Var, this.j);
                        this.i = j;
                        j390Var = j390.e;
                        j390Var2 = j390.d;
                        while (!atomicReference.compareAndSet(j390Var, j390Var2)) {
                            if (atomicReference.get() != j390Var) {
                                dsb0.b("Unexpected state change from: " + j390Var + " to: " + j390Var2 + Separators.DOT);
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        j390 j390Var7 = j390.e;
                        j390 j390Var8 = j390.d;
                        while (!atomicReference.compareAndSet(j390Var7, j390Var8)) {
                            if (atomicReference.get() != j390Var7) {
                                dsb0.b("Unexpected state change from: " + j390Var7 + " to: " + j390Var8 + Separators.DOT);
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = this.i;
                case 4:
                    ykd.b("Recursive call to resume()");
                    throw new rsy();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new m460();
            }
        } catch (Exception e) {
            atomicReference.set(j390.f15820a);
            throw e;
        }
    }
}
