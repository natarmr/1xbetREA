package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l9l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f19658a;
    public final String b;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public l9l(long j, String str) {
        this.f19658a = (int) j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9l)) {
            return false;
        }
        l9l l9lVar = (l9l) obj;
        return ((long) this.f19658a) == ((long) l9lVar.f19658a) && this.b.equals(l9lVar.b);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof l9l) && (p6t0Var2 instanceof l9l) && ((long) ((l9l) p6t0Var).f19658a) == ((long) ((l9l) p6t0Var2).f19658a);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_statistic_future_game_header_bg) + ua80.b(Long.hashCode(this.f19658a) * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof l9l) || !(p6t0Var2 instanceof l9l)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        k9x.G(arrayList, new j9l(((l9l) p6t0Var).b), new j9l(((l9l) p6t0Var2).b));
        k9x.G(arrayList, new i9l(), new i9l());
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        return rw2.o(axq.o(this.f19658a, "DotaStatisticFutureGameHeaderUiModel(id=", ", teamImage=", kng0.l("TeamImage(value=", this.b, Separators.RPAREN)), ", background=", ua80.e(R.drawable.dota_statistic_future_game_header_bg, "Background(value=", Separators.RPAREN), Separators.RPAREN);
    }
}
