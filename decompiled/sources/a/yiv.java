package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yiv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42715a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public yiv(String str, String str2, String str3, String str4, String str5, String str6) {
        brm0.B(str, str3, str5);
        this.f42715a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiv)) {
            return false;
        }
        yiv yivVar = (yiv) obj;
        return Intrinsics.d(this.f42715a, yivVar.f42715a) && this.b.equals(yivVar.b) && Intrinsics.d(this.c, yivVar.c) && this.d.equals(yivVar.d) && Intrinsics.d(this.e, yivVar.e) && this.f.equals(yivVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f42715a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GuiltyGearRoundInformationUiModel(winnerTitle=", this.f42715a, ", winner=", this.b, ", typeOfWinnerTitle=");
        f140.v(sbN, this.c, ", typeOfWinner=", this.d, ", finishTitle=");
        return ua80.m(sbN, this.e, ", finish=", this.f, Separators.RPAREN);
    }
}
