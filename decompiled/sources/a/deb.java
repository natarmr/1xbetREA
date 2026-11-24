package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class deb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5941a;
    public final List b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;
    public final List g;

    public deb(String str, List list, String str2, String str3, long j, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f5941a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = list2;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deb)) {
            return false;
        }
        deb debVar = (deb) obj;
        return this.f5941a.equals(debVar.f5941a) && Intrinsics.d(this.b, debVar.b) && this.c.equals(debVar.c) && this.d.equals(debVar.d) && this.e == debVar.e && Intrinsics.d(this.f, debVar.f) && Intrinsics.d(this.g, debVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a(rw2.b(ua80.b(ua80.b(dw9.a(this.f5941a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("ChampModel(id=", this.f5941a, ", disciplines=", this.b, ", title=");
        f140.v(sbF, this.c, ", discipline=", this.d, ", competitorType=");
        hne.x(sbF, this.e, ", tableTitles=", this.f);
        return ohs0.s(sbF, ", ratingRows=", this.g, Separators.RPAREN);
    }
}
