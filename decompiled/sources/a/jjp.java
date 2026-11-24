package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jjp implements ujp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16628a;

    public jjp(String str) {
        this.f16628a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjp) && this.f16628a.equals(((jjp) obj).f16628a);
    }

    public final int hashCode() {
        return this.f16628a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChange(query=", this.f16628a, Separators.RPAREN);
    }
}
