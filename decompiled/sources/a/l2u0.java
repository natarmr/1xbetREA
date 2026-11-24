package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l2u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19332a;
    public final String b;
    public final List c;
    public final String d;

    public l2u0(long j, String str, String str2, List list) {
        list.getClass();
        this.f19332a = j;
        this.b = str;
        this.c = list;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2u0)) {
            return false;
        }
        l2u0 l2u0Var = (l2u0) obj;
        return this.f19332a == l2u0Var.f19332a && this.b.equals(l2u0Var.b) && Intrinsics.d(this.c, l2u0Var.c) && this.d.equals(l2u0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(ua80.b(Long.hashCode(this.f19332a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f19332a, "ValueColBodyModel(id=", ", contentType=", this.b);
        sbO.append(", value=");
        sbO.append(this.c);
        sbO.append(", competitorId=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
