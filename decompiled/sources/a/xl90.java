package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xl90 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqp f41061a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public xl90(vqp vqpVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        this.f41061a = vqpVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public static xl90 c(xl90 xl90Var, String str, String str2, String str3, String str4, String str5, int i) {
        vqp vqpVar = xl90Var.f41061a;
        String str6 = xl90Var.b;
        String str7 = (i & 4) != 0 ? xl90Var.c : "";
        if ((i & 16) != 0) {
            str2 = xl90Var.e;
        }
        String str8 = str2;
        if ((i & 32) != 0) {
            str3 = xl90Var.f;
        }
        String str9 = str3;
        if ((i & 64) != 0) {
            str4 = xl90Var.g;
        }
        String str10 = str4;
        if ((i & 128) != 0) {
            str5 = xl90Var.h;
        }
        str6.getClass();
        str8.getClass();
        str10.getClass();
        return new xl90(vqpVar, str6, str7, str, str8, str9, str10, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl90)) {
            return false;
        }
        xl90 xl90Var = (xl90) obj;
        return this.f41061a == xl90Var.f41061a && Intrinsics.d(this.b, xl90Var.b) && this.c.equals(xl90Var.c) && this.d.equals(xl90Var.d) && this.e.equals(xl90Var.e) && this.f.equals(xl90Var.f) && this.g.equals(xl90Var.g) && this.h.equals(xl90Var.h);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f41061a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof xl90) || !(p6t0Var2 instanceof xl90)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xl90 xl90Var = (xl90) p6t0Var;
        xl90 xl90Var2 = (xl90) p6t0Var2;
        k9x.G(linkedHashSet, new rl90(xl90Var.d), new rl90(xl90Var2.d));
        k9x.G(linkedHashSet, new pl90(xl90Var.c), new pl90(xl90Var2.c));
        k9x.G(linkedHashSet, new ql90(xl90Var.e), new ql90(xl90Var2.e));
        k9x.G(linkedHashSet, new ol90(xl90Var.f), new ol90(xl90Var2.f));
        k9x.G(linkedHashSet, new tl90(xl90Var.g), new tl90(xl90Var2.g));
        k9x.G(linkedHashSet, new sl90(xl90Var.h), new sl90(xl90Var2.h));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Error(value=", this.c, Separators.RPAREN);
        String strA = rl90.a(this.d);
        String strL2 = kng0.l("Mask(value=", this.e, Separators.RPAREN);
        String strL3 = kng0.l("CountryImage(value=", this.f, Separators.RPAREN);
        String strL4 = kng0.l("Placeholder(value=", this.g, Separators.RPAREN);
        String strL5 = kng0.l("PhoneCode(value=", this.h, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("PhoneFieldUiModel(fieldName=");
        sb.append(this.f41061a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", error=");
        f140.v(sb, strL, ", phone=", strA, ", mask=");
        f140.v(sb, strL2, ", countryImage=", strL3, ", placeholder=");
        return ua80.m(sb, strL4, ", phoneCode=", strL5, Separators.RPAREN);
    }
}
