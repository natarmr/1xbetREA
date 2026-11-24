package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jak implements nak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16193a;

    public jak(String str) {
        this.f16193a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jak) && this.f16193a.equals(((jak) obj).f16193a);
    }

    public final int hashCode() {
        return this.f16193a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(errorMessage=", this.f16193a, Separators.RPAREN);
    }
}
