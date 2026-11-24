package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tr9 implements ur9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34413a;
    public final String b;
    public final String c;
    public final boolean d;

    public tr9(String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.f34413a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr9)) {
            return false;
        }
        tr9 tr9Var = (tr9) obj;
        return Intrinsics.d(this.f34413a, tr9Var.f34413a) && this.b.equals(tr9Var.b) && Intrinsics.d(this.c, tr9Var.c) && this.d == tr9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f34413a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", animateButton=", Separators.RPAREN, b1j.n("Evaluate(title=", this.f34413a, ", subtitle=", this.b, ", buttonText="), this.d);
    }
}
