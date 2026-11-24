package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yuk0 implements zuk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ubv0 f43272a;

    public yuk0(ubv0 ubv0Var) {
        this.f43272a = ubv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yuk0) && this.f43272a.equals(((yuk0) obj).f43272a);
    }

    public final int hashCode() {
        return this.f43272a.hashCode();
    }

    public final String toString() {
        return "SendWhoWinGameCardSideEffect(internalEffect=" + this.f43272a + Separators.RPAREN;
    }
}
