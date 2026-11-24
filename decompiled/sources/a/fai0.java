package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fai0 implements hai0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9209a;

    public fai0(String str) {
        this.f9209a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fai0) && this.f9209a.equals(((fai0) obj).f9209a);
    }

    public final int hashCode() {
        return this.f9209a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(message=", this.f9209a, Separators.RPAREN);
    }
}
