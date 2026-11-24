package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class we40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f39002a;

    public we40(vbj vbjVar) {
        this.f39002a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof we40) && this.f39002a.equals(((we40) obj).f39002a);
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f39002a;
    }

    public final int hashCode() {
        return this.f39002a.hashCode();
    }

    public final String toString() {
        return "PromoItems(state=" + this.f39002a + Separators.RPAREN;
    }
}
