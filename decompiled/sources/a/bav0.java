package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bav0 {
    public static final aav0 Companion = new aav0();
    public static final a8z[] h = {maz.a(wez.f39042a, new y9v0((byte) 0)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2278a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final s9v0 e;
    public final Double f;
    public final Long g;

    public /* synthetic */ bav0(int i, List list, Long l, Integer num, Integer num2, s9v0 s9v0Var, Double d, Long l2) {
        if ((i & 1) == 0) {
            this.f2278a = null;
        } else {
            this.f2278a = list;
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
            this.e = s9v0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bav0)) {
            return false;
        }
        bav0 bav0Var = (bav0) obj;
        return Intrinsics.d(this.f2278a, bav0Var.f2278a) && Intrinsics.d(this.b, bav0Var.b) && Intrinsics.d(this.c, bav0Var.c) && Intrinsics.d(this.d, bav0Var.d) && Intrinsics.d(this.e, bav0Var.e) && Intrinsics.d(this.f, bav0Var.f) && Intrinsics.d(this.g, bav0Var.g);
    }

    public final int hashCode() {
        List list = this.f2278a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        s9v0 s9v0Var = this.e;
        int iHashCode5 = (iHashCode4 + (s9v0Var == null ? 0 : s9v0Var.hashCode())) * 31;
        Double d = this.f;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Long l2 = this.g;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WheelInfoResponse(wheelSections=");
        sb.append(this.f2278a);
        sb.append(", freeSpinTimer=");
        sb.append(this.b);
        sb.append(", freeSpinCounts=");
        rz4.y(sb, this.c, ", userId=", this.d, ", winBonus=");
        sb.append(this.e);
        sb.append(", balance=");
        sb.append(this.f);
        sb.append(", accountId=");
        return ohs0.r(sb, this.g, Separators.RPAREN);
    }
}
