package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class a9e0 {
    public static final z8e0 Companion = new z8e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f472a;
    public final Boolean b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ a9e0(int i, Integer num, Boolean bool, Integer num2, String str, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f472a = null;
        } else {
            this.f472a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9e0)) {
            return false;
        }
        a9e0 a9e0Var = (a9e0) obj;
        return Intrinsics.d(this.f472a, a9e0Var.f472a) && Intrinsics.d(this.b, a9e0Var.b) && Intrinsics.d(this.c, a9e0Var.c) && Intrinsics.d(this.d, a9e0Var.d) && Intrinsics.d(this.e, a9e0Var.e) && Intrinsics.d(this.f, a9e0Var.f);
    }

    public final int hashCode() {
        Integer num = this.f472a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingTitleColResponse(id=");
        sb.append(this.f472a);
        sb.append(", isOffset=");
        sb.append(this.b);
        sb.append(", group=");
        b1j.u(this.c, ", title=", this.d, ", rowSpan=", sb);
        return ua80.l(sb, this.e, ", colSpan=", this.f, Separators.RPAREN);
    }
}
