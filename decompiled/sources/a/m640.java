package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class m640 {
    public static final k640 Companion = new k640();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f21250a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Boolean g;
    public final w440 h;

    public /* synthetic */ m640(int i, Integer num, String str, String str2, String str3, String str4, Integer num2, Boolean bool, w440 w440Var) {
        if ((i & 1) == 0) {
            this.f21250a = null;
        } else {
            this.f21250a = num;
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
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = w440Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m640)) {
            return false;
        }
        m640 m640Var = (m640) obj;
        return Intrinsics.d(this.f21250a, m640Var.f21250a) && Intrinsics.d(this.b, m640Var.b) && Intrinsics.d(this.c, m640Var.c) && Intrinsics.d(this.d, m640Var.d) && Intrinsics.d(this.e, m640Var.e) && Intrinsics.d(this.f, m640Var.f) && Intrinsics.d(this.g, m640Var.g) && Intrinsics.d(this.h, m640Var.h);
    }

    public final int hashCode() {
        Integer num = this.f21250a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        w440 w440Var = this.h;
        return iHashCode7 + (w440Var != null ? w440Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f21250a, "MessageResponse(readTime=", ", id=", this.b, ", title=");
        f140.v(sbN, this.c, ", text=", this.d, ", imageUrl=");
        axq.x(this.f, this.e, ", date=", ", isMatchOfDays=", sbN);
        sbN.append(this.g);
        sbN.append(", extension=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
