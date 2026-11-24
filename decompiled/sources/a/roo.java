package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class roo {
    public static final qoo Companion = new qoo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30849a;
    public final long b;

    public /* synthetic */ roo(int i, long j, long j2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, poo.f27339a.getDescriptor());
            throw null;
        }
        this.f30849a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roo)) {
            return false;
        }
        roo rooVar = (roo) obj;
        return this.f30849a == rooVar.f30849a && this.b == rooVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f30849a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f30849a, "ExpandedSportsModel(sportId=", ", subSportId="));
    }

    public roo(long j, long j2) {
        this.f30849a = j;
        this.b = j2;
    }
}
