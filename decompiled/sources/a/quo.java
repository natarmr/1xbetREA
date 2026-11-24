package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class quo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f29354a;
    public final String b;
    public final double c;

    public quo(double d, double d2, String str) {
        str.getClass();
        this.f29354a = d;
        this.b = str;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quo)) {
            return false;
        }
        quo quoVar = (quo) obj;
        return Double.compare(this.f29354a, quoVar.f29354a) == 0 && Intrinsics.d(this.b, quoVar.b) && Double.compare(this.c, quoVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ua80.b(Double.hashCode(this.f29354a) * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.m(vqd.s("FIECollectionUIModel(coefficient=", this.f29354a, ", coefDescription=", this.b), this.c, ", price=", Separators.RPAREN);
    }
}
