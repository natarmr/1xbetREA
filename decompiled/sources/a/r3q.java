package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r3q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29800a;
    public final List b;
    public final List c;
    public final long d;

    public r3q(long j, List list, List list2, long j2) {
        list.getClass();
        list2.getClass();
        this.f29800a = j;
        this.b = list;
        this.c = list2;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3q)) {
            return false;
        }
        r3q r3qVar = (r3q) obj;
        return this.f29800a == r3qVar.f29800a && Intrinsics.d(this.b, r3qVar.b) && Intrinsics.d(this.c, r3qVar.c) && this.d == r3qVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + dw9.a(dw9.a(Long.hashCode(this.f29800a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f29800a, "FilterParams(partitionId=", ", chosenFilters=", this.b);
        sbP.append(", chosenProviders=");
        sbP.append(this.c);
        sbP.append(", partType=");
        return brm0.k(this.d, Separators.RPAREN, sbP);
    }
}
