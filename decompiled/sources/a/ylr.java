package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ylr implements amr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42858a;
    public final long b;

    public ylr(String str, long j) {
        this.f42858a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylr)) {
            return false;
        }
        ylr ylrVar = (ylr) obj;
        return this.f42858a.equals(ylrVar.f42858a) && this.b == ylrVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f42858a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "OnTabClick(blockKey=", this.f42858a, ", tabId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
