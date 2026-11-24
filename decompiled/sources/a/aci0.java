package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aci0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f628a;
    public final swp0 b;
    public final List c;
    public final List d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final we50 i;

    public aci0(String str, swp0 swp0Var, List list, List list2, boolean z, String str2, String str3, boolean z2, we50 we50Var) {
        str.getClass();
        swp0Var.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        str3.getClass();
        we50Var.getClass();
        this.f628a = str;
        this.b = swp0Var;
        this.c = list;
        this.d = list2;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = we50Var;
    }

    @Override // a.dci0
    public final List D() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aci0)) {
            return false;
        }
        aci0 aci0Var = (aci0) obj;
        return Intrinsics.d(this.f628a, aci0Var.f628a) && Intrinsics.d(this.b, aci0Var.b) && Intrinsics.d(this.c, aci0Var.c) && Intrinsics.d(this.d, aci0Var.d) && this.e == aci0Var.e && Intrinsics.d(this.f, aci0Var.f) && Intrinsics.d(this.g, aci0Var.g) && this.h == aci0Var.h && this.i == aci0Var.i;
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f628a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(ua80.b(ua80.b(brm0.e(dw9.a(dw9.a(twn.a(24, (this.b.hashCode() + (this.f628a.hashCode() * 31)) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // a.dci0
    public final int p() {
        return 24;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestorePasswordConfirmation(phoneNumber=");
        sb.append(this.f628a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=24, availableActivationTypeList=");
        b1j.y(", availableRepeatActivationTypeList=", ", isRepeatFlow=", sb, this.c, this.d);
        f140.s(", countyCodeDigits=", this.f, ", phoneDigits=", sb, this.e);
        brm0.C(this.g, ", hasAuthenticator=", ", navigation=", sb, this.h);
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
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
