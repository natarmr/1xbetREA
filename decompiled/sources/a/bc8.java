package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.models.BonusAccountUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class bc8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BonusAccountUiModel f2342a;

    public bc8(BonusAccountUiModel bonusAccountUiModel) {
        bonusAccountUiModel.getClass();
        this.f2342a = bonusAccountUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc8) && Intrinsics.d(this.f2342a, ((bc8) obj).f2342a);
    }

    public final int hashCode() {
        return this.f2342a.hashCode();
    }

    public final String toString() {
        return "AccountClicked(item=" + this.f2342a + Separators.RPAREN;
    }
}
