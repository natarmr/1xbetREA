package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n84 {
    public static final l84 Companion = new l84();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23071a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Long f;

    public /* synthetic */ n84(int i, String str, String str2, String str3, String str4, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f23071a = null;
        } else {
            this.f23071a = str;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n84)) {
            return false;
        }
        n84 n84Var = (n84) obj;
        return Intrinsics.d(this.f23071a, n84Var.f23071a) && Intrinsics.d(this.b, n84Var.b) && Intrinsics.d(this.c, n84Var.c) && Intrinsics.d(this.d, n84Var.d) && Intrinsics.d(this.e, n84Var.e) && Intrinsics.d(this.f, n84Var.f);
    }

    public final int hashCode() {
        String str = this.f23071a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f;
        return iHashCode5 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AuthHistoryResponse(appGuid=", this.f23071a, ", deviceName=", this.b, ", country=");
        f140.v(sbN, this.c, ", city=", this.d, ", idOs=");
        sbN.append(this.e);
        sbN.append(", registrationDate=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
