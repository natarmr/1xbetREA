package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class d5s0 {
    public static final y4s0 Companion = new y4s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m88 f5523a;
    public final p88 b;
    public final g88 c;
    public final z88 d;
    public final c98 e;
    public final n98 f;
    public final r98 g;
    public final c88 h;
    public final v98 i;
    public final Long j;
    public final Integer k;
    public final Boolean l;
    public final Integer m;
    public final Integer n;

    static {
        u98 u98Var = v98.Companion;
        q98 q98Var = r98.Companion;
        m98 m98Var = n98.Companion;
        b98 b98Var = c98.Companion;
        y88 y88Var = z88.Companion;
        f88 f88Var = g88.Companion;
    }

    public /* synthetic */ d5s0(int i, m88 m88Var, p88 p88Var, g88 g88Var, z88 z88Var, c98 c98Var, n98 n98Var, r98 r98Var, c88 c88Var, v98 v98Var, Long l, Integer num, Boolean bool, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f5523a = null;
        } else {
            this.f5523a = m88Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = p88Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = g88Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = z88Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = c98Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = n98Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = r98Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = c88Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = v98Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5s0)) {
            return false;
        }
        d5s0 d5s0Var = (d5s0) obj;
        return Intrinsics.d(this.f5523a, d5s0Var.f5523a) && Intrinsics.d(this.b, d5s0Var.b) && Intrinsics.d(this.c, d5s0Var.c) && Intrinsics.d(this.d, d5s0Var.d) && Intrinsics.d(this.e, d5s0Var.e) && Intrinsics.d(this.f, d5s0Var.f) && Intrinsics.d(this.g, d5s0Var.g) && Intrinsics.d(this.h, d5s0Var.h) && Intrinsics.d(this.i, d5s0Var.i) && Intrinsics.d(this.j, d5s0Var.j) && Intrinsics.d(this.k, d5s0Var.k) && Intrinsics.d(this.l, d5s0Var.l) && Intrinsics.d(this.m, d5s0Var.m) && Intrinsics.d(this.n, d5s0Var.n);
    }

    public final int hashCode() {
        m88 m88Var = this.f5523a;
        int iHashCode = (m88Var == null ? 0 : m88Var.hashCode()) * 31;
        p88 p88Var = this.b;
        int iHashCode2 = (iHashCode + (p88Var == null ? 0 : p88Var.hashCode())) * 31;
        g88 g88Var = this.c;
        int iHashCode3 = (iHashCode2 + (g88Var == null ? 0 : g88Var.hashCode())) * 31;
        z88 z88Var = this.d;
        int iHashCode4 = (iHashCode3 + (z88Var == null ? 0 : z88Var.hashCode())) * 31;
        c98 c98Var = this.e;
        int iHashCode5 = (iHashCode4 + (c98Var == null ? 0 : c98Var.hashCode())) * 31;
        n98 n98Var = this.f;
        int iHashCode6 = (iHashCode5 + (n98Var == null ? 0 : n98Var.hashCode())) * 31;
        r98 r98Var = this.g;
        int iHashCode7 = (iHashCode6 + (r98Var == null ? 0 : r98Var.hashCode())) * 31;
        c88 c88Var = this.h;
        int iHashCode8 = (iHashCode7 + (c88Var == null ? 0 : c88Var.hashCode())) * 31;
        v98 v98Var = this.i;
        int iHashCode9 = (iHashCode8 + (v98Var == null ? 0 : v98Var.hashCode())) * 31;
        Long l = this.j;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.l;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.m;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.n;
        return iHashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentResponse(blockHeader=");
        sb.append(this.f5523a);
        sb.append(", blockImage=");
        sb.append(this.b);
        sb.append(", blockGame=");
        sb.append(this.c);
        sb.append(", blockPrize=");
        sb.append(this.d);
        sb.append(", blockProduct=");
        sb.append(this.e);
        sb.append(", blockRule=");
        sb.append(this.f);
        sb.append(", blockRuleStage=");
        sb.append(this.g);
        sb.append(", blockFullRule=");
        sb.append(this.h);
        sb.append(", blockStage=");
        sb.append(this.i);
        sb.append(", id=");
        sb.append(this.j);
        sb.append(", kind=");
        brm0.z(this.l, this.k, ", providerTournamentWithStages=", ", status=", sb);
        return ua80.l(sb, this.m, ", type=", this.n, Separators.RPAREN);
    }
}
