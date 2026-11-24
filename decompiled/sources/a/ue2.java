package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ue2 implements ye2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35506a;

    public ue2(String str) {
        this.f35506a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue2) && this.f35506a.equals(((ue2) obj).f35506a);
    }

    public final int hashCode() {
        return this.f35506a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChanged(query=", this.f35506a, Separators.RPAREN);
    }
}
