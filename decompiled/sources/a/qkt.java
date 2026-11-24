package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class qkt implements Serializable {
    public static final pkt Companion = new pkt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28902a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final boolean g;
    public final cm90 h;

    public /* synthetic */ qkt(int i, int i2, String str, String str2, String str3, long j, String str4, boolean z, cm90 cm90Var) {
        if ((i & 1) == 0) {
            this.f28902a = 0;
        } else {
            this.f28902a = i2;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) != 0) {
            this.h = cm90Var;
        } else {
            cm90.Companion.getClass();
            this.h = am90.a();
        }
    }

    public static qkt a(qkt qktVar, String str, boolean z, int i) {
        int i2 = qktVar.f28902a;
        String str2 = qktVar.b;
        if ((i & 4) != 0) {
            str = qktVar.c;
        }
        String str3 = str;
        String str4 = qktVar.d;
        long j = qktVar.e;
        String str5 = qktVar.f;
        if ((i & 64) != 0) {
            z = qktVar.g;
        }
        cm90 cm90Var = qktVar.h;
        qktVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        cm90Var.getClass();
        return new qkt(i2, j, cm90Var, str2, str3, str4, str5, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkt)) {
            return false;
        }
        qkt qktVar = (qkt) obj;
        return this.f28902a == qktVar.f28902a && Intrinsics.d(this.b, qktVar.b) && Intrinsics.d(this.c, qktVar.c) && Intrinsics.d(this.d, qktVar.d) && this.e == qktVar.e && Intrinsics.d(this.f, qktVar.f) && this.g == qktVar.g && Intrinsics.d(this.h, qktVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f28902a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f28902a, "GeoCountry(id=", ", name=", this.b, ", phoneCode=");
        f140.v(sbR, this.c, ", countryCode=", this.d, ", currencyId=");
        kng0.z(sbR, this.e, ", countryImage=", this.f);
        sbR.append(", top=");
        sbR.append(this.g);
        sbR.append(", phoneMask=");
        sbR.append(this.h);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    public qkt(int i, long j, cm90 cm90Var, String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        cm90Var.getClass();
        this.f28902a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
        this.g = z;
        this.h = cm90Var;
    }
}
