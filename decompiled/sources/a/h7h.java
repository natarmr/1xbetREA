package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12573a;
    public final String b;
    public final boolean c;
    public final long d;
    public final String e;
    public final String f;
    public final a4x g;
    public final boolean h;

    public h7h(long j, String str, boolean z, long j2, String str2, String str3, a4x a4xVar, boolean z2) {
        w6x.x(a4xVar, str2, str3);
        this.f12573a = j;
        this.b = str;
        this.c = z;
        this.d = j2;
        this.e = str2;
        this.f = str3;
        this.g = a4xVar;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7h)) {
            return false;
        }
        h7h h7hVar = (h7h) obj;
        return this.f12573a == h7hVar.f12573a && this.b.equals(h7hVar.b) && this.c == h7hVar.c && this.d == h7hVar.d && Intrinsics.d(this.e, h7hVar.e) && Intrinsics.d(this.f, h7hVar.f) && Intrinsics.d(this.g, h7hVar.g) && this.h == h7hVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + cs0.b(this.g, ua80.b(ua80.b(rw2.b(brm0.e(ua80.b(Long.hashCode(this.f12573a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f12573a, "CyberMarketsSubGameUiModel(id=", ", title=", this.b);
        rz4.A(sbO, ", isLoading=", this.c, ", hiddenMarketsCount=");
        kng0.z(sbO, this.d, ", hiddenMarketsBannerText=", this.e);
        sbO.append(", noBetsMessage=");
        sbO.append(this.f);
        sbO.append(", groups=");
        sbO.append(this.g);
        return f140.n(sbO, ", relatedGamesVisible=", this.h, Separators.RPAREN);
    }
}
