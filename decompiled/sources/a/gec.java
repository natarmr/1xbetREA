package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gec implements jec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11147a;

    public gec(String str) {
        this.f11147a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gec) && this.f11147a.equals(((gec) obj).f11147a);
    }

    public final int hashCode() {
        return this.f11147a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChanged(query=", this.f11147a, Separators.RPAREN);
    }
}
