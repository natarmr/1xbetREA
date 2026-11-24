package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n9p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23153a;
    public final fhh b;

    public n9p0(String str, fhh fhhVar) {
        this.f23153a = str;
        this.b = fhhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9p0)) {
            return false;
        }
        n9p0 n9p0Var = (n9p0) obj;
        return this.f23153a.equals(n9p0Var.f23153a) && this.b.equals(n9p0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f23153a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23153a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamDetailsLineupUiModel(key=" + this.f23153a + ", playerCard=" + this.b + Separators.RPAREN;
    }
}
