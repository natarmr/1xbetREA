package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ajf0 implements djf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f973a;

    public ajf0(String str) {
        this.f973a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajf0) && this.f973a.equals(((ajf0) obj).f973a);
    }

    public final int hashCode() {
        return this.f973a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInputError(message=", this.f973a, Separators.RPAREN);
    }
}
