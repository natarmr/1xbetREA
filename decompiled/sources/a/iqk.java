package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iqk implements lqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15213a;

    public iqk(String str) {
        this.f15213a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqk) && this.f15213a.equals(((iqk) obj).f15213a);
    }

    public final int hashCode() {
        return this.f15213a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(title=", this.f15213a, Separators.RPAREN);
    }
}
