package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bf40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f2484a;

    public bf40(vbj vbjVar) {
        this.f2484a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf40) && this.f2484a.equals(((bf40) obj).f2484a);
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f2484a;
    }

    public final int hashCode() {
        return this.f2484a.hashCode();
    }

    public final String toString() {
        return "UserInfo(state=" + this.f2484a + Separators.RPAREN;
    }
}
