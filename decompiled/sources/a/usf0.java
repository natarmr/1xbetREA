package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class usf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final go3 f36208a;
    public final go3 b;
    public final String c;
    public final List d;
    public final List e;

    public usf0(go3 go3Var, go3 go3Var2, String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f36208a = go3Var;
        this.b = go3Var2;
        this.c = str;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usf0)) {
            return false;
        }
        usf0 usf0Var = (usf0) obj;
        return this.f36208a.equals(usf0Var.f36208a) && this.b.equals(usf0Var.b) && this.c.equals(usf0Var.c) && Intrinsics.d(this.d, usf0Var.d) && Intrinsics.d(this.e, usf0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(ua80.b((this.b.hashCode() + (this.f36208a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolveVersionValid(minVersion=");
        sb.append(this.f36208a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", updateURL=");
        cs0.y(this.c, ", forceUpdateBuilds=", ", alternatePath=", sb, this.d);
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
