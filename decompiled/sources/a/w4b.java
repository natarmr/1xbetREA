package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w4b implements x4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38535a;

    public w4b(String str) {
        this.f38535a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4b) && this.f38535a.equals(((w4b) obj).f38535a);
    }

    public final int hashCode() {
        return this.f38535a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSelectTab(id=", this.f38535a, Separators.RPAREN);
    }
}
