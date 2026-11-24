package a;

import android.gov.nist.core.Separators;
import org.xplatform.consultantchat.presentation.dialogs.rate.model.RatingModel;

/* JADX INFO: loaded from: classes3.dex */
public final class i6e implements p6e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RatingModel f14236a;

    public i6e(RatingModel ratingModel) {
        this.f14236a = ratingModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6e) && this.f14236a.equals(((i6e) obj).f14236a);
    }

    public final int hashCode() {
        return this.f14236a.hashCode();
    }

    public final String toString() {
        return "OpenRateConsultantDialog(ratingModel=" + this.f14236a + Separators.RPAREN;
    }
}
