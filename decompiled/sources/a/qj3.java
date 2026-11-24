package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28817a;
    public final String b;
    public final String c;

    public qj3(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f28817a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj3)) {
            return false;
        }
        qj3 qj3Var = (qj3) obj;
        return Intrinsics.d(this.f28817a, qj3Var.f28817a) && Intrinsics.d(this.b, qj3Var.b) && Intrinsics.d(this.c, qj3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28817a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("AppStringModel(locale=", this.f28817a, ", key=", this.b, ", value="), this.c, Separators.RPAREN);
    }
}
