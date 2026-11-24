package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class lfj implements mfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f19959a;

    public lfj(Date date) {
        this.f19959a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfj) && this.f19959a.equals(((lfj) obj).f19959a);
    }

    public final int hashCode() {
        return this.f19959a.hashCode();
    }

    public final String toString() {
        return "Value(date=" + this.f19959a + Separators.RPAREN;
    }
}
