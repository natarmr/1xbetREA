package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class spd extends vpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32587a;

    public spd(String str) {
        this.f32587a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof spd) && this.f32587a.equals(((spd) obj).f32587a);
    }

    public final int hashCode() {
        return this.f32587a.hashCode();
    }

    public final String toString() {
        return kng0.l("PeriodNameChanged(value=", this.f32587a, Separators.RPAREN);
    }
}
