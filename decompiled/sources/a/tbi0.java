package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class tbi0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33666a;
    public final boolean b;
    public final List c;
    public final List d;
    public final swp0 e;

    public tbi0(String str, boolean z) {
        this.f33666a = str;
        this.b = z;
        obk0 obk0Var = obk0.SMS;
        this.c = kotlin.collections.a.c(obk0Var);
        this.d = kotlin.collections.a.c(obk0Var);
        this.e = new swp0("", "", false);
    }

    @Override // a.dci0
    public final List D() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbi0)) {
            return false;
        }
        tbi0 tbi0Var = (tbi0) obj;
        return this.f33666a.equals(tbi0Var.f33666a) && this.b == tbi0Var.b;
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f33666a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + brm0.e(this.f33666a.hashCode() * 31, 31, true);
    }

    @Override // a.dci0
    public final int p() {
        return 12;
    }

    public final String toString() {
        return ua80.j("AuthenticatorActivation(phoneNumber=", this.f33666a, ", isRepeatFlow=true, hasAuthenticator=", this.b, Separators.RPAREN);
    }

    @Override // a.dci0
    public final boolean u() {
        return true;
    }

    @Override // a.dci0
    public final List z() {
        return this.c;
    }
}
