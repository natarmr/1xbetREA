package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bao implements aeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2269a;

    public bao(String str) {
        this.f2269a = str;
    }

    @Override // a.aeo
    public final String a() {
        return this.f2269a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bao) && this.f2269a.equals(((bao) obj).f2269a);
    }

    public final int hashCode() {
        return this.f2269a.hashCode();
    }

    public final String toString() {
        return kng0.l("EventAutoSubUiModel(eventKey=", this.f2269a, Separators.RPAREN);
    }
}
