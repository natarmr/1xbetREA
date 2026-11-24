package a;

import android.gov.nist.core.Separators;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$VerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class gn50 implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VerificationStatusScreens$VerificationStatusFragmentScreen f11570a;

    public gn50(VerificationStatusScreens$VerificationStatusFragmentScreen verificationStatusScreens$VerificationStatusFragmentScreen) {
        this.f11570a = verificationStatusScreens$VerificationStatusFragmentScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn50) && this.f11570a == ((gn50) obj).f11570a;
    }

    public final int hashCode() {
        return this.f11570a.hashCode();
    }

    public final String toString() {
        return "NewRootScreenCurrentChildChain(screen=" + this.f11570a + Separators.RPAREN;
    }
}
