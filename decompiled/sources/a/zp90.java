package a;

import android.gov.nist.core.Separators;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class zp90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f44749a;
    public final Boolean b;

    public zp90(Locale locale, Boolean bool) {
        this.f44749a = locale;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp90)) {
            return false;
        }
        zp90 zp90Var = (zp90) obj;
        return this.f44749a.equals(zp90Var.f44749a) && this.b.equals(zp90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44749a.hashCode() * 31);
    }

    public final String toString() {
        return "PickerLocaleConfig(locale=" + this.f44749a + ", is24h=" + this.b + Separators.RPAREN;
    }
}
