package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wmp0 {
    public static final vmp0 Companion = new vmp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39416a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Boolean f;

    public /* synthetic */ wmp0(int i, Boolean bool, Long l, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f39416a = null;
        } else {
            this.f39416a = str;
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
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmp0)) {
            return false;
        }
        wmp0 wmp0Var = (wmp0) obj;
        return Intrinsics.d(this.f39416a, wmp0Var.f39416a) && Intrinsics.d(this.b, wmp0Var.b) && Intrinsics.d(this.c, wmp0Var.c) && Intrinsics.d(this.d, wmp0Var.d) && Intrinsics.d(this.e, wmp0Var.e) && Intrinsics.d(this.f, wmp0Var.f);
    }

    public final int hashCode() {
        String str = this.f39416a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamTransferResponse(name=", this.f39416a, ", logo=", this.b, ", role=");
        f140.v(sbN, this.c, ", roleGroup=", this.d, ", feedId=");
        sbN.append(this.e);
        sbN.append(", hasStat=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
