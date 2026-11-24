package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i2i0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f14049a;
    public final Date b;

    public i2i0(Date date, Date date2) {
        date.getClass();
        date2.getClass();
        this.f14049a = date;
        this.b = date2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2i0)) {
            return false;
        }
        i2i0 i2i0Var = (i2i0) obj;
        return Intrinsics.d(this.f14049a, i2i0Var.f14049a) && Intrinsics.d(this.b, i2i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14049a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectDateTimeResult(start=" + this.f14049a + ", end=" + this.b + Separators.RPAREN;
    }
}
