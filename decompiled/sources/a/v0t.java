package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v0t implements w0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36598a;
    public final boolean b;

    public v0t(String str, boolean z) {
        this.f36598a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0t)) {
            return false;
        }
        v0t v0tVar = (v0t) obj;
        return this.f36598a.equals(v0tVar.f36598a) && this.b == v0tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f36598a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("InitUrl(url=", this.f36598a, ", isControlPanelVisible=", this.b, Separators.RPAREN);
    }
}
