package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ftk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f10116a;
    public final boolean b;

    public ftk0(Date date, boolean z) {
        date.getClass();
        this.f10116a = date;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftk0)) {
            return false;
        }
        ftk0 ftk0Var = (ftk0) obj;
        return Intrinsics.d(this.f10116a, ftk0Var.f10116a) && this.b == ftk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f10116a.hashCode() * 31);
    }

    public final String toString() {
        return "SpecialEventTabDateModel(date=" + this.f10116a + ", liveEvent=" + this.b + Separators.RPAREN;
    }
}
