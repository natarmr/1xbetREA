package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vtn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38016a;
    public final String b;
    public final String c;

    public vtn(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f38016a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtn)) {
            return false;
        }
        vtn vtnVar = (vtn) obj;
        return Intrinsics.d(this.f38016a, vtnVar.f38016a) && Intrinsics.d(this.b, vtnVar.b) && Intrinsics.d(this.c, vtnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f38016a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("EmptyBalanceUiModel(warningLabel=", this.f38016a, ", infoLabel=", this.b, ", buttonText="), this.c, Separators.RPAREN);
    }
}
