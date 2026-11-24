package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uhg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35677a;
    public final String b;
    public final String c;

    public uhg0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f35677a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhg0)) {
            return false;
        }
        uhg0 uhg0Var = (uhg0) obj;
        return Intrinsics.d(this.f35677a, uhg0Var.f35677a) && Intrinsics.d(this.b, uhg0Var.b) && Intrinsics.d(this.c, uhg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f35677a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("RowModel(id=", this.f35677a, ", type=", this.b, ", text="), this.c, Separators.RPAREN);
    }
}
