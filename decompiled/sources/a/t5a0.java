package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t5a0 implements u5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33359a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public t5a0(String str, String str2, String str3, String str4, String str5, String str6) {
        str4.getClass();
        str6.getClass();
        this.f33359a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5a0)) {
            return false;
        }
        t5a0 t5a0Var = (t5a0) obj;
        return this.f33359a.equals(t5a0Var.f33359a) && this.b.equals(t5a0Var.b) && this.c.equals(t5a0Var.c) && Intrinsics.d(this.d, t5a0Var.d) && this.e.equals(t5a0Var.e) && Intrinsics.d(this.f, t5a0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f33359a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Success(imageUrl=", this.f33359a, ", countryImageUrl=", this.b, ", name=");
        f140.v(sbN, this.c, ", type=", this.d, ", country=");
        return ua80.m(sbN, this.e, ", age=", this.f, Separators.RPAREN);
    }
}
