package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u690 implements w690 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35128a;
    public final String b;
    public final String c;
    public final String d;

    public u690(String str, String str2, String str3, String str4) {
        str2.getClass();
        str3.getClass();
        this.f35128a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u690)) {
            return false;
        }
        u690 u690Var = (u690) obj;
        return this.f35128a.equals(u690Var.f35128a) && Intrinsics.d(this.b, u690Var.b) && Intrinsics.d(this.c, u690Var.c) && this.d.equals(u690Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(1357, ua80.b(this.f35128a.hashCode() * 31, 31, this.b), 31), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("LoadUrlInWebView(url=", this.f35128a, ", webToken=", this.b, ", groupId=1357, countryId="), this.c, ", lang=", this.d, Separators.RPAREN);
    }
}
