package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40467a;

    public x8l(String str) {
        str.getClass();
        this.f40467a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8l) && Intrinsics.d(this.f40467a, ((x8l) obj).f40467a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_radiant_dot) + (this.f40467a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.dota_radiant_dot, "RadiantSide(title=", this.f40467a, ", icon=", Separators.RPAREN);
    }
}
