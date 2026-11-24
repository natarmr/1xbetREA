package a;

/* JADX INFO: loaded from: classes.dex */
public final class jkk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16674a;
    public final String b;
    public final String c;
    public final int d;
    public final kkk0 e;
    public final lkk0 f;
    public final String g;

    public jkk0(String str, String str2, String str3, int i, kkk0 kkk0Var, lkk0 lkk0Var, String str4) {
        this.f16674a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = kkk0Var;
        this.f = lkk0Var;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkk0)) {
            return false;
        }
        jkk0 jkk0Var = (jkk0) obj;
        return this.f16674a.equals(jkk0Var.f16674a) && this.b.equals(jkk0Var.b) && this.c.equals(jkk0Var.c) && this.d == jkk0Var.d && this.e == jkk0Var.e && this.f == jkk0Var.f && this.g.equals(jkk0Var.g);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ua80.b((this.f.hashCode() + ((this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(this.f16674a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SocketResponseModel(operationApprovalGuid=", this.f16674a, ", token=", this.b, ", deviceName=");
        twn.w(this.d, this.c, ", pushExpiry=", ", status=", sbN);
        sbN.append(this.e);
        sbN.append(", errorCode=");
        sbN.append(this.f);
        sbN.append(", error=");
        return axq.n(sbN, this.g, ", expireAt=0)");
    }
}
