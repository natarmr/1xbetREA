package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yk4 implements al4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42770a;

    public yk4(String str) {
        this.f42770a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk4) && this.f42770a.equals(((yk4) obj).f42770a);
    }

    public final int hashCode() {
        return this.f42770a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f42770a, Separators.RPAREN);
    }
}
