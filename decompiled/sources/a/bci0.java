package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class bci0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2358a;
    public final swp0 b;
    public final int c;
    public final List d;
    public final List e;
    public final boolean f;
    public final BindPhoneNumberScreen g;

    public bci0(String str, swp0 swp0Var, int i, List list, List list2, boolean z, BindPhoneNumberScreen bindPhoneNumberScreen) {
        swp0Var.getClass();
        list.getClass();
        list2.getClass();
        this.f2358a = str;
        this.b = swp0Var;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = bindPhoneNumberScreen;
    }

    @Override // a.dci0
    public final List D() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bci0) {
            bci0 bci0Var = (bci0) obj;
            return this.f2358a.equals(bci0Var.f2358a) && Intrinsics.d(this.b, bci0Var.b) && this.c == bci0Var.c && Intrinsics.d(this.d, bci0Var.d) && Intrinsics.d(this.e, bci0Var.e) && this.f == bci0Var.f && this.g == bci0Var.g;
        }
        return false;
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f2358a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(dw9.a(dw9.a(twn.a(this.c, (this.b.hashCode() + (this.f2358a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // a.dci0
    public final int p() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleConfirmation(phoneNumber=");
        sb.append(this.f2358a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=");
        ohs0.v(this.c, ", availableActivationTypeList=", ", availableRepeatActivationTypeList=", sb, this.d);
        rz4.z(sb, ", isRepeatFlow=", this.e, ", onTokenExpiredNavigationScreen=", this.f);
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // a.dci0
    public final boolean u() {
        return this.f;
    }

    @Override // a.dci0
    public final List z() {
        return this.d;
    }
}
