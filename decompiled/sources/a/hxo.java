package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hxo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13819a;
    public final double b;

    public hxo(String str, double d) {
        str.getClass();
        this.f13819a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxo)) {
            return false;
        }
        hxo hxoVar = (hxo) obj;
        return Intrinsics.d(this.f13819a, hxoVar.f13819a) && Double.compare(this.b, hxoVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f13819a.hashCode() * 31);
    }

    public final String toString() {
        return "FastBetValue(stringFormatValue=" + this.f13819a + ", rawValue=" + this.b + Separators.RPAREN;
    }
}
