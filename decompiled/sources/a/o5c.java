package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o5c implements d6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24680a;
    public final swp0 b;
    public final List c;
    public final List d;
    public final int e;
    public final obk0 f;
    public final boolean g;
    public final String h;
    public final String i;

    public o5c(String str, swp0 swp0Var, List list, List list2, int i, obk0 obk0Var, boolean z, String str2, String str3) {
        list.getClass();
        list2.getClass();
        this.f24680a = str;
        this.b = swp0Var;
        this.c = list;
        this.d = list2;
        this.e = i;
        this.f = obk0Var;
        this.g = z;
        this.h = str2;
        this.i = str3;
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
        if (!(obj instanceof o5c)) {
            return false;
        }
        o5c o5cVar = (o5c) obj;
        return this.f24680a.equals(o5cVar.f24680a) && this.b.equals(o5cVar.b) && Intrinsics.d(this.c, o5cVar.c) && Intrinsics.d(this.d, o5cVar.d) && this.e == o5cVar.e && this.f == o5cVar.f && this.g == o5cVar.g && this.h.equals(o5cVar.h) && this.i.equals(o5cVar.i);
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f24680a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(brm0.e((this.f.hashCode() + twn.a(this.e, dw9.a(dw9.a((this.b.hashCode() + (this.f24680a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31)) * 31, 31, this.g), 31, this.h);
    }

    @Override // a.d6c
    public final int p() {
        return 5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddTwoFactorAuthConfirmation(phoneNumber=");
        sb.append(this.f24680a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", availableActivationTypeList=");
        b1j.y(", availableRepeatActivationTypeList=", ", smsTime=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", currentActivationType=");
        sb.append(this.f);
        sb.append(", isRepeatFlow=");
        f140.s(", resetHashResultKey=", this.h, ", resetHashSecretKeyValue=", sb, this.g);
        return axq.n(sb, this.i, Separators.RPAREN);
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
