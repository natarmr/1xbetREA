package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class sqn0 implements uqn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32638a;

    public sqn0(String str) {
        str.getClass();
        this.f32638a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqn0) && Intrinsics.d(this.f32638a, ((sqn0) obj).f32638a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_arrow_left) + (this.f32638a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_arrow_left, "SwipeLeft(description=", this.f32638a, ", descriptionImage=", Separators.RPAREN);
    }
}
