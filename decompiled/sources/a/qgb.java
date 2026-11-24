package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qgb implements sgb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28675a;
    public final long b;

    public qgb(long j, long j2) {
        this.f28675a = j;
        this.b = j2;
    }

    @Override // a.sgb
    public final long b() {
        return this.f28675a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgb)) {
            return false;
        }
        qgb qgbVar = (qgb) obj;
        return this.f28675a == qgbVar.f28675a && this.b == qgbVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f28675a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f28675a, "RealCyber(champId=", ", subSportId="));
    }
}
