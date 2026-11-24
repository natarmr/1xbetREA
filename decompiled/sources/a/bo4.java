package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bo4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2913a;
    public final String b;
    public final String c;
    public final String d;
    public final wa80 e;
    public final boolean f;
    public final long g;

    public bo4(String str, String str2, String str3, String str4, wa80 wa80Var, boolean z, long j) {
        str.getClass();
        this.f2913a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = wa80Var;
        this.f = z;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo4)) {
            return false;
        }
        bo4 bo4Var = (bo4) obj;
        return Intrinsics.d(this.f2913a, bo4Var.f2913a) && this.b.equals(bo4Var.b) && this.c.equals(bo4Var.c) && this.d.equals(bo4Var.d) && this.e == bo4Var.e && this.f == bo4Var.f && this.g == bo4Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + brm0.e((this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f2913a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AuthSessionsHistoryModel(appGuid=", this.f2913a, ", deviceName=", this.b, ", country=");
        f140.v(sbN, this.c, ", city=", this.d, ", osType=");
        sbN.append(this.e);
        sbN.append(", currentSession=");
        sbN.append(this.f);
        sbN.append(", registrationDate=");
        return brm0.k(this.g, Separators.RPAREN, sbN);
    }
}
