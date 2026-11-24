package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q5h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28151a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public q5h(long j, String str, boolean z, boolean z2) {
        str.getClass();
        this.f28151a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5h)) {
            return false;
        }
        q5h q5hVar = (q5h) obj;
        return this.f28151a == q5hVar.f28151a && Intrinsics.d(this.b, q5hVar.b) && this.c == q5hVar.c && this.d == q5hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(Long.hashCode(this.f28151a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28151a, "CyberMarketCategoryUiModel(marketTypeId=", ", name=", this.b);
        w6x.A(", isSelected=", ", isPopular=", sbO, this.c, this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
