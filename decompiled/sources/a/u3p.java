package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u3p implements x3p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35008a;

    public u3p(String str) {
        this.f35008a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3p) && this.f35008a.equals(((u3p) obj).f35008a);
    }

    public final int hashCode() {
        return this.f35008a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChange(query=", this.f35008a, Separators.RPAREN);
    }
}
