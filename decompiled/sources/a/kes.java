package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class kes extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18167a;

    public kes(String str) {
        this.f18167a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kes) && this.f18167a.equals(((kes) obj).f18167a);
    }

    public final int hashCode() {
        return this.f18167a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoLogoUrlChanged(url=", this.f18167a, Separators.RPAREN);
    }
}
