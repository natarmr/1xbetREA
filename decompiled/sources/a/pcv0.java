package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pcv0 implements rcv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f26778a;

    public pcv0(mdm mdmVar) {
        this.f26778a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcv0) && this.f26778a.equals(((pcv0) obj).f26778a);
    }

    public final int hashCode() {
        return this.f26778a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f26778a, Separators.RPAREN);
    }
}
