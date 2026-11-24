package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kre {
    public static final hre Companion = new hre();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18761a;
    public final String b;

    public /* synthetic */ kre(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f18761a = null;
        } else {
            this.f18761a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kre)) {
            return false;
        }
        kre kreVar = (kre) obj;
        return Intrinsics.d(this.f18761a, kreVar.f18761a) && Intrinsics.d(this.b, kreVar.b);
    }

    public final int hashCode() {
        String str = this.f18761a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("CountryResponse(title=", this.f18761a, ", image=", this.b, Separators.RPAREN);
    }
}
