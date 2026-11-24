package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zod implements mnd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44714a;
    public final String b;
    public final boolean c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public zod(long j, String str, String str2, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        this.f44714a = str;
        this.b = str2;
        this.c = z;
        this.d = j;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zod)) {
            return false;
        }
        zod zodVar = (zod) obj;
        return Intrinsics.d(this.f44714a, zodVar.f44714a) && Intrinsics.d(this.b, zodVar.b) && this.c == zodVar.c && this.d == zodVar.d && this.e == zodVar.e && this.f == zodVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(rw2.b(brm0.e(ua80.b(this.f44714a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, false), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CompressedCardMultiTeamsModel(teamOneName=", this.f44714a, ", teamTwoName=", this.b, ", finished=");
        rw2.v(this.d, ", sportId=", sbN, this.c);
        w6x.A(", hostsVsGuests=false, live=", ", nonStarted=", sbN, this.e, this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
