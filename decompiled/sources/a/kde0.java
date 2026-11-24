package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kde0 implements mde0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18103a;

    public kde0(String str) {
        this.f18103a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kde0) && this.f18103a.equals(((kde0) obj).f18103a);
    }

    public final int hashCode() {
        return this.f18103a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(message=", this.f18103a, Separators.RPAREN);
    }
}
