package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hew implements kew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud f12944a;
    public final long b;
    public final String c;

    public hew(aud audVar, long j, String str) {
        audVar.getClass();
        str.getClass();
        this.f12944a = audVar;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hew)) {
            return false;
        }
        hew hewVar = (hew) obj;
        return Intrinsics.d(this.f12944a, hewVar.f12944a) && this.b == hewVar.b && Intrinsics.d(this.c, hewVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f12944a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendAddToCouponEffect(configureCouponResultModel=");
        sb.append(this.f12944a);
        sb.append(", champId=");
        sb.append(this.b);
        return rw2.o(sb, ", gameId=", this.c, Separators.RPAREN);
    }
}
