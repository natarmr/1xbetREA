package a;

import android.gov.nist.core.Separators;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public final class tz implements yz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f34780a;

    public tz(Calendar calendar) {
        this.f34780a = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz) && this.f34780a.equals(((tz) obj).f34780a);
    }

    public final int hashCode() {
        return this.f34780a.hashCode();
    }

    public final String toString() {
        return "ShowDatePickerDialog(calendar=" + this.f34780a + Separators.RPAREN;
    }
}
