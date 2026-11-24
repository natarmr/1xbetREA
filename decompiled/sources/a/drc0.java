package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class drc0 implements erc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hds f6554a;
    public final String b;

    public drc0(hds hdsVar, String str) {
        this.f6554a = hdsVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drc0)) {
            return false;
        }
        drc0 drc0Var = (drc0) obj;
        return this.f6554a.equals(drc0Var.f6554a) && this.b.equals(drc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6554a.hashCode() * 31);
    }

    public final String toString() {
        return "OneXGame(imageInfo=" + this.f6554a + ", title=" + this.b + Separators.RPAREN;
    }
}
