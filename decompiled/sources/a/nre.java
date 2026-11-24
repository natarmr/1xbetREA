package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class nre implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwe f23998a;
    public final zxj0 b;
    public final m0k0 c;

    public nre(hwe hweVar, zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f23998a = hweVar;
        this.b = zxj0Var;
        this.c = m0k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nre)) {
            return false;
        }
        nre nreVar = (nre) obj;
        return this.f23998a == nreVar.f23998a && this.b.equals(nreVar.b) && this.c.equals(nreVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f23998a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CouponActionInfo(couponEventAction=" + this.f23998a + ", simpleBetZip=" + this.b + ", singleBetGame=" + this.c + Separators.RPAREN;
    }
}
