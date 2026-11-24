package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jeg implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16372a;
    public final hjm b;

    public jeg(hjm hjmVar, String str) {
        this.f16372a = str;
        this.b = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeg)) {
            return false;
        }
        jeg jegVar = (jeg) obj;
        return this.f16372a.equals(jegVar.f16372a) && this.b.equals(jegVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f16372a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16372a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberChampionshipEventHeaderUiModel(key=" + this.f16372a + ", dsModel=" + this.b + Separators.RPAREN;
    }
}
