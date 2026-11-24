package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class krb implements orb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18755a;

    public final boolean equals(Object obj) {
        if (obj instanceof krb) {
            return Intrinsics.d(this.f18755a, ((krb) obj).f18755a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18755a.hashCode();
    }

    public final String toString() {
        return kng0.l("ChangeInputNewPass(value=", this.f18755a, Separators.RPAREN);
    }
}
