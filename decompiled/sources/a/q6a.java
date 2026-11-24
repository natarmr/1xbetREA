package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q6a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28191a;
    public final String b;
    public final String c;

    public q6a(String str, String str2, String str3) {
        str2.getClass();
        this.f28191a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6a)) {
            return false;
        }
        q6a q6aVar = (q6a) obj;
        return this.f28191a.equals(q6aVar.f28191a) && Intrinsics.d(this.b, q6aVar.b) && this.c.equals(q6aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28191a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("CaptchaPushTokenInfo(token=", this.f28191a, ", tokenType=", this.b, ", projectId="), this.c, Separators.RPAREN);
    }
}
