package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rgf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30432a;
    public final int b;
    public final nhf c;
    public final String d;
    public final String e;

    public rgf(int i, int i2, nhf nhfVar, String str, String str2) {
        nhfVar.getClass();
        str.getClass();
        this.f30432a = i;
        this.b = i2;
        this.c = nhfVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgf)) {
            return false;
        }
        rgf rgfVar = (rgf) obj;
        return this.f30432a == rgfVar.f30432a && this.b == rgfVar.b && this.c == rgfVar.c && Intrinsics.d(this.d, rgfVar.d) && this.e.equals(rgfVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f30432a) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CrystalPlayerInfoUiModel(id=", this.f30432a, ", round=", ", crystalType=", this.b);
        sbT.append(this.c);
        sbT.append(", points=");
        sbT.append(this.d);
        sbT.append(", combination=");
        return axq.n(sbT, this.e, Separators.RPAREN);
    }
}
