package a;

import android.gov.nist.core.Separators;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes2.dex */
public final class yd4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationNewPlaceResultType f42415a;

    public yd4(ConfirmationNewPlaceResultType confirmationNewPlaceResultType) {
        this.f42415a = confirmationNewPlaceResultType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd4) && this.f42415a.equals(((yd4) obj).f42415a);
    }

    public final int hashCode() {
        return this.f42415a.hashCode();
    }

    public final String toString() {
        return "OnConfirmNewPlace(type=" + this.f42415a + Separators.RPAREN;
    }
}
