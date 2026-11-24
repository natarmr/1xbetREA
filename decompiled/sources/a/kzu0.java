package a;

import android.gov.nist.core.Separators;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.models.BonusAccountUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class kzu0 implements pzu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BonusAccountUiModel f19168a;

    public kzu0(BonusAccountUiModel bonusAccountUiModel) {
        this.f19168a = bonusAccountUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzu0) && this.f19168a.equals(((kzu0) obj).f19168a);
    }

    public final int hashCode() {
        return this.f19168a.hashCode();
    }

    public final String toString() {
        return "OnBonusActionClick(bonusAccountUiModel=" + this.f19168a + Separators.RPAREN;
    }
}
