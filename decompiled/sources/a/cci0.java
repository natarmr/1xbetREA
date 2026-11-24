package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class cci0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4113a;
    public final swp0 b;
    public final List c;
    public final List d;
    public final boolean e;
    public final BindPhoneNumberScreen f;

    public cci0(String str, swp0 swp0Var, List list, List list2, boolean z, BindPhoneNumberScreen bindPhoneNumberScreen) {
        swp0Var.getClass();
        list.getClass();
        list2.getClass();
        this.f4113a = str;
        this.b = swp0Var;
        this.c = list;
        this.d = list2;
        this.e = z;
        this.f = bindPhoneNumberScreen;
    }

    @Override // a.dci0
    public final List D() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cci0) {
            cci0 cci0Var = (cci0) obj;
            return this.f4113a.equals(cci0Var.f4113a) && Intrinsics.d(this.b, cci0Var.b) && Intrinsics.d(this.c, cci0Var.c) && Intrinsics.d(this.d, cci0Var.d) && this.e == cci0Var.e && this.f == cci0Var.f;
        }
        return false;
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f4113a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(dw9.a(dw9.a((this.b.hashCode() + (this.f4113a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // a.dci0
    public final int p() {
        return 26;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleConfirmationFromGameBroadcasting(phoneNumber=");
        sb.append(this.f4113a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", availableActivationTypeList=");
        b1j.y(", availableRepeatActivationTypeList=", ", isRepeatFlow=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", onTokenExpiredNavigationScreen=");
        sb.append(this.f);
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
