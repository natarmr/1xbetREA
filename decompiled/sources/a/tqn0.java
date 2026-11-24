package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class tqn0 implements uqn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34389a;

    public tqn0(String str) {
        str.getClass();
        this.f34389a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqn0) && Intrinsics.d(this.f34389a, ((tqn0) obj).f34389a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_arrow_right) + (this.f34389a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_arrow_right, "SwipeRight(description=", this.f34389a, ", descriptionImage=", Separators.RPAREN);
    }
}
