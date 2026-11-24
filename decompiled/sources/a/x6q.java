package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class x6q implements y6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinBetInfoModel f40375a;

    public x6q(FinBetInfoModel finBetInfoModel) {
        finBetInfoModel.getClass();
        this.f40375a = finBetInfoModel;
    }

    @Override // a.y6q
    public final int a() {
        return R.string.bet_type_simple;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6q) && Intrinsics.d(this.f40375a, ((x6q) obj).f40375a);
    }

    public final int hashCode() {
        return this.f40375a.hashCode() + (Integer.hashCode(R.string.bet_type_simple) * 31);
    }

    public final String toString() {
        return "Simple(titleResId=" + R.string.bet_type_simple + ", finBetInfoModel=" + this.f40375a + Separators.RPAREN;
    }
}
