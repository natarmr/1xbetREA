package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wzr implements yzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40033a;
    public final String b;
    public final String c;
    public final boolean d;

    public wzr(long j, String str, String str2, boolean z) {
        str.getClass();
        this.f40033a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzr)) {
            return false;
        }
        wzr wzrVar = (wzr) obj;
        return this.f40033a == wzrVar.f40033a && Intrinsics.d(this.b, wzrVar.b) && this.c.equals(wzrVar.c) && this.d == wzrVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_away) + brm0.e(ua80.b(ua80.b(Long.hashCode(this.f40033a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f40033a, "TeamSecond(teamId=", ", teamName=", this.b);
        w6x.z(", imageUrl=", this.c, ", hostGuest=", sbO, this.d);
        return vqd.p(sbO, ", hostGuestIconDrawableRes=", R.drawable.ic_away, Separators.RPAREN);
    }
}
