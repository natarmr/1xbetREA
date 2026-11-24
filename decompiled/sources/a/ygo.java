package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ygo {
    public static final jgo Companion = new jgo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f42595a;
    public final Boolean b;
    public final kaa0 c;
    public final Double d;
    public final Double e;
    public final String f;
    public final Boolean g;
    public final sgo h;

    public /* synthetic */ ygo(int i, Long l, Boolean bool, kaa0 kaa0Var, Double d, Double d2, String str, Boolean bool2, sgo sgoVar) {
        if ((i & 1) == 0) {
            this.f42595a = null;
        } else {
            this.f42595a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kaa0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = sgoVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygo)) {
            return false;
        }
        ygo ygoVar = (ygo) obj;
        return Intrinsics.d(this.f42595a, ygoVar.f42595a) && Intrinsics.d(this.b, ygoVar.b) && Intrinsics.d(this.c, ygoVar.c) && Intrinsics.d(this.d, ygoVar.d) && Intrinsics.d(this.e, ygoVar.e) && Intrinsics.d(this.f, ygoVar.f) && Intrinsics.d(this.g, ygoVar.g) && Intrinsics.d(this.h, ygoVar.h);
    }

    public final int hashCode() {
        Long l = this.f42595a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        kaa0 kaa0Var = this.c;
        int iHashCode3 = (iHashCode2 + (kaa0Var == null ? 0 : kaa0Var.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        sgo sgoVar = this.h;
        return iHashCode7 + (sgoVar != null ? sgoVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventResponse(type=");
        sb.append(this.f42595a);
        sb.append(", blocked=");
        sb.append(this.b);
        sb.append(", player=");
        sb.append(this.c);
        sb.append(", parameter=");
        sb.append(this.d);
        sb.append(", cf=");
        ua80.w(sb, this.e, ", cfView=", this.f, ", isCenter=");
        sb.append(this.g);
        sb.append(", eventParamsResponse=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
