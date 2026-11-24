package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zk40 implements bl40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wus f44511a;

    public final boolean equals(Object obj) {
        if (obj instanceof zk40) {
            return this.f44511a.equals(((zk40) obj).f44511a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44511a.hashCode();
    }

    public final String toString() {
        return "SendGameToolbarSideEffect(value=" + this.f44511a + Separators.RPAREN;
    }
}
