package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class lre {
    public static final ire Companion = new ire();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20527a;
    public final String b;

    public /* synthetic */ lre(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f20527a = null;
        } else {
            this.f20527a = str;
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
        if (!(obj instanceof lre)) {
            return false;
        }
        lre lreVar = (lre) obj;
        return Intrinsics.d(this.f20527a, lreVar.f20527a) && Intrinsics.d(this.b, lreVar.b);
    }

    public final int hashCode() {
        String str = this.f20527a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("CountryResponse(title=", this.f20527a, ", image=", this.b, Separators.RPAREN);
    }
}
