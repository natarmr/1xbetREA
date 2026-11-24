package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29981a;
    public final boolean b;

    public r7l(String str, boolean z) {
        str.getClass();
        this.f29981a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7l)) {
            return false;
        }
        r7l r7lVar = (r7l) obj;
        return Intrinsics.d(this.f29981a, r7lVar.f29981a) && this.b == r7lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_gold_ic) + brm0.e(this.f29981a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(R.drawable.dota_gold_ic, Separators.RPAREN, brm0.u("DireNetWorth(amount=", this.f29981a, ", visibility=", this.b, ", icon="));
    }
}
