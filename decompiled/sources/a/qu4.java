package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qu4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29330a;
    public final String b;
    public final cl c;
    public final List d;
    public final List e;

    public qu4(String str, String str2, cl clVar, List list, List list2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.f29330a = str;
        this.b = str2;
        this.c = clVar;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu4)) {
            return false;
        }
        qu4 qu4Var = (qu4) obj;
        return Intrinsics.d(this.f29330a, qu4Var.f29330a) && Intrinsics.d(this.b, qu4Var.b) && this.c == qu4Var.c && Intrinsics.d(this.d, qu4Var.d) && Intrinsics.d(this.e, qu4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a((this.c.hashCode() + ua80.b(this.f29330a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AuthorizationCredentialsModel(guid=", this.f29330a, ", token=", this.b, ", activationType=");
        sbN.append(this.c);
        sbN.append(", activationTypes=");
        sbN.append(this.d);
        sbN.append(", activationRepeatTypes=");
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
