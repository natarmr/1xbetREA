package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v6k0 implements x6k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36882a;
    public final int b;
    public final int c;

    public v6k0(String str, int i, int i2) {
        this.f36882a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6k0)) {
            return false;
        }
        v6k0 v6k0Var = (v6k0) obj;
        return this.f36882a.equals(v6k0Var.f36882a) && this.b == v6k0Var.b && this.c == v6k0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f36882a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, kng0.p(this.b, "Established(remoteIp=", this.f36882a, ", remoteRtpPort=", ", payloadType="));
    }
}
