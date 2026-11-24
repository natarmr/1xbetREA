package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28616a;
    public final String b;
    public final String c;

    public qf60(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f28616a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf60)) {
            return false;
        }
        qf60 qf60Var = (qf60) obj;
        return Intrinsics.d(this.f28616a, qf60Var.f28616a) && Intrinsics.d(this.b, qf60Var.b) && Intrinsics.d(this.c, qf60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28616a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("OkSocialKeys(id=", this.f28616a, ", key=", this.b, ", redirectUrl="), this.c, Separators.RPAREN);
    }
}
