package a;

import android.gov.nist.core.Separators;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class hvk implements AutoCloseable {
    public static final Regex r = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y190 f13730a;
    public final long b;
    public final y190 c;
    public final y190 d;
    public final y190 e;
    public final LinkedHashMap f;
    public final sje g;
    public final Object h;
    public long i;
    public int j;
    public yae0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final gvk q;

    public hvk(yzp yzpVar, y190 y190Var, CoroutineContext coroutineContext, long j) {
        this.f13730a = y190Var;
        this.b = j;
        if (j <= 0) {
            jf4.o("maxSize <= 0");
            throw null;
        }
        this.c = y190Var.e("journal");
        this.d = y190Var.e("journal.tmp");
        this.e = y190Var.e("journal.bkp");
        this.f = new LinkedHashMap(0, 0.75f, true);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(qem0.e());
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.d1);
        lne lneVar = element instanceof lne ? (lne) element : null;
        if (lneVar == null) {
            rwj rwjVar = tvk.f34603a;
            lneVar = dvj.c;
        }
        kne kneVar = lne.b;
        this.g = d5c.a(coroutineContextPlus.plus(lneVar.w(1)));
        this.h = new Object();
        this.q = new gvk(yzpVar);
    }

    public static void w(String str) {
        if (r.g(str)) {
            return;
        }
        c99.s(kng0.l("keys must match regex [a-z0-9_-]{1,120}: \"", str, Separators.DOUBLE_QUOTE));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0111 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x0069, B:31:0x0079, B:33:0x0080, B:28:0x005e, B:37:0x00a0, B:39:0x00a7, B:42:0x00ac, B:44:0x00bd, B:47:0x00c2, B:52:0x00fd, B:54:0x0108, B:58:0x0111, B:48:0x00da, B:50:0x00ef, B:51:0x00fa, B:36:0x0090, B:61:0x0116, B:62:0x011d), top: B:65:0x0003 }] */
    public final void a(o24 o24Var, boolean z) {
        synchronized (this.h) {
            evk evkVar = (evk) o24Var.b;
            if (!Intrinsics.d(evkVar.g, o24Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || evkVar.f) {
                for (int i = 0; i < 2; i++) {
                    this.q.l((y190) evkVar.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) o24Var.c)[i2] && !this.q.n((y190) evkVar.d.get(i2))) {
                        o24Var.a(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    y190 y190Var = (y190) evkVar.d.get(i3);
                    y190 y190Var2 = (y190) evkVar.c.get(i3);
                    boolean zN = this.q.n(y190Var);
                    gvk gvkVar = this.q;
                    if (zN) {
                        gvkVar.c(y190Var, y190Var2);
                    } else {
                        ebc.d0(gvkVar, (y190) evkVar.c.get(i3));
                    }
                    long j = evkVar.b[i3];
                    Long l = (Long) this.q.r(y190Var2).e;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    evkVar.b[i3] = jLongValue;
                    this.i = (this.i - j) + jLongValue;
                }
            }
            evkVar.g = null;
            if (evkVar.f) {
                r(evkVar);
                return;
            }
            this.j++;
            yae0 yae0Var = this.k;
            yae0Var.getClass();
            if (z || evkVar.e) {
                evkVar.e = true;
                yae0Var.D("CLEAN");
                yae0Var.writeByte(32);
                yae0Var.D(evkVar.f8472a);
                for (long j2 : evkVar.b) {
                    yae0Var.writeByte(32);
                    yae0Var.i0(j2);
                }
                yae0Var.writeByte(10);
            } else {
                this.f.remove(evkVar.f8472a);
                yae0Var.D("REMOVE");
                yae0Var.writeByte(32);
                yae0Var.D(evkVar.f8472a);
                yae0Var.writeByte(10);
            }
            yae0Var.flush();
            if (this.i > this.b) {
                k();
            } else if (this.j >= 2000) {
                k();
            }
        }
    }

    public final o24 c(String str) {
        synchronized (this.h) {
            if (this.n) {
                throw new IllegalStateException("cache is closed");
            }
            w(str);
            e();
            evk evkVar = (evk) this.f.get(str);
            if ((evkVar != null ? evkVar.g : null) != null) {
                return null;
            }
            if (evkVar != null && evkVar.h != 0) {
                return null;
            }
            if (!this.o && !this.p) {
                yae0 yae0Var = this.k;
                yae0Var.getClass();
                yae0Var.D("DIRTY");
                yae0Var.writeByte(32);
                yae0Var.D(str);
                yae0Var.writeByte(10);
                yae0Var.flush();
                if (this.l) {
                    return null;
                }
                if (evkVar == null) {
                    evkVar = new evk(this, str);
                    this.f.put(str, evkVar);
                }
                o24 o24Var = new o24(this, evkVar);
                evkVar.g = o24Var;
                return o24Var;
            }
            k();
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            try {
                if (this.m && !this.n) {
                    for (evk evkVar : (evk[]) this.f.values().toArray(new evk[0])) {
                        o24 o24Var = evkVar.g;
                        if (o24Var != null) {
                            evk evkVar2 = (evk) o24Var.b;
                            if (Intrinsics.d(evkVar2.g, o24Var)) {
                                evkVar2.f = true;
                            }
                        }
                    }
                    v();
                    d5c.G(this.g, null);
                    yae0 yae0Var = this.k;
                    yae0Var.getClass();
                    yae0Var.close();
                    this.k = null;
                    this.n = true;
                    return;
                }
                this.n = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final fvk d(String str) {
        fvk fvkVarA;
        synchronized (this.h) {
            if (this.n) {
                throw new IllegalStateException("cache is closed");
            }
            w(str);
            e();
            evk evkVar = (evk) this.f.get(str);
            if (evkVar != null && (fvkVarA = evkVar.a()) != null) {
                boolean z = true;
                this.j++;
                yae0 yae0Var = this.k;
                yae0Var.getClass();
                yae0Var.D("READ");
                yae0Var.writeByte(32);
                yae0Var.D(str);
                yae0Var.writeByte(10);
                yae0Var.flush();
                if (this.j < 2000) {
                    z = false;
                }
                if (z) {
                    k();
                }
                return fvkVarA;
            }
            return null;
        }
    }

    public final void e() {
        synchronized (this.h) {
            try {
                if (this.m) {
                    return;
                }
                this.q.k(this.d);
                if (this.q.n(this.e)) {
                    boolean zN = this.q.n(this.c);
                    gvk gvkVar = this.q;
                    y190 y190Var = this.e;
                    if (zN) {
                        gvkVar.k(y190Var);
                    } else {
                        gvkVar.c(y190Var, this.c);
                    }
                }
                if (this.q.n(this.c)) {
                    try {
                        n();
                        l();
                        this.m = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            ebc.e0(this.q, this.f13730a);
                            this.n = false;
                            x();
                            this.m = true;
                        } catch (Throwable th) {
                            this.n = false;
                            throw th;
                        }
                    }
                }
                x();
                this.m = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        qjj.W(this.g, null, null, new wib(this, null, (byte) 25), 3);
    }

    public final void l() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            evk evkVar = (evk) it.next();
            int i = 0;
            if (evkVar.g == null) {
                while (i < 2) {
                    j += evkVar.b[i];
                    i++;
                }
            } else {
                evkVar.g = null;
                while (i < 2) {
                    y190 y190Var = (y190) evkVar.c.get(i);
                    gvk gvkVar = this.q;
                    gvkVar.l(y190Var);
                    gvkVar.l((y190) evkVar.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.i = j;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    public final void n() throws Throwable {
        gvk gvkVar = this.q;
        yzp yzpVar = gvkVar.c;
        y190 y190Var = this.c;
        zae0 zae0VarD = x9x.D(yzpVar.y(y190Var));
        try {
            String strA = zae0VarD.A(Long.MAX_VALUE);
            String strA2 = zae0VarD.A(Long.MAX_VALUE);
            String strA3 = zae0VarD.A(Long.MAX_VALUE);
            String strA4 = zae0VarD.A(Long.MAX_VALUE);
            String strA5 = zae0VarD.A(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Intrinsics.d(String.valueOf(3), strA3) || !Intrinsics.d(String.valueOf(2), strA4) || strA5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA3 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    q(zae0VarD.A(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.j = i - this.f.size();
                    if (zae0VarD.v0()) {
                        this.k = new yae0(new uzj(gvkVar.a(y190Var), new e3j(this, (byte) 21), (byte) 1));
                    } else {
                        x();
                    }
                    try {
                        zae0VarD.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th == null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                zae0VarD.close();
            } catch (Throwable th3) {
                tjo.a(th, th3);
            }
            if (th == null) {
                throw th;
            }
        }
    }

    public final void q(String str) throws IOException {
        String strSubstring;
        int iU = StringsKt.U(' ', 0, 6, str);
        if (iU == -1) {
            ohq.l("unexpected journal line: ".concat(str));
            return;
        }
        int i = iU + 1;
        int iU2 = StringsKt.U(' ', i, 4, str);
        LinkedHashMap linkedHashMap = this.f;
        if (iU2 == -1) {
            strSubstring = str.substring(i);
            if (iU == 6 && kotlin.text.c.x(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iU2);
        }
        Object evkVar = linkedHashMap.get(strSubstring);
        if (evkVar == null) {
            evkVar = new evk(this, strSubstring);
            linkedHashMap.put(strSubstring, evkVar);
        }
        evk evkVar2 = (evk) evkVar;
        if (iU2 == -1 || iU != 5 || !kotlin.text.c.x(str, "CLEAN", false)) {
            if (iU2 == -1 && iU == 5 && kotlin.text.c.x(str, "DIRTY", false)) {
                evkVar2.g = new o24(this, evkVar2);
                return;
            } else {
                if (iU2 == -1 && iU == 4 && kotlin.text.c.x(str, "READ", false)) {
                    return;
                }
                ohq.l("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listI0 = StringsKt.i0(str.substring(iU2 + 1), new char[]{' '}, 6);
        evkVar2.e = true;
        evkVar2.g = null;
        if (listI0.size() != 2) {
            itt0.j(listI0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listI0.size();
            for (int i2 = 0; i2 < size; i2++) {
                evkVar2.b[i2] = Long.parseLong((String) listI0.get(i2));
            }
        } catch (NumberFormatException unused) {
            itt0.j(listI0, "unexpected journal line: ");
        }
    }

    public final void r(evk evkVar) {
        yae0 yae0Var;
        int i = evkVar.h;
        String str = evkVar.f8472a;
        if (i > 0 && (yae0Var = this.k) != null) {
            yae0Var.D("DIRTY");
            yae0Var.writeByte(32);
            yae0Var.D(str);
            yae0Var.writeByte(10);
            yae0Var.flush();
        }
        if (evkVar.h > 0 || evkVar.g != null) {
            evkVar.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.q.l((y190) evkVar.c.get(i2));
            long j = this.i;
            long[] jArr = evkVar.b;
            this.i = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.j++;
        yae0 yae0Var2 = this.k;
        if (yae0Var2 != null) {
            yae0Var2.D("REMOVE");
            yae0Var2.writeByte(32);
            yae0Var2.D(str);
            yae0Var2.writeByte(10);
            yae0Var2.flush();
        }
        this.f.remove(str);
        if (this.j >= 2000) {
            k();
        }
    }

    public final void v() {
        while (this.i > this.b) {
            for (evk evkVar : this.f.values()) {
                if (!evkVar.f) {
                    r(evkVar);
                }
            }
            return;
        }
        this.o = false;
    }

    public final void x() {
        Throwable th;
        synchronized (this.h) {
            try {
                yae0 yae0Var = this.k;
                if (yae0Var != null) {
                    yae0Var.close();
                }
                yae0 yae0VarC = x9x.C(this.q.x(this.d, false));
                try {
                    yae0VarC.D("libcore.io.DiskLruCache");
                    yae0VarC.writeByte(10);
                    yae0VarC.D("1");
                    yae0VarC.writeByte(10);
                    yae0VarC.i0(3L);
                    yae0VarC.writeByte(10);
                    yae0VarC.i0(2L);
                    yae0VarC.writeByte(10);
                    yae0VarC.writeByte(10);
                    for (evk evkVar : this.f.values()) {
                        if (evkVar.g != null) {
                            yae0VarC.D("DIRTY");
                            yae0VarC.writeByte(32);
                            yae0VarC.D(evkVar.f8472a);
                            yae0VarC.writeByte(10);
                        } else {
                            yae0VarC.D("CLEAN");
                            yae0VarC.writeByte(32);
                            yae0VarC.D(evkVar.f8472a);
                            for (long j : evkVar.b) {
                                yae0VarC.writeByte(32);
                                yae0VarC.i0(j);
                            }
                            yae0VarC.writeByte(10);
                        }
                    }
                    try {
                        yae0VarC.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        yae0VarC.close();
                    } catch (Throwable th4) {
                        tjo.a(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean zN = this.q.n(this.c);
                gvk gvkVar = this.q;
                if (zN) {
                    gvkVar.c(this.c, this.e);
                    this.q.c(this.d, this.c);
                    this.q.k(this.e);
                } else {
                    gvkVar.c(this.d, this.c);
                }
                this.k = new yae0(new uzj(this.q.a(this.c), new e3j(this, (byte) 21), (byte) 1));
                this.j = 0;
                this.l = false;
                this.p = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
