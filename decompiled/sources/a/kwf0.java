package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kwf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19000a;
    public final String b;
    public final Date c;

    public kwf0(String str, String str2, Date date) {
        str.getClass();
        str2.getClass();
        this.f19000a = str;
        this.b = str2;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwf0)) {
            return false;
        }
        kwf0 kwf0Var = (kwf0) obj;
        return Intrinsics.d(this.f19000a, kwf0Var.f19000a) && Intrinsics.d(this.b, kwf0Var.b) && this.c.equals(kwf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f19000a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RestWSSettings(accessToken=", this.f19000a, ", tokenType=", this.b, ", expiresIn=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
