package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rco {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30249a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;

    public rco(long j, long j2, long j3, String str, boolean z) {
        str.getClass();
        this.f30249a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rco)) {
            return false;
        }
        rco rcoVar = (rco) obj;
        return this.f30249a == rcoVar.f30249a && Intrinsics.d(this.b, rcoVar.b) && this.c == rcoVar.c && this.d == rcoVar.d && this.e == rcoVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.b(rw2.b(ua80.b(Long.hashCode(this.f30249a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f30249a, "EventGroupDbModel(id=", ", name=", this.b);
        kng0.A(sbO, ", position=", this.c, ", countCols=");
        hne.t(this.d, ", hasAutoSub=", sbO, this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
