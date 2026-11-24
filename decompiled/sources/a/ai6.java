package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ai6 {
    public static final zh6 Companion = new zh6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f909a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Boolean e;
    public final String f;

    public /* synthetic */ ai6(int i, Boolean bool, Integer num, Long l, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f909a = null;
        } else {
            this.f909a = l;
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
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai6)) {
            return false;
        }
        ai6 ai6Var = (ai6) obj;
        return Intrinsics.d(this.f909a, ai6Var.f909a) && Intrinsics.d(this.b, ai6Var.b) && Intrinsics.d(this.c, ai6Var.c) && Intrinsics.d(this.d, ai6Var.d) && Intrinsics.d(this.e, ai6Var.e) && Intrinsics.d(this.f, ai6Var.f);
    }

    public final int hashCode() {
        Long l = this.f909a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f909a, "BetBuilderLigaResponse(id=", ", name=", this.b, ", image=");
        axq.x(this.d, this.c, ", cyberType=", ", isDuelChamp=", sbS);
        sbS.append(this.e);
        sbS.append(", layout=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
