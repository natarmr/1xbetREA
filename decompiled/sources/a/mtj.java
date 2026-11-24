package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mtj implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22373a;
    public final j9m b;

    public mtj(String str, j9m j9mVar) {
        this.f22373a = str;
        this.b = j9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtj)) {
            return false;
        }
        mtj mtjVar = (mtj) obj;
        return this.f22373a.equals(mtjVar.f22373a) && this.b.equals(mtjVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f22373a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22373a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultCyberLogoCollectionUiModel(key=" + this.f22373a + ", value=" + this.b + Separators.RPAREN;
    }
}
