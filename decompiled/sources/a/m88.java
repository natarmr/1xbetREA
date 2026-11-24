package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class m88 {
    public static final l88 Companion = new l88();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dpe f21358a;
    public final Integer b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final Long h;
    public final String i;
    public final of9 j;

    public /* synthetic */ m88(int i, dpe dpeVar, Integer num, String str, Long l, String str2, String str3, String str4, Long l2, String str5, of9 of9Var) {
        if ((i & 1) == 0) {
            this.f21358a = null;
        } else {
            this.f21358a = dpeVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = of9Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m88)) {
            return false;
        }
        m88 m88Var = (m88) obj;
        return Intrinsics.d(this.f21358a, m88Var.f21358a) && Intrinsics.d(this.b, m88Var.b) && Intrinsics.d(this.c, m88Var.c) && Intrinsics.d(this.d, m88Var.d) && Intrinsics.d(this.e, m88Var.e) && Intrinsics.d(this.f, m88Var.f) && Intrinsics.d(this.g, m88Var.g) && Intrinsics.d(this.h, m88Var.h) && Intrinsics.d(this.i, m88Var.i) && Intrinsics.d(this.j, m88Var.j);
    }

    public final int hashCode() {
        dpe dpeVar = this.f21358a;
        int iHashCode = (dpeVar == null ? 0 : dpeVar.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        of9 of9Var = this.j;
        return iHashCode9 + (of9Var != null ? of9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockHeaderResponse(counter=");
        sb.append(this.f21358a);
        sb.append(", currencyId=");
        sb.append(this.b);
        sb.append(", description=");
        h97.w(this.d, this.c, ", endDt=", ", mediaValue=", sb);
        f140.v(sb, this.e, ", prizeTitle=", this.f, ", prizePool=");
        h97.w(this.h, this.g, ", startDt=", ", title=", sb);
        sb.append(this.i);
        sb.append(", buttons=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
