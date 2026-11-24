package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ubi0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35383a;
    public final boolean b;
    public final List c;
    public final List d;
    public final swp0 e;

    public ubi0(String str, boolean z) {
        this.f35383a = str;
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
        if (!(obj instanceof ubi0)) {
            return false;
        }
        ubi0 ubi0Var = (ubi0) obj;
        return this.f35383a.equals(ubi0Var.f35383a) && this.b == ubi0Var.b;
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f35383a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35383a.hashCode() * 31);
    }

    @Override // a.dci0
    public final int p() {
        return 13;
    }

    public final String toString() {
        return ua80.j("AuthenticatorConfirmation(phoneNumber=", this.f35383a, ", isRepeatFlow=", this.b, Separators.RPAREN);
    }

    @Override // a.dci0
    public final boolean u() {
        return this.b;
    }

    @Override // a.dci0
    public final List z() {
        return this.c;
    }
}
