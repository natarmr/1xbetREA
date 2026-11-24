package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ug50 {
    public static final tg50 Companion = new tg50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35608a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Long e;
    public final String f;
    public final Long g;

    public /* synthetic */ ug50(int i, String str, String str2, String str3, Boolean bool, Long l, String str4, Long l2) {
        if ((i & 1) == 0) {
            this.f35608a = null;
        } else {
            this.f35608a = str;
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
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug50)) {
            return false;
        }
        ug50 ug50Var = (ug50) obj;
        return Intrinsics.d(this.f35608a, ug50Var.f35608a) && Intrinsics.d(this.b, ug50Var.b) && Intrinsics.d(this.c, ug50Var.c) && Intrinsics.d(this.d, ug50Var.d) && Intrinsics.d(this.e, ug50Var.e) && Intrinsics.d(this.f, ug50Var.f) && Intrinsics.d(this.g, ug50Var.g);
    }

    public final int hashCode() {
        String str = this.f35608a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.g;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NearestGameDetailsLigaResponse(nameEng=", this.f35608a, ", countryImage=", this.b, ", image=");
        h97.v(this.d, this.c, ", isDuelChamp=", ", id=", sbN);
        rz4.v(this.e, ", name=", this.f, ", cyberType=", sbN);
        return ohs0.r(sbN, this.g, Separators.RPAREN);
    }
}
