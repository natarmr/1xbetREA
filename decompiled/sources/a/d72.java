package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d72 implements f72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5574a;
    public final Date b;

    public d72(Date date, List list) {
        list.getClass();
        date.getClass();
        this.f5574a = list;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d72)) {
            return false;
        }
        d72 d72Var = (d72) obj;
        return Intrinsics.d(this.f5574a, d72Var.f5574a) && Intrinsics.d(this.b, d72Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5574a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(items=" + this.f5574a + ", date=" + this.b + Separators.RPAREN;
    }
}
