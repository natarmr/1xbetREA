package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class u5g implements v5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35092a;

    public final boolean equals(Object obj) {
        if (obj instanceof u5g) {
            return this.f35092a.equals(((u5g) obj).f35092a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35092a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(value=", this.f35092a, Separators.RPAREN);
    }
}
