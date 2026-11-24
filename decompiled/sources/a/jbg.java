package a;

import android.gov.nist.core.Separators;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class jbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16239a;
    public final IntRange b;

    public jbg(long j, IntRange intRange) {
        this.f16239a = j;
        this.b = intRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbg)) {
            return false;
        }
        jbg jbgVar = (jbg) obj;
        return this.f16239a == jbgVar.f16239a && this.b.equals(jbgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f16239a) * 31);
    }

    public final String toString() {
        return "WidthRangeDay(startPeriod=" + this.f16239a + ", widthRange=" + this.b + Separators.RPAREN;
    }
}
