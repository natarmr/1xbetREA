package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h500 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12458a;
    public final String b;
    public final List c;

    public h500(String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f12458a = list;
        this.b = str;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h500)) {
            return false;
        }
        h500 h500Var = (h500) obj;
        return Intrinsics.d(this.f12458a, h500Var.f12458a) && this.b.equals(h500Var.b) && Intrinsics.d(this.c, h500Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f12458a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(ua80.o("LimitsWithExamModel(limitsList=", ", tokenGuid=", this.b, this.f12458a, ", questionsList="), this.c, Separators.RPAREN);
    }
}
