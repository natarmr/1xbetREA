package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ey70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8615a;
    public final String b;
    public final String c;

    public ey70(String str, String str2, String str3) {
        str.getClass();
        this.f8615a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey70)) {
            return false;
        }
        ey70 ey70Var = (ey70) obj;
        return Intrinsics.d(this.f8615a, ey70Var.f8615a) && this.b.equals(ey70Var.b) && this.c.equals(ey70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f8615a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ProfileInfoContainer(userId=", this.f8615a, ", phone=", this.b, ", countryCode="), this.c, Separators.RPAREN);
    }
}
