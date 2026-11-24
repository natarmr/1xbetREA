package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gmj0 implements mmj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f11546a;

    public gmj0(Throwable th) {
        this.f11546a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmj0) && this.f11546a.equals(((gmj0) obj).f11546a);
    }

    public final int hashCode() {
        return this.f11546a.hashCode();
    }

    public final String toString() {
        return ohs0.q("OnShareActivityStartFailed(throwable=", Separators.RPAREN, this.f11546a);
    }
}
