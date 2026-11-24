package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v3g0 implements x3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36732a;

    public v3g0(String str) {
        this.f36732a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3g0) && this.f36732a.equals(((v3g0) obj).f36732a);
    }

    public final int hashCode() {
        return this.f36732a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnApplyHint(hint=", this.f36732a, Separators.RPAREN);
    }
}
