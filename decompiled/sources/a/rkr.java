package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rkr implements ukr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30661a;

    public rkr(String str) {
        this.f30661a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkr) && this.f30661a.equals(((rkr) obj).f30661a);
    }

    public final int hashCode() {
        return this.f30661a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(errorMessage=", this.f30661a, Separators.RPAREN);
    }
}
