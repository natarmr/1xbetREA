package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gvr implements lvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11988a;
    public final String b;
    public final String c;

    public gvr(long j, String str, String str2) {
        str.getClass();
        this.f11988a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvr)) {
            return false;
        }
        gvr gvrVar = (gvr) obj;
        return this.f11988a == gvrVar.f11988a && Intrinsics.d(this.b, gvrVar.b) && this.c.equals(gvrVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.no_photo_new) + ua80.b(ua80.b(Long.hashCode(this.f11988a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f11988a, "FirstPlayer(id=", ", title=", this.b);
        axq.s(R.drawable.no_photo_new, ", icon=", this.c, ", placeholderRes=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
