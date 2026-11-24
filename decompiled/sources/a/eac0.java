package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eac0 implements hac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7458a;

    public eac0(String str) {
        this.f7458a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eac0) && this.f7458a.equals(((eac0) obj).f7458a);
    }

    public final int hashCode() {
        return this.f7458a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f7458a, Separators.RPAREN);
    }
}
