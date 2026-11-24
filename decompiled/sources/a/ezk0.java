package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ezk0 {
    public static final dzk0 Companion = new dzk0();
    public static final a8z[] h = {null, null, null, maz.a(wez.f39042a, new pdk0(29)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8676a;
    public final Double b;
    public final Double c;
    public final List d;
    public final kyk0 e;
    public final Double f;
    public final String g;

    public /* synthetic */ ezk0(int i, Long l, Double d, Double d2, List list, kyk0 kyk0Var, Double d3, String str) {
        if ((i & 1) == 0) {
            this.f8676a = null;
        } else {
            this.f8676a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = kyk0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezk0)) {
            return false;
        }
        ezk0 ezk0Var = (ezk0) obj;
        return Intrinsics.d(this.f8676a, ezk0Var.f8676a) && Intrinsics.d(this.b, ezk0Var.b) && Intrinsics.d(this.c, ezk0Var.c) && Intrinsics.d(this.d, ezk0Var.d) && this.e == ezk0Var.e && Intrinsics.d(this.f, ezk0Var.f) && Intrinsics.d(this.g, ezk0Var.g);
    }

    public final int hashCode() {
        Long l = this.f8676a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        kyk0 kyk0Var = this.e;
        int iHashCode5 = (iHashCode4 + (kyk0Var == null ? 0 : kyk0Var.hashCode())) * 31;
        Double d3 = this.f;
        int iHashCode6 = (iHashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.g;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpinAndWinResponse(accountId=");
        sb.append(this.f8676a);
        sb.append(", coefficient=");
        sb.append(this.b);
        sb.append(", balanceNew=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append(this.d);
        sb.append(", gameState=");
        sb.append(this.e);
        sb.append(", winSum=");
        sb.append(this.f);
        sb.append(", gameId=");
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
