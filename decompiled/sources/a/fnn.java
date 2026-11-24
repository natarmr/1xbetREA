package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.edit_coupon.presentation.model.OptionSelectBottomSheetDialogModel;

/* JADX INFO: loaded from: classes3.dex */
public final class fnn implements hnn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OptionSelectBottomSheetDialogModel f9846a;

    public final boolean equals(Object obj) {
        if (obj instanceof fnn) {
            return this.f9846a.equals(((fnn) obj).f9846a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9846a.hashCode();
    }

    public final String toString() {
        return "ShowOptionSelectDialog(optionSelectBottomSheetDialogModel=" + this.f9846a + Separators.RPAREN;
    }
}
