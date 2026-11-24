package a;

import android.gov.nist.core.Separators;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;

/* JADX INFO: loaded from: classes6.dex */
public final class zsr0 implements etr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuccessBetStringModel f44919a;
    public final SuccessBetAlertModel b;

    public zsr0(SuccessBetStringModel successBetStringModel, SuccessBetAlertModel successBetAlertModel) {
        this.f44919a = successBetStringModel;
        this.b = successBetAlertModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsr0)) {
            return false;
        }
        zsr0 zsr0Var = (zsr0) obj;
        return this.f44919a.equals(zsr0Var.f44919a) && this.b.equals(zsr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44919a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowBetSuccessMessage(successBetStringModel=" + this.f44919a + ", successBetAlertModel=" + this.b + Separators.RPAREN;
    }
}
