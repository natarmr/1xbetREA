package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nza implements qza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24362a;

    public nza(String str) {
        str.getClass();
        this.f24362a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nza) && Intrinsics.d(this.f24362a, ((nza) obj).f24362a);
    }

    public final int hashCode() {
        return this.f24362a.hashCode();
    }

    public final String toString() {
        return kng0.l("Label(value=", this.f24362a, Separators.RPAREN);
    }
}
