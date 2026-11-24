package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class trd implements urd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34418a;

    public trd(Object obj) {
        this.f34418a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof trd) && Intrinsics.d(this.f34418a, ((trd) obj).f34418a);
    }

    public final int hashCode() {
        Object obj = this.f34418a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f34418a, "Success(item=", Separators.RPAREN);
    }
}
