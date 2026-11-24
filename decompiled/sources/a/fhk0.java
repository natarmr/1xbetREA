package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class fhk0 {
    public static final ehk0 Companion = new ehk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f9546a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhk0)) {
            return false;
        }
        fhk0 fhk0Var = (fhk0) obj;
        return Intrinsics.d(this.f9546a, fhk0Var.f9546a) && Intrinsics.d(this.b, fhk0Var.b) && Intrinsics.d(this.c, fhk0Var.c) && Intrinsics.d(this.d, fhk0Var.d) && Intrinsics.d(this.e, fhk0Var.e) && Intrinsics.d(this.f, fhk0Var.f) && Intrinsics.d(this.g, fhk0Var.g) && Intrinsics.d(this.h, fhk0Var.h) && Intrinsics.d(this.i, fhk0Var.i) && Intrinsics.d(this.j, fhk0Var.j);
    }

    public final int hashCode() {
        Boolean bool = this.f9546a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.g;
        int iHashCode7 = (iHashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.h;
        int iHashCode8 = (iHashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.i;
        int iHashCode9 = (iHashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.j;
        return iHashCode9 + (bool10 != null ? bool10.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f9546a;
        Boolean bool2 = this.b;
        Boolean bool3 = this.c;
        Boolean bool4 = this.d;
        Boolean bool5 = this.e;
        Boolean bool6 = this.f;
        Boolean bool7 = this.g;
        Boolean bool8 = this.h;
        Boolean bool9 = this.i;
        Boolean bool10 = this.j;
        StringBuilder sb = new StringBuilder("SocialConfig(hasVKontakteSocial=");
        sb.append(bool);
        sb.append(", hasGoogleSocial=");
        sb.append(bool2);
        sb.append(", hasOdnoklassnikiSocial=");
        defpackage.c.j(sb, bool3, ", hasMailruSocial=", bool4, ", hasYandexSocial=");
        defpackage.c.j(sb, bool5, ", hasTelegramSocial=", bool6, ", hasAppleIDSocial=");
        defpackage.c.j(sb, bool7, ", hasXSocial=", bool8, ", hasDiscordSocial=");
        sb.append(bool9);
        sb.append(", hasItsMeSocial=");
        sb.append(bool10);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
