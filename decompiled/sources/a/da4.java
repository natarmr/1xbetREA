package a;

import android.gov.nist.core.Separators;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes2.dex */
public final class da4 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationNewPlaceResultType f5729a;

    public da4(ConfirmationNewPlaceResultType confirmationNewPlaceResultType) {
        this.f5729a = confirmationNewPlaceResultType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da4) && this.f5729a.equals(((da4) obj).f5729a);
    }

    public final int hashCode() {
        return this.f5729a.hashCode();
    }

    public final String toString() {
        return "OnConfirmNewPlace(type=" + this.f5729a + Separators.RPAREN;
    }
}
