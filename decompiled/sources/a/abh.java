package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class abh {
    public static final zah Companion = new zah();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2g f579a;
    public final Integer b;
    public final l26 c;
    public final l26 d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    public /* synthetic */ abh(int i, e2g e2gVar, Integer num, l26 l26Var, l26 l26Var2, Integer num2, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f579a = null;
        } else {
            this.f579a = e2gVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l26Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l26Var2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abh)) {
            return false;
        }
        abh abhVar = (abh) obj;
        return Intrinsics.d(this.f579a, abhVar.f579a) && Intrinsics.d(this.b, abhVar.b) && Intrinsics.d(this.c, abhVar.c) && Intrinsics.d(this.d, abhVar.d) && Intrinsics.d(this.e, abhVar.e) && Intrinsics.d(this.f, abhVar.f) && Intrinsics.d(this.g, abhVar.g);
    }

    public final int hashCode() {
        e2g e2gVar = this.f579a;
        int iHashCode = (e2gVar == null ? 0 : e2gVar.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        l26 l26Var = this.c;
        int iHashCode3 = (iHashCode2 + (l26Var == null ? 0 : l26Var.hashCode())) * 31;
        l26 l26Var2 = this.d;
        int iHashCode4 = (iHashCode3 + (l26Var2 == null ? 0 : l26Var2.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberRealTopChampsResponse(liga=");
        sb.append(this.f579a);
        sb.append(", countryId=");
        sb.append(this.b);
        sb.append(", sport=");
        sb.append(this.c);
        sb.append(", subSport=");
        sb.append(this.d);
        sb.append(", lineGamesCount=");
        rz4.y(sb, this.e, ", liveGamesCount=", this.f, ", globalChampId=");
        return dw9.q(sb, this.g, Separators.RPAREN);
    }
}
