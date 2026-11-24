package a;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class n7d0 implements fuo {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public xiq i;
    public huo j;
    public boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final coq0 f23037a = new coq0(0);
    public final fq80 c = new fq80(4096);
    public final SparseArray b = new SparseArray();
    public final l7d0 d = new l7d0((byte) 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) {
        char c;
        long j;
        ?? r4;
        int i;
        long jB;
        trn jjvVar;
        long j2;
        long j3;
        l7d0 l7d0Var = this.d;
        coq0 coq0Var = l7d0Var.b;
        this.j.getClass();
        long length = guoVar.getLength();
        if (length != -1) {
            c = 3;
            if (!l7d0Var.d) {
                fq80 fq80Var = l7d0Var.c;
                if (!l7d0Var.f) {
                    long length2 = guoVar.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j4 = length2 - ((long) iMin);
                    if (guoVar.getPosition() != j4) {
                        mtcVar.f22363a = j4;
                        return 1;
                    }
                    fq80Var.J(iMin);
                    guoVar.g();
                    guoVar.n(fq80Var.f9961a, 0, iMin);
                    int i2 = fq80Var.b;
                    for (int i3 = fq80Var.c - 4; i3 >= i2; i3--) {
                        if (l7d0.b(fq80Var.f9961a, i3) == 442) {
                            fq80Var.M(i3 + 4);
                            long jC = l7d0.c(fq80Var);
                            if (jC != -9223372036854775807L) {
                                j3 = jC;
                                l7d0Var.h = j3;
                                l7d0Var.f = true;
                                return 0;
                            }
                        }
                    }
                    j3 = -9223372036854775807L;
                    l7d0Var.h = j3;
                    l7d0Var.f = true;
                    return 0;
                }
                if (l7d0Var.h == -9223372036854775807L) {
                    l7d0Var.a(guoVar);
                    return 0;
                }
                if (l7d0Var.e) {
                    long j5 = l7d0Var.g;
                    if (j5 == -9223372036854775807L) {
                        l7d0Var.a(guoVar);
                        return 0;
                    }
                    l7d0Var.i = coq0Var.c(l7d0Var.h) - coq0Var.b(j5);
                    l7d0Var.a(guoVar);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, guoVar.getLength());
                if (guoVar.getPosition() != 0) {
                    mtcVar.f22363a = 0L;
                    return 1;
                }
                fq80Var.J(iMin2);
                guoVar.g();
                guoVar.n(fq80Var.f9961a, 0, iMin2);
                int i4 = fq80Var.c;
                for (int i5 = fq80Var.b; i5 < i4 - 3; i5++) {
                    if (l7d0.b(fq80Var.f9961a, i5) == 442) {
                        fq80Var.M(i5 + 4);
                        long jC2 = l7d0.c(fq80Var);
                        if (jC2 != -9223372036854775807L) {
                            j2 = jC2;
                            l7d0Var.g = j2;
                            l7d0Var.e = true;
                            return 0;
                        }
                    }
                }
                j2 = -9223372036854775807L;
                l7d0Var.g = j2;
                l7d0Var.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            j = 0;
            r4 = 1;
            i = 0;
        } else {
            this.k = true;
            long j6 = l7d0Var.i;
            if (j6 != -9223372036854775807L) {
                bj5 bj5Var = new bj5();
                kd30 kd30Var = new kd30();
                kd30Var.f18086a = coq0Var;
                kd30Var.b = new fq80();
                j = 0;
                i = 0;
                r4 = 1;
                xiq xiqVar = new xiq(bj5Var, kd30Var, j6, 1 + j6, 0L, length, 188L, 1000);
                this.i = xiqVar;
                this.j.f(xiqVar.f40957a);
            } else {
                j = 0;
                r4 = 1;
                i = 0;
                this.j.f(new ca5(j6));
            }
        }
        xiq xiqVar2 = this.i;
        if (xiqVar2 != null && xiqVar2.c != null) {
            return xiqVar2.a(guoVar, mtcVar);
        }
        guoVar.g();
        long jI = length != -1 ? length - guoVar.i() : -1L;
        if (jI != -1 && jI < 4) {
            g();
            return -1;
        }
        fq80 fq80Var2 = this.c;
        if (!guoVar.b(fq80Var2.f9961a, i, 4, r4)) {
            g();
            return -1;
        }
        fq80Var2.M(i);
        int iM = fq80Var2.m();
        if (iM == 441) {
            g();
            return -1;
        }
        if (iM == 442) {
            guoVar.n(fq80Var2.f9961a, i, 10);
            fq80Var2.M(9);
            guoVar.m((fq80Var2.z() & 7) + 14);
            return i;
        }
        if (iM == 443) {
            guoVar.n(fq80Var2.f9961a, i, 2);
            fq80Var2.M(i);
            guoVar.m(fq80Var2.G() + 6);
            return i;
        }
        if (((iM & (-256)) >> 8) != r4) {
            guoVar.m(r4);
            return i;
        }
        int i6 = iM & 255;
        SparseArray sparseArray = this.b;
        m7d0 m7d0Var = (m7d0) sparseArray.get(i6);
        if (!this.e) {
            if (m7d0Var == null) {
                if (i6 == 189) {
                    jjvVar = new g6("video/mp2p");
                    this.f = r4;
                    this.h = guoVar.getPosition();
                } else if ((iM & 224) == 192) {
                    jjvVar = new lv40(null, i, "video/mp2p");
                    this.f = r4;
                    this.h = guoVar.getPosition();
                } else if ((iM & 240) == 224) {
                    jjvVar = new jjv(null, "video/mp2p");
                    this.g = r4;
                    this.h = guoVar.getPosition();
                } else {
                    jjvVar = null;
                }
                if (jjvVar != null) {
                    jjvVar.e(this.j, new zrs0(i6, 256));
                    m7d0Var = new m7d0(jjvVar, this.f23037a);
                    sparseArray.put(i6, m7d0Var);
                }
            }
            if (guoVar.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = r4;
                this.j.o();
            }
        }
        guoVar.n(fq80Var2.f9961a, i, 2);
        fq80Var2.M(i);
        int iG = fq80Var2.G() + 6;
        if (m7d0Var == null) {
            guoVar.m(iG);
            return i;
        }
        fq80Var2.J(iG);
        guoVar.readFully(fq80Var2.f9961a, i, iG);
        fq80Var2.M(6);
        trn trnVar = m7d0Var.f21315a;
        q8b q8bVar = m7d0Var.c;
        fq80Var2.k(q8bVar.b, i, 3);
        q8bVar.m(i);
        q8bVar.o(8);
        m7d0Var.d = q8bVar.f();
        m7d0Var.e = q8bVar.f();
        q8bVar.o(6);
        fq80Var2.k(q8bVar.b, i, q8bVar.g(8));
        q8bVar.m(i);
        coq0 coq0Var2 = m7d0Var.b;
        if (m7d0Var.d) {
            q8bVar.o(4);
            long jG = ((long) q8bVar.g(3)) << 30;
            q8bVar.o(r4);
            long jG2 = jG | ((long) (q8bVar.g(15) << 15));
            q8bVar.o(r4);
            long jG3 = jG2 | ((long) q8bVar.g(15));
            q8bVar.o(r4);
            if (!m7d0Var.f && m7d0Var.e) {
                q8bVar.o(4);
                long jG4 = ((long) q8bVar.g(3)) << 30;
                q8bVar.o(r4);
                long jG5 = jG4 | ((long) (q8bVar.g(15) << 15));
                q8bVar.o(r4);
                long jG6 = ((long) q8bVar.g(15)) | jG5;
                q8bVar.o(r4);
                coq0Var2.b(jG6);
                m7d0Var.f = r4;
            }
            jB = coq0Var2.b(jG3);
        } else {
            jB = j;
        }
        trnVar.g(4, jB);
        trnVar.a(fq80Var2);
        trnVar.f();
        fq80Var2.L(fq80Var2.f9961a.length);
        return i;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        coq0 coq0Var = this.f23037a;
        synchronized (coq0Var) {
            j3 = coq0Var.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = coq0Var.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            coq0Var.f(j2);
        }
        xiq xiqVar = this.i;
        if (xiqVar != null) {
            xiqVar.d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            m7d0 m7d0Var = (m7d0) sparseArray.valueAt(i);
            m7d0Var.f = false;
            m7d0Var.f21315a.c();
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        guj gujVar = (guj) guoVar;
        gujVar.b(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            gujVar.f(bArr[13] & 7, false);
            gujVar.b(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.j = huoVar;
    }

    public final void g() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((m7d0) sparseArray.valueAt(i)).f21315a.d();
            i++;
        }
    }

    @Override // a.fuo
    public final void release() {
    }
}
