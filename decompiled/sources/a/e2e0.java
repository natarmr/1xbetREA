package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class e2e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7080a;
    public final String b;

    public e2e0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f7080a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2e0)) {
            return false;
        }
        e2e0 e2e0Var = (e2e0) obj;
        return Intrinsics.d(this.f7080a, e2e0Var.f7080a) && Intrinsics.d(this.b, e2e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + twn.a(R.drawable.ic_glyph_statistics, this.f7080a.hashCode() * 31, 31);
    }

    public final String toString() {
        return axq.n(kng0.p(R.drawable.ic_glyph_statistics, "RankingsTournamentUiModel(eventId=", this.f7080a, ", icon=", ", title="), this.b, Separators.RPAREN);
    }
}
