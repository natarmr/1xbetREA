package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fpg0 implements mpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9928a;

    public final boolean equals(Object obj) {
        if (obj instanceof fpg0) {
            return Intrinsics.d(this.f9928a, ((fpg0) obj).f9928a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9928a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f9928a, "BarrelNums(value=", Separators.RPAREN);
    }
}
