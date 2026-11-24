package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rsb implements vsb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31023a;

    public rsb(String str) {
        str.getClass();
        this.f31023a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsb) && Intrinsics.d(this.f31023a, ((rsb) obj).f31023a);
    }

    public final int hashCode() {
        return this.f31023a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnEnteredValueChanged(value=", this.f31023a, Separators.RPAREN);
    }
}
