package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ufp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35586a;
    public final String b;
    public final int c;
    public final String d;
    public final List e;

    public ufp0(int i, String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.f35586a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = list;
    }

    public static ufp0 a(ufp0 ufp0Var, String str, String str2) {
        String str3 = ufp0Var.f35586a;
        int i = ufp0Var.c;
        List list = ufp0Var.e;
        str3.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        return new ufp0(i, str3, str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufp0)) {
            return false;
        }
        ufp0 ufp0Var = (ufp0) obj;
        return Intrinsics.d(this.f35586a, ufp0Var.f35586a) && Intrinsics.d(this.b, ufp0Var.b) && this.c == ufp0Var.c && Intrinsics.d(this.d, ufp0Var.d) && Intrinsics.d(this.e, ufp0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(this.c, ua80.b(this.f35586a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamModel(id=", this.f35586a, ", title=", this.b, ", translationId=");
        kng0.w(this.c, ", image=", this.d, ", subTeams=", sbN);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
