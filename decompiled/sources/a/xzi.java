package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xzi extends px40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzi f41754a;

    public xzi(wzi wziVar) {
        this.f41754a = wziVar;
    }

    @Override // a.px40
    public final int a() {
        int iOrdinal = this.f41754a.ordinal();
        if (iOrdinal == 0) {
            return R.layout.daily_tournament_item_result_fg;
        }
        if (iOrdinal == 1) {
            return R.layout.daily_tournament_item_prize_fg;
        }
        if (iOrdinal == 2) {
            return R.layout.daily_tournament_item_winners_fg;
        }
        t9f.b();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzi) && this.f41754a == ((xzi) obj).f41754a;
    }

    public final int hashCode() {
        return this.f41754a.hashCode();
    }

    public final String toString() {
        return "DailyAdapterItem(type=" + this.f41754a + Separators.RPAREN;
    }
}
