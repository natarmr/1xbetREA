package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class zof0 {
    public static final yof0 Companion = new yof0();
    public static final a8z[] o = {null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new b4f0((byte) 15)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44718a;
    public final rk10 b;
    public final Long c;
    public final Double d;
    public final bpf0 e;
    public final Integer f;
    public final Boolean g;
    public final String h;
    public final Boolean i;
    public final Double j;
    public final List k;
    public final epf0 l;
    public final Double m;
    public final Long n;

    public /* synthetic */ zof0(int i, Long l, rk10 rk10Var, Long l2, Double d, bpf0 bpf0Var, Integer num, Boolean bool, String str, Boolean bool2, Double d2, List list, epf0 epf0Var, Double d3, Long l3) {
        if ((i & 1) == 0) {
            this.f44718a = null;
        } else {
            this.f44718a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = rk10Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bpf0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = epf0Var;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = d3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zof0)) {
            return false;
        }
        zof0 zof0Var = (zof0) obj;
        return Intrinsics.d(this.f44718a, zof0Var.f44718a) && Intrinsics.d(this.b, zof0Var.b) && Intrinsics.d(this.c, zof0Var.c) && Intrinsics.d(this.d, zof0Var.d) && this.e == zof0Var.e && Intrinsics.d(this.f, zof0Var.f) && Intrinsics.d(this.g, zof0Var.g) && Intrinsics.d(this.h, zof0Var.h) && Intrinsics.d(this.i, zof0Var.i) && Intrinsics.d(this.j, zof0Var.j) && Intrinsics.d(this.k, zof0Var.k) && this.l == zof0Var.l && Intrinsics.d(this.m, zof0Var.m) && Intrinsics.d(this.n, zof0Var.n);
    }

    public final int hashCode() {
        Long l = this.f44718a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        rk10 rk10Var = this.b;
        int iHashCode2 = (iHashCode + (rk10Var == null ? 0 : rk10Var.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        bpf0 bpf0Var = this.e;
        int iHashCode5 = (iHashCode4 + (bpf0Var == null ? 0 : bpf0Var.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d2 = this.j;
        int iHashCode10 = (iHashCode9 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List list = this.k;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        epf0 epf0Var = this.l;
        int iHashCode12 = (iHashCode11 + (epf0Var == null ? 0 : epf0Var.hashCode())) * 31;
        Double d3 = this.m;
        int iHashCode13 = (iHashCode12 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l3 = this.n;
        return iHashCode13 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResidentGameResponse(accountId=");
        sb.append(this.f44718a);
        sb.append(", bonus=");
        sb.append(this.b);
        sb.append(", bonusId=");
        sb.append(this.c);
        sb.append(", betSum=");
        sb.append(this.d);
        sb.append(", state=");
        sb.append(this.e);
        sb.append(", step=");
        sb.append(this.f);
        sb.append(", fireEnabled=");
        defpackage.c.h(this.g, ", gameId=", this.h, ", increaseBetAvailable=", sb);
        sb.append(this.i);
        sb.append(", newBalance=");
        sb.append(this.j);
        sb.append(", subjects=");
        sb.append(this.k);
        sb.append(", status=");
        sb.append(this.l);
        sb.append(", winSum=");
        sb.append(this.m);
        sb.append(", userId=");
        sb.append(this.n);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
