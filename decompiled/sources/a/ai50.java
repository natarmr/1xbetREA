package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ai50 {
    public static final zh50 Companion = new zh50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f908a;
    public final Boolean b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;

    public /* synthetic */ ai50(int i, Boolean bool, Long l, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f908a = null;
        } else {
            this.f908a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
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
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai50)) {
            return false;
        }
        ai50 ai50Var = (ai50) obj;
        return Intrinsics.d(this.f908a, ai50Var.f908a) && Intrinsics.d(this.b, ai50Var.b) && Intrinsics.d(this.c, ai50Var.c) && Intrinsics.d(this.d, ai50Var.d) && Intrinsics.d(this.e, ai50Var.e) && Intrinsics.d(this.f, ai50Var.f);
    }

    public final int hashCode() {
        String str = this.f908a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearestGameDetailsSportResponse(nameEng=");
        sb.append(this.f908a);
        sb.append(", isCyber=");
        sb.append(this.b);
        sb.append(", timeName=");
        f140.v(sb, this.c, ", timesName=", this.d, ", id=");
        sb.append(this.e);
        sb.append(", name=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
