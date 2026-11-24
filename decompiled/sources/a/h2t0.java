package a;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class h2t0 implements Comparable {
    public static final g2t0 b = new g2t0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12353a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        if (j >= 0) {
            String string = Long.toString(j, CharsKt.checkRadix(10));
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        String string2 = Long.toString(j2, CharsKt.checkRadix(10));
        string2.getClass();
        String string3 = Long.toString(j3, CharsKt.checkRadix(10));
        string3.getClass();
        return string2.concat(string3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.f(this.f12353a ^ Long.MIN_VALUE, ((h2t0) obj).f12353a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h2t0) {
            return this.f12353a == ((h2t0) obj).f12353a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12353a);
    }

    public final String toString() {
        return b(this.f12353a);
    }
}
