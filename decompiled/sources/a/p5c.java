package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class p5c implements r5c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26398a;
    public final int b;
    public final boolean c;
    public final List d;
    public final List e;
    public final swp0 f;

    public p5c(String str, int i, boolean z) {
        this.f26398a = str;
        this.b = i;
        this.c = z;
        obk0 obk0Var = obk0.SMS;
        this.d = kotlin.collections.a.c(obk0Var);
        this.e = kotlin.collections.a.c(obk0Var);
        this.f = new swp0("", "", false);
    }

    @Override // a.d6c
    public final int N() {
        return this.b;
    }

    @Override // a.d6c
    public final obk0 P() {
        return obk0.SMS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5c)) {
            return false;
        }
        p5c p5cVar = (p5c) obj;
        return this.f26398a.equals(p5cVar.f26398a) && this.b == p5cVar.b && this.c == p5cVar.c;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f26398a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f26398a.hashCode() * 31, 31);
    }

    @Override // a.d6c
    public final int p() {
        return 13;
    }

    public final String toString() {
        return rw2.p(kng0.p(this.b, "AuthenticatorConfirmation(phoneNumber=", this.f26398a, ", smsTime=", ", isRepeatFlow="), this.c, Separators.RPAREN);
    }

    @Override // a.d6c
    public final boolean u() {
        return this.c;
    }

    @Override // a.d6c
    public final List z() {
        return this.d;
    }
}
