package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ozr implements qzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26113a;
    public final String b;
    public final String c;

    public ozr(long j, String str, String str2) {
        str.getClass();
        this.f26113a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozr)) {
            return false;
        }
        ozr ozrVar = (ozr) obj;
        return this.f26113a == ozrVar.f26113a && Intrinsics.d(this.b, ozrVar.b) && this.c.equals(ozrVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.no_photo_new) + ua80.b(ua80.b(Long.hashCode(this.f26113a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26113a, "TeamSecond(id=", ", title=", this.b);
        axq.s(R.drawable.no_photo_new, ", icon=", this.c, ", placeholder=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
