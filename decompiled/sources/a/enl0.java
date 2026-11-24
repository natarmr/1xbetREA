package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class enl0 implements hnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final izm f8100a;

    public enl0(izm izmVar) {
        this.f8100a = izmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enl0) && this.f8100a.equals(((enl0) obj).f8100a);
    }

    public final int hashCode() {
        return this.f8100a.hashCode();
    }

    public final String toString() {
        return "Tennis(model=" + this.f8100a + Separators.RPAREN;
    }
}
