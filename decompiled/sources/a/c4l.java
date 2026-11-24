package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c4l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3730a;
    public final String b;
    public final a4x c;
    public final a4x d;

    public c4l(String str, String str2, i4 i4Var, i4 i4Var2) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        i4Var2.getClass();
        this.f3730a = str;
        this.b = str2;
        this.c = i4Var;
        this.d = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4l)) {
            return false;
        }
        c4l c4lVar = (c4l) obj;
        return Intrinsics.d(this.f3730a, c4lVar.f3730a) && Intrinsics.d(this.b, c4lVar.b) && Intrinsics.d(this.c, c4lVar.c) && Intrinsics.d(this.d, c4lVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "HERO_INDICATORS_TABLET";
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, ua80.b(ua80.b(-209476156, 31, this.f3730a), 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DotaHeroIndicatorsTabletUiModel(key=HERO_INDICATORS_TABLET, firstHeader=", this.f3730a, ", secondHeader=", this.b, ", totalValueList=");
        sbN.append(this.c);
        sbN.append(", buyBackList=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
