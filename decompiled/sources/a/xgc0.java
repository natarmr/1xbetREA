package a;

import android.gov.nist.core.Separators;
import org.xplatform.makebet_promocodes.api.presentation.models.PromoCodeInfoUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class xgc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromoCodeInfoUiModel f40831a;

    public xgc0(PromoCodeInfoUiModel promoCodeInfoUiModel) {
        this.f40831a = promoCodeInfoUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgc0) && this.f40831a.equals(((xgc0) obj).f40831a);
    }

    public final int hashCode() {
        return this.f40831a.hashCode();
    }

    public final String toString() {
        return "SendSelectedPromoCode(promoCodeInfoModel=" + this.f40831a + Separators.RPAREN;
    }
}
