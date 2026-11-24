package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class xg9 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f40826a;
    public long b = -1;
    public long c = Long.MAX_VALUE;
    public wg9 d;

    public xg9(char[] cArr) {
        this.f40826a = cArr;
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public xg9 clone() {
        try {
            return (xg9) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String c() {
        String str = new String(this.f40826a);
        if (str.length() < 1) {
            return "";
        }
        long j = this.c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public float e() {
        if (this instanceof zg9) {
            return ((zg9) this).e();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg9)) {
            return false;
        }
        xg9 xg9Var = (xg9) obj;
        if (this.b == xg9Var.b && this.c == xg9Var.c && Arrays.equals(this.f40826a, xg9Var.f40826a)) {
            return Objects.equals(this.d, xg9Var.d);
        }
        return false;
    }

    public int f() {
        if (this instanceof zg9) {
            return ((zg9) this).f();
        }
        return 0;
    }

    public final String g() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public final void h(long j) {
        if (this.c != Long.MAX_VALUE) {
            return;
        }
        this.c = j;
        wg9 wg9Var = this.d;
        if (wg9Var != null) {
            wg9Var.i(this);
        }
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f40826a) * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        wg9 wg9Var = this.d;
        return (i2 + (wg9Var != null ? wg9Var.hashCode() : 0)) * 31;
    }

    public String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.b);
            sb.append("-");
            return brm0.k(this.c, Separators.RPAREN, sb);
        }
        String strSubstring = new String(this.f40826a).substring((int) this.b, ((int) this.c) + 1);
        StringBuilder sb2 = new StringBuilder(g());
        sb2.append(" (");
        sb2.append(this.b);
        sb2.append(" : ");
        kng0.z(sb2, this.c, ") <<", strSubstring);
        sb2.append(">>");
        return sb2.toString();
    }
}
