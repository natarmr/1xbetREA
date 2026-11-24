package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class frq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10031a;
    public final String b;
    public final String c;

    public frq(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f10031a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frq)) {
            return false;
        }
        frq frqVar = (frq) obj;
        return this.f10031a == frqVar.f10031a && Intrinsics.d(this.b, frqVar.b) && Intrinsics.d(this.c, frqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f10031a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f10031a, "FollowedCountry(countryId=", ", countryName=", this.b, ", countryImage="), this.c, Separators.RPAREN);
    }
}
