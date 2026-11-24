package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z690 implements d790 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f43855a;

    public z690(mdm mdmVar) {
        this.f43855a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z690) && this.f43855a.equals(((z690) obj).f43855a);
    }

    public final int hashCode() {
        return this.f43855a.hashCode();
    }

    public final String toString() {
        return b1j.j("ConnectionLost(lottieConfig=", this.f43855a, Separators.RPAREN);
    }
}
