package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yvs0 implements aws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43336a;

    public yvs0(String str) {
        this.f43336a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvs0) && this.f43336a.equals(((yvs0) obj).f43336a);
    }

    public final int hashCode() {
        return this.f43336a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f43336a, Separators.RPAREN);
    }
}
