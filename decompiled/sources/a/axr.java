package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class axr implements ixr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1635a;
    public final long b;
    public final String c;
    public final boolean d;

    public axr(long j, String str, String str2, boolean z) {
        str.getClass();
        this.f1635a = str;
        this.b = j;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axr)) {
            return false;
        }
        axr axrVar = (axr) obj;
        return Intrinsics.d(this.f1635a, axrVar.f1635a) && this.b == axrVar.b && this.c.equals(axrVar.c) && this.d == axrVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_home) + brm0.e(ua80.b(rw2.b(this.f1635a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "FirstTeam(playerName=", this.f1635a, ", teamId=");
        w6x.z(", imageUrl=", this.c, ", hostGuest=", sbO, this.d);
        return vqd.p(sbO, ", hostGuestIconDrawableRes=", R.drawable.ic_home, Separators.RPAREN);
    }
}
