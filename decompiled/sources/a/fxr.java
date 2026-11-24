package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fxr implements ixr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10323a;
    public final long b;
    public final String c;
    public final boolean d;

    public fxr(long j, String str, String str2, boolean z) {
        str.getClass();
        this.f10323a = str;
        this.b = j;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxr)) {
            return false;
        }
        fxr fxrVar = (fxr) obj;
        return Intrinsics.d(this.f10323a, fxrVar.f10323a) && this.b == fxrVar.b && this.c.equals(fxrVar.c) && this.d == fxrVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_home) + brm0.e(ua80.b(rw2.b(this.f10323a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "SecondTeam(playerName=", this.f10323a, ", teamId=");
        w6x.z(", imageUrl=", this.c, ", hostGuest=", sbO, this.d);
        return vqd.p(sbO, ", hostGuestIconDrawableRes=", R.drawable.ic_home, Separators.RPAREN);
    }
}
