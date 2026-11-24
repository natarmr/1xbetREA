package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ob1 implements wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24954a;

    public ob1(String str) {
        this.f24954a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob1) && this.f24954a.equals(((ob1) obj).f24954a);
    }

    public final int hashCode() {
        return this.f24954a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowGameUrlError(description=", this.f24954a, Separators.RPAREN);
    }
}
