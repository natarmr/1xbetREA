package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40987a;
    public final String b;
    public final int c;
    public final long d;
    public final uaj e;
    public final String f;
    public final String g;

    public xji0(String str, String str2, int i, long j, uaj uajVar, String str3, String str4) {
        brm0.B(str, str2, str4);
        this.f40987a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = uajVar;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xji0)) {
            return false;
        }
        xji0 xji0Var = (xji0) obj;
        return Intrinsics.d(this.f40987a, xji0Var.f40987a) && Intrinsics.d(this.b, xji0Var.b) && this.c == xji0Var.c && this.d == xji0Var.d && this.e.equals(xji0Var.e) && this.f.equals(xji0Var.f) && Intrinsics.d(this.g, xji0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b((this.e.hashCode() + rw2.b(twn.a(this.c, ua80.b(this.f40987a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f40987a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return axq.m(sb, this.g, ')');
    }
}
