package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kw10 implements nw10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18980a;

    public kw10(String str) {
        this.f18980a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kw10) && this.f18980a.equals(((kw10) obj).f18980a);
    }

    public final int hashCode() {
        return this.f18980a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(errorMessage=", this.f18980a, Separators.RPAREN);
    }
}
