package a;

import android.gov.nist.core.Separators;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes2.dex */
public final class bi4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationNewPlaceResultType f2640a;

    public bi4(ConfirmationNewPlaceResultType confirmationNewPlaceResultType) {
        this.f2640a = confirmationNewPlaceResultType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi4) && this.f2640a.equals(((bi4) obj).f2640a);
    }

    public final int hashCode() {
        return this.f2640a.hashCode();
    }

    public final String toString() {
        return "OnConfirmNewPlace(type=" + this.f2640a + Separators.RPAREN;
    }
}
