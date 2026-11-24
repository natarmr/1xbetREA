package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class x29 {
    public static final w29 Companion = new w29();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40156a;
    public final Long b;
    public final Integer c;
    public final String d;
    public final String e;

    public /* synthetic */ x29(int i, Long l, Long l2, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f40156a = null;
        } else {
            this.f40156a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x29)) {
            return false;
        }
        x29 x29Var = (x29) obj;
        return Intrinsics.d(this.f40156a, x29Var.f40156a) && Intrinsics.d(this.b, x29Var.b) && Intrinsics.d(this.c, x29Var.c) && Intrinsics.d(this.d, x29Var.d) && Intrinsics.d(this.e, x29Var.e);
    }

    public final int hashCode() {
        Long l = this.f40156a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f40156a, this.b, "BreakdownResponse(date=", ", dropDate=", ", points=");
        b1j.u(this.c, ", round=", this.d, ", tournamentTitle=", sbO);
        return axq.n(sbO, this.e, Separators.RPAREN);
    }
}
