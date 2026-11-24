package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h0v0 implements i0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12252a;

    public h0v0(String str) {
        this.f12252a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0v0) && this.f12252a.equals(((h0v0) obj).f12252a);
    }

    public final int hashCode() {
        return this.f12252a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(message=", this.f12252a, Separators.RPAREN);
    }
}
