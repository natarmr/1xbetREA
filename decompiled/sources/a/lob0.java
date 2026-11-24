package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20384a;
    public final String b;
    public final String c;

    public lob0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f20384a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lob0)) {
            return false;
        }
        lob0 lob0Var = (lob0) obj;
        return Intrinsics.d(this.f20384a, lob0Var.f20384a) && Intrinsics.d(this.b, lob0Var.b) && Intrinsics.d(this.c, lob0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f20384a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("PowerBetItemUiModel(title=", this.f20384a, ", currentBetProperty=", this.b, ", betProperty="), this.c, Separators.RPAREN);
    }
}
