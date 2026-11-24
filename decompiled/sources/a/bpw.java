package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bpw {
    public static final apw Companion = new apw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3004a;
    public final String b;
    public final String c;

    public /* synthetic */ bpw(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f3004a = null;
        } else {
            this.f3004a = str;
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
        if (!(obj instanceof bpw)) {
            return false;
        }
        bpw bpwVar = (bpw) obj;
        return Intrinsics.d(this.f3004a, bpwVar.f3004a) && Intrinsics.d(this.b, bpwVar.b) && Intrinsics.d(this.c, bpwVar.c);
    }

    public final int hashCode() {
        String str = this.f3004a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("HorseResponse(gender=", this.f3004a, ", id=", this.b, ", name="), this.c, Separators.RPAREN);
    }
}
