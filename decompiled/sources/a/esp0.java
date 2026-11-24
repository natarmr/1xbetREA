package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class esp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8341a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public esp0(String str, String str2, String str3, String str4, String str5, List list) {
        list.getClass();
        this.f8341a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esp0)) {
            return false;
        }
        esp0 esp0Var = (esp0) obj;
        return this.f8341a.equals(esp0Var.f8341a) && this.b.equals(esp0Var.b) && this.c.equals(esp0Var.c) && this.d.equals(esp0Var.d) && this.e.equals(esp0Var.e) && Intrinsics.d(this.f, esp0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f8341a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamsStatisticMenuModel(id=", this.f8341a, ", name=", this.b, ", teamId=");
        f140.v(sbN, this.c, ", image=", this.d, ", stadiumId=");
        return rw2.m(this.e, ", menuItems=", Separators.RPAREN, sbN, this.f);
    }
}
