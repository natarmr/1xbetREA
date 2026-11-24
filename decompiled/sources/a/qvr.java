package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qvr implements uvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29399a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public qvr(String str, String str2, String str3, String str4, String str5, long j) {
        cs0.x(str, str3, str4, str5);
        this.f29399a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvr)) {
            return false;
        }
        qvr qvrVar = (qvr) obj;
        return this.f29399a == qvrVar.f29399a && Intrinsics.d(this.b, qvrVar.b) && this.c.equals(qvrVar.c) && Intrinsics.d(this.d, qvrVar.d) && Intrinsics.d(this.e, qvrVar.e) && Intrinsics.d(this.f, qvrVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f29399a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29399a, "PlayerFirst(id=", ", name=", this.b);
        f140.v(sbO, ", formula=", this.c, ", firstNumber=", this.d);
        f140.v(sbO, ", secondNumber=", this.e, ", thirdNumber=", this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
