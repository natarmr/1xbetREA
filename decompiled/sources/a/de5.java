package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class de5 implements he5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5931a;
    public final String b;
    public final xwn c;

    public de5(String str, String str2, xwn xwnVar) {
        str.getClass();
        str2.getClass();
        xwnVar.getClass();
        this.f5931a = str;
        this.b = str2;
        this.c = xwnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de5)) {
            return false;
        }
        de5 de5Var = (de5) obj;
        return Intrinsics.d(this.f5931a, de5Var.f5931a) && Intrinsics.d(this.b, de5Var.b) && Intrinsics.d(this.c, de5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f5931a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CorruptedVideoFileException(videoUrn=", this.f5931a, ", prefix=", this.b, ", encryptedVideoUrn=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
