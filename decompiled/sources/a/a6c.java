package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a6c implements d6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311a;
    public final swp0 b;
    public final ArrayList c;
    public final ArrayList d;
    public final int e;
    public final obk0 f;
    public final String g;
    public final String h;
    public final int i;
    public final long j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final boolean q;

    public a6c(String str, swp0 swp0Var, ArrayList arrayList, ArrayList arrayList2, int i, obk0 obk0Var, String str2, String str3, int i2, long j, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        obk0Var.getClass();
        str2.getClass();
        str3.getClass();
        this.f311a = str;
        this.b = swp0Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = i;
        this.f = obk0Var;
        this.g = str2;
        this.h = str3;
        this.i = i2;
        this.j = j;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = str8;
        this.p = str9;
        this.q = z;
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
        if (!(obj instanceof a6c)) {
            return false;
        }
        a6c a6cVar = (a6c) obj;
        return this.f311a.equals(a6cVar.f311a) && this.b.equals(a6cVar.b) && this.c.equals(a6cVar.c) && this.d.equals(a6cVar.d) && this.e == a6cVar.e && this.f == a6cVar.f && Intrinsics.d(this.g, a6cVar.g) && Intrinsics.d(this.h, a6cVar.h) && this.i == a6cVar.i && this.j == a6cVar.j && this.k.equals(a6cVar.k) && this.l.equals(a6cVar.l) && this.m.equals(a6cVar.m) && this.n.equals(a6cVar.n) && this.o.equals(a6cVar.o) && this.p.equals(a6cVar.p) && this.q == a6cVar.q;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f311a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(twn.a(this.i, ua80.b(ua80.b((this.f.hashCode() + twn.a(this.e, twn.g(this.d, twn.g(this.c, (this.b.hashCode() + (this.f311a.hashCode() * 31)) * 31, 31), 31), 31)) * 31, 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    @Override // a.d6c
    public final int p() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneActivationFromRegistrationConfirmationCode(phoneNumber=");
        sb.append(this.f311a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", availableActivationTypeList=");
        sb.append(this.c);
        sb.append(", availableRepeatActivationTypeList=");
        sb.append(this.d);
        sb.append(", smsTime=");
        sb.append(this.e);
        sb.append(", currentActivationType=");
        sb.append(this.f);
        sb.append(", phoneCodeDigits=");
        f140.v(sb, this.g, ", phoneDigits=", this.h, ", registrationTypeId=");
        sb.append(this.i);
        sb.append(", countryId=");
        sb.append(this.j);
        f140.v(sb, ", countryName=", this.k, ", currencyName=", this.l);
        f140.v(sb, ", bonusName=", this.m, ", promoCode=", this.n);
        f140.v(sb, ", countryCode=", this.o, ", referralLink=", this.p);
        return f140.n(sb, ", isRepeatFlow=", this.q, Separators.RPAREN);
    }

    @Override // a.d6c
    public final boolean u() {
        return this.q;
    }

    @Override // a.d6c
    public final List z() {
        return this.c;
    }
}
