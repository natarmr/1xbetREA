package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class joh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16858a;
    public final String b;
    public final ewp c;
    public final fnk0 d;

    public joh(long j, String str, ewp ewpVar, fnk0 fnk0Var) {
        str.getClass();
        this.f16858a = j;
        this.b = str;
        this.c = ewpVar;
        this.d = fnk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joh)) {
            return false;
        }
        joh johVar = (joh) obj;
        return this.f16858a == johVar.f16858a && Intrinsics.d(this.b, johVar.b) && this.c.equals(johVar.c) && Intrinsics.d(this.d, johVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ua80.b(Long.hashCode(this.f16858a) * 31, 31, this.b)) * 31;
        fnk0 fnk0Var = this.d;
        return iHashCode + (fnk0Var == null ? 0 : fnk0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f16858a, "CyberUFCRatingCellItemUiModel(id=", ", indexNumber=", this.b);
        sbO.append(", fighterInfo=");
        sbO.append(this.c);
        sbO.append(", sparkline=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
