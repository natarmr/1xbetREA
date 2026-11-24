package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c2z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3647a;
    public final int b;
    public final int c;
    public final int d;
    public final byte e;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public c2z(int i, int i2, int i3, long j, String str) {
        str.getClass();
        this.f3647a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = (int) j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2z)) {
            return false;
        }
        c2z c2zVar = (c2z) obj;
        return Intrinsics.d(this.f3647a, c2zVar.f3647a) && this.b == c2zVar.b && this.c == c2zVar.c && this.d == c2zVar.d && ((long) this.e) == ((long) c2zVar.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + twn.a(this.d, twn.a(this.c, twn.a(this.b, ua80.b(Long.hashCode(3L) * 31, 31, this.f3647a), 31), 31), 31);
    }

    public final String toString() {
        long j = this.e;
        StringBuilder sbP = kng0.p(this.b, "LastMatchesGamesDrawableToolsModel(headerUiId=3, additionalTitle=", this.f3647a, ", backgroundHeadToHeadHeader=", ", backgroundSingleFirstTeamItem=");
        axq.r(this.c, this.d, ", backgroundSingleSecondTeamItem=", ", footerUiId=", sbP);
        return brm0.k(j, Separators.RPAREN, sbP);
    }
}
