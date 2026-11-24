package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22041a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public mmk(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.f22041a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmk)) {
            return false;
        }
        mmk mmkVar = (mmk) obj;
        return Intrinsics.d(this.f22041a, mmkVar.f22041a) && Intrinsics.d(this.b, mmkVar.b) && this.c.equals(mmkVar.c) && this.d.equals(mmkVar.d) && Intrinsics.d(this.e, mmkVar.e);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(this.f22041a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DigestChallenge(realm=", this.f22041a, ", nonce=", this.b, ", algorithm=");
        f140.v(sbN, this.c, ", qop=", this.d, ", opaque=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
