package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class llg0 implements olg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20247a;
    public final boolean b;

    public llg0(String str, boolean z) {
        this.f20247a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llg0)) {
            return false;
        }
        llg0 llg0Var = (llg0) obj;
        return this.f20247a.equals(llg0Var.f20247a) && this.b == llg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + ua80.b(-1852163011, 31, this.f20247a);
    }

    public final String toString() {
        return ua80.j("OnLinkClick(screenName=RulesScreen, link=", this.f20247a, ", deeplink=", this.b, Separators.RPAREN);
    }
}
