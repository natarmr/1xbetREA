package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39550a;
    public final String b;
    public final String c;
    public final String d;

    public wpl(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f39550a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpl)) {
            return false;
        }
        wpl wplVar = (wpl) obj;
        return Intrinsics.d(this.f39550a, wplVar.f39550a) && Intrinsics.d(this.b, wplVar.b) && Intrinsics.d(this.c, wplVar.c) && Intrinsics.d(this.d, wplVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f39550a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("DsAggregatorTournamentCardPeriodModel(startTitle=", this.f39550a, ", startDate=", this.b, ", endTitle="), this.c, ", endDate=", this.d, Separators.RPAREN);
    }
}
