package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f34121a;
    public final String b;
    public final String c;

    public tl(double d, String str, String str2) {
        str2.getClass();
        this.f34121a = d;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl)) {
            return false;
        }
        tl tlVar = (tl) obj;
        return Double.compare(this.f34121a, tlVar.f34121a) == 0 && this.b.equals(tlVar.b) && Intrinsics.d(this.c, tlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Double.hashCode(this.f34121a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(vqd.s("ActiveLimitValueModel(value=", this.f34121a, ", measure=", this.b), ", valueView=", this.c, Separators.RPAREN);
    }
}
