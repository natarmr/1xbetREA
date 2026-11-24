package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ks70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18800a;
    public final boolean b;

    public ks70(String str, boolean z) {
        this.f18800a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks70)) {
            return false;
        }
        ks70 ks70Var = (ks70) obj;
        return this.f18800a.equals(ks70Var.f18800a) && this.b == ks70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f18800a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("OnlineCallOperatorRatingModel(callId=", this.f18800a, ", isRatingNeeded=", this.b, Separators.RPAREN);
    }
}
