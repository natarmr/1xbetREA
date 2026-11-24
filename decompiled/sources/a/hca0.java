package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12812a;
    public final String b;
    public final String c;
    public final String d;
    public final bre e;
    public final List f;

    public hca0(String str, String str2, String str3, String str4, bre breVar, List list) {
        str.getClass();
        breVar.getClass();
        list.getClass();
        this.f12812a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = breVar;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hca0)) {
            return false;
        }
        hca0 hca0Var = (hca0) obj;
        return Intrinsics.d(this.f12812a, hca0Var.f12812a) && this.b.equals(hca0Var.b) && this.c.equals(hca0Var.c) && this.d.equals(hca0Var.d) && Intrinsics.d(this.e, hca0Var.e) && Intrinsics.d(this.f, hca0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f12812a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerTennisMenuUiModel(name=", this.f12812a, ", image=", this.b, ", birthDay=");
        f140.v(sbN, this.c, ", plays=", this.d, ", country=");
        sbN.append(this.e);
        sbN.append(", menu=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
