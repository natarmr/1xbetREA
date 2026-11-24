package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.impl.navigation.ChangePhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class t5c implements v5c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33362a;
    public final swp0 b;
    public final int c;
    public final List d;
    public final List e;
    public final int f;
    public final obk0 g;
    public final ChangePhoneNumberScreen h;
    public final boolean i;
    public final String j;

    public t5c(String str, swp0 swp0Var, int i, List list, List list2, int i2, obk0 obk0Var, ChangePhoneNumberScreen changePhoneNumberScreen, boolean z, String str2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        obk0Var.getClass();
        str2.getClass();
        this.f33362a = str;
        this.b = swp0Var;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = i2;
        this.g = obk0Var;
        this.h = changePhoneNumberScreen;
        this.i = z;
        this.j = str2;
    }

    @Override // a.d6c
    public final int N() {
        return this.f;
    }

    @Override // a.d6c
    public final obk0 P() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t5c) {
            t5c t5cVar = (t5c) obj;
            if (Intrinsics.d(this.f33362a, t5cVar.f33362a) && this.b.equals(t5cVar.b) && this.c == t5cVar.c && Intrinsics.d(this.d, t5cVar.d) && Intrinsics.d(this.e, t5cVar.e) && this.f == t5cVar.f && this.g == t5cVar.g && this.h == t5cVar.h && this.i == t5cVar.i && Intrinsics.d(this.j, t5cVar.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f33362a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.j.hashCode() + brm0.e((this.h.hashCode() + ((this.g.hashCode() + twn.a(this.f, dw9.a(dw9.a(twn.a(this.c, (this.b.hashCode() + (this.f33362a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31)) * 31)) * 31, 31, this.i);
    }

    @Override // a.v5c
    public final SecurityNavigationScreen i0() {
        return this.h;
    }

    @Override // a.d6c
    public final int p() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmActionCode(phoneNumber=");
        sb.append(this.f33362a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=");
        ohs0.v(this.c, ", availableActivationTypeList=", ", availableRepeatActivationTypeList=", sb, this.d);
        brm0.v(this.f, ", smsTime=", ", currentActivationType=", sb, this.e);
        sb.append(this.g);
        sb.append(", onTokenExpiredNavigationScreen=");
        sb.append(this.h);
        sb.append(", isRepeatFlow=");
        return twn.q(", newPhoneNumber=", this.j, Separators.RPAREN, sb, this.i);
    }

    @Override // a.d6c
    public final boolean u() {
        return this.i;
    }

    @Override // a.d6c
    public final List z() {
        return this.d;
    }
}
