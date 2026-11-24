package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class gdh {
    public static final fdh Companion = new fdh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f11103a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ gdh(int i, Long l, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f11103a = null;
        } else {
            this.f11103a = l;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdh)) {
            return false;
        }
        gdh gdhVar = (gdh) obj;
        return Intrinsics.d(this.f11103a, gdhVar.f11103a) && Intrinsics.d(this.b, gdhVar.b) && Intrinsics.d(this.c, gdhVar.c) && Intrinsics.d(this.d, gdhVar.d) && Intrinsics.d(this.e, gdhVar.e);
    }

    public final int hashCode() {
        Long l = this.f11103a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f11103a, "CyberSportResponse(id=", ", name=", this.b, ", nameEng=");
        f140.v(sbS, this.c, ", timeName=", this.d, ", timesName=");
        return axq.n(sbS, this.e, Separators.RPAREN);
    }
}
