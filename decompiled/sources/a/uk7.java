package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uk7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35813a;

    public final boolean equals(Object obj) {
        if (obj instanceof uk7) {
            return Intrinsics.d(this.f35813a, ((uk7) obj).f35813a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35813a.hashCode();
    }

    public final String toString() {
        return kng0.l("DeleteOrder(betId=", this.f35813a, Separators.RPAREN);
    }
}
