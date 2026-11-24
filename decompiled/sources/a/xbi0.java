package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xbi0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40601a;
    public final byte b;
    public final boolean c;
    public final List d;
    public final List e;
    public final swp0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public xbi0(String str, int i, boolean z) {
        str.getClass();
        this.f40601a = str;
        this.b = i;
        this.c = z;
        obk0 obk0Var = obk0.SMS;
        this.d = kotlin.collections.a.c(obk0Var);
        this.e = kotlin.collections.a.c(obk0Var);
        this.f = new swp0("", "", false);
    }

    @Override // a.dci0
    public final List D() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbi0)) {
            return false;
        }
        xbi0 xbi0Var = (xbi0) obj;
        return Intrinsics.d(this.f40601a, xbi0Var.f40601a) && this.b == xbi0Var.b && this.c == xbi0Var.c;
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f40601a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f40601a.hashCode() * 31, 31);
    }

    @Override // a.dci0
    public final int p() {
        return this.b;
    }

    public final String toString() {
        return rw2.p(kng0.p(this.b, "PhoneActivationConfirmation(phoneNumber=", this.f40601a, ", confirmTypeAlias=", ", isRepeatFlow="), this.c, Separators.RPAREN);
    }

    @Override // a.dci0
    public final boolean u() {
        return this.c;
    }

    @Override // a.dci0
    public final List z() {
        return this.d;
    }
}
