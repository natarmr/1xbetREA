package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uan0 implements yan0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f35339a;

    public uan0(mdm mdmVar) {
        this.f35339a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uan0) && this.f35339a.equals(((uan0) obj).f35339a);
    }

    public final int hashCode() {
        return this.f35339a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f35339a, Separators.RPAREN);
    }
}
