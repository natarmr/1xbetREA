package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class to30 implements vo30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34264a;
    public final String b;
    public final m0x c;
    public final boolean d;

    public to30(String str, String str2, m0x m0xVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.f34264a = str;
        this.b = str2;
        this.c = m0xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to30)) {
            return false;
        }
        to30 to30Var = (to30) obj;
        return Intrinsics.d(this.f34264a, to30Var.f34264a) && Intrinsics.d(this.b, to30Var.b) && this.c.equals(to30Var.c) && this.d == to30Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.a(this.c, ua80.b(this.f34264a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(title=", this.f34264a, ", subtitle=", this.b, ", backgroundPicture=");
        sbN.append(this.c);
        sbN.append(", underMaintenance=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
