package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11404a;
    public final String b;
    public final String c;

    public gjl0(String str, String str2, String str3) {
        str.getClass();
        this.f11404a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjl0)) {
            return false;
        }
        gjl0 gjl0Var = (gjl0) obj;
        return Intrinsics.d(this.f11404a, gjl0Var.f11404a) && this.b.equals(gjl0Var.b) && this.c.equals(gjl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f11404a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("TwoOpponents(infoLabel=", this.f11404a, ", teamOneName=", this.b, ", teamTwoName="), this.c, Separators.RPAREN);
    }
}
