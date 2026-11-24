package a;

import android.gov.nist.core.Separators;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetInfoItem;

/* JADX INFO: loaded from: classes6.dex */
public final class mb7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f21493a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final SuccessBetInfoItem d;

    public mb7(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, SuccessBetInfoItem successBetInfoItem) {
        successBetInfoItem.getClass();
        this.f21493a = appCompatTextView;
        this.b = appCompatTextView2;
        this.c = appCompatTextView3;
        this.d = successBetInfoItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mb7) {
            mb7 mb7Var = (mb7) obj;
            if (this.f21493a == mb7Var.f21493a && this.b.equals(mb7Var.b) && Intrinsics.d(this.c, mb7Var.c) && Intrinsics.d(this.d, mb7Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f21493a.hashCode() * 31)) * 31;
        AppCompatTextView appCompatTextView = this.c;
        return this.d.hashCode() + ((iHashCode + (appCompatTextView == null ? 0 : appCompatTextView.hashCode())) * 31);
    }

    public final String toString() {
        return "BetInfoItemView(nameView=" + this.f21493a + ", valueView=" + this.b + ", currencyView=" + this.c + ", item=" + this.d + Separators.RPAREN;
    }
}
