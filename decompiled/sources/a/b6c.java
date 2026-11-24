package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b6c implements d6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2045a;
    public final swp0 b;
    public final List c;
    public final List d;
    public final int e;
    public final obk0 f;
    public final boolean g;
    public final we50 h;
    public final String i;
    public final String j;
    public final boolean k;

    public b6c(String str, swp0 swp0Var, List list, List list2, int i, obk0 obk0Var, boolean z, we50 we50Var, String str2, String str3, boolean z2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        obk0Var.getClass();
        we50Var.getClass();
        str2.getClass();
        str3.getClass();
        this.f2045a = str;
        this.b = swp0Var;
        this.c = list;
        this.d = list2;
        this.e = i;
        this.f = obk0Var;
        this.g = z;
        this.h = we50Var;
        this.i = str2;
        this.j = str3;
        this.k = z2;
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
        if (!(obj instanceof b6c)) {
            return false;
        }
        b6c b6cVar = (b6c) obj;
        return Intrinsics.d(this.f2045a, b6cVar.f2045a) && this.b.equals(b6cVar.b) && Intrinsics.d(this.c, b6cVar.c) && Intrinsics.d(this.d, b6cVar.d) && this.e == b6cVar.e && this.f == b6cVar.f && this.g == b6cVar.g && this.h == b6cVar.h && Intrinsics.d(this.i, b6cVar.i) && Intrinsics.d(this.j, b6cVar.j) && this.k == b6cVar.k;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f2045a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ua80.b(ua80.b((this.h.hashCode() + brm0.e((this.f.hashCode() + twn.a(this.e, dw9.a(dw9.a(twn.a(24, (this.b.hashCode() + (this.f2045a.hashCode() * 31)) * 31, 31), 31, this.c), 31, this.d), 31)) * 31, 31, this.g)) * 31, 31, this.i), 31, this.j);
    }

    @Override // a.d6c
    public final int p() {
        return 24;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestoreConfirmation(phoneNumber=");
        sb.append(this.f2045a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=24, availableActivationTypeList=");
        b1j.y(", availableRepeatActivationTypeList=", ", smsTime=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", currentActivationType=");
        sb.append(this.f);
        sb.append(", isRepeatFlow=");
        sb.append(this.g);
        sb.append(", navigation=");
        sb.append(this.h);
        sb.append(", countyCodeDigits=");
        f140.v(sb, this.i, ", phoneDigits=", this.j, ", hasAuthenticator=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }

    @Override // a.d6c
    public final boolean u() {
        return this.g;
    }

    @Override // a.d6c
    public final List z() {
        return this.c;
    }
}
