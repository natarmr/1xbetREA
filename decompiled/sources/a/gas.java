package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gas {
    public static final fas Companion = new fas();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f10984a;
    public final Boolean b;
    public final qfo c;
    public final Double d;
    public final Double e;
    public final String f;
    public final Boolean g;
    public final Long h;
    public final lfo i;

    public /* synthetic */ gas(int i, Long l, Boolean bool, qfo qfoVar, Double d, Double d2, String str, Boolean bool2, Long l2, lfo lfoVar) {
        if ((i & 1) == 0) {
            this.f10984a = null;
        } else {
            this.f10984a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = qfoVar;
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
            this.h = l2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = lfoVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gas)) {
            return false;
        }
        gas gasVar = (gas) obj;
        return Intrinsics.d(this.f10984a, gasVar.f10984a) && Intrinsics.d(this.b, gasVar.b) && Intrinsics.d(this.c, gasVar.c) && Intrinsics.d(this.d, gasVar.d) && Intrinsics.d(this.e, gasVar.e) && Intrinsics.d(this.f, gasVar.f) && Intrinsics.d(this.g, gasVar.g) && Intrinsics.d(this.h, gasVar.h) && Intrinsics.d(this.i, gasVar.i);
    }

    public final int hashCode() {
        Long l = this.f10984a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        qfo qfoVar = this.c;
        int iHashCode3 = (iHashCode2 + (qfoVar == null ? 0 : qfoVar.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        lfo lfoVar = this.i;
        return iHashCode8 + (lfoVar != null ? lfoVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameEventItemResponse(type=");
        sb.append(this.f10984a);
        sb.append(", blocked=");
        sb.append(this.b);
        sb.append(", player=");
        sb.append(this.c);
        sb.append(", parameter=");
        sb.append(this.d);
        sb.append(", cf=");
        ua80.w(sb, this.e, ", cfView=", this.f, ", isCenter=");
        sb.append(this.g);
        sb.append(", ruleId=");
        sb.append(this.h);
        sb.append(", eventParamsResponse=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
