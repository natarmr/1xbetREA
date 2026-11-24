package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bjf0 implements djf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2704a;

    public bjf0(String str) {
        this.f2704a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjf0) && this.f2704a.equals(((bjf0) obj).f2704a);
    }

    public final int hashCode() {
        return this.f2704a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f2704a, Separators.RPAREN);
    }
}
