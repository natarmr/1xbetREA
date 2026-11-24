package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rr4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30962a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr4)) {
            return false;
        }
        rr4 rr4Var = (rr4) obj;
        return Intrinsics.d(this.f30962a, rr4Var.f30962a) && Intrinsics.d(this.b, rr4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30962a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthenticatorRegInfoModel(registrationGuid=", this.f30962a, ", secret=", this.b, Separators.RPAREN);
    }
}
