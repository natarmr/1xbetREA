package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.impl.navigation.ChangePhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class u5c implements v5c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35086a;
    public final swp0 b;
    public final int c;
    public final List d;
    public final List e;
    public final int f;
    public final ChangePhoneNumberScreen g;
    public final boolean h;

    public u5c(String str, swp0 swp0Var, int i, List list, List list2, int i2, ChangePhoneNumberScreen changePhoneNumberScreen, boolean z) {
        zie0 zie0Var = obk0.b;
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f35086a = str;
        this.b = swp0Var;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = i2;
        this.g = changePhoneNumberScreen;
        this.h = z;
    }

    @Override // a.d6c
    public final int N() {
        return this.f;
    }

    @Override // a.d6c
    public final obk0 P() {
        return obk0.SMS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u5c) {
            u5c u5cVar = (u5c) obj;
            if (Intrinsics.d(this.f35086a, u5cVar.f35086a) && this.b.equals(u5cVar.b) && this.c == u5cVar.c && Intrinsics.d(this.d, u5cVar.d) && Intrinsics.d(this.e, u5cVar.e) && this.f == u5cVar.f) {
                zie0 zie0Var = obk0.b;
                if (this.g == u5cVar.g && this.h == u5cVar.h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f35086a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((obk0.SMS.hashCode() + twn.a(this.f, dw9.a(dw9.a(twn.a(this.c, (this.b.hashCode() + (this.f35086a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31)) * 31)) * 31);
    }

    @Override // a.v5c
    public final SecurityNavigationScreen i0() {
        return this.g;
    }

    @Override // a.d6c
    public final int p() {
        return this.c;
    }

    public final String toString() {
        obk0 obk0Var = obk0.SMS;
        StringBuilder sb = new StringBuilder("ConfirmNewPhoneNumberCode(phoneNumber=");
        sb.append(this.f35086a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=");
        ohs0.v(this.c, ", availableActivationTypeList=", ", availableRepeatActivationTypeList=", sb, this.d);
        brm0.v(this.f, ", smsTime=", ", currentActivationType=", sb, this.e);
        sb.append(obk0Var);
        sb.append(", onTokenExpiredNavigationScreen=");
        sb.append(this.g);
        sb.append(", isRepeatFlow=");
        return rw2.p(sb, this.h, Separators.RPAREN);
    }

    @Override // a.d6c
    public final boolean u() {
        return this.h;
    }

    @Override // a.d6c
    public final List z() {
        return this.d;
    }
}
