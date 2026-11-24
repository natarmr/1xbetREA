package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p2n0 implements t2n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f26259a;

    public p2n0(hjm hjmVar) {
        this.f26259a = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2n0) && this.f26259a.equals(((p2n0) obj).f26259a);
    }

    public final int hashCode() {
        return this.f26259a.hashCode();
    }

    public final String toString() {
        return "Header(headerModel=" + this.f26259a + Separators.RPAREN;
    }
}
