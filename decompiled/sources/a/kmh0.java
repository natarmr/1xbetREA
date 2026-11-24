package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kmh0 implements lmh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18539a;

    public kmh0(int i) {
        this.f18539a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmh0) && this.f18539a == ((kmh0) obj).f18539a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18539a);
    }

    public final String toString() {
        return ua80.e(this.f18539a, "ShowSecretQuestionChoiceList(selectedQuestionId=", Separators.RPAREN);
    }
}
