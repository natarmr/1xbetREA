package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9285a;
    public final String b;
    public final n0x c;

    public fc0(long j, String str, n0x n0xVar) {
        str.getClass();
        this.f9285a = j;
        this.b = str;
        this.c = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc0)) {
            return false;
        }
        fc0 fc0Var = (fc0) obj;
        return this.f9285a == fc0Var.f9285a && Intrinsics.d(this.b, fc0Var.b) && this.c.equals(fc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f9285a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f9285a, "AggregatorBannerUiModel(bannerId=", ", title=", this.b);
        sbO.append(", image=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
