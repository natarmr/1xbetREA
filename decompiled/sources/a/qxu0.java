package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qxu0 implements sxu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29506a;

    public qxu0(String str) {
        this.f29506a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxu0) && this.f29506a.equals(((qxu0) obj).f29506a);
    }

    public final int hashCode() {
        return this.f29506a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSuccessPayInDialog(message=", this.f29506a, Separators.RPAREN);
    }
}
