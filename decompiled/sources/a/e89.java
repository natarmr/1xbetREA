package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e89 implements f89 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7362a;
    public final boolean b;

    public e89(String str, boolean z) {
        this.f7362a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e89)) {
            return false;
        }
        e89 e89Var = (e89) obj;
        return this.f7362a.equals(e89Var.f7362a) && this.b == e89Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f7362a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("InitUrl(url=", this.f7362a, ", isControlPanelVisible=", this.b, Separators.RPAREN);
    }
}
