package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qjx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28861a;
    public final String b;
    public final String c;

    public qjx(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f28861a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjx)) {
            return false;
        }
        qjx qjxVar = (qjx) obj;
        return Intrinsics.d(this.f28861a, qjxVar.f28861a) && Intrinsics.d(this.b, qjxVar.b) && Intrinsics.d(this.c, qjxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28861a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("InsufficientFundsUiState(warningLabel=", this.f28861a, ", hintLabel=", this.b, ", buttonLabel="), this.c, Separators.RPAREN);
    }
}
