package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nq1 implements rq1 {
    public static final mq1 Companion = new mq1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f23936a;
    public final Long b;
    public final Long c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;

    public /* synthetic */ nq1(int i, Long l, Long l2, Long l3, String str, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.f23936a = null;
        } else {
            this.f23936a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq1)) {
            return false;
        }
        nq1 nq1Var = (nq1) obj;
        return Intrinsics.d(this.f23936a, nq1Var.f23936a) && Intrinsics.d(this.b, nq1Var.b) && Intrinsics.d(this.c, nq1Var.c) && Intrinsics.d(this.d, nq1Var.d) && Intrinsics.d(this.e, nq1Var.e) && Intrinsics.d(this.f, nq1Var.f) && Intrinsics.d(this.g, nq1Var.g);
    }

    public final int hashCode() {
        Long l = this.f23936a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.g;
        return iHashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f23936a, this.b, "Game(gameId=", ", partId=", ", productId=");
        rz4.v(this.c, ", nameForUrl=", this.d, ", isDemoAvailable=", sbO);
        defpackage.c.j(sbO, this.e, ", needTransfer=", this.f, ", bonusWageringBan=");
        return defpackage.c.e(sbO, this.g, Separators.RPAREN);
    }
}
