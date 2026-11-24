package a;

import android.gov.nist.core.Separators;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes5.dex */
public final class d6f0 implements i6f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationNewPlaceResultType f5546a;

    public d6f0(ConfirmationNewPlaceResultType confirmationNewPlaceResultType) {
        this.f5546a = confirmationNewPlaceResultType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6f0) && this.f5546a.equals(((d6f0) obj).f5546a);
    }

    public final int hashCode() {
        return this.f5546a.hashCode();
    }

    public final String toString() {
        return "OnConfirmNewPlace(type=" + this.f5546a + Separators.RPAREN;
    }
}
