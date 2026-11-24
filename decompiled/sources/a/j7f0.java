package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j7f0 implements n7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16038a;

    public j7f0(String str) {
        this.f16038a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7f0) && this.f16038a.equals(((j7f0) obj).f16038a);
    }

    public final int hashCode() {
        return this.f16038a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShareLoginPassword(parsedLoginPassword=", this.f16038a, Separators.RPAREN);
    }
}
