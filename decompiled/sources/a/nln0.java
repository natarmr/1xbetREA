package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nln0 implements rln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23737a;
    public final String b;

    public nln0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f23737a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nln0)) {
            return false;
        }
        nln0 nln0Var = (nln0) obj;
        return Intrinsics.d(this.f23737a, nln0Var.f23737a) && Intrinsics.d(this.b, nln0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23737a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PotentialWin(potentialWinLabel=", this.f23737a, ", potentialWinValue=", this.b, Separators.RPAREN);
    }
}
