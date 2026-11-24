package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class lds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19866a;

    public lds(String str) {
        this.f19866a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lds) && this.f19866a.equals(((lds) obj).f19866a);
    }

    public final int hashCode() {
        return this.f19866a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneLogoUrlChanged(url=", this.f19866a, Separators.RPAREN);
    }
}
