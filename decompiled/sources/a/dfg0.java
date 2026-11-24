package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dfg0 implements ffg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6000a;

    public final boolean equals(Object obj) {
        if (obj instanceof dfg0) {
            return this.f6000a.equals(((dfg0) obj).f6000a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6000a.hashCode();
    }

    public final String toString() {
        return kng0.l("RoundValue(value=", this.f6000a, Separators.RPAREN);
    }
}
