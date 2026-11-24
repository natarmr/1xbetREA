package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wmb {
    public static final vmb Companion = new vmb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39397a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final Integer f;

    public /* synthetic */ wmb(int i, Long l, String str, String str2, Long l2, Long l3, Integer num) {
        if ((i & 1) == 0) {
            this.f39397a = null;
        } else {
            this.f39397a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmb)) {
            return false;
        }
        wmb wmbVar = (wmb) obj;
        return Intrinsics.d(this.f39397a, wmbVar.f39397a) && Intrinsics.d(this.b, wmbVar.b) && Intrinsics.d(this.c, wmbVar.c) && Intrinsics.d(this.d, wmbVar.d) && Intrinsics.d(this.e, wmbVar.e) && Intrinsics.d(this.f, wmbVar.f);
    }

    public final int hashCode() {
        Long l = this.f39397a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f39397a, "SubChamp(id=", ", name=", this.b, ", image=");
        h97.w(this.d, this.c, ", sportId=", ", subSportId=", sbS);
        sbS.append(this.e);
        sbS.append(", countEvent=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
