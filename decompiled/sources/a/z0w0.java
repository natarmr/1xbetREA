package a;

import android.gov.nist.core.Separators;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$VerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class z0w0 implements g1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VerificationStatusScreens$VerificationStatusFragmentScreen f43589a;

    public z0w0(VerificationStatusScreens$VerificationStatusFragmentScreen verificationStatusScreens$VerificationStatusFragmentScreen) {
        this.f43589a = verificationStatusScreens$VerificationStatusFragmentScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0w0) && this.f43589a == ((z0w0) obj).f43589a;
    }

    public final int hashCode() {
        return this.f43589a.hashCode();
    }

    public final String toString() {
        return "NewRootCurrentChildChain(screen=" + this.f43589a + Separators.RPAREN;
    }
}
