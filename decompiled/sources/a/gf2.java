package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gf2 implements hf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f11185a;

    public final boolean equals(Object obj) {
        if (obj instanceof gf2) {
            return Intrinsics.d(this.f11185a, ((gf2) obj).f11185a);
        }
        return false;
    }

    public final int hashCode() {
        Date date = this.f11185a;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public final String toString() {
        return "ShowCalendarChooser(date=" + this.f11185a + Separators.RPAREN;
    }
}
