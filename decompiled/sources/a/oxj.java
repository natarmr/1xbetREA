package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oxj implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26015a;
    public final vrm b;

    public oxj(String str, vrm vrmVar) {
        this.f26015a = str;
        this.b = vrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxj)) {
            return false;
        }
        oxj oxjVar = (oxj) obj;
        return this.f26015a.equals(oxjVar.f26015a) && this.b.equals(oxjVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f26015a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26015a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultSportBannerChampionshipUiModel(key=" + this.f26015a + ", item=" + this.b + Separators.RPAREN;
    }
}
