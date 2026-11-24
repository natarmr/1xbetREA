package a;

import android.gov.nist.core.Separators;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;

/* JADX INFO: loaded from: classes6.dex */
public final class whr0 implements xhr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuccessBetStringModel f39179a;
    public final SuccessBetAlertModel b;

    public whr0(SuccessBetStringModel successBetStringModel, SuccessBetAlertModel successBetAlertModel) {
        this.f39179a = successBetStringModel;
        this.b = successBetAlertModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whr0)) {
            return false;
        }
        whr0 whr0Var = (whr0) obj;
        return this.f39179a.equals(whr0Var.f39179a) && this.b.equals(whr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39179a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackBar(successBetStringModel=" + this.f39179a + ", successBetAlertModel=" + this.b + Separators.RPAREN;
    }
}
