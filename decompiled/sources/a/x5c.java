package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class x5c implements y5c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40308a;
    public final swp0 b;
    public final List c;
    public final List d;
    public final int e;
    public final obk0 f;
    public final BindPhoneNumberScreen g;
    public final boolean h;

    public x5c(String str, swp0 swp0Var, List list, List list2, int i, obk0 obk0Var, BindPhoneNumberScreen bindPhoneNumberScreen, boolean z) {
        list.getClass();
        list2.getClass();
        obk0Var.getClass();
        this.f40308a = str;
        this.b = swp0Var;
        this.c = list;
        this.d = list2;
        this.e = i;
        this.f = obk0Var;
        this.g = bindPhoneNumberScreen;
        this.h = z;
    }

    @Override // a.d6c
    public final int N() {
        return this.e;
    }

    @Override // a.d6c
    public final obk0 P() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x5c) {
            x5c x5cVar = (x5c) obj;
            if (this.f40308a.equals(x5cVar.f40308a) && this.b.equals(x5cVar.b) && Intrinsics.d(this.c, x5cVar.c) && Intrinsics.d(this.d, x5cVar.d) && this.e == x5cVar.e && this.f == x5cVar.f && this.g == x5cVar.g && this.h == x5cVar.h) {
                return true;
            }
        }
        return false;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f40308a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + twn.a(this.e, dw9.a(dw9.a((this.b.hashCode() + (this.f40308a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31)) * 31)) * 31);
    }

    @Override // a.d6c
    public final int p() {
        return 26;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BindPhone(phoneNumber=");
        sb.append(this.f40308a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", availableActivationTypeList=");
        b1j.y(", availableRepeatActivationTypeList=", ", smsTime=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", currentActivationType=");
        sb.append(this.f);
        sb.append(", onTokenExpiredNavigationScreen=");
        sb.append(this.g);
        sb.append(", isRepeatFlow=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // a.d6c
    public final boolean u() {
        return this.h;
    }

    @Override // a.d6c
    public final List z() {
        return this.c;
    }
}
