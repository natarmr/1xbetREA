package a;

import android.gov.nist.core.Separators;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$VerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class ie50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VerificationStatusScreens$VerificationStatusFragmentScreen f14617a;

    public ie50(VerificationStatusScreens$VerificationStatusFragmentScreen verificationStatusScreens$VerificationStatusFragmentScreen) {
        this.f14617a = verificationStatusScreens$VerificationStatusFragmentScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie50) && this.f14617a == ((ie50) obj).f14617a;
    }

    public final int hashCode() {
        return this.f14617a.hashCode();
    }

    public final String toString() {
        return "NewRootCurrentChildChain(screen=" + this.f14617a + Separators.RPAREN;
    }
}
