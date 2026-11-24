package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23235a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbe)) {
            return false;
        }
        nbe nbeVar = (nbe) obj;
        return this.f23235a == nbeVar.f23235a && this.b == nbeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f23235a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f23235a, "ConsumeParams(value=", ", head=", Separators.RPAREN, this.b);
    }
}
