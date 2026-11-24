package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jxd0 implements nxd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa30 f17302a;

    public final boolean equals(Object obj) {
        if (obj instanceof jxd0) {
            return this.f17302a.equals(((jxd0) obj).f17302a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17302a.hashCode();
    }

    public final String toString() {
        return "SendGameMatchInfoSideEffect(value=" + this.f17302a + Separators.RPAREN;
    }
}
