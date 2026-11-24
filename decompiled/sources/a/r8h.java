package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r8h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f30025a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final Float f;

    public r8h(Float f, Float f2, Float f3, Float f4, Float f5, Float f6) {
        this.f30025a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8h)) {
            return false;
        }
        r8h r8hVar = (r8h) obj;
        return Intrinsics.d(this.f30025a, r8hVar.f30025a) && Intrinsics.d(this.b, r8hVar.b) && Intrinsics.d(this.c, r8hVar.c) && Intrinsics.d(this.d, r8hVar.d) && Intrinsics.d(this.e, r8hVar.e) && Intrinsics.d(this.f, r8hVar.f);
    }

    public final int hashCode() {
        Float f = this.f30025a;
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
        StringBuilder sb = new StringBuilder("CyberMatchesStatisticPlayersModel(rating=");
        sb.append(this.f30025a);
        sb.append(", adr=");
        sb.append(this.b);
        sb.append(", kpr=");
        vqd.x(sb, this.c, ", dpr=", this.d, ", kast=");
        sb.append(this.e);
        sb.append(", impact=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
