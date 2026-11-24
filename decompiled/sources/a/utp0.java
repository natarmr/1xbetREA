package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class utp0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36265a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public utp0(String str, String str2, String str3, List list, String str4) {
        list.getClass();
        this.f36265a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utp0)) {
            return false;
        }
        utp0 utp0Var = (utp0) obj;
        return this.f36265a.equals(utp0Var.f36265a) && this.b.equals(utp0Var.b) && this.c.equals(utp0Var.c) && this.d.equals(utp0Var.d) && Intrinsics.d(this.e, utp0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f36265a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TekkenModel(teamOneName=", this.f36265a, ", teamTwoName=", this.b, ", teamOneImage=");
        f140.v(sbN, this.c, ", teamTwoImage=", this.d, ", rounds=");
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
