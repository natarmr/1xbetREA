package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38727a;
    public final boolean b;
    public final boolean c;

    public w8l(String str, boolean z, boolean z2) {
        str.getClass();
        this.f38727a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8l)) {
            return false;
        }
        w8l w8lVar = (w8l) obj;
        return Intrinsics.d(this.f38727a, w8lVar.f38727a) && this.b == w8lVar.b && this.c == w8lVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_gold_ic) + brm0.e(brm0.e(this.f38727a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("NetWorth(amount=", this.f38727a, ", radiant=", this.b, ", visibility=");
        sbU.append(this.c);
        sbU.append(", icon=");
        sbU.append(R.drawable.dota_gold_ic);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
