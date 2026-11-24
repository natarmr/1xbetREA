package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class unp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35975a;
    public final String b;
    public final List c;

    public unp0(long j, String str, List list) {
        str.getClass();
        list.getClass();
        this.f35975a = j;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unp0)) {
            return false;
        }
        unp0 unp0Var = (unp0) obj;
        return this.f35975a == unp0Var.f35975a && Intrinsics.d(this.b, unp0Var.b) && Intrinsics.d(this.c, unp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f35975a) * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(axq.o(this.f35975a, "TeamUIModel(id=", ", name=", this.b), ", images=", this.c, Separators.RPAREN);
    }
}
