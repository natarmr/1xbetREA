package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nfh0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f23436a;

    public nfh0(hjm hjmVar) {
        this.f23436a = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfh0) && this.f23436a.equals(((nfh0) obj).f23436a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "RECOMMENDS_TAG";
    }

    public final int hashCode() {
        return this.f23436a.hashCode() - 179938354;
    }

    public final String toString() {
        return "SearchEventsFrequentlyHeaderUiModel(key=RECOMMENDS_TAG, model=" + this.f23436a + Separators.RPAREN;
    }
}
