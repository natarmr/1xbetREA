package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ixo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15551a;
    public final double b;

    public ixo(String str, double d) {
        str.getClass();
        this.f15551a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixo)) {
            return false;
        }
        ixo ixoVar = (ixo) obj;
        return Intrinsics.d(this.f15551a, ixoVar.f15551a) && Double.compare(this.b, ixoVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f15551a.hashCode() * 31);
    }

    public final String toString() {
        return "FastBetValue(stringFormatValue=" + this.f15551a + ", rawValue=" + this.b + Separators.RPAREN;
    }
}
