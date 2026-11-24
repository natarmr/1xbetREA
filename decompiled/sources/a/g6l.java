package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g6l implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10771a;
    public final String b;
    public final String c;

    public g6l(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f10771a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6l)) {
            return false;
        }
        g6l g6lVar = (g6l) obj;
        return Intrinsics.d(this.f10771a, g6lVar.f10771a) && Intrinsics.d(this.b, g6lVar.b) && Intrinsics.d(this.c, g6lVar.c);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return g6l.class;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f10771a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("DotaPopularHeroesHeaderUiModel(title=", this.f10771a, ", picksTitle=", this.b, ", winsTitle="), this.c, Separators.RPAREN);
    }
}
