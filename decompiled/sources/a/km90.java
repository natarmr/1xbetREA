package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class km90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18528a;

    public km90(String str) {
        str.getClass();
        this.f18528a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km90) && Intrinsics.d(this.f18528a, ((km90) obj).f18528a);
    }

    public final int hashCode() {
        return this.f18528a.hashCode();
    }

    public final String toString() {
        return kng0.l("PhoneValidationModel(countryCode=", this.f18528a, Separators.RPAREN);
    }
}
