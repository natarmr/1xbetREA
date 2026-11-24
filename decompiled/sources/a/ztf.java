package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ztf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44956a;
    public final String b;
    public final int c;

    public ztf(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f44956a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztf)) {
            return false;
        }
        ztf ztfVar = (ztf) obj;
        return Intrinsics.d(this.f44956a, ztfVar.f44956a) && Intrinsics.d(this.b, ztfVar.b) && this.c == ztfVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f44956a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("CupheadRoundInformationHpUiModel(hpTitle=", this.f44956a, ", hpStageCount=", this.b, ", hpIcon="));
    }
}
