package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o5b0 implements p5b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24679a;

    public o5b0(String str) {
        this.f24679a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5b0) && this.f24679a.equals(((o5b0) obj).f24679a);
    }

    public final int hashCode() {
        return this.f24679a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(message=", this.f24679a, Separators.RPAREN);
    }
}
