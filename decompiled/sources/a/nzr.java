package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class nzr implements qzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24386a;
    public final String b;
    public final String c;

    public nzr(long j, String str, String str2) {
        str.getClass();
        this.f24386a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzr)) {
            return false;
        }
        nzr nzrVar = (nzr) obj;
        return this.f24386a == nzrVar.f24386a && Intrinsics.d(this.b, nzrVar.b) && this.c.equals(nzrVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.no_photo_new) + ua80.b(ua80.b(Long.hashCode(this.f24386a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f24386a, "TeamFirst(id=", ", title=", this.b);
        axq.s(R.drawable.no_photo_new, ", icon=", this.c, ", placeholder=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
