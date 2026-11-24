package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class b4h {
    public static final a4h Companion = new a4h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1957a;
    public final String b;
    public final String c;
    public final Double d;
    public final Double e;
    public final Integer f;

    public /* synthetic */ b4h(int i, String str, String str2, String str3, Double d, Double d2, Integer num) {
        if ((i & 1) == 0) {
            this.f1957a = null;
        } else {
            this.f1957a = str;
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
            this.f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4h)) {
            return false;
        }
        b4h b4hVar = (b4h) obj;
        return Intrinsics.d(this.f1957a, b4hVar.f1957a) && Intrinsics.d(this.b, b4hVar.b) && Intrinsics.d(this.c, b4hVar.c) && Intrinsics.d(this.d, b4hVar.d) && Intrinsics.d(this.e, b4hVar.e) && Intrinsics.d(this.f, b4hVar.f);
    }

    public final int hashCode() {
        String str = this.f1957a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberLolPlayerHeroesResponse(heroName=", this.f1957a, ", image=", this.b, ", heroImageS3=");
        sbN.append(this.c);
        sbN.append(", winRate=");
        sbN.append(this.d);
        sbN.append(", kda=");
        sbN.append(this.e);
        sbN.append(", matchesCount=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
