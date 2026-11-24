package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s5c implements d6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31649a;
    public final swp0 b;
    public final int c;
    public final List d;
    public final List e;
    public final int f;
    public final obk0 g;
    public final boolean h;
    public final String i;
    public final we50 j;
    public final boolean k;

    public s5c(String str, swp0 swp0Var, int i, List list, List list2, int i2, obk0 obk0Var, boolean z, String str2, we50 we50Var, boolean z2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        obk0Var.getClass();
        str2.getClass();
        we50Var.getClass();
        this.f31649a = str;
        this.b = swp0Var;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = i2;
        this.g = obk0Var;
        this.h = z;
        this.i = str2;
        this.j = we50Var;
        this.k = z2;
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
        if (!(obj instanceof s5c)) {
            return false;
        }
        s5c s5cVar = (s5c) obj;
        return Intrinsics.d(this.f31649a, s5cVar.f31649a) && this.b.equals(s5cVar.b) && this.c == s5cVar.c && Intrinsics.d(this.d, s5cVar.d) && Intrinsics.d(this.e, s5cVar.e) && this.f == s5cVar.f && this.g == s5cVar.g && this.h == s5cVar.h && Intrinsics.d(this.i, s5cVar.i) && this.j == s5cVar.j && this.k == s5cVar.k;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f31649a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + ua80.b(brm0.e((this.g.hashCode() + twn.a(this.f, dw9.a(dw9.a(twn.a(this.c, (this.b.hashCode() + (this.f31649a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31)) * 31, 31, this.h), 31, this.i)) * 31);
    }

    @Override // a.d6c
    public final int p() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangePasswordConfirmation(phoneNumber=");
        sb.append(this.f31649a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=");
        ohs0.v(this.c, ", availableActivationTypeList=", ", availableRepeatActivationTypeList=", sb, this.d);
        brm0.v(this.f, ", smsTime=", ", currentActivationType=", sb, this.e);
        sb.append(this.g);
        sb.append(", isRepeatFlow=");
        sb.append(this.h);
        sb.append(", newPass=");
        sb.append(this.i);
        sb.append(", navigation=");
        sb.append(this.j);
        sb.append(", hasAuthenticator=");
        return rw2.p(sb, this.k, Separators.RPAREN);
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
