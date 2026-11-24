package a;

import android.gov.nist.core.Separators;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d3x0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5427a;
    public final String b;
    public final int c;
    public final long d;
    public final Object e;
    public final RuntimeException f;

    public d3x0(long j, String str, int i, long j2, Object obj) {
        x0x.A(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.f5427a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = obj;
        if (i != 5) {
            this.f = null;
            return;
        }
        if (obj == null) {
            this.f = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof qdw0)) {
            this.f = null;
        } else {
            this.f = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object a() {
        int i = this.c;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.d;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.e;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            c99.l("Impossible, this was validated when parsed or created");
            return null;
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((qdw0) obj).m();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d3x0 d3x0Var = (d3x0) obj;
        long j = d3x0Var.f5427a;
        long j2 = this.f5427a;
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.b;
        str.getClass();
        String str2 = d3x0Var.b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3x0)) {
            return false;
        }
        d3x0 d3x0Var = (d3x0) obj;
        return this.f5427a == d3x0Var.f5427a && Objects.equals(this.b, d3x0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5427a), this.b);
    }

    public final String toString() {
        String string = this.b;
        if (string == null) {
            string = Long.toString(this.f5427a);
        }
        String strValueOf = String.valueOf(a());
        return rw2.o(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, Separators.COLON, strValueOf);
    }
}
