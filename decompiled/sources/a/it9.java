package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class it9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15344a;
    public final long b;
    public final String c;
    public final su9 d;
    public final String e;
    public final boolean f;
    public final int g;

    public it9(long j, long j2, String str, su9 su9Var, String str2, boolean z, int i) {
        this.f15344a = j;
        this.b = j2;
        this.c = str;
        this.d = su9Var;
        this.e = str2;
        this.f = z;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it9)) {
            return false;
        }
        it9 it9Var = (it9) obj;
        return this.f15344a == it9Var.f15344a && this.b == it9Var.b && this.c.equals(it9Var.c) && this.d == it9Var.d && this.e.equals(it9Var.e) && this.f == it9Var.f && this.g == it9Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + brm0.e(ua80.b((this.d.hashCode() + ua80.b(rw2.b(Long.hashCode(this.f15344a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f15344a, "CallbackModel(callbackId=", ", date=");
        kng0.z(sbQ, this.b, ", phone=", this.c);
        sbQ.append(", callbackStatus=");
        sbQ.append(this.d);
        sbQ.append(", guid=");
        sbQ.append(this.e);
        cs0.v(this.g, ", needFeedback=", ", feedbackRate=", sbQ, this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
