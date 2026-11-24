package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33028a;
    public final String b;
    public final gzm c;

    public sym(String str, String str2, gzm gzmVar) {
        str.getClass();
        str2.getClass();
        this.f33028a = str;
        this.b = str2;
        this.c = gzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sym)) {
            return false;
        }
        sym symVar = (sym) obj;
        return Intrinsics.d(this.f33028a, symVar.f33028a) && Intrinsics.d(this.b, symVar.b) && this.c.equals(symVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f33028a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V4(liveTag=", this.f33028a, ", info=", this.b, ", timerModel=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
