package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10108a;

    public final boolean equals(Object obj) {
        if (obj instanceof fte) {
            return Intrinsics.d(this.f10108a, ((fte) obj).f10108a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10108a.hashCode();
    }

    public final String toString() {
        return kng0.l("CoefTextValue(value=", this.f10108a, Separators.RPAREN);
    }
}
