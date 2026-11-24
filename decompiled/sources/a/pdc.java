package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pdc implements qdc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26801a;

    public pdc(String str) {
        this.f26801a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdc) && this.f26801a.equals(((pdc) obj).f26801a);
    }

    public final int hashCode() {
        return this.f26801a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f26801a, Separators.RPAREN);
    }
}
