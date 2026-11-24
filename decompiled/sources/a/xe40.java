package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xe40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f40727a;

    public xe40(vbj vbjVar) {
        this.f40727a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe40) && this.f40727a.equals(((xe40) obj).f40727a);
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f40727a;
    }

    public final int hashCode() {
        return this.f40727a.hashCode();
    }

    public final String toString() {
        return "RegistrationBanner(state=" + this.f40727a + Separators.RPAREN;
    }
}
