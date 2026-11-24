package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ka30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17945a;

    public ka30(String str) {
        this.f17945a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka30) && this.f17945a.equals(((ka30) obj).f17945a);
    }

    public final int hashCode() {
        return this.f17945a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchInfoModel(matchFormat=", this.f17945a, Separators.RPAREN);
    }
}
