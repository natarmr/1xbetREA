package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lxa0 implements iya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wkb0 f20805a;

    public lxa0(wkb0 wkb0Var) {
        this.f20805a = wkb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxa0) && this.f20805a.equals(((lxa0) obj).f20805a);
    }

    public final int hashCode() {
        return this.f20805a.f39300a.hashCode();
    }

    public final String toString() {
        return "OnOnboardingStepAction(value=" + this.f20805a + Separators.RPAREN;
    }
}
