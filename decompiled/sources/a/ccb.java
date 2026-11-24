package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ccb implements dcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4102a;

    public final boolean equals(Object obj) {
        if (obj instanceof ccb) {
            return Intrinsics.d(this.f4102a, ((ccb) obj).f4102a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4102a.hashCode();
    }

    public final String toString() {
        return kng0.l("Name(value=", this.f4102a, Separators.RPAREN);
    }
}
