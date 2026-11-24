package a;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class wen implements Comparable {
    public static final uen b = new uen(null);
    public static final long c = ibc.Z(4611686018427387903L);
    public static final long d = ibc.Z(-4611686018427387903L);
    public static final long e = 9223372036854759646L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39026a;

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jS = ibc.S(j, j3);
        if (-4611686018426L > jS || jS >= 4611686018427L) {
            return ibc.Z(jS);
        }
        return ibc.b0((jS * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strB0 = StringsKt.b0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strB0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strB0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strB0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strB0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.f(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final long e(long j) {
        return ((((int) j) & 1) != 1 || i(j)) ? l(j, bfn.MILLISECONDS) : j >> 1;
    }

    public static final int f(long j) {
        if (i(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean i(long j) {
        return j == c || j == d;
    }

    public static final long j(long j, long j2) {
        return k(j, n(j2));
    }

    public static final long k(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? ibc.Z(j3 / 1000000) : ibc.b0(j3);
        }
        long jS = ibc.S(j >> 1, j2 >> 1);
        if (jS != 9223372036854759646L) {
            return (jS == 4611686018427387903L || jS == -4611686018427387903L) ? ibc.Z(jS) : ibc.a0(jS);
        }
        jf4.o("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    public static final long l(long j, bfn bfnVar) {
        bfnVar.getClass();
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return dfn.b(j >> 1, (((int) j) & 1) == 0 ? bfn.NANOSECONDS : bfn.MILLISECONDS, bfnVar);
    }

    public static String m(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = n(j);
        }
        long jL = l(j, bfn.DAYS);
        int iL = i(j) ? 0 : (int) (l(j, bfn.HOURS) % 24);
        int iL2 = i(j) ? 0 : (int) (l(j, bfn.MINUTES) % 60);
        int iL3 = i(j) ? 0 : (int) (l(j, bfn.SECONDS) % 60);
        int iF = f(j);
        boolean z2 = jL != 0;
        boolean z3 = iL != 0;
        boolean z4 = iL2 != 0;
        boolean z5 = (iL3 == 0 && iF == 0) ? false : true;
        if (z2) {
            sb.append(jL);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iL);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iL2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iL3 != 0 || z2 || z3 || z4) {
                b(sb, iL3, iF, 9, "s", false);
            } else if (iF >= 1000000) {
                b(sb, iF / 1000000, iF % 1000000, 6, "ms", false);
            } else if (iF >= 1000) {
                b(sb, iF / 1000, iF % 1000, 3, "us", false);
            } else {
                sb.append(iF);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long n(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        b.getClass();
        int i = yen.f42494a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f39026a, ((wen) obj).f39026a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wen) {
            return this.f39026a == ((wen) obj).f39026a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39026a);
    }

    public final String toString() {
        return m(this.f39026a);
    }
}
