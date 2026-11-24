package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pfz implements qfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xhz f26928a;

    public pfz(xhz xhzVar) {
        this.f26928a = xhzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfz) && this.f26928a == ((pfz) obj).f26928a;
    }

    public final int hashCode() {
        return this.f26928a.hashCode();
    }

    public final String toString() {
        return "OnTypeSelect(selectedType=" + this.f26928a + Separators.RPAREN;
    }
}
