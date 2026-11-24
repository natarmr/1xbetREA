package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l3p0 implements n3p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f19370a;

    public l3p0(hjm hjmVar) {
        this.f19370a = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3p0) && this.f19370a.equals(((l3p0) obj).f19370a);
    }

    public final int hashCode() {
        return this.f19370a.hashCode();
    }

    public final String toString() {
        return "Header(model=" + this.f19370a + Separators.RPAREN;
    }
}
