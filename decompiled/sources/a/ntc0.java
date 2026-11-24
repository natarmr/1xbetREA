package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ntc0 implements otc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gtc0 f24092a;

    public final boolean equals(Object obj) {
        if (obj instanceof ntc0) {
            return this.f24092a == ((ntc0) obj).f24092a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24092a.hashCode();
    }

    public final String toString() {
        return "Type(value=" + this.f24092a + Separators.RPAREN;
    }
}
