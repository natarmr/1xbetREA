package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ek1 implements gk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7933a;

    public ek1(String str) {
        str.getClass();
        this.f7933a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek1) && Intrinsics.d(this.f7933a, ((ek1) obj).f7933a);
    }

    public final int hashCode() {
        return this.f7933a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnProviderClick(providerId=", this.f7933a, Separators.RPAREN);
    }
}
