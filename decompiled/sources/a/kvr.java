package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class kvr implements lvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18968a;
    public final String b;
    public final String c;

    public kvr(long j, String str, String str2) {
        str.getClass();
        this.f18968a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvr)) {
            return false;
        }
        kvr kvrVar = (kvr) obj;
        return this.f18968a == kvrVar.f18968a && Intrinsics.d(this.b, kvrVar.b) && this.c.equals(kvrVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.no_photo_new) + ua80.b(ua80.b(Long.hashCode(this.f18968a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f18968a, "SecondPlayer(id=", ", title=", this.b);
        axq.s(R.drawable.no_photo_new, ", icon=", this.c, ", placeholderRes=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
