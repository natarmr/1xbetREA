package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uus0 implements vus0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f36318a;

    public uus0(swp0 swp0Var) {
        this.f36318a = swp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uus0) && this.f36318a.equals(((uus0) obj).f36318a);
    }

    public final int hashCode() {
        return this.f36318a.hashCode();
    }

    public final String toString() {
        return "Token(token=" + this.f36318a + Separators.RPAREN;
    }
}
