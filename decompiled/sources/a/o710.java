package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class o710 implements Iterable, khy {
    public static final n710 d = new n710(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24763a;
    public final long b;
    public final long c;

    public o710(long j, long j2, long j3) {
        if (j3 == 0) {
            jf4.o("Step must be non-zero.");
            throw null;
        }
        if (j3 == Long.MIN_VALUE) {
            jf4.o("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f24763a = j;
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                long j5 = j % j3;
                long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                j2 -= j6 < 0 ? j6 + j3 : j6;
            }
        } else {
            if (j3 >= 0) {
                jf4.o("Step is zero.");
                throw null;
            }
            if (j > j2) {
                long j7 = -j3;
                long j8 = j % j7;
                long j9 = j2 % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j2 += j10 < 0 ? j10 + j7 : j10;
            }
        }
        this.b = j2;
        this.c = j3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o710)) {
            return false;
        }
        if (isEmpty() && ((o710) obj).isEmpty()) {
            return true;
        }
        o710 o710Var = (o710) obj;
        return this.f24763a == o710Var.f24763a && this.b == o710Var.b && this.c == o710Var.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f24763a) * 31, 31, this.b);
    }

    public boolean isEmpty() {
        long j = this.c;
        long j2 = this.b;
        long j3 = this.f24763a;
        if (j > 0) {
            return j3 > j2;
        }
        return j3 < j2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p710(this.f24763a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.c;
        long j2 = this.b;
        long j3 = this.f24763a;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
