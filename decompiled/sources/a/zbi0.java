package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zbi0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44118a;
    public final swp0 b;
    public final ArrayList c;
    public final ArrayList d;
    public final boolean e;
    public final String f;
    public final String g;
    public final int h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    public zbi0(String str, swp0 swp0Var, ArrayList arrayList, ArrayList arrayList2, boolean z, String str2, String str3, int i, long j, String str4, String str5, String str6, String str7, String str8, String str9) {
        str2.getClass();
        str3.getClass();
        this.f44118a = str;
        this.b = swp0Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = i;
        this.i = j;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = str9;
    }

    @Override // a.dci0
    public final List D() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbi0)) {
            return false;
        }
        zbi0 zbi0Var = (zbi0) obj;
        return this.f44118a.equals(zbi0Var.f44118a) && this.b.equals(zbi0Var.b) && this.c.equals(zbi0Var.c) && this.d.equals(zbi0Var.d) && this.e == zbi0Var.e && Intrinsics.d(this.f, zbi0Var.f) && Intrinsics.d(this.g, zbi0Var.g) && this.h == zbi0Var.h && this.i == zbi0Var.i && this.j.equals(zbi0Var.j) && this.k.equals(zbi0Var.k) && this.l.equals(zbi0Var.l) && this.m.equals(zbi0Var.m) && this.n.equals(zbi0Var.n) && this.o.equals(zbi0Var.o);
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f44118a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.o.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(twn.a(this.h, ua80.b(ua80.b(brm0.e(twn.g(this.d, twn.g(this.c, (this.b.hashCode() + (this.f44118a.hashCode() * 31)) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    @Override // a.dci0
    public final int p() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneActivationFromRegistrationConfirmation(phoneNumber=");
        sb.append(this.f44118a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", availableActivationTypeList=");
        sb.append(this.c);
        sb.append(", availableRepeatActivationTypeList=");
        sb.append(this.d);
        sb.append(", isRepeatFlow=");
        f140.s(", phoneCodeDigits=", this.f, ", phoneDigits=", sb, this.e);
        twn.w(this.h, this.g, ", registrationTypeId=", ", countryId=", sb);
        kng0.z(sb, this.i, ", countryName=", this.j);
        f140.v(sb, ", currencyName=", this.k, ", bonusName=", this.l);
        f140.v(sb, ", promoCode=", this.m, ", countryCode=", this.n);
        return rw2.o(sb, ", referralLink=", this.o, Separators.RPAREN);
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
