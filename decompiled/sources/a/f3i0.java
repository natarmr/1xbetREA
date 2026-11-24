package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class f3i0 implements l3i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f8866a;

    public f3i0(Date date) {
        this.f8866a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3i0) && this.f8866a.equals(((f3i0) obj).f8866a);
    }

    public final int hashCode() {
        return this.f8866a.hashCode();
    }

    public final String toString() {
        return "SetEndDateAndExit(date=" + this.f8866a + Separators.RPAREN;
    }
}
