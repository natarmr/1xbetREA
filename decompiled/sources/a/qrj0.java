package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qrj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29213a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;

    public qrj0(float f, float f2, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f29213a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrj0)) {
            return false;
        }
        qrj0 qrj0Var = (qrj0) obj;
        return Intrinsics.d(this.f29213a, qrj0Var.f29213a) && Intrinsics.d(this.b, qrj0Var.b) && Intrinsics.d(this.c, qrj0Var.c) && Float.compare(this.d, qrj0Var.d) == 0 && Float.compare(this.e, qrj0Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + defpackage.c.a(ua80.b(ua80.b(this.f29213a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ShortInfoUiModel(statisticDescription=", this.f29213a, ", teamOneStat=", this.b, ", teamTwoStat=");
        sbN.append(this.c);
        sbN.append(", weightTeamOneView=");
        sbN.append(this.d);
        sbN.append(", weightTeamTwoView=");
        return kng0.o(sbN, this.e, Separators.RPAREN);
    }
}
