package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class g3i0 implements l3i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f10614a;

    public g3i0(Date date) {
        this.f10614a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3i0) && this.f10614a.equals(((g3i0) obj).f10614a);
    }

    public final int hashCode() {
        return this.f10614a.hashCode();
    }

    public final String toString() {
        return "SetStartDate(date=" + this.f10614a + Separators.RPAREN;
    }
}
