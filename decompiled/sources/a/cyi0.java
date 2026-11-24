package a;

import android.gov.nist.core.Separators;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes5.dex */
public final class cyi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationNewPlaceResultType f5177a;

    public cyi0(ConfirmationNewPlaceResultType confirmationNewPlaceResultType) {
        this.f5177a = confirmationNewPlaceResultType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyi0) && this.f5177a.equals(((cyi0) obj).f5177a);
    }

    public final int hashCode() {
        return this.f5177a.hashCode();
    }

    public final String toString() {
        return "HandleConfirmNewPlaceResult(type=" + this.f5177a + Separators.RPAREN;
    }
}
