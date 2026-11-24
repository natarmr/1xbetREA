package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xa2 implements za2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f40533a;
    public final List b;

    public xa2(Date date, List list) {
        date.getClass();
        list.getClass();
        this.f40533a = date;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa2)) {
            return false;
        }
        xa2 xa2Var = (xa2) obj;
        return Intrinsics.d(this.f40533a, xa2Var.f40533a) && Intrinsics.d(this.b, xa2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40533a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(date=" + this.f40533a + ", items=" + this.b + Separators.RPAREN;
    }
}
