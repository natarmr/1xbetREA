package a;

import android.gov.nist.core.Separators;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes5.dex */
public final class nc4 implements pc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationNewPlaceResultType f23273a;

    public nc4(ConfirmationNewPlaceResultType confirmationNewPlaceResultType) {
        this.f23273a = confirmationNewPlaceResultType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc4) && this.f23273a.equals(((nc4) obj).f23273a);
    }

    public final int hashCode() {
        return this.f23273a.hashCode();
    }

    public final String toString() {
        return "HandleConfirmNewPlaceResult(type=" + this.f23273a + Separators.RPAREN;
    }
}
