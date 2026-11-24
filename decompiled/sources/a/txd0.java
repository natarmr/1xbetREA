package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class txd0 {
    public static final sxd0 Companion = new sxd0();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new etd0(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f34693a;
    public final Long b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final List f;

    public /* synthetic */ txd0(int i, Long l, Long l2, String str, Boolean bool, String str2, List list) {
        if ((i & 1) == 0) {
            this.f34693a = null;
        } else {
            this.f34693a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txd0)) {
            return false;
        }
        txd0 txd0Var = (txd0) obj;
        return Intrinsics.d(this.f34693a, txd0Var.f34693a) && Intrinsics.d(this.b, txd0Var.b) && Intrinsics.d(this.c, txd0Var.c) && Intrinsics.d(this.d, txd0Var.d) && Intrinsics.d(this.e, txd0Var.e) && Intrinsics.d(this.f, txd0Var.f);
    }

    public final int hashCode() {
        Long l = this.f34693a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f34693a, this.b, "RainbowSixPlayersCompositionResponse(id=", ", feedId=", ", teamName=");
        h97.v(this.d, this.c, ", partner=", ", teamImage=", sbO);
        return rw2.m(this.e, ", players=", Separators.RPAREN, sbO, this.f);
    }
}
