package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i7a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14283a;
    public final String b;
    public final int c;
    public final m7a d;

    public i7a(int i, String str, int i2, m7a m7aVar) {
        str.getClass();
        this.f14283a = i;
        this.b = str;
        this.c = i2;
        this.d = m7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7a)) {
            return false;
        }
        i7a i7aVar = (i7a) obj;
        return this.f14283a == i7aVar.f14283a && Intrinsics.d(this.b, i7aVar.b) && this.c == i7aVar.c && this.d == i7aVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, ua80.b(Integer.hashCode(this.f14283a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f14283a, "CaptchaTask(count=", ", image=", this.b, ", letCount=");
        sbR.append(this.c);
        sbR.append(", type=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
