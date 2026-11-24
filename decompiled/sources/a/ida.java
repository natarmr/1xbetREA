package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ida implements mca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14574a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public ida(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7) {
        brm0.B(str4, str5, str7);
        this.f14574a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ida)) {
            return false;
        }
        ida idaVar = (ida) obj;
        return this.f14574a.equals(idaVar.f14574a) && this.b.equals(idaVar.b) && this.c.equals(idaVar.c) && Intrinsics.d(this.d, idaVar.d) && Intrinsics.d(this.e, idaVar.e) && this.f.equals(idaVar.f) && this.g == idaVar.g && this.h == idaVar.h && Intrinsics.d(this.i, idaVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f14574a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardCommonSingleGameModel(tournamentStage=", this.f14574a, ", seriesScore=", this.b, ", matchFormat=");
        f140.v(sbN, this.c, ", vid=", this.d, ", matchName=");
        f140.v(sbN, this.e, ", locationCountry=", this.f, ", finished=");
        ua80.u(", isLive=", ", dopInfo=", sbN, this.g, this.h);
        return axq.n(sbN, this.i, Separators.RPAREN);
    }
}
