package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hce implements kce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12819a;

    public hce(String str) {
        this.f12819a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hce) && this.f12819a.equals(((hce) obj).f12819a);
    }

    public final int hashCode() {
        return this.f12819a.hashCode();
    }

    public final String toString() {
        return kng0.l("Data(htmlData=", this.f12819a, Separators.RPAREN);
    }
}
