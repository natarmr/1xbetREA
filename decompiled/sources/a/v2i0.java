package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class v2i0 implements x2i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f36684a;

    public v2i0(Date date) {
        this.f36684a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2i0) && this.f36684a.equals(((v2i0) obj).f36684a);
    }

    public final int hashCode() {
        return this.f36684a.hashCode();
    }

    public final String toString() {
        return "OnStartDateSelected(date=" + this.f36684a + Separators.RPAREN;
    }
}
