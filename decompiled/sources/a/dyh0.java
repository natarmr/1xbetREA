package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dyh0 implements hyh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vxh0 f6894a;

    public final boolean equals(Object obj) {
        if (obj instanceof dyh0) {
            return this.f6894a.equals(((dyh0) obj).f6894a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6894a.hashCode();
    }

    public final String toString() {
        return "MatchStatusText(value=" + this.f6894a + Separators.RPAREN;
    }
}
