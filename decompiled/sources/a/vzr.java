package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vzr implements yzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38311a;
    public final String b;
    public final String c;
    public final boolean d;

    public vzr(long j, String str, String str2, boolean z) {
        str.getClass();
        this.f38311a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzr)) {
            return false;
        }
        vzr vzrVar = (vzr) obj;
        return this.f38311a == vzrVar.f38311a && Intrinsics.d(this.b, vzrVar.b) && this.c.equals(vzrVar.c) && this.d == vzrVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_home) + brm0.e(ua80.b(ua80.b(Long.hashCode(this.f38311a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f38311a, "TeamFirst(teamId=", ", teamName=", this.b);
        w6x.z(", imageUrl=", this.c, ", hostGuest=", sbO, this.d);
        return vqd.p(sbO, ", hostGuestIconDrawableRes=", R.drawable.ic_home, Separators.RPAREN);
    }
}
