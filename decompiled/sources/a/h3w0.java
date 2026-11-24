package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h3w0 implements l3w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12406a;

    public final boolean equals(Object obj) {
        if (obj instanceof h3w0) {
            return this.f12406a.equals(((h3w0) obj).f12406a);
        }
        return false;
    }

    @Override // a.l3w0
    public final String getValue() {
        return this.f12406a;
    }

    public final int hashCode() {
        return this.f12406a.hashCode();
    }

    public final String toString() {
        return kng0.l("Default(value=", this.f12406a, Separators.RPAREN);
    }
}
