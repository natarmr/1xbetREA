package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class c6c implements d6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3812a;
    public final swp0 b;
    public final int c;
    public final List d;
    public final List e;
    public final int f;
    public final obk0 g;
    public final boolean h;
    public final BindPhoneNumberScreen i;

    public c6c(String str, swp0 swp0Var, int i, List list, List list2, int i2, obk0 obk0Var, boolean z, BindPhoneNumberScreen bindPhoneNumberScreen) {
        list.getClass();
        list2.getClass();
        obk0Var.getClass();
        this.f3812a = str;
        this.b = swp0Var;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = i2;
        this.g = obk0Var;
        this.h = z;
        this.i = bindPhoneNumberScreen;
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
        if (obj instanceof c6c) {
            c6c c6cVar = (c6c) obj;
            return this.f3812a.equals(c6cVar.f3812a) && this.b.equals(c6cVar.b) && this.c == c6cVar.c && Intrinsics.d(this.d, c6cVar.d) && Intrinsics.d(this.e, c6cVar.e) && this.f == c6cVar.f && this.g == c6cVar.g && this.h == c6cVar.h && this.i == c6cVar.i;
        }
        return false;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f3812a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e((this.g.hashCode() + twn.a(this.f, dw9.a(dw9.a(twn.a(this.c, (this.b.hashCode() + (this.f3812a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31)) * 31, 31, this.h);
    }

    @Override // a.d6c
    public final int p() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleConfirmation(phoneNumber=");
        sb.append(this.f3812a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=");
        ohs0.v(this.c, ", availableActivationTypeList=", ", availableRepeatActivationTypeList=", sb, this.d);
        brm0.v(this.f, ", smsTime=", ", currentActivationType=", sb, this.e);
        sb.append(this.g);
        sb.append(", isRepeatFlow=");
        sb.append(this.h);
        sb.append(", onTokenExpiredNavigationScreen=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
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
