package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ime0 implements jme0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15021a;

    public /* synthetic */ ime0(String str) {
        this.f15021a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ime0) {
            return this.f15021a.equals(((ime0) obj).f15021a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15021a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnRefereeItemClick(refereeId=", this.f15021a, Separators.RPAREN);
    }
}
