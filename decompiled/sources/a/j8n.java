package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16092a;
    public final String b;
    public final String c;

    public j8n(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f16092a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8n)) {
            return false;
        }
        j8n j8nVar = (j8n) obj;
        return Intrinsics.d(this.f16092a, j8nVar.f16092a) && Intrinsics.d(this.b, j8nVar.b) && Intrinsics.d(this.c, j8nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f16092a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("DsUfcStatsRowUiModel(leftValue=", this.f16092a, ", label=", this.b, ", rightValue="), this.c, Separators.RPAREN);
    }
}
