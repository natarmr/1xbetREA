package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m1t implements n1t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21025a;
    public final boolean b;

    public m1t(String str, boolean z) {
        this.f21025a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1t)) {
            return false;
        }
        m1t m1tVar = (m1t) obj;
        return this.f21025a.equals(m1tVar.f21025a) && this.b == m1tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21025a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("InitUrl(url=", this.f21025a, ", isControlPanelVisible=", this.b, Separators.RPAREN);
    }
}
