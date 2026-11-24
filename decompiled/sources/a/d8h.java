package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class d8h {
    public static final c8h Companion = new c8h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5647a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Long f;
    public final String g;
    public final String h;

    public /* synthetic */ d8h(int i, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f5647a = null;
        } else {
            this.f5647a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8h)) {
            return false;
        }
        d8h d8hVar = (d8h) obj;
        return Intrinsics.d(this.f5647a, d8hVar.f5647a) && Intrinsics.d(this.b, d8hVar.b) && Intrinsics.d(this.c, d8hVar.c) && Intrinsics.d(this.d, d8hVar.d) && Intrinsics.d(this.e, d8hVar.e) && Intrinsics.d(this.f, d8hVar.f) && Intrinsics.d(this.g, d8hVar.g) && Intrinsics.d(this.h, d8hVar.h);
    }

    public final int hashCode() {
        String str = this.f5647a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberMatchResponse(id=", this.f5647a, ", firstTeamId=", this.b, ", secondTeamId=");
        axq.x(this.d, this.c, ", firstTeamScore=", ", secondTeamScore=", sbN);
        cs0.w(this.e, this.f, ", dateStart=", ", tournamentTitle=", sbN);
        return ua80.m(sbN, this.g, ", description=", this.h, Separators.RPAREN);
    }
}
