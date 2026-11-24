package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class dqe implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6510a;
    public final int b;

    public dqe(String str, int i) {
        this.f6510a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqe)) {
            return false;
        }
        dqe dqeVar = (dqe) obj;
        return this.f6510a.equals(dqeVar.f6510a) && this.b == dqeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f6510a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "CountryChoiceScreenParams(requestKey=", this.f6510a, ", selectedCountryId=", Separators.RPAREN);
    }
}
