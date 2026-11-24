package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class bes extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2466a;

    public bes(String str) {
        this.f2466a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bes) && this.f2466a.equals(((bes) obj).f2466a);
    }

    public final int hashCode() {
        return this.f2466a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneLogoUrlChanged(url=", this.f2466a, Separators.RPAREN);
    }
}
