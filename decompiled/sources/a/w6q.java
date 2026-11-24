package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class w6q implements y6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinBetInfoModel f38636a;

    public w6q(FinBetInfoModel finBetInfoModel) {
        finBetInfoModel.getClass();
        this.f38636a = finBetInfoModel;
    }

    @Override // a.y6q
    public final int a() {
        return R.string.bet_type_promo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6q) && Intrinsics.d(this.f38636a, ((w6q) obj).f38636a);
    }

    public final int hashCode() {
        return this.f38636a.hashCode() + (Integer.hashCode(R.string.bet_type_promo) * 31);
    }

    public final String toString() {
        return "Promo(titleResId=" + R.string.bet_type_promo + ", finBetInfoModel=" + this.f38636a + Separators.RPAREN;
    }
}
