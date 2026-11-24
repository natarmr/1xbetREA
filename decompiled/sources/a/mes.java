package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class mes extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21662a;

    public mes(String str) {
        this.f21662a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mes) && this.f21662a.equals(((mes) obj).f21662a);
    }

    public final int hashCode() {
        return this.f21662a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoSecondPlayerLogoUrlChanged(url=", this.f21662a, Separators.RPAREN);
    }
}
