package a;

import android.gov.nist.core.Separators;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class faq implements naq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinBetInfoModel f9222a;

    public faq(FinBetInfoModel finBetInfoModel) {
        this.f9222a = finBetInfoModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof faq) && this.f9222a.equals(((faq) obj).f9222a);
    }

    public final int hashCode() {
        return this.f9222a.hashCode();
    }

    public final String toString() {
        return "ShowBetDialog(betInfo=" + this.f9222a + Separators.RPAREN;
    }
}
