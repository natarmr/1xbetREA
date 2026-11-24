package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sbi0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31936a;
    public final swp0 b;
    public final List c;
    public final List d;
    public final boolean e;
    public final String f;
    public final String g;

    public sbi0(String str, swp0 swp0Var, List list, List list2, boolean z, String str2, String str3) {
        list.getClass();
        list2.getClass();
        this.f31936a = str;
        this.b = swp0Var;
        this.c = list;
        this.d = list2;
        this.e = z;
        this.f = str2;
        this.g = str3;
    }

    @Override // a.dci0
    public final List D() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbi0)) {
            return false;
        }
        sbi0 sbi0Var = (sbi0) obj;
        return this.f31936a.equals(sbi0Var.f31936a) && this.b.equals(sbi0Var.b) && Intrinsics.d(this.c, sbi0Var.c) && Intrinsics.d(this.d, sbi0Var.d) && this.e == sbi0Var.e && this.f.equals(sbi0Var.f) && this.g.equals(sbi0Var.g);
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f31936a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(brm0.e(dw9.a(dw9.a((this.b.hashCode() + (this.f31936a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // a.dci0
    public final int p() {
        return 5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddTwoFactorAuthConfirmation(phoneNumber=");
        sb.append(this.f31936a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", availableActivationTypeList=");
        b1j.y(", availableRepeatActivationTypeList=", ", isRepeatFlow=", sb, this.c, this.d);
        f140.s(", resetHashResultKey=", this.f, ", resetHashSecretKeyValue=", sb, this.e);
        return axq.n(sb, this.g, Separators.RPAREN);
    }

    @Override // a.dci0
    public final boolean u() {
        return this.e;
    }

    @Override // a.dci0
    public final List z() {
        return this.c;
    }
}
