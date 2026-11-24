package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2808a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public bls(int i, int i2, String str, String str2, String str3, boolean z, boolean z2) {
        brm0.B(str, str2, str3);
        this.f2808a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bls)) {
            return false;
        }
        bls blsVar = (bls) obj;
        return Intrinsics.d(this.f2808a, blsVar.f2808a) && Intrinsics.d(this.b, blsVar.b) && Intrinsics.d(this.c, blsVar.c) && this.d == blsVar.d && this.e == blsVar.e && this.f == blsVar.f && this.g == blsVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(twn.a(this.e, twn.a(this.d, ua80.b(ua80.b(this.f2808a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GameLogEventUiModel(eventMinute=", this.f2808a, ", radiantEventTitle=", this.b, ", direEventTitle=");
        twn.w(this.d, this.c, ", radiantEventIcon=", ", direEventIcon=", sbN);
        brm0.w(this.e, ", radiantEventIconVisibility=", ", direEventIconVisibility=", sbN, this.f);
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
