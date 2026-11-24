package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class gjf {
    public static final fjf Companion = new fjf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f11393a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final Float f;

    public /* synthetic */ gjf(int i, Float f, Float f2, Float f3, Float f4, Float f5, Float f6) {
        if ((i & 1) == 0) {
            this.f11393a = null;
        } else {
            this.f11393a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjf)) {
            return false;
        }
        gjf gjfVar = (gjf) obj;
        return Intrinsics.d(this.f11393a, gjfVar.f11393a) && Intrinsics.d(this.b, gjfVar.b) && Intrinsics.d(this.c, gjfVar.c) && Intrinsics.d(this.d, gjfVar.d) && Intrinsics.d(this.e, gjfVar.e) && Intrinsics.d(this.f, gjfVar.f);
    }

    public final int hashCode() {
        Float f = this.f11393a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.b;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.c;
        int iHashCode3 = (iHashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.d;
        int iHashCode4 = (iHashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.e;
        int iHashCode5 = (iHashCode4 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.f;
        return iHashCode5 + (f6 != null ? f6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2CompositionStatisticInfoResponse(rating=");
        sb.append(this.f11393a);
        sb.append(", kills=");
        sb.append(this.b);
        sb.append(", dead=");
        vqd.x(sb, this.c, ", kast=", this.d, ", roundSwing=");
        sb.append(this.e);
        sb.append(", adr=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
