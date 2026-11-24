package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.models.BonusAccountUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class tb8 implements ub8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BonusAccountUiModel f33650a;

    public tb8(BonusAccountUiModel bonusAccountUiModel) {
        bonusAccountUiModel.getClass();
        this.f33650a = bonusAccountUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb8) && Intrinsics.d(this.f33650a, ((tb8) obj).f33650a);
    }

    public final int hashCode() {
        return this.f33650a.hashCode();
    }

    public final String toString() {
        return "OnAccountClick(item=" + this.f33650a + Separators.RPAREN;
    }
}
