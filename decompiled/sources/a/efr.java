package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class efr implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7730a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public efr(String str, String str2, String str3, String str4, String str5, boolean z) {
        brm0.B(str, str4, str5);
        this.f7730a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efr)) {
            return false;
        }
        efr efrVar = (efr) obj;
        return Intrinsics.d(this.f7730a, efrVar.f7730a) && this.b.equals(efrVar.b) && this.c.equals(efrVar.c) && Intrinsics.d(this.d, efrVar.d) && Intrinsics.d(this.e, efrVar.e) && this.f == efrVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(this.f7730a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FutureGameItemUiModel(teamName=", this.f7730a, ", teamIcon=", this.b, ", tournamentName=");
        f140.v(sbN, this.c, ", startTime=", this.d, ", date=");
        return defpackage.c.c(this.e, ", last=", Separators.RPAREN, sbN, this.f);
    }
}
