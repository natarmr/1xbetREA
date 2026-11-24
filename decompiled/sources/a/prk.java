package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class prk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27470a;
    public final eoa b;

    public prk(String str, eoa eoaVar) {
        this.f27470a = str;
        this.b = eoaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prk)) {
            return false;
        }
        prk prkVar = (prk) obj;
        return this.f27470a.equals(prkVar.f27470a) && this.b.equals(prkVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f27470a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27470a.hashCode() * 31);
    }

    public final String toString() {
        return "DisciplineDetailsIconFocusCardStackUiModel(key=" + this.f27470a + ", cardStackUiModel=" + this.b + Separators.RPAREN;
    }
}
