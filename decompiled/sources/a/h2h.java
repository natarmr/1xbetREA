package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12333a;
    public final String b;
    public final String c;

    public h2h(String str, String str2, String str3) {
        str2.getClass();
        this.f12333a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2h)) {
            return false;
        }
        h2h h2hVar = (h2h) obj;
        return this.f12333a.equals(h2hVar.f12333a) && Intrinsics.d(this.b, h2hVar.b) && this.c.equals(h2hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f12333a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("CyberLeaderboardAnalyticsCardBottomValueUiModel(id=", this.f12333a, ", title=", this.b, ", amount="), this.c, Separators.RPAREN);
    }
}
