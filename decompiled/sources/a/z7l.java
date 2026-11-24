package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class z7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43922a;
    public final boolean b;

    public z7l(String str, boolean z) {
        str.getClass();
        this.f43922a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7l)) {
            return false;
        }
        z7l z7lVar = (z7l) obj;
        return Intrinsics.d(this.f43922a, z7lVar.f43922a) && this.b == z7lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_gold_ic) + brm0.e(this.f43922a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(R.drawable.dota_gold_ic, Separators.RPAREN, brm0.u("RadiantNetWorth(amount=", this.f43922a, ", visibility=", this.b, ", icon="));
    }
}
