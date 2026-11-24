package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rjc0 implements ujc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30585a;

    public rjc0(String str) {
        this.f30585a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rjc0) && this.f30585a.equals(((rjc0) obj).f30585a);
    }

    public final int hashCode() {
        return this.f30585a.hashCode();
    }

    public final String toString() {
        return kng0.l("RequestErrorMessageDialog(message=", this.f30585a, Separators.RPAREN);
    }
}
