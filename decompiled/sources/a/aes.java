package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class aes extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f744a;

    public aes(String str) {
        this.f744a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aes) && this.f744a.equals(((aes) obj).f744a);
    }

    public final int hashCode() {
        return this.f744a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneFirstPlayerLogoUrlChanged(url=", this.f744a, Separators.RPAREN);
    }
}
