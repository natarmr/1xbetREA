package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g6r0 implements n6r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10782a;

    public g6r0(String str) {
        this.f10782a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6r0) && this.f10782a.equals(((g6r0) obj).f10782a);
    }

    public final int hashCode() {
        return this.f10782a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChange(query=", this.f10782a, Separators.RPAREN);
    }
}
