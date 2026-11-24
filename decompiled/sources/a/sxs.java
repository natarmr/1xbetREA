package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sxs implements txs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32994a;
    public final boolean b;

    public sxs(String str, boolean z) {
        this.f32994a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxs)) {
            return false;
        }
        sxs sxsVar = (sxs) obj;
        return this.f32994a.equals(sxsVar.f32994a) && this.b == sxsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f32994a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("InitUrl(url=", this.f32994a, ", isControlPanelVisible=", this.b, Separators.RPAREN);
    }
}
