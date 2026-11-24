package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class lmw {
    public static final kmw Companion = new kmw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20317a;
    public final String b;
    public final String c;

    public /* synthetic */ lmw(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20317a = null;
        } else {
            this.f20317a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmw)) {
            return false;
        }
        lmw lmwVar = (lmw) obj;
        return Intrinsics.d(this.f20317a, lmwVar.f20317a) && Intrinsics.d(this.b, lmwVar.b) && Intrinsics.d(this.c, lmwVar.c);
    }

    public final int hashCode() {
        String str = this.f20317a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("HorseInfoResponse(id=", this.f20317a, ", name=", this.b, ", gender="), this.c, Separators.RPAREN);
    }
}
