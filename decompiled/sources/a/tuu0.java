package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tuu0 {
    public static final suu0 Companion = new suu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34569a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f;

    public /* synthetic */ tuu0(int i, String str, Long l, Integer num, Integer num2, Integer num3, String str2) {
        if ((i & 1) == 0) {
            this.f34569a = null;
        } else {
            this.f34569a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tuu0)) {
            return false;
        }
        tuu0 tuu0Var = (tuu0) obj;
        return Intrinsics.d(this.f34569a, tuu0Var.f34569a) && Intrinsics.d(this.b, tuu0Var.b) && Intrinsics.d(this.c, tuu0Var.c) && Intrinsics.d(this.d, tuu0Var.d) && Intrinsics.d(this.e, tuu0Var.e) && Intrinsics.d(this.f, tuu0Var.f);
    }

    public final int hashCode() {
        String str = this.f34569a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "VisitorInfoModel(visitorId=", this.f34569a, ", timestamp=", ", ref=");
        rz4.y(sbS, this.c, ", gr=", this.d, ", whence=");
        sbS.append(this.e);
        sbS.append(", phone=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }

    public tuu0(Long l, String str, String str2) {
        this.f34569a = str;
        this.b = l;
        this.c = 1;
        this.d = 1357;
        this.e = 22;
        this.f = str2;
    }
}
