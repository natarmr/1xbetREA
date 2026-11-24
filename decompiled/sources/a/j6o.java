package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j6o implements k6o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wus f15998a;

    public final boolean equals(Object obj) {
        if (obj instanceof j6o) {
            return this.f15998a.equals(((j6o) obj).f15998a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15998a.hashCode();
    }

    public final String toString() {
        return "SendGameToolbarSideEffect(value=" + this.f15998a + Separators.RPAREN;
    }
}
