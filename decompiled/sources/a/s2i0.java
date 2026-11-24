package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class s2i0 implements x2i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f31502a;

    public s2i0(Date date) {
        this.f31502a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2i0) && this.f31502a.equals(((s2i0) obj).f31502a);
    }

    public final int hashCode() {
        return this.f31502a.hashCode();
    }

    public final String toString() {
        return "OnEndDateSelected(date=" + this.f31502a + Separators.RPAREN;
    }
}
