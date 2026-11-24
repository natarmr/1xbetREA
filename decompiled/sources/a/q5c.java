package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class q5c implements r5c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28145a;
    public final int b;
    public final List c;
    public final List d;
    public final swp0 e;

    public q5c(String str, int i) {
        this.f28145a = str;
        this.b = i;
        obk0 obk0Var = obk0.SMS;
        this.c = kotlin.collections.a.c(obk0Var);
        this.d = kotlin.collections.a.c(obk0Var);
        this.e = new swp0("", "", false);
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
        if (!(obj instanceof q5c)) {
            return false;
        }
        q5c q5cVar = (q5c) obj;
        return this.f28145a.equals(q5cVar.f28145a) && this.b == q5cVar.b;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f28145a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + twn.a(this.b, this.f28145a.hashCode() * 31, 31);
    }

    @Override // a.d6c
    public final int p() {
        return 14;
    }

    public final String toString() {
        return dw9.n(this.b, "AuthenticatorMigration(phoneNumber=", this.f28145a, ", smsTime=", ", isRepeatFlow=false)");
    }

    @Override // a.d6c
    public final boolean u() {
        return false;
    }

    @Override // a.d6c
    public final List z() {
        return this.c;
    }
}
