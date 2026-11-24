package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class gm90 {
    public static final fm90 Companion = new fm90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11532a;
    public final Integer b;
    public final Integer c;
    public final String d;

    public /* synthetic */ gm90(int i, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f11532a = null;
        } else {
            this.f11532a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm90)) {
            return false;
        }
        gm90 gm90Var = (gm90) obj;
        return Intrinsics.d(this.f11532a, gm90Var.f11532a) && Intrinsics.d(this.b, gm90Var.b) && Intrinsics.d(this.c, gm90Var.c) && Intrinsics.d(this.d, gm90Var.d);
    }

    public final int hashCode() {
        Integer num = this.f11532a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("PhoneMaskResponse(countryId=", this.f11532a, ", minLength=", this.b, ", maxLength=");
        sbQ.append(this.c);
        sbQ.append(", mask=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
