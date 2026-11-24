package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mqa extends tqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22214a;

    public mqa(String str) {
        this.f22214a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqa) && this.f22214a.equals(((mqa) obj).f22214a);
    }

    public final int hashCode() {
        return this.f22214a.hashCode();
    }

    public final String toString() {
        return kng0.l("PressureInfoChanged(pressure=", this.f22214a, Separators.RPAREN);
    }
}
