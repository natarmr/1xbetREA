package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zqt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44823a;
    public final String b;
    public final String c;

    public zqt0(long j, String str, String str2) {
        str.getClass();
        this.f44823a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqt0)) {
            return false;
        }
        zqt0 zqt0Var = (zqt0) obj;
        return this.f44823a == zqt0Var.f44823a && Intrinsics.d(this.b, zqt0Var.b) && this.c.equals(zqt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f44823a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f44823a, "UserCredentialsModel(userId=", ", password=", this.b), ", message=", this.c, Separators.RPAREN);
    }
}
