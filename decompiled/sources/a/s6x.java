package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31725a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;

    public s6x(float f, float f2, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f31725a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6x)) {
            return false;
        }
        s6x s6xVar = (s6x) obj;
        return Intrinsics.d(this.f31725a, s6xVar.f31725a) && Intrinsics.d(this.b, s6xVar.b) && Intrinsics.d(this.c, s6xVar.c) && Float.compare(this.d, s6xVar.d) == 0 && Float.compare(this.e, s6xVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + defpackage.c.a(ua80.b(ua80.b(this.f31725a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("IndicatorUiModel(title=", this.f31725a, ", score1=", this.b, ", score2=");
        sbN.append(this.c);
        sbN.append(", firstProgress=");
        sbN.append(this.d);
        sbN.append(", secondProgress=");
        return kng0.o(sbN, this.e, Separators.RPAREN);
    }
}
