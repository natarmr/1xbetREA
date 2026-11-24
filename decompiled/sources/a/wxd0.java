package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wxd0 {
    public static final vxd0 Companion = new vxd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39927a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final zxd0 g;

    public /* synthetic */ wxd0(int i, Long l, String str, String str2, String str3, String str4, String str5, zxd0 zxd0Var) {
        if ((i & 1) == 0) {
            this.f39927a = null;
        } else {
            this.f39927a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = zxd0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxd0)) {
            return false;
        }
        wxd0 wxd0Var = (wxd0) obj;
        return Intrinsics.d(this.f39927a, wxd0Var.f39927a) && Intrinsics.d(this.b, wxd0Var.b) && Intrinsics.d(this.c, wxd0Var.c) && Intrinsics.d(this.d, wxd0Var.d) && Intrinsics.d(this.e, wxd0Var.e) && Intrinsics.d(this.f, wxd0Var.f) && Intrinsics.d(this.g, wxd0Var.g);
    }

    public final int hashCode() {
        Long l = this.f39927a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        zxd0 zxd0Var = this.g;
        return iHashCode6 + (zxd0Var != null ? zxd0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f39927a, "RainbowSixPlayersResponse(id=", ", name=", this.b, ", realName=");
        f140.v(sbS, this.c, ", image=", this.d, ", country=");
        f140.v(sbS, this.e, ", countryImageS3=", this.f, ", stats=");
        sbS.append(this.g);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
