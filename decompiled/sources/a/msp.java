package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class msp {
    public static final lsp Companion = new lsp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22330a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final String h;

    public /* synthetic */ msp(int i, Long l, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4) {
        if ((i & 1) == 0) {
            this.f22330a = null;
        } else {
            this.f22330a = l;
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
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msp)) {
            return false;
        }
        msp mspVar = (msp) obj;
        return Intrinsics.d(this.f22330a, mspVar.f22330a) && Intrinsics.d(this.b, mspVar.b) && Intrinsics.d(this.c, mspVar.c) && Intrinsics.d(this.d, mspVar.d) && Intrinsics.d(this.e, mspVar.e) && Intrinsics.d(this.f, mspVar.f) && Intrinsics.d(this.g, mspVar.g) && Intrinsics.d(this.h, mspVar.h);
    }

    public final int hashCode() {
        Long l = this.f22330a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f22330a, "FightCornerResponse(feedId=", ", name=", this.b, ", imageS3=");
        f140.v(sbS, this.c, ", corner=", this.d, ", wins=");
        rz4.y(sbS, this.e, ", losses=", this.f, ", draws=");
        sbS.append(this.g);
        sbS.append(", country=");
        sbS.append(this.h);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
